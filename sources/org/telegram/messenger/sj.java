package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bo;
public final class sj implements Runnable {
    public final int f17328a = 0;
    public final int f17329b;
    public final int f17330c;
    public final boolean d;
    public final Object e;
    public final Object f17331f;

    public sj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f17331f = message;
        this.f17329b = i10;
        this.f17330c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17328a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f17331f, this.f17329b, this.f17330c, this.d);
                return;
            case 1:
                bo boVar = (bo) this.e;
                fk0 fk0Var = (fk0) this.f17331f;
                org.telegram.ui.ActionBar.n1 n1Var = boVar.Q8;
                if (n1Var != null && boVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(boVar.getParentActivity())) {
                    boVar.Q8.showAtLocation(boVar.f32519x0, 51, this.f17329b, this.f17330c);
                    if (this.d && fk0Var != null) {
                        fk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.qf(boVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) this.e;
                zg.p0 p0Var = (zg.p0) this.f17331f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = p0Var.f49121g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49120f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.o5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(R);
                    int i11 = ybVar.f30202a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17329b, this.f17330c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17331f;
                int i12 = this.f17329b;
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
                j5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f30873c.m(this.f17330c);
                return;
        }
    }

    public sj(bo boVar, int i10, int i11, boolean z10, fk0 fk0Var) {
        this.e = boVar;
        this.f17329b = i10;
        this.f17330c = i11;
        this.d = z10;
        this.f17331f = fk0Var;
    }

    public sj(org.telegram.ui.Components.yb ybVar, zg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = ybVar;
        this.f17331f = p0Var;
        this.d = z10;
        this.f17329b = i10;
        this.f17330c = i11;
    }

    public sj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f17329b = i10;
        this.d = z10;
        this.f17331f = j5Var;
        this.f17330c = i11;
    }
}
