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
import java.io.File;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.IUpdateLayout;
public class ApplicationLoaderImpl extends ApplicationLoader {
    private static long lastUpdateCheckTime;

    private String getVersionName(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                return "unknown";
                            }
                            return "release";
                        }
                        return "standalone";
                    }
                    return "hardcore";
                }
                return "public";
            }
            return "private";
        }
        return "local-debug";
    }

    @Override
    public void appCenterLogInternal(Throwable th2) {
        try {
            s9.c cVar = (s9.c) k9.h.c().b(s9.c.class);
            if (cVar != null) {
                cVar.a(th2);
                return;
            }
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        } catch (Throwable th3) {
            FileLog.e(th3, false);
        }
    }

    @Override
    public void cancelDownloadingUpdate() {
        if (!isCustomUpdate()) {
            return;
        }
        BetaUpdaterController.getInstance().cancelDownloadingUpdate();
    }

    @Override
    public boolean checkApkInstallPermissions(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !ApplicationLoader.applicationContext.getPackageManager().canRequestPackageInstalls()) {
            org.telegram.ui.Components.e5.j(context, null).show();
            return false;
        }
        return true;
    }

    @Override
    public void checkForUpdatesInternal() {
        try {
            if (BuildVars.DEBUG_VERSION && SystemClock.elapsedRealtime() - lastUpdateCheckTime >= 3600000) {
                lastUpdateCheckTime = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public void checkUpdate(boolean z10, Runnable runnable) {
        if (!isCustomUpdate()) {
            return;
        }
        BetaUpdaterController.getInstance().checkForUpdate(z10, runnable);
    }

    @Override
    public void downloadUpdate() {
        if (!isCustomUpdate()) {
            return;
        }
        BetaUpdaterController.getInstance().downloadUpdate();
    }

    @Override
    public File getDownloadedUpdateFile() {
        if (!isCustomUpdate()) {
            return null;
        }
        return BetaUpdaterController.getInstance().getDownloadedFile();
    }

    @Override
    public float getDownloadingUpdateProgress() {
        if (!isCustomUpdate()) {
            return 0.0f;
        }
        return BetaUpdaterController.getInstance().getDownloadingProgress();
    }

    @Override
    public BetaUpdate getUpdate() {
        if (!isCustomUpdate()) {
            return null;
        }
        return BetaUpdaterController.getInstance().getUpdate();
    }

    @Override
    public boolean isBeta() {
        return true;
    }

    @Override
    public boolean isCustomUpdate() {
        return !TextUtils.isEmpty("null");
    }

    @Override
    public boolean isDownloadingUpdate() {
        if (!isCustomUpdate()) {
            return false;
        }
        return BetaUpdaterController.getInstance().isDownloading();
    }

    @Override
    public String onGetApplicationId() {
        return "org.telegram.messenger.beta";
    }

    @Override
    public boolean openApkInstall(Activity activity, TLRPC.Document document) {
        boolean z10 = false;
        try {
            FileLoader.getAttachFileName(document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true);
            z10 = pathToAttach.exists();
            if (z10) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setDataAndType(FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", pathToAttach), "application/vnd.android.package-archive");
                } else {
                    intent.setDataAndType(Uri.fromFile(pathToAttach), "application/vnd.android.package-archive");
                }
                try {
                    activity.startActivityForResult(intent, 500);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return z10;
    }

    @Override
    public boolean showCustomUpdateAppPopup(Context context, BetaUpdate betaUpdate, int i10) {
        try {
            new j61(context, betaUpdate).show();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return true;
        }
    }

    @Override
    public void startAppCenterInternal(Activity activity) {
        String str;
        try {
            if (BuildVars.DEBUG_VERSION) {
                String str2 = "" + UserConfig.getInstance(UserConfig.selectedAccount).clientUserId;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser() != null) {
                    String publicUsername = UserObject.getPublicUsername(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                    if (!TextUtils.isEmpty(publicUsername)) {
                        str2 = "@" + publicUsername;
                    }
                }
                if (ConnectionsManager.getInstance(UserConfig.selectedAccount).isTestBackend()) {
                    str2 = str2 + " [TEST SERVER]";
                }
                s9.c cVar = (s9.c) k9.h.c().b(s9.c.class);
                if (cVar != null) {
                    cVar.d(str2);
                    cVar.c("version", getVersionName(4));
                    cVar.c("model", Build.MODEL);
                    cVar.c("manufacturer", Build.MANUFACTURER);
                    if (Build.VERSION.SDK_INT >= 31) {
                        str = Build.SOC_MODEL;
                        cVar.c("soc_model", str);
                        cVar.c("soc_manufacturer", Build.SOC_MANUFACTURER);
                    }
                    cVar.c("device", Build.DEVICE);
                    cVar.c("product", Build.PRODUCT);
                    cVar.c("hardware", Build.HARDWARE);
                    cVar.c("user", Build.USER);
                    cVar.b();
                    return;
                }
                throw new NullPointerException("FirebaseCrashlytics component is not present.");
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup) {
        if (!isCustomUpdate()) {
            return null;
        }
        return new l61(activity, viewGroup);
    }

    @Override
    public void logDualCameraInternal(boolean z10, boolean z11) {
    }
}
