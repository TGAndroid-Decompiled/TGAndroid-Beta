package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.eo;
public final class hj implements Runnable {
    public final int f17821a = 0;
    public final int f17822b;
    public final int f17823c;
    public final boolean d;
    public final Object f17824e;
    public final Object f17825f;

    public hj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f17824e = sendMessagesHelper;
        this.f17825f = message;
        this.f17822b = i10;
        this.f17823c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17821a) {
            case 0:
                ((SendMessagesHelper) this.f17824e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f17825f, this.f17822b, this.f17823c, this.d);
                return;
            case 1:
                eo eoVar = (eo) this.f17824e;
                nl0 nl0Var = (nl0) this.f17825f;
                org.telegram.ui.ActionBar.m1 m1Var = eoVar.Q8;
                if (m1Var != null && eoVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(eoVar.getParentActivity())) {
                    eoVar.Q8.showAtLocation(eoVar.f37483x0, 51, this.f17822b, this.f17823c);
                    if (this.d && nl0Var != null) {
                        nl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.vf(eoVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f17824e;
                zg.n0 n0Var = (zg.n0) this.f17825f;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                long j3 = n0Var.f54850g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54849f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(R);
                    int i11 = ccVar.f24917a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17822b, this.f17823c, R, 6);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f17824e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17825f;
                int i12 = this.f17822b;
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
                j5Var.f22103e.b(0, !z10, true);
                notificationsSettingsActivity.f33679c.m(this.f17823c);
                return;
        }
    }

    public hj(eo eoVar, int i10, int i11, boolean z10, nl0 nl0Var) {
        this.f17824e = eoVar;
        this.f17822b = i10;
        this.f17823c = i11;
        this.d = z10;
        this.f17825f = nl0Var;
    }

    public hj(org.telegram.ui.Components.cc ccVar, zg.n0 n0Var, boolean z10, int i10, int i11) {
        this.f17824e = ccVar;
        this.f17825f = n0Var;
        this.d = z10;
        this.f17822b = i10;
        this.f17823c = i11;
    }

    public hj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.f17824e = notificationsSettingsActivity;
        this.f17822b = i10;
        this.d = z10;
        this.f17825f = j5Var;
        this.f17823c = i11;
    }
}
