package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.xn;
public final class rj implements Runnable {
    public final int f17235a = 0;
    public final int f17236b;
    public final int f17237c;
    public final boolean d;
    public final Object e;
    public final Object f17238f;

    public rj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f17238f = message;
        this.f17236b = i10;
        this.f17237c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        gg.n nVar;
        int i10;
        switch (this.f17235a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f17238f, this.f17236b, this.f17237c, this.d);
                return;
            case 1:
                xn xnVar = (xn) this.e;
                gk0 gk0Var = (gk0) this.f17238f;
                org.telegram.ui.ActionBar.n1 n1Var = xnVar.Q8;
                if (n1Var != null && xnVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(xnVar.getParentActivity())) {
                    xnVar.Q8.showAtLocation(xnVar.f39596x0, 51, this.f17236b, this.f17237c);
                    if (this.d && gk0Var != null) {
                        gk0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.pf(xnVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                zg.p0 p0Var = (zg.p0) this.f17238f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j3 = p0Var.f49072g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49071f);
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
                    int i11 = acVar.f22410a.h;
                    if (this.d) {
                        nVar = new gg.n(this.f17236b, this.f17237c, R, 7);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f17238f;
                int i12 = this.f17236b;
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
                notificationsSettingsActivity.f30847c.m(this.f17237c);
                return;
        }
    }

    public rj(xn xnVar, int i10, int i11, boolean z10, gk0 gk0Var) {
        this.e = xnVar;
        this.f17236b = i10;
        this.f17237c = i11;
        this.d = z10;
        this.f17238f = gk0Var;
    }

    public rj(org.telegram.ui.Components.ac acVar, zg.p0 p0Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f17238f = p0Var;
        this.d = z10;
        this.f17236b = i10;
        this.f17237c = i11;
    }

    public rj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f17236b = i10;
        this.d = z10;
        this.f17238f = j5Var;
        this.f17237c = i11;
    }
}
