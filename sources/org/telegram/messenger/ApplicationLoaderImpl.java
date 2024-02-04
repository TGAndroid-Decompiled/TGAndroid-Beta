package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.IUpdateLayout;
public class ApplicationLoaderImpl extends ApplicationLoader {
    @Override
    protected void appCenterLogInternal(Throwable th) {
    }

    @Override
    protected void checkForUpdatesInternal() {
    }

    @Override
    protected boolean isStandalone() {
        return true;
    }

    @Override
    protected void logDualCameraInternal(boolean z, boolean z2) {
    }

    @Override
    protected String onGetApplicationId() {
        return "org.telegram.messenger.web";
    }

    @Override
    protected void startAppCenterInternal(Activity activity) {
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
    public boolean openApkInstall(Activity activity, TLRPC$Document tLRPC$Document) {
        boolean z = false;
        try {
            FileLoader.getAttachFileName(tLRPC$Document);
            File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tLRPC$Document, true);
            z = pathToAttach.exists();
            if (z) {
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
        return z;
    }

    @Override
    public boolean showUpdateAppPopup(Context context, TLRPC$TL_help_appUpdate tLRPC$TL_help_appUpdate, int i) {
        try {
            new UpdateAppAlertDialog(context, tLRPC$TL_help_appUpdate, i).show();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    @Override
    public IUpdateLayout takeUpdateLayout(Activity activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        return new UpdateLayout(activity, viewGroup, viewGroup2);
    }
}
