package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.sn;
public final class wi implements Runnable {
    public final int f20018a = 0;
    public final int f20019b;
    public final int f20020c;
    public final boolean d;
    public final Object e;
    public final Object f20021f;

    public wi(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f20021f = message;
        this.f20019b = i10;
        this.f20020c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        hg.n nVar;
        int i10;
        switch (this.f20018a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f20021f, this.f20019b, this.f20020c, this.d);
                return;
            case 1:
                sn snVar = (sn) this.e;
                cl0 cl0Var = (cl0) this.f20021f;
                org.telegram.ui.ActionBar.m1 m1Var = snVar.Q8;
                if (m1Var != null && snVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(snVar.getParentActivity())) {
                    snVar.Q8.showAtLocation(snVar.f41454x0, 51, this.f20019b, this.f20020c);
                    if (this.d && cl0Var != null) {
                        cl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.mf(snVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                ah.i1 i1Var = (ah.i1) this.f20021f;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                long j10 = i1Var.f786g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f785f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.r5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(R);
                    int i11 = acVar.f24566a.h;
                    if (this.d) {
                        nVar = new hg.n(this.f20019b, this.f20020c, R, 6);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) this.f20021f;
                int i12 = this.f20019b;
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
                notificationsSettingsActivity.f33212c.m(this.f20020c);
                return;
        }
    }

    public wi(sn snVar, int i10, int i11, boolean z10, cl0 cl0Var) {
        this.e = snVar;
        this.f20019b = i10;
        this.f20020c = i11;
        this.d = z10;
        this.f20021f = cl0Var;
    }

    public wi(org.telegram.ui.Components.ac acVar, ah.i1 i1Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f20021f = i1Var;
        this.d = z10;
        this.f20019b = i10;
        this.f20020c = i11;
    }

    public wi(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.i5 i5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f20019b = i10;
        this.d = z10;
        this.f20021f = i5Var;
        this.f20020c = i11;
    }
}
