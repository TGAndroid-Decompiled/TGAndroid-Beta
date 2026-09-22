package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.zn;
public final class rj implements Runnable {
    public final int f17492a = 0;
    public final int f17493b;
    public final int f17494c;
    public final boolean d;
    public final Object e;
    public final Object f17495f;

    public rj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f17495f = message;
        this.f17493b = i10;
        this.f17494c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17492a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f17495f, this.f17493b, this.f17494c, this.d);
                return;
            case 1:
                zn znVar = (zn) this.e;
                sk0 sk0Var = (sk0) this.f17495f;
                org.telegram.ui.ActionBar.n1 n1Var = znVar.Q8;
                if (n1Var != null && znVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(znVar.getParentActivity())) {
                    znVar.Q8.showAtLocation(znVar.f40551x0, 51, this.f17493b, this.f17494c);
                    if (this.d && sk0Var != null) {
                        sk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.rf(znVar, 26), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) this.e;
                zg.p0 p0Var = (zg.p0) this.f17495f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = p0Var.f49448g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49447f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(R);
                    int i11 = zbVar.f30870a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17493b, this.f17494c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) this.f17495f;
                int i12 = this.f17493b;
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
                k5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f31181c.m(this.f17494c);
                return;
        }
    }

    public rj(zn znVar, int i10, int i11, boolean z10, sk0 sk0Var) {
        this.e = znVar;
        this.f17493b = i10;
        this.f17494c = i11;
        this.d = z10;
        this.f17495f = sk0Var;
    }

    public rj(org.telegram.ui.Components.zb zbVar, zg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = zbVar;
        this.f17495f = p0Var;
        this.d = z10;
        this.f17493b = i10;
        this.f17494c = i11;
    }

    public rj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.k5 k5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f17493b = i10;
        this.d = z10;
        this.f17495f = k5Var;
        this.f17494c = i11;
    }
}
