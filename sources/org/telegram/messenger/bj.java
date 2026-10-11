package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.zn;
public final class bj implements Runnable {
    public final int f17453a = 0;
    public final int f17454b;
    public final int f17455c;
    public final boolean d;
    public final Object f17456e;
    public final Object f17457f;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f17456e = sendMessagesHelper;
        this.f17457f = message;
        this.f17454b = i10;
        this.f17455c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17453a) {
            case 0:
                ((SendMessagesHelper) this.f17456e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f17457f, this.f17454b, this.f17455c, this.d);
                return;
            case 1:
                zn znVar = (zn) this.f17456e;
                ml0 ml0Var = (ml0) this.f17457f;
                org.telegram.ui.ActionBar.m1 m1Var = znVar.Q8;
                if (m1Var != null && znVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(znVar.getParentActivity())) {
                    znVar.Q8.showAtLocation(znVar.f44989x0, 51, this.f17454b, this.f17455c);
                    if (this.d && ml0Var != null) {
                        ml0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.qf(znVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f17456e;
                zg.n0 n0Var = (zg.n0) this.f17457f;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                long j3 = n0Var.f54705g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54704f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(R);
                    int i11 = ccVar.f25187a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17454b, this.f17455c, R, 6);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f17456e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17457f;
                int i12 = this.f17454b;
                boolean z10 = this.d;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i12);
                } else if (i12 != 4 && i12 != 5) {
                    NotificationsController notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i10 = 0;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    notificationsController.setGlobalNotificationsEnabled(i12, i10);
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i12);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i12);
                }
                j5Var.f22311e.b(0, !z10, true);
                notificationsSettingsActivity.f33868c.m(this.f17455c);
                return;
        }
    }

    public bj(zn znVar, int i10, int i11, boolean z10, ml0 ml0Var) {
        this.f17456e = znVar;
        this.f17454b = i10;
        this.f17455c = i11;
        this.d = z10;
        this.f17457f = ml0Var;
    }

    public bj(org.telegram.ui.Components.cc ccVar, zg.n0 n0Var, boolean z10, int i10, int i11) {
        this.f17456e = ccVar;
        this.f17457f = n0Var;
        this.d = z10;
        this.f17454b = i10;
        this.f17455c = i11;
    }

    public bj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.f17456e = notificationsSettingsActivity;
        this.f17454b = i10;
        this.d = z10;
        this.f17457f = j5Var;
        this.f17455c = i11;
    }
}
