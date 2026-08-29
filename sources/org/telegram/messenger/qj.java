package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.tn;
public final class qj implements Runnable {
    public final int f21376a = 0;
    public final int f21377b;
    public final int f21378c;
    public final boolean d;
    public final Object f21379e;
    public final Object f21380f;

    public qj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f21379e = sendMessagesHelper;
        this.f21380f = message;
        this.f21377b = i10;
        this.f21378c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f9;
        j3.y yVar;
        int i10;
        switch (this.f21376a) {
            case 0:
                ((SendMessagesHelper) this.f21379e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f21380f, this.f21377b, this.f21378c, this.d);
                return;
            case 1:
                tn tnVar = (tn) this.f21379e;
                fk0 fk0Var = (fk0) this.f21380f;
                org.telegram.ui.ActionBar.o1 o1Var = tnVar.M8;
                if (o1Var != null && tnVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(tnVar.getParentActivity())) {
                    tnVar.M8.showAtLocation(tnVar.f42973t0, 51, this.f21377b, this.f21378c);
                    if (this.d && fk0Var != null) {
                        fk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.df(tnVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) this.f21379e;
                kg.q0 q0Var = (kg.q0) this.f21380f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j10 = q0Var.f13826g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f13825f);
                    if (tL_availableReaction != null) {
                        f9 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f9 = org.telegram.ui.Components.p5.f(UserConfig.selectedAccount, j10);
                }
                if (f9 != null && R != null) {
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(R);
                    int i11 = wbVar.f34362a.h;
                    if (this.d) {
                        yVar = new j3.y(this.f21377b, this.f21378c, R, 6);
                    } else {
                        yVar = null;
                    }
                    a02.y(i11, f9, yVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f21379e;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) this.f21380f;
                int i12 = this.f21377b;
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
                h5Var.f24453e.b(0, !z10, true);
                notificationsSettingsActivity.f35623c.m(this.f21378c);
                return;
        }
    }

    public qj(tn tnVar, int i10, int i11, boolean z10, fk0 fk0Var) {
        this.f21379e = tnVar;
        this.f21377b = i10;
        this.f21378c = i11;
        this.d = z10;
        this.f21380f = fk0Var;
    }

    public qj(org.telegram.ui.Components.wb wbVar, kg.q0 q0Var, boolean z10, int i10, int i11) {
        this.f21379e = wbVar;
        this.f21380f = q0Var;
        this.d = z10;
        this.f21377b = i10;
        this.f21378c = i11;
    }

    public qj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i11) {
        this.f21379e = notificationsSettingsActivity;
        this.f21377b = i10;
        this.d = z10;
        this.f21380f = h5Var;
        this.f21378c = i11;
    }
}
