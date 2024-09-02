package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_help_appUpdate;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_eligibleToJoin;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_join;
import org.telegram.tgnet.TL_smsjobs$TL_updateSmsJob;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.DrawerLayoutAdapter;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.UpdateAppAlertDialog;
import org.telegram.ui.Components.UpdateLayout;
import org.telegram.ui.IUpdateLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SMSStatsActivity;
import org.telegram.ui.SMSSubscribeSheet;

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

    @Override
    public TLRPC$Update parseTLUpdate(int i) {
        if (i == -245208620) {
            return new TL_smsjobs$TL_updateSmsJob();
        }
        return super.parseTLUpdate(i);
    }

    @Override
    public void processUpdate(int i, TLRPC$Update tLRPC$Update) {
        if (tLRPC$Update instanceof TL_smsjobs$TL_updateSmsJob) {
            SMSJobController.getInstance(i).processJobUpdate(((TL_smsjobs$TL_updateSmsJob) tLRPC$Update).job_id);
        }
    }

    @Override
    public boolean extendDrawer(ArrayList<DrawerLayoutAdapter.Item> arrayList) {
        if (SMSJobController.getInstance(UserConfig.selectedAccount).isAvailable()) {
            CharSequence string = LocaleController.getString(2131696922);
            if (MessagesController.getGlobalMainSettings().getBoolean("newppsms", true)) {
                string = PremiumPreviewFragment.applyNewSpan(string.toString());
            }
            DrawerLayoutAdapter.Item onClick = new DrawerLayoutAdapter.Item(93, string, 2131231238).onClick(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ApplicationLoaderImpl.lambda$extendDrawer$3(view);
                }
            });
            if (SMSStatsActivity.isAirplaneMode(LaunchActivity.instance) || SMSJobController.getInstance(UserConfig.selectedAccount).hasError()) {
                onClick.withError();
            }
            arrayList.add(onClick);
        }
        return true;
    }

    public static void lambda$extendDrawer$3(View view) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("newppsms", false).apply();
        final SMSJobController sMSJobController = SMSJobController.getInstance(UserConfig.selectedAccount);
        int i = sMSJobController.currentState;
        if (i == 0) {
            SMSSubscribeSheet.show(LaunchActivity.instance, SMSJobController.getInstance(UserConfig.selectedAccount).isEligible, null, null);
            return;
        }
        if (i == 2) {
            sMSJobController.checkSelectedSIMCard();
            if (sMSJobController.getSelectedSIM() == null) {
                new AlertDialog.Builder(LaunchActivity.instance).setTitle(LocaleController.getString(2131696927)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(2131696926))).setPositiveButton(LocaleController.getString(2131694867), null).show();
                return;
            }
        } else if (i == 1) {
            SMSSubscribeSheet.requestSMSPermissions(LaunchActivity.instance, new Runnable() {
                @Override
                public final void run() {
                    ApplicationLoaderImpl.lambda$extendDrawer$2(SMSJobController.this);
                }
            }, false);
            return;
        }
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new SMSStatsActivity());
        }
    }

    public static void lambda$extendDrawer$2(final SMSJobController sMSJobController) {
        sMSJobController.checkSelectedSIMCard();
        if (sMSJobController.getSelectedSIM() == null) {
            sMSJobController.setState(2);
            new AlertDialog.Builder(LaunchActivity.instance).setTitle(LocaleController.getString(2131696927)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(2131696926))).setPositiveButton(LocaleController.getString(2131694867), null).show();
        } else {
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(new TL_smsjobs$TL_smsjobs_join(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ApplicationLoaderImpl.lambda$extendDrawer$1(SMSJobController.this, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public static void lambda$extendDrawer$1(final SMSJobController sMSJobController, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ApplicationLoaderImpl.lambda$extendDrawer$0(TLRPC$TL_error.this, tLObject, sMSJobController);
            }
        });
    }

    public static void lambda$extendDrawer$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, SMSJobController sMSJobController) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString(2131698006)).show();
            return;
        }
        sMSJobController.setState(3);
        sMSJobController.loadStatus(true);
        SMSSubscribeSheet.showSubscribed(LaunchActivity.instance, null);
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            lastFragment.presentFragment(new SMSStatsActivity());
        }
    }

    @Override
    public boolean checkRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        if (SMSSubscribeSheet.checkSMSPermissions(i, strArr, iArr)) {
            return true;
        }
        return super.checkRequestPermissionResult(i, strArr, iArr);
    }

    @Override
    public boolean onSuggestionFill(String str, CharSequence[] charSequenceArr, boolean[] zArr) {
        if (str == null && SMSJobController.getInstance(UserConfig.selectedAccount).hasError()) {
            charSequenceArr[0] = new SpannableStringBuilder().append(SMSStatsActivity.error(17)).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(2131696921));
            charSequenceArr[1] = LocaleController.getString(2131696920);
            zArr[0] = false;
            return true;
        }
        if ("PREMIUM_SMSJOBS".equals(str) && SMSJobController.getInstance(UserConfig.selectedAccount).currentState != 3) {
            charSequenceArr[0] = LocaleController.getString(2131696924);
            charSequenceArr[1] = LocaleController.getString(2131696923);
            zArr[0] = true;
            return true;
        }
        return super.onSuggestionFill(str, charSequenceArr, zArr);
    }

    @Override
    public boolean onSuggestionClick(String str) {
        if (str == null) {
            BaseFragment lastFragment = LaunchActivity.getLastFragment();
            if (lastFragment != null) {
                SMSJobController.getInstance(UserConfig.selectedAccount).seenError();
                final SMSStatsActivity sMSStatsActivity = new SMSStatsActivity();
                lastFragment.presentFragment(sMSStatsActivity);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ApplicationLoaderImpl.lambda$onSuggestionClick$4(SMSStatsActivity.this);
                    }
                }, 800L);
            }
            return true;
        }
        if (!"PREMIUM_SMSJOBS".equals(str)) {
            return false;
        }
        SMSJobController sMSJobController = SMSJobController.getInstance(UserConfig.selectedAccount);
        TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = sMSJobController.isEligible;
        if (tL_smsjobs$TL_smsjobs_eligibleToJoin != null) {
            SMSSubscribeSheet.show(LaunchActivity.instance, tL_smsjobs$TL_smsjobs_eligibleToJoin, null, null);
        } else {
            sMSJobController.checkIsEligible(true, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ApplicationLoaderImpl.lambda$onSuggestionClick$5((TL_smsjobs$TL_smsjobs_eligibleToJoin) obj);
                }
            });
        }
        return true;
    }

    public static void lambda$onSuggestionClick$4(SMSStatsActivity sMSStatsActivity) {
        sMSStatsActivity.showDialog(new SMSStatsActivity.SMSHistorySheet(sMSStatsActivity));
    }

    public static void lambda$onSuggestionClick$5(TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin) {
        if (tL_smsjobs$TL_smsjobs_eligibleToJoin == null) {
            MessagesController.getInstance(UserConfig.selectedAccount).removeSuggestion(0L, "PREMIUM_SMSJOBS");
        } else {
            SMSSubscribeSheet.show(LaunchActivity.instance, tL_smsjobs$TL_smsjobs_eligibleToJoin, null, null);
        }
    }

    @Override
    public boolean consumePush(int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            if (!"SMSJOB".equals(jSONObject.getString("loc_key"))) {
                return false;
            }
            SMSJobController.getInstance(UserConfig.selectedAccount).processJobUpdate(jSONObject.getJSONObject("custom").getString("job_id"));
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public boolean onPause() {
        super.onPause();
        return SMSJobsNotification.check();
    }

    @Override
    public void onResume() {
        super.onResume();
        SMSJobsNotification.check();
    }

    @Override
    public BaseFragment openSettings(int i) {
        if (i == 13 && SMSJobController.getInstance(UserConfig.selectedAccount).getState() == 3) {
            return new SMSStatsActivity();
        }
        return null;
    }
}
