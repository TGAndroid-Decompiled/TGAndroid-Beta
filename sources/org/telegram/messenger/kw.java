package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.li0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
public final class kw implements Runnable {
    public final int f23876a = 0;
    public final int f23877b;
    public final int f23878c;
    public final boolean d;
    public final Object f23879e;
    public final Object f23880f;

    public kw(yy yyVar, TLRPC.Message message, int i3, int i10, boolean z10) {
        this.f23879e = yyVar;
        this.f23880f = message;
        this.f23877b = i3;
        this.f23878c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document e10;
        k2.u uVar;
        int i3;
        int i10 = this.f23876a;
        int i11 = this.f23878c;
        Object obj = this.f23880f;
        boolean z10 = this.d;
        int i12 = this.f23877b;
        Object obj2 = this.f23879e;
        switch (i10) {
            case 0:
                yy yyVar = (yy) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                yyVar.getMediaDataController().w0(message.dialog_id);
                yyVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.f27022id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                yyVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.f27022id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                yyVar.d0(i12);
                yyVar.i0(i12, z10);
                return;
            case 1:
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) obj2;
                li0 li0Var = (li0) obj;
                org.telegram.ui.ActionBar.f1 f1Var = wmVar.f51316f9;
                if (f1Var != null && wmVar.fragmentView != null && !f1Var.isShowing()) {
                    Activity parentActivity = wmVar.getParentActivity();
                    Typeface typeface = g0.f22580a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        wmVar.f51316f9.showAtLocation(wmVar.A0, 51, i12, i11);
                        if (z10 && li0Var != null) {
                            li0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.xe(wmVar, 27), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.kb kbVar = (org.telegram.ui.Components.kb) obj2;
                dh.n0 n0Var = (dh.n0) obj;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                long j10 = n0Var.f9098g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.f22829t0).f24045r.get(n0Var.f9097f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e10 = org.telegram.ui.Components.g5.e(h10.f22829t0, j10);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(Q);
                    int i13 = kbVar.f35360a.h;
                    if (z10) {
                        uVar = new k2.u(i12, i11, Q, 10);
                    } else {
                        uVar = null;
                    }
                    a02.y(i13, e10, uVar).k(true);
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
                    us notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i3 = 0;
                    } else {
                        i3 = Integer.MAX_VALUE;
                    }
                    notificationsController.U(i12, i3);
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
                h5Var.f29340e.b(0, !z10, true);
                notificationsSettingsActivity.f41345c.g(i11);
                return;
        }
    }

    public kw(org.telegram.ui.wm wmVar, int i3, int i10, boolean z10, li0 li0Var) {
        this.f23879e = wmVar;
        this.f23877b = i3;
        this.f23878c = i10;
        this.d = z10;
        this.f23880f = li0Var;
    }

    public kw(org.telegram.ui.Components.kb kbVar, dh.n0 n0Var, boolean z10, int i3, int i10) {
        this.f23879e = kbVar;
        this.f23880f = n0Var;
        this.d = z10;
        this.f23877b = i3;
        this.f23878c = i10;
    }

    public kw(NotificationsSettingsActivity notificationsSettingsActivity, int i3, boolean z10, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.f23879e = notificationsSettingsActivity;
        this.f23877b = i3;
        this.d = z10;
        this.f23880f = h5Var;
        this.f23878c = i10;
    }
}
