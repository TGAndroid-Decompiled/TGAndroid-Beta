package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.CustomProperties;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.utils.async.AppCenterConsumer;
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.IUpdateLayout;

public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    @Override
    protected boolean isBeta() {
        return true;
    }

    @Override
    protected void logDualCameraInternal(boolean z, boolean z2) {
    }

    @Override
    protected String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    private String getVersionName(int i) {
        if (i == 0) {
            return "local-debug";
        }
        if (i == 1) {
            return "private";
        }
        if (i == 4) {
            return "public";
        }
        if (i == 5) {
            return "hardcore";
        }
        if (i == 6) {
            return "standalone";
        }
        if (i == 7) {
            return "release";
        }
        return "unknown";
    }

    @Override
    protected void startAppCenterInternal(Activity activity) {
        try {
            if (BuildVars.DEBUG_VERSION) {
                String str = "" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str = "@" + publicUsername;
                    }
                }
                if (ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend()) {
                    str = str + " [TEST SERVER]";
                }
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.setUserId(str);
                firebaseCrashlytics.setCustomKey("version", getVersionName(4));
                firebaseCrashlytics.setCustomKey("model", Build.MODEL);
                firebaseCrashlytics.setCustomKey("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    firebaseCrashlytics.setCustomKey("soc_model", Build.SOC_MODEL);
                    firebaseCrashlytics.setCustomKey("soc_manufacturer", Build.SOC_MANUFACTURER);
                }
                firebaseCrashlytics.setCustomKey("device", Build.DEVICE);
                firebaseCrashlytics.setCustomKey("product", Build.PRODUCT);
                firebaseCrashlytics.setCustomKey("hardware", Build.HARDWARE);
                firebaseCrashlytics.setCustomKey("user", Build.USER);
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
            }
            if (BuildVars.DEBUG_VERSION) {
                Distribute.setEnabledForDebuggableBuild(true);
                if (!TextUtils.isEmpty("f9726602-67c9-48d2-b5d0-4761f1c1a8f3")) {
                    AppCenter.start(activity.getApplication(), "f9726602-67c9-48d2-b5d0-4761f1c1a8f3", Distribute.class, Crashes.class, Analytics.class);
                    Crashes.getMinidumpDirectory().thenAccept(new AppCenterConsumer() {
                        @Override
                        public final void accept(Object obj) {
                            ApplicationLoaderImpl.m358$r8$lambda$iduE1Rxk3r4juvJqEO1Jt_RGXI((String) obj);
                        }
                    });
                    CustomProperties customProperties = new CustomProperties();
                    customProperties.set("model", Build.MODEL);
                    customProperties.set("manufacturer", Build.MANUFACTURER);
                    if (Build.VERSION.SDK_INT >= 31) {
                        customProperties.set("soc_model", Build.SOC_MODEL);
                        customProperties.set("soc_manufacturer", Build.SOC_MANUFACTURER);
                    }
                    customProperties.set("device", Build.DEVICE);
                    customProperties.set("product", Build.PRODUCT);
                    customProperties.set("hardware", Build.HARDWARE);
                    customProperties.set("user", Build.USER);
                    AppCenter.setCustomProperties(customProperties);
                    String str2 = "uid=" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                    if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                        String publicUsername2 = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        if (!TextUtils.isEmpty(publicUsername2)) {
                            str2 = str2 + " @" + publicUsername2;
                        }
                    }
                    AppCenter.setUserId(str2);
                    return;
                }
                throw new RuntimeException("App Center hash is empty. add to local.properties field APP_CENTER_HASH_PRIVATE and APP_CENTER_HASH_PUBLIC");
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public static void m358$r8$lambda$iduE1Rxk3r4juvJqEO1Jt_RGXI(String str) {
        if (str != null) {
            Utilities.setupNativeCrashesListener(str);
        }
    }

    @Override
    protected void checkForUpdatesInternal() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
                Distribute.checkForUpdate();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    protected void appCenterLogInternal(Throwable th) {
        try {
            FirebaseCrashlytics.getInstance().recordException(th);
        } catch (Throwable th2) {
            FileLog.e(th2, false);
        }
        try {
            Crashes.trackError(th);
        } catch (Throwable unused) {
        }
    }

    @Override
    public boolean checkApkInstallPermissions(Context context) {
        if (Build.VERSION.SDK_INT < 26 || ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
            return true;
        }
        AlertsCreator.createApkRestrictedDialog(context, null).show();
        return false;
    }

    @Override
    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        boolean zExists = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            zExists = pathToAttach.exists();
            if (zExists) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return zExists;
    }

    @Override
    public boolean isCustomUpdate() {
        return !TextUtils.isEmpty("https://telegram.org/dl/android/apk-public-beta.json");
    }

    @Override
    public BetaUpdate getUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getUpdate();
        }
        return null;
    }

    @Override
    public void checkUpdate(boolean z, Runnable runnable) {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().checkForUpdate(z, runnable);
        }
    }

    @Override
    public void downloadUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().downloadUpdate();
        }
    }

    @Override
    public void cancelDownloadingUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().cancelDownloadingUpdate();
        }
    }

    @Override
    public boolean isDownloadingUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().isDownloading();
        }
        return false;
    }

    @Override
    public float getDownloadingUpdateProgress() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadingProgress();
        }
        return 0.0f;
    }

    @Override
    public File getDownloadedUpdateFile() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadedFile();
        }
        return null;
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (isCustomUpdate()) {
            return new UpdateLayout(activity, viewGroup);
        }
        return null;
    }

    @Override
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i) {
        try {
            new UpdateAppAlertDialog(context, betaUpdate, i).show();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }
}
