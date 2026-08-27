package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.rn;

public final class nj implements Runnable {

    public final int f21098a = 0;

    public final int f21099b;

    public final int f21100c;
    public final boolean d;

    public final Object f21101e;

    public final Object f21102f;

    public nj(SendMessagesHelper sendMessagesHelper, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.f21101e = sendMessagesHelper;
        this.f21102f = message;
        this.f21099b = i10;
        this.f21100c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document documentF;
        h3.z zVar;
        switch (this.f21098a) {
            case 0:
                ((SendMessagesHelper) this.f21101e).lambda$performSendMessageRequest$98((TLRPC.Message) this.f21102f, this.f21099b, this.f21100c, this.d);
                break;
            case 1:
                rn rnVar = (rn) this.f21101e;
                wj0 wj0Var = (wj0) this.f21102f;
                org.telegram.ui.ActionBar.n1 n1Var = rnVar.M8;
                if (n1Var != null && rnVar.fragmentView != null && !n1Var.isShowing() && AndroidUtilities.isActivityRunning(rnVar.getParentActivity())) {
                    rnVar.M8.showAtLocation(rnVar.f42213t0, 51, this.f21099b, this.f21100c);
                    if (this.d && wj0Var != null) {
                        wj0Var.r(true);
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.gf(rnVar, 25), 420L);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) this.f21101e;
                ig.q0 q0Var = (ig.q0) this.f21102f;
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                long j10 = q0Var.f11413g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f11412f);
                    if (tL_availableReaction != null) {
                        documentF = tL_availableReaction.activate_animation;
                    }
                } else {
                    documentF = org.telegram.ui.Components.k5.f(UserConfig.selectedAccount, j10);
                }
                if (documentF != null && n2VarR != null) {
                    org.telegram.ui.Components.mc mcVarA0 = org.telegram.ui.Components.mc.a0(n2VarR);
                    int i10 = obVar.f31249a.h;
                    if (this.d) {
                        zVar = new h3.z(this.f21099b, this.f21100c, n2VarR, 6);
                    } else {
                        zVar = null;
                    }
                    mcVarA0.y(i10, documentF, zVar).k(true);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.f21101e;
                org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) this.f21102f;
                int i11 = this.f21099b;
                boolean z10 = this.d;
                if (i11 == 3) {
                    SharedPreferences.Editor editorEdit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        editorEdit.remove("EnableAllStories");
                    } else {
                        editorEdit.putBoolean("EnableAllStories", true);
                    }
                    editorEdit.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i11);
                } else if (i11 == 4 || i11 == 5) {
                    SharedPreferences.Editor editorEdit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        editorEdit2.putBoolean("EnableReactionsMessages", false);
                        editorEdit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        editorEdit2.putBoolean("EnableReactionsMessages", true);
                        editorEdit2.putBoolean("EnableReactionsStories", true);
                    }
                    editorEdit2.apply();
                    notificationsSettingsActivity.getNotificationsController().updateServerNotificationsSettings(i11);
                    notificationsSettingsActivity.getNotificationsController().deleteNotificationChannelGlobal(i11);
                } else {
                    notificationsSettingsActivity.getNotificationsController().setGlobalNotificationsEnabled(i11, !z10 ? 0 : Integer.MAX_VALUE);
                }
                g5Var.f24392e.b(0, !z10, true);
                notificationsSettingsActivity.f35559c.m(this.f21100c);
                break;
        }
    }

    public nj(rn rnVar, int i10, int i11, boolean z10, wj0 wj0Var) {
        this.f21101e = rnVar;
        this.f21099b = i10;
        this.f21100c = i11;
        this.d = z10;
        this.f21102f = wj0Var;
    }

    public nj(org.telegram.ui.Components.ob obVar, ig.q0 q0Var, boolean z10, int i10, int i11) {
        this.f21101e = obVar;
        this.f21102f = q0Var;
        this.d = z10;
        this.f21099b = i10;
        this.f21100c = i11;
    }

    public nj(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.g5 g5Var, int i11) {
        this.f21101e = notificationsSettingsActivity;
        this.f21099b = i10;
        this.d = z10;
        this.f21102f = g5Var;
        this.f21100c = i11;
    }
}
