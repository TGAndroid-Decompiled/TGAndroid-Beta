package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bo;
public final class sj implements Runnable {
    public final int f17340a = 0;
    public final int f17341b;
    public final int f17342c;
    public final boolean d;
    public final Object e;
    public final Object f17343f;

    public sj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f17343f = message;
        this.f17341b = i10;
        this.f17342c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17340a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f17343f, this.f17341b, this.f17342c, this.d);
                return;
            case 1:
                bo boVar = (bo) this.e;
                gk0 gk0Var = (gk0) this.f17343f;
                org.telegram.ui.ActionBar.o1 o1Var = boVar.Q8;
                if (o1Var != null && boVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(boVar.getParentActivity())) {
                    boVar.Q8.showAtLocation(boVar.f32506x0, 51, this.f17341b, this.f17342c);
                    if (this.d && gk0Var != null) {
                        gk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.sf(boVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) this.e;
                zg.p0 p0Var = (zg.p0) this.f17343f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j3 = p0Var.f49156g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49155f);
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
                    int i11 = ybVar.f30165a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17341b, this.f17342c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f17343f;
                int i12 = this.f17341b;
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
                i5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f30893c.m(this.f17342c);
                return;
        }
    }

    public sj(bo boVar, int i10, int i11, boolean z10, gk0 gk0Var) {
        this.e = boVar;
        this.f17341b = i10;
        this.f17342c = i11;
        this.d = z10;
        this.f17343f = gk0Var;
    }

    public sj(org.telegram.ui.Components.yb ybVar, zg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = ybVar;
        this.f17343f = p0Var;
        this.d = z10;
        this.f17341b = i10;
        this.f17342c = i11;
    }

    public sj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f17341b = i10;
        this.d = z10;
        this.f17343f = i5Var;
        this.f17342c = i11;
    }
}
