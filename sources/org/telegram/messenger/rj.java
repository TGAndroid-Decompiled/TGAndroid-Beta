package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.co;
public final class rj implements Runnable {
    public final int f18921a = 0;
    public final int f18922b;
    public final int f18923c;
    public final boolean d;
    public final Object f18924e;
    public final Object f18925f;

    public rj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f18924e = sendMessagesHelper;
        this.f18925f = message;
        this.f18922b = i10;
        this.f18923c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        hg.n nVar;
        int i10;
        switch (this.f18921a) {
            case 0:
                ((SendMessagesHelper) this.f18924e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f18925f, this.f18922b, this.f18923c, this.d);
                return;
            case 1:
                co coVar = (co) this.f18924e;
                fk0 fk0Var = (fk0) this.f18925f;
                org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
                if (n1Var != null && coVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(coVar.getParentActivity())) {
                    coVar.Q8.showAtLocation(coVar.f35473x0, 51, this.f18922b, this.f18923c);
                    if (this.d && fk0Var != null) {
                        fk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.qf(coVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.f18924e;
                ah.j1 j1Var = (ah.j1) this.f18925f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = j1Var.f598g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f597f);
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
                    int i11 = acVar.f24328a.h;
                    if (this.d) {
                        nVar = new hg.n(this.f18922b, this.f18923c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f18924e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f18925f;
                int i12 = this.f18922b;
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
                i5Var.f22096e.b(0, !z10, true);
                notificationsSettingsActivity.f33486c.m(this.f18923c);
                return;
        }
    }

    public rj(co coVar, int i10, int i11, boolean z10, fk0 fk0Var) {
        this.f18924e = coVar;
        this.f18922b = i10;
        this.f18923c = i11;
        this.d = z10;
        this.f18925f = fk0Var;
    }

    public rj(org.telegram.ui.Components.ac acVar, ah.j1 j1Var, boolean z10, int i10, int i11) {
        this.f18924e = acVar;
        this.f18925f = j1Var;
        this.d = z10;
        this.f18922b = i10;
        this.f18923c = i11;
    }

    public rj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.f18924e = notificationsSettingsActivity;
        this.f18922b = i10;
        this.d = z10;
        this.f18925f = i5Var;
        this.f18923c = i11;
    }
}
