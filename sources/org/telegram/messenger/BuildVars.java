package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.Build;

public class BuildVars {
    public static String APPCENTER_HASH = null;
    public static String APP_HASH = null;
    public static int APP_ID = 0;
    public static int BUILD_VERSION = 0;
    public static String BUILD_VERSION_STRING = null;
    public static boolean CHECK_UPDATES = true;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean DEBUG_VERSION = true;
    public static boolean IS_BILLING_UNAVAILABLE = false;
    public static boolean LOGS_ENABLED = true;
    public static boolean NO_SCOPED_STORAGE = false;
    public static String PLAYSTORE_APP_URL = null;
    public static String SMS_HASH = null;
    public static boolean USE_CLOUD_STRINGS = true;
    private static Boolean betaApp;
    private static Boolean standaloneApp;

    static {
        boolean z = true;
        NO_SCOPED_STORAGE = Build.VERSION.SDK_INT <= 29;
        BUILD_VERSION = 2700;
        BUILD_VERSION_STRING = BuildConfig.VERSION_NAME;
        APP_ID = 4;
        APP_HASH = "014b35b6184100b085b0d0572f9b5103";
        APPCENTER_HASH = "f9726602-67c9-48d2-b5d0-4761f1c1a8f3";
        SMS_HASH = isStandaloneApp() ? "w0lkcmTZkKh" : DEBUG_VERSION ? "O2P2z+/jBpJ" : "oLeq9AcOZkT";
        PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        IS_BILLING_UNAVAILABLE = false;
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0);
            boolean z2 = DEBUG_VERSION;
            if (!z2 && !sharedPreferences.getBoolean("logsEnabled", z2)) {
                z = false;
            }
            LOGS_ENABLED = z;
        }
    }

    public static boolean useInvoiceBilling() {
        return DEBUG_VERSION || isStandaloneApp() || isBetaApp();
    }

    public static boolean isStandaloneApp() {
        if (standaloneApp == null) {
            standaloneApp = Boolean.valueOf(ApplicationLoader.applicationContext != null && "org.telegram.messenger.web".equals(ApplicationLoader.applicationContext.getPackageName()));
        }
        return standaloneApp.booleanValue();
    }

    public static boolean isBetaApp() {
        if (betaApp == null) {
            betaApp = Boolean.valueOf(ApplicationLoader.applicationContext != null && BuildConfig.APPLICATION_ID.equals(ApplicationLoader.applicationContext.getPackageName()));
        }
        return betaApp.booleanValue();
    }
}
