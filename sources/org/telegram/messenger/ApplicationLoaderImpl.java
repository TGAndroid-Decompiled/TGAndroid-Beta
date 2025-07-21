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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UpdateButton;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.IUpdateButton;
import org.telegram.ui.IUpdateLayout;

public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i) {
        return i != 0 ? i != 1 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "unknown" : "release" : "standalone" : "hardcore" : "public" : "private" : "local-debug";
    }

    public static void lambda$startAppCenterInternal$0(String str) {
        if (str != null) {
            Utilities.setupNativeCrashesListener(str);
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
    public void cancelDownloadingUpdate() {
        if (isCustomUpdate()) {
            BetaUpdaterController.getInstance().cancelDownloadingUpdate();
        }
    }

    @Override
    public boolean checkApkInstallPermissions(Context context) {
        boolean canRequestPackageInstalls;
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        canRequestPackageInstalls = ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls();
        if (canRequestPackageInstalls) {
            return true;
        }
        AlertsCreator.createApkRestrictedDialog(context, null).show();
        return false;
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
    public File getDownloadedUpdateFile() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadedFile();
        }
        return null;
    }

    @Override
    public float getDownloadingUpdateProgress() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getDownloadingProgress();
        }
        return 0.0f;
    }

    @Override
    public BetaUpdate getUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().getUpdate();
        }
        return null;
    }

    @Override
    protected boolean isBeta() {
        return true;
    }

    @Override
    public boolean isCustomUpdate() {
        return !TextUtils.isEmpty("https://telegram.org/dl/android/apk-public-beta.json");
    }

    @Override
    public boolean isDownloadingUpdate() {
        if (isCustomUpdate()) {
            return BetaUpdaterController.getInstance().isDownloading();
        }
        return false;
    }

    @Override
    protected void logDualCameraInternal(boolean z, boolean z2) {
    }

    @Override
    protected String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    @Override
    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        Uri fromFile;
        boolean z = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            z = pathToAttach.exists();
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    fromFile = FileProvider.getUriForFile(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach);
                } else {
                    fromFile = Uri.fromFile(pathToAttach);
                }
                intent.setDataAndType(fromFile, "application/vnd.android.package-archive");
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return z;
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

    @Override
    protected void startAppCenterInternal(Activity activity) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            if (BuildVars.DEBUG_VERSION) {
                String str5 = "" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str5 = "@" + publicUsername;
                    }
                }
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                firebaseCrashlytics.setUserId(str5);
                firebaseCrashlytics.setCustomKey("version", getVersionName(4));
                firebaseCrashlytics.setCustomKey("model", Build.MODEL);
                firebaseCrashlytics.setCustomKey("manufacturer", Build.MANUFACTURER);
                if (Build.VERSION.SDK_INT >= 31) {
                    str3 = Build.SOC_MODEL;
                    firebaseCrashlytics.setCustomKey("soc_model", str3);
                    str4 = Build.SOC_MANUFACTURER;
                    firebaseCrashlytics.setCustomKey("soc_manufacturer", str4);
                }
                firebaseCrashlytics.setCustomKey("device", Build.DEVICE);
                firebaseCrashlytics.setCustomKey("product", Build.PRODUCT);
                firebaseCrashlytics.setCustomKey("hardware", Build.HARDWARE);
                firebaseCrashlytics.setCustomKey("user", Build.USER);
                firebaseCrashlytics.setCrashlyticsCollectionEnabled(true);
            }
            if (BuildVars.DEBUG_VERSION) {
                Distribute.setEnabledForDebuggableBuild(true);
                if (TextUtils.isEmpty("f9726602-67c9-48d2-b5d0-4761f1c1a8f3")) {
                    throw new RuntimeException("App Center hash is empty. add to local.properties field APP_CENTER_HASH_PRIVATE and APP_CENTER_HASH_PUBLIC");
                }
                AppCenter.start(activity.getApplication(), "f9726602-67c9-48d2-b5d0-4761f1c1a8f3", Distribute.class, Crashes.class, Analytics.class);
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
                    str = Build.SOC_MODEL;
                    customProperties.set("soc_model", str);
                    str2 = Build.SOC_MANUFACTURER;
                    customProperties.set("soc_manufacturer", str2);
                }
                customProperties.set("device", Build.DEVICE);
                customProperties.set("product", Build.PRODUCT);
                customProperties.set("hardware", Build.HARDWARE);
                customProperties.set("user", Build.USER);
                AppCenter.setCustomProperties(customProperties);
                String str6 = "uid=" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername2 = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername2)) {
                        str6 = str6 + " @" + publicUsername2;
                    }
                }
                AppCenter.setUserId(str6);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public IUpdateButton takeUpdateButton(Context context) {
        if (isCustomUpdate()) {
            return new UpdateButton(context);
        }
        return null;
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (isCustomUpdate()) {
            return new UpdateLayout(activity, viewGroup, viewGroup2);
        }
        return null;
    }
}
