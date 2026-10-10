package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.zn;
public final class bj implements Runnable {
    public final int f17454a = 0;
    public final int f17455b;
    public final int f17456c;
    public final boolean d;
    public final Object f17457e;
    public final Object f17458f;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f17457e = sendMessagesHelper;
        this.f17458f = message;
        this.f17455b = i10;
        this.f17456c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17454a) {
            case 0:
                ((SendMessagesHelper) this.f17457e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f17458f, this.f17455b, this.f17456c, this.d);
                return;
            case 1:
                zn znVar = (zn) this.f17457e;
                ll0 ll0Var = (ll0) this.f17458f;
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null && znVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(znVar.getParentActivity())) {
                    znVar.Q8.showAtLocation(znVar.f45034x0, 51, this.f17455b, this.f17456c);
                    if (this.d && ll0Var != null) {
                        ll0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.rf(znVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.dc dcVar = (org.telegram.ui.Components.dc) this.f17457e;
                zg.n0 n0Var = (zg.n0) this.f17458f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = n0Var.f54662g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54661f);
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
                    int i11 = dcVar.f25641a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17455b, this.f17456c, R, 6);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f17457e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17458f;
                int i12 = this.f17455b;
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
                j5Var.f22323e.b(0, !z10, true);
                notificationsSettingsActivity.f33878c.m(this.f17456c);
                return;
        }
    }

    public bj(zn znVar, int i10, int i11, boolean z10, ll0 ll0Var) {
        this.f17457e = znVar;
        this.f17455b = i10;
        this.f17456c = i11;
        this.d = z10;
        this.f17458f = ll0Var;
    }

    public bj(org.telegram.ui.Components.dc dcVar, zg.n0 n0Var, boolean z10, int i10, int i11) {
        this.f17457e = dcVar;
        this.f17458f = n0Var;
        this.d = z10;
        this.f17455b = i10;
        this.f17456c = i11;
    }

    public bj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.f17457e = notificationsSettingsActivity;
        this.f17455b = i10;
        this.d = z10;
        this.f17458f = j5Var;
        this.f17456c = i11;
    }
}
