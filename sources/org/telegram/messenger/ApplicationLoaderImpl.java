package org.telegram.messenger;

import android.app.Activity;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.CustomProperties;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.analytics.EventProperties;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.utils.async.AppCenterConsumer;
public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    @Override
    protected String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    @Override
    protected void startAppCenterInternal(Activity activity) {
        try {
            if (BuildVars.DEBUG_VERSION) {
                Distribute.setEnabledForDebuggableBuild(true);
                if (TextUtils.isEmpty(BuildConfig.APP_CENTER_HASH)) {
                    throw new RuntimeException("App Center hash is empty. add to local.properties field APP_CENTER_HASH_PRIVATE and APP_CENTER_HASH_PUBLIC");
                }
                AppCenter.start(activity.getApplication(), BuildConfig.APP_CENTER_HASH, Distribute.class, Crashes.class, Analytics.class);
                Crashes.getMinidumpDirectory().thenAccept(new AppCenterConsumer() {
                    @Override
                    public final void accept(Object obj) {
                        ApplicationLoaderImpl.lambda$startAppCenterInternal$0((String) obj);
                    }
                });
                CustomProperties customProperties = new CustomProperties();
                customProperties.set("model", Build.MODEL);
                customProperties.set("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    customProperties.set("model", Build.SOC_MODEL);
                    customProperties.set("manufacturer", Build.SOC_MANUFACTURER);
                }
                customProperties.set("device", Build.DEVICE);
                customProperties.set("product", Build.PRODUCT);
                customProperties.set("hardware", Build.HARDWARE);
                customProperties.set("user", Build.USER);
                AppCenter.setCustomProperties(customProperties);
                AppCenter.setUserId("uid=" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void lambda$startAppCenterInternal$0(String str) {
        if (str != null) {
            Utilities.setupNativeCrashesListener(str);
        }
    }

    @Override
    protected void checkForUpdatesInternal() {
        try {
            if (!BuildVars.DEBUG_VERSION || SystemClock.elapsedRealtime() - lastUpdateCheckTime < 3600000) {
                return;
            }
            lastUpdateCheckTime = SystemClock.elapsedRealtime();
            Distribute.checkForUpdate();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    protected void appCenterLogInternal(Throwable th) {
        try {
            Crashes.trackError(th);
        } catch (Throwable unused) {
        }
    }

    @Override
    protected void logDualCameraInternal(boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("dual-camera[");
            sb.append((Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase());
            sb.append("]");
            String sb2 = sb.toString();
            EventProperties eventProperties = new EventProperties().set("success", z).set("vendor", z2);
            Analytics.trackEvent(sb2, eventProperties.set("product", Build.PRODUCT + "").set("model", Build.MODEL));
        } catch (Throwable unused) {
        }
    }
}
