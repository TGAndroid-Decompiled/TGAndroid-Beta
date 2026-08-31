package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.Build;
import j$.util.Objects;
import java.lang.Thread;
import java.util.ArrayList;
public class BuildVars {
    public static String APP_HASH = null;
    public static int APP_ID = 0;
    public static String BUILD_VERSION_STRING = null;
    public static boolean CHECK_UPDATES = true;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean DEBUG_VERSION = true;
    public static String GOOGLE_AUTH_CLIENT_ID = null;
    public static String HUAWEI_APP_ID = null;
    public static String HUAWEI_STORE_URL = null;
    public static boolean IS_BILLING_UNAVAILABLE = false;
    public static boolean LOGS_ENABLED = true;
    public static boolean NO_SCOPED_STORAGE = false;
    public static String PLAYSTORE_APP_URL = null;
    public static String SAFETYNET_KEY = null;
    public static boolean SUPPORTS_PASSKEYS = false;
    public static boolean USE_CLOUD_STRINGS = true;
    private static Boolean betaApp;

    static {
        boolean z4;
        boolean z10 = true;
        if (Build.VERSION.SDK_INT <= 29) {
            z4 = true;
        } else {
            z4 = false;
        }
        NO_SCOPED_STORAGE = z4;
        BUILD_VERSION_STRING = "12.10.2";
        APP_ID = 4;
        APP_HASH = "014b35b6184100b085b0d0572f9b5103";
        SAFETYNET_KEY = "AIzaSyDqt8P-7F7CPCseMkOiVRgb1LY8RN1bvH8";
        PLAYSTORE_APP_URL = "https://play.google.com/store/apps/details?id=org.telegram.messenger";
        HUAWEI_STORE_URL = "https://appgallery.huawei.com/app/C101184875";
        GOOGLE_AUTH_CLIENT_ID = "760348033671-81kmi3pi84p11ub8hp9a1funsv0rn2p9.apps.googleusercontent.com";
        HUAWEI_APP_ID = "101184875";
        IS_BILLING_UNAVAILABLE = false;
        SUPPORTS_PASSKEYS = true;
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0);
            boolean z11 = DEBUG_VERSION;
            if (!z11 && !sharedPreferences.getBoolean("logsEnabled", z11)) {
                z10 = false;
            }
            LOGS_ENABLED = z10;
            if (z10) {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public final void uncaughtException(Thread thread, Throwable th2) {
                        BuildVars.lambda$static$0(defaultUncaughtExceptionHandler, thread, th2);
                    }
                });
            }
        }
    }

    public static String getSmsHash() {
        if (ApplicationLoader.isStandaloneBuild()) {
            return "w0lkcmTZkKh";
        }
        if (DEBUG_VERSION) {
            return "O2P2z+/jBpJ";
        }
        return "oLeq9AcOZkT";
    }

    private static boolean hasDirectCurrency() {
        p2.m mVar;
        if (BillingController.getInstance().isReady() && (mVar = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
            ArrayList arrayList = mVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ArrayList arrayList2 = ((p2.l) obj).f44158b.f11056a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    p2.k kVar = (p2.k) obj2;
                    for (String str : MessagesController.getInstance(UserConfig.selectedAccount).directPaymentsCurrency) {
                        if (Objects.equals(kVar.f44156c, str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isBetaApp() {
        boolean z4;
        if (betaApp == null) {
            if (ApplicationLoader.applicationContext != null && "org.telegram.messenger.beta".equals(ApplicationLoader.applicationContext.getPackageName())) {
                z4 = true;
            } else {
                z4 = false;
            }
            betaApp = Boolean.valueOf(z4);
        }
        return betaApp.booleanValue();
    }

    public static boolean isHuaweiStoreApp() {
        return ApplicationLoader.isHuaweiStoreBuild();
    }

    public static void lambda$static$0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        FileLog.fatal(th2, false);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }

    public static boolean useInvoiceBilling() {
        if (!BillingController.billingClientEmpty && !ApplicationLoader.isStandaloneBuild()) {
            isBetaApp();
            if (!isHuaweiStoreApp() && !hasDirectCurrency()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
