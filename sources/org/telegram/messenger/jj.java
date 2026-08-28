package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.qn;
public final class jj implements Runnable {
    public final int f20726a = 0;
    public final int f20727b;
    public final int f20728c;
    public final boolean d;
    public final Object f20729e;
    public final Object f20730f;

    public jj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i9, int i10, boolean z10) {
        this.f20729e = sendMessagesHelper;
        this.f20730f = message;
        this.f20727b = i9;
        this.f20728c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f10;
        h3.y yVar;
        int i9;
        switch (this.f20726a) {
            case 0:
                ((SendMessagesHelper) this.f20729e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f20730f, this.f20727b, this.f20728c, this.d);
                return;
            case 1:
                qn qnVar = (qn) this.f20729e;
                uj0 uj0Var = (uj0) this.f20730f;
                org.telegram.ui.ActionBar.o1 o1Var = qnVar.M8;
                if (o1Var != null && qnVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(qnVar.getParentActivity())) {
                    qnVar.M8.showAtLocation(qnVar.f42077t0, 51, this.f20727b, this.f20728c);
                    if (this.d && uj0Var != null) {
                        uj0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gf(qnVar, 25), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.qb qbVar = (org.telegram.ui.Components.qb) this.f20729e;
                hg.r0 r0Var = (hg.r0) this.f20730f;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                long j10 = r0Var.f10718g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f10717f);
                    if (tL_availableReaction != null) {
                        f10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f10 = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
                }
                if (f10 != null && R != null) {
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(R);
                    int i10 = qbVar.f31877a.h;
                    if (this.d) {
                        yVar = new h3.y(this.f20727b, this.f20728c, R, 7);
                    } else {
                        yVar = null;
                    }
                    a02.y(i10, f10, yVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f20729e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f20730f;
                int i11 = this.f20727b;
                boolean z10 = this.d;
                if (i11 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i11);
                } else if (i11 != 4 && i11 != 5) {
                    NotificationsController notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i9 = 0;
                    } else {
                        i9 = Integer.MAX_VALUE;
                    }
                    notificationsController.setGlobalNotificationsEnabled(i11, i9);
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
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i11);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i11);
                }
                j5Var.f24566e.b(0, !z10, true);
                notificationsSettingsActivity.f35556c.m(this.f20728c);
                return;
        }
    }

    public jj(qn qnVar, int i9, int i10, boolean z10, uj0 uj0Var) {
        this.f20729e = qnVar;
        this.f20727b = i9;
        this.f20728c = i10;
        this.d = z10;
        this.f20730f = uj0Var;
    }

    public jj(org.telegram.ui.Components.qb qbVar, hg.r0 r0Var, boolean z10, int i9, int i10) {
        this.f20729e = qbVar;
        this.f20730f = r0Var;
        this.d = z10;
        this.f20727b = i9;
        this.f20728c = i10;
    }

    public jj(NotificationsSettingsActivity notificationsSettingsActivity, int i9, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i10) {
        this.f20729e = notificationsSettingsActivity;
        this.f20727b = i9;
        this.d = z10;
        this.f20730f = j5Var;
        this.f20728c = i10;
    }
}
