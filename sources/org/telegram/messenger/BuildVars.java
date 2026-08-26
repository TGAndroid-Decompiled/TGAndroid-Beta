package org.telegram.messenger;

import android.content.SharedPreferences;
import android.os.Build;
import com.android.billingclient.api.ProductDetails;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

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
        boolean z = true;
        NO_SCOPED_STORAGE = Build.VERSION.SDK_INT <= 29;
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
            boolean z2 = DEBUG_VERSION;
            if (!z2 && !sharedPreferences.getBoolean("logsEnabled", z2)) {
                z = false;
            }
            LOGS_ENABLED = z;
            if (z) {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public final void uncaughtException(Thread thread, Throwable th) {
                        BuildVars.lambda$static$0(defaultUncaughtExceptionHandler, thread, th);
                    }
                });
            }
        }
    }

    public static String getSmsHash() {
        if (ApplicationLoader.isStandaloneBuild()) {
            return "w0lkcmTZkKh";
        }
        return DEBUG_VERSION ? "O2P2z+/jBpJ" : "oLeq9AcOZkT";
    }

    private static boolean hasDirectCurrency() {
        ProductDetails productDetails;
        if (BillingController.getInstance().isReady() && (productDetails = BillingController.PREMIUM_PRODUCT_DETAILS) != null) {
            ArrayList arrayList = productDetails.zzj;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((ProductDetails.SubscriptionOfferDetails) obj).zzd.mControlCategories;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ProductDetails.PricingPhase pricingPhase = (ProductDetails.PricingPhase) obj2;
                    Iterator<String> it = MessagesController.getInstance(UserConfig.selectedAccount).directPaymentsCurrency.iterator();
                    while (it.hasNext()) {
                        if (Objects.equals(pricingPhase.zzc, it.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isBetaApp() {
        if (betaApp == null) {
            betaApp = Boolean.valueOf(ApplicationLoader.applicationContext != null && "org.telegram.messenger.beta".equals(ApplicationLoader.applicationContext.getPackageName()));
        }
        return betaApp.booleanValue();
    }

    public static boolean isHuaweiStoreApp() {
        return ApplicationLoader.isHuaweiStoreBuild();
    }

    public static void lambda$static$0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        FileLog.fatal(th, false);
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public static boolean useInvoiceBilling() {
        if (BillingController.billingClientEmpty || ApplicationLoader.isStandaloneBuild()) {
            return true;
        }
        isBetaApp();
        return isHuaweiStoreApp() || hasDirectCurrency();
    }
}
