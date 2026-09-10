package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.eo;
public final class ak implements Runnable {
    public final int f14730a = 0;
    public final int f14731b;
    public final int f14732c;
    public final boolean d;
    public final Object e;
    public final Object f14733f;

    public ak(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f14733f = message;
        this.f14731b = i10;
        this.f14732c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        fg.n nVar;
        int i10;
        switch (this.f14730a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f14733f, this.f14731b, this.f14732c, this.d);
                return;
            case 1:
                eo eoVar = (eo) this.e;
                pk0 pk0Var = (pk0) this.f14733f;
                org.telegram.ui.ActionBar.p1 p1Var = eoVar.Q8;
                if (p1Var != null && eoVar.fragmentView != null && !p1Var.isShowing() && AndroidUtilities.isActivityRunning(eoVar.getParentActivity())) {
                    eoVar.Q8.showAtLocation(eoVar.f32542x0, 51, this.f14731b, this.f14732c);
                    if (this.d && pk0Var != null) {
                        pk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.sf(eoVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) this.e;
                yg.p0 p0Var = (yg.p0) this.f14733f;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                long j3 = p0Var.f47102g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f47101f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(R);
                    int i11 = zbVar.f29637a.h;
                    if (this.d) {
                        nVar = new fg.n(this.f14731b, this.f14732c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f14733f;
                int i12 = this.f14731b;
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
                notificationsSettingsActivity.f29989c.m(this.f14732c);
                return;
        }
    }

    public ak(eo eoVar, int i10, int i11, boolean z10, pk0 pk0Var) {
        this.e = eoVar;
        this.f14731b = i10;
        this.f14732c = i11;
        this.d = z10;
        this.f14733f = pk0Var;
    }

    public ak(org.telegram.ui.Components.zb zbVar, yg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = zbVar;
        this.f14733f = p0Var;
        this.d = z10;
        this.f14731b = i10;
        this.f14732c = i11;
    }

    public ak(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f14731b = i10;
        this.d = z10;
        this.f14733f = j5Var;
        this.f14732c = i11;
    }
}
