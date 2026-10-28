package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.wn;
public final class cj implements Runnable {
    public final int f19836a = 0;
    public final int f19837b;
    public final int f19838c;
    public final boolean d;
    public final Object e;
    public final Object f19839f;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = sendMessagesHelper;
        this.f19839f = message;
        this.f19837b = i10;
        this.f19838c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document f7;
        i2.v vVar;
        int i10;
        switch (this.f19836a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$101((TLRPC.Message) this.f19839f, this.f19837b, this.f19838c, this.d);
                return;
            case 1:
                wn wnVar = (wn) this.e;
                gl0 gl0Var = (gl0) this.f19839f;
                org.telegram.ui.ActionBar.o1 o1Var = wnVar.f45134g9;
                if (o1Var != null && wnVar.fragmentView != null && !o1Var.isShowing() && AndroidUtilities.isActivityRunning(wnVar.getParentActivity())) {
                    wnVar.f45134g9.showAtLocation(wnVar.f45339x0, 51, this.f19837b, this.f19838c);
                    if (this.d && gl0Var != null) {
                        gl0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ig(wnVar, 8), 420L);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.ac acVar = (org.telegram.ui.Components.ac) this.e;
                bh.x0 x0Var = (bh.x0) this.f19839f;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                long j10 = x0Var.f4209g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f4208f);
                    if (tL_availableReaction != null) {
                        f7 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    f7 = org.telegram.ui.Components.t5.f(UserConfig.selectedAccount, j10);
                }
                if (f7 != null && R != null) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(R);
                    int i11 = acVar.f26503a.h;
                    if (this.d) {
                        vVar = new i2.v(this.f19837b, this.f19838c, R, 7);
                    } else {
                        vVar = null;
                    }
                    b02.y(i11, f7, vVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
                org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) this.f19839f;
                int i12 = this.f19837b;
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
                n5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f35609c.m(this.f19838c);
                return;
        }
    }

    public cj(wn wnVar, int i10, int i11, boolean z10, gl0 gl0Var) {
        this.e = wnVar;
        this.f19837b = i10;
        this.f19838c = i11;
        this.d = z10;
        this.f19839f = gl0Var;
    }

    public cj(org.telegram.ui.Components.ac acVar, bh.x0 x0Var, boolean z10, int i10, int i11) {
        this.e = acVar;
        this.f19839f = x0Var;
        this.d = z10;
        this.f19837b = i10;
        this.f19838c = i11;
    }

    public cj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.n5 n5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f19837b = i10;
        this.d = z10;
        this.f19839f = n5Var;
        this.f19838c = i11;
    }
}
