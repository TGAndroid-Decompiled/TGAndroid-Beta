package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
public final class pw implements Runnable {
    public final int f25995a = 0;
    public final int f25996b;
    public final int f25997c;
    public final boolean d;
    public final Object f25998e;
    public final Object f25999f;

    public pw(ez ezVar, TLRPC.Message message, int i7, int i10, boolean z10) {
        this.f25998e = ezVar;
        this.f25999f = message;
        this.f25996b = i7;
        this.f25997c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document e10;
        jg.q qVar;
        int i7;
        int i10 = this.f25995a;
        int i11 = this.f25997c;
        Object obj = this.f25999f;
        boolean z10 = this.d;
        int i12 = this.f25996b;
        Object obj2 = this.f25998e;
        switch (i10) {
            case 0:
                ez ezVar = (ez) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                ezVar.getMediaDataController().w0(message.dialog_id);
                ezVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.f28072id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                ezVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.f28072id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                ezVar.d0(i12);
                ezVar.i0(i12, z10);
                return;
            case 1:
                org.telegram.ui.an anVar = (org.telegram.ui.an) obj2;
                mi0 mi0Var = (mi0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f45196f9;
                if (g1Var != null && anVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = anVar.getParentActivity();
                    Typeface typeface = g0.f23583a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        anVar.f45196f9.showAtLocation(anVar.A0, 51, i12, i11);
                        anVar.ia(anVar.f45196f9);
                        if (z10 && mi0Var != null) {
                            mi0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.uf(anVar, 1), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.hb hbVar = (org.telegram.ui.Components.hb) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                long j3 = p0Var.f5192g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(m10.f24940t0).f26505r.get(p0Var.f5191f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e10 = org.telegram.ui.Components.g5.e(m10.f24940t0, j3);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(Q);
                    int i13 = hbVar.f35208a.h;
                    if (z10) {
                        qVar = new jg.q(i12, i11, Q, 10);
                    } else {
                        qVar = null;
                    }
                    a02.y(i13, e10, qVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) obj;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                } else if (i12 != 4 && i12 != 5) {
                    at notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i7 = 0;
                    } else {
                        i7 = Integer.MAX_VALUE;
                    }
                    notificationsController.U(i12, i7);
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
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                    notificationsSettingsActivity.getNotificationsController().m(i12);
                }
                h5Var.f30399e.b(0, !z10, true);
                notificationsSettingsActivity.f42684c.g(i11);
                return;
        }
    }

    public pw(org.telegram.ui.an anVar, int i7, int i10, boolean z10, mi0 mi0Var) {
        this.f25998e = anVar;
        this.f25996b = i7;
        this.f25997c = i10;
        this.d = z10;
        this.f25999f = mi0Var;
    }

    public pw(org.telegram.ui.Components.hb hbVar, ch.p0 p0Var, boolean z10, int i7, int i10) {
        this.f25998e = hbVar;
        this.f25999f = p0Var;
        this.d = z10;
        this.f25996b = i7;
        this.f25997c = i10;
    }

    public pw(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.f25998e = notificationsSettingsActivity;
        this.f25996b = i7;
        this.d = z10;
        this.f25999f = h5Var;
        this.f25997c = i10;
    }
}
