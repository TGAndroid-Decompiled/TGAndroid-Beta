package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.fo;
public final class ej implements Runnable {
    public final int f16886a = 0;
    public final int f16887b;
    public final int f16888c;
    public final boolean d;
    public final Object e;
    public final Object f16889f;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f16889f = message;
        this.f16887b = i10;
        this.f16888c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        hg.n nVar;
        int i10;
        switch (this.f16886a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f16889f, this.f16887b, this.f16888c, this.d);
                return;
            case 1:
                fo foVar = (fo) this.e;
                gl0 gl0Var = (gl0) this.f16889f;
                org.telegram.ui.ActionBar.m1 m1Var = foVar.Q8;
                if (m1Var != null && foVar.fragmentView != null && !m1Var.isShowing() && AndroidUtilities.isActivityRunning(foVar.getParentActivity())) {
                    foVar.Q8.showAtLocation(foVar.f35861x0, 51, this.f16887b, this.f16888c);
                    if (this.d && gl0Var != null) {
                        gl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.wf(foVar, 22), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.e;
                ah.i1 i1Var = (ah.i1) this.f16889f;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                long j10 = i1Var.f784g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f783f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.s5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(R);
                    int i11 = ccVar.f23682a.h;
                    if (this.d) {
                        nVar = new hg.n(this.f16887b, this.f16888c, R, 6);
                    } else {
                        nVar = null;
                    }
                    a02.y(i11, f7, nVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) this.f16889f;
                int i12 = this.f16887b;
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
                notificationsSettingsActivity.f31867c.m(this.f16888c);
                return;
        }
    }

    public ej(fo foVar, int i10, int i11, boolean z10, gl0 gl0Var) {
        this.e = foVar;
        this.f16887b = i10;
        this.f16888c = i11;
        this.d = z10;
        this.f16889f = gl0Var;
    }

    public ej(org.telegram.ui.Components.cc ccVar, ah.i1 i1Var, boolean z10, int i10, int i11) {
        this.e = ccVar;
        this.f16889f = i1Var;
        this.d = z10;
        this.f16887b = i10;
        this.f16888c = i11;
    }

    public ej(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f16887b = i10;
        this.d = z10;
        this.f16889f = j5Var;
        this.f16888c = i11;
    }
}
