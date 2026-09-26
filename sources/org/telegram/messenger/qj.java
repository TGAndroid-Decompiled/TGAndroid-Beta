package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.wn;
public final class qj implements Runnable {
    public final int f17410a = 0;
    public final int f17411b;
    public final int f17412c;
    public final boolean d;
    public final Object e;
    public final Object f17413f;

    public qj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f17413f = message;
        this.f17411b = i10;
        this.f17412c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17410a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f17413f, this.f17411b, this.f17412c, this.d);
                return;
            case 1:
                wn wnVar = (wn) this.e;
                rk0 rk0Var = (rk0) this.f17413f;
                org.telegram.ui.ActionBar.m1 m1Var = wnVar.Q8;
                if (m1Var != null && wnVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(wnVar.getParentActivity())) {
                    wnVar.Q8.showAtLocation(wnVar.f39694x0, 51, this.f17411b, this.f17412c);
                    if (this.d && rk0Var != null) {
                        rk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.of(wnVar, 26), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                zg.o0 o0Var = (zg.o0) this.f17413f;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                long j3 = o0Var.f49396g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f49395f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(R);
                    int i11 = acVar.f22600a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17411b, this.f17412c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17413f;
                int i12 = this.f17411b;
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
                notificationsSettingsActivity.f31161c.m(this.f17412c);
                return;
        }
    }

    public qj(wn wnVar, int i10, int i11, boolean z10, rk0 rk0Var) {
        this.e = wnVar;
        this.f17411b = i10;
        this.f17412c = i11;
        this.d = z10;
        this.f17413f = rk0Var;
    }

    public qj(org.telegram.ui.Components.ac acVar, zg.o0 o0Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f17413f = o0Var;
        this.d = z10;
        this.f17411b = i10;
        this.f17412c = i11;
    }

    public qj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f17411b = i10;
        this.d = z10;
        this.f17413f = j5Var;
        this.f17412c = i11;
    }
}
