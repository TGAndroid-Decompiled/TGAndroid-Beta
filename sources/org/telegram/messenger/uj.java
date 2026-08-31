package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.xn;
public final class uj implements Runnable {
    public final int f20221a = 0;
    public final int f20222b;
    public final int f20223c;
    public final boolean d;
    public final Object f20224e;
    public final Object f20225f;

    public uj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z4) {
        this.f20224e = sendMessagesHelper;
        this.f20225f = message;
        this.f20222b = i10;
        this.f20223c = i11;
        this.d = z4;
    }

    @Override
    public final void run() {
        TLRPC.Document f10;
        j3.v vVar;
        int i10;
        switch (this.f20221a) {
            case 0:
                ((SendMessagesHelper) this.f20224e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f20225f, this.f20222b, this.f20223c, this.d);
                return;
            case 1:
                xn xnVar = (xn) this.f20224e;
                rk0 rk0Var = (rk0) this.f20225f;
                org.telegram.ui.ActionBar.p1 p1Var = xnVar.N8;
                if (p1Var != null && xnVar.fragmentView != null && !p1Var.isShowing() && AndroidUtilities.isActivityRunning(xnVar.getParentActivity())) {
                    xnVar.N8.showAtLocation(xnVar.f43362u0, 51, this.f20222b, this.f20223c);
                    if (this.d && rk0Var != null) {
                        rk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lf(xnVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.sb sbVar = (org.telegram.ui.Components.sb) this.f20224e;
                ng.q0 q0Var = (ng.q0) this.f20225f;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                long j10 = q0Var.f16179g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f16178f);
                    if (tL_availableReaction != null) {
                        f10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f10 = org.telegram.ui.Components.l5.f(UserConfig.selectedAccount, j10);
                }
                if (f10 != null && R != null) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(R);
                    int i11 = sbVar.f31026a.h;
                    if (this.d) {
                        vVar = new j3.v(this.f20222b, this.f20223c, R, 6);
                    } else {
                        vVar = null;
                    }
                    a02.y(i11, f10, vVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f20224e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f20225f;
                int i12 = this.f20222b;
                boolean z4 = this.d;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z4) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i12);
                } else if (i12 != 4 && i12 != 5) {
                    NotificationsController notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z4) {
                        i10 = 0;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    notificationsController.setGlobalNotificationsEnabled(i12, i10);
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z4) {
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
                j5Var.f23019e.b(0, !z4, true);
                notificationsSettingsActivity.f34197c.m(this.f20223c);
                return;
        }
    }

    public uj(xn xnVar, int i10, int i11, boolean z4, rk0 rk0Var) {
        this.f20224e = xnVar;
        this.f20222b = i10;
        this.f20223c = i11;
        this.d = z4;
        this.f20225f = rk0Var;
    }

    public uj(org.telegram.ui.Components.sb sbVar, ng.q0 q0Var, boolean z4, int i10, int i11) {
        this.f20224e = sbVar;
        this.f20225f = q0Var;
        this.d = z4;
        this.f20222b = i10;
        this.f20223c = i11;
    }

    public uj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z4, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.f20224e = notificationsSettingsActivity;
        this.f20222b = i10;
        this.d = z4;
        this.f20225f = j5Var;
        this.f20223c = i11;
    }
}
