package de.robv.android.xposed.mods.appsettings;

public class Common {

	public static final String MY_PACKAGE_NAME = Common.class.getPackage().getName();

	public static final String ACTION_PERMISSIONS = "update_permissions";

	
	public static final String PREFS = "ModSettings";

	public static final String PREF_DEFAULT = "default";
	
	public static final String PREF_ACTIVE = "/active";
	public static final String PREF_DPI = "/dpi";
	public static final String PREF_LOCALE = "/locale";
	public static final String PREF_SCREEN = "/screen";
	public static final String PREF_TABLET = "/tablet";
	public static final String PREF_RESIDENT = "/resident";
	public static final String PREF_REVOKEPERMS = "/revoke-perms";
	public static final String PREF_REVOKELIST = "/revoke-list";
	public static final String PREF_FULLSCREEN = "/fullscreen";
	public static final String PREF_ORIENTATION = "/orientation";

	public static final int[] swdp = { 0, 320, 480, 600, 800, 1000 };
	public static final int[] wdp = { 0, 320, 480, 600, 800, 1000 };
	public static final int[] hdp = { 0, 480, 854, 1024, 1280, 1600 };
	public static final int[] w = { 0, 320, 480, 600, 800, 1000 };
	public static final int[] h = { 0, 480, 854, 1024, 1280, 1600 };
	public static final String[] screens = { "(default)", "320x480", "480x854", "600x1024", "800x1280", "1000x1600" };
	
	public static final String[] orientations = { "(default app rotation)", "Normal rotation", "Always portrait", "Always landscape" };
	public static final int[] orientationCodes = { Integer.MIN_VALUE, -1, 1, 0 };

}
