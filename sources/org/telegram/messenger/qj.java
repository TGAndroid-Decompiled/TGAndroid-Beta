package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.yn;
public final class qj implements Runnable {
    public final int f19008a = 0;
    public final int f19009b;
    public final int f19010c;
    public final boolean d;
    public final Object f19011e;
    public final Object f19012f;

    public qj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f19011e = sendMessagesHelper;
        this.f19012f = message;
        this.f19009b = i10;
        this.f19010c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f19008a) {
            case 0:
                ((SendMessagesHelper) this.f19011e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f19012f, this.f19009b, this.f19010c, this.d);
                return;
            case 1:
                yn ynVar = (yn) this.f19011e;
                sk0 sk0Var = (sk0) this.f19012f;
                org.telegram.ui.ActionBar.n1 n1Var = ynVar.O8;
                if (n1Var != null && ynVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(ynVar.getParentActivity())) {
                    ynVar.O8.showAtLocation(ynVar.f43525v0, 51, this.f19009b, this.f19010c);
                    if (this.d && sk0Var != null) {
                        sk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.yf(ynVar, 23), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.bc bcVar = (org.telegram.ui.Components.bc) this.f19011e;
                zg.o0 o0Var = (zg.o0) this.f19012f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = o0Var.f53480g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f53479f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.q5.f(UserConfig.selectedAccount, j3);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(R);
                    int i11 = bcVar.f24916a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f19009b, this.f19010c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f19011e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f19012f;
                int i12 = this.f19009b;
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
                j5Var.f22328e.b(0, !z10, true);
                notificationsSettingsActivity.f33830c.m(this.f19010c);
                return;
        }
    }

    public qj(yn ynVar, int i10, int i11, boolean z10, sk0 sk0Var) {
        this.f19011e = ynVar;
        this.f19009b = i10;
        this.f19010c = i11;
        this.d = z10;
        this.f19012f = sk0Var;
    }

    public qj(org.telegram.ui.Components.bc bcVar, zg.o0 o0Var, boolean z10, int i10, int i11) {
        this.f19011e = bcVar;
        this.f19012f = o0Var;
        this.d = z10;
        this.f19009b = i10;
        this.f19010c = i11;
    }

    public qj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.f19011e = notificationsSettingsActivity;
        this.f19009b = i10;
        this.d = z10;
        this.f19012f = j5Var;
        this.f19010c = i11;
    }
}
