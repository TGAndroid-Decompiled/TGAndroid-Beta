package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
public final class rw implements Runnable {
    public final int f25348a = 0;
    public final int f25349b;
    public final int f25350c;
    public final boolean d;
    public final Object f25351e;
    public final Object f25352f;

    public rw(gz gzVar, TLRPC.Message message, int i7, int i10, boolean z9) {
        this.f25351e = gzVar;
        this.f25352f = message;
        this.f25349b = i7;
        this.f25350c = i10;
        this.d = z9;
    }

    @Override
    public final void run() {
        TLRPC.Document e10;
        jg.r rVar;
        int i7;
        int i10 = this.f25348a;
        int i11 = this.f25350c;
        Object obj = this.f25352f;
        boolean z9 = this.d;
        int i12 = this.f25349b;
        Object obj2 = this.f25351e;
        switch (i10) {
            case 0:
                gz gzVar = (gz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                gzVar.getMediaDataController().w0(message.dialog_id);
                gzVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.f26977id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z9));
                gzVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.f26977id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z9));
                gzVar.d0(i12);
                gzVar.i0(i12, z9);
                return;
            case 1:
                org.telegram.ui.an anVar = (org.telegram.ui.an) obj2;
                ii0 ii0Var = (ii0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = anVar.f43787e9;
                if (g1Var != null && anVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = anVar.getParentActivity();
                    Typeface typeface = g0.f22535a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        anVar.f43787e9.showAtLocation(anVar.f44043z0, 51, i12, i11);
                        if (z9 && ii0Var != null) {
                            ii0Var.r(true);
                        }
                        g0.i3(new org.telegram.ui.af(anVar, 27), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.mb mbVar = (org.telegram.ui.Components.mb) obj2;
                ch.o0 o0Var = (ch.o0) obj;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                long j3 = o0Var.f6357g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.f24470s0).f25836r.get(o0Var.f6356f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e10 = org.telegram.ui.Components.i5.e(p10.f24470s0, j3);
                }
                if (e10 != null && Q != null) {
                    org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(Q);
                    int i13 = mbVar.f35956a.h;
                    if (z9) {
                        rVar = new jg.r(i12, i11, Q, 10);
                    } else {
                        rVar = null;
                    }
                    a02.y(i13, e10, rVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) obj;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                } else if (i12 != 4 && i12 != 5) {
                    dt notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z9) {
                        i7 = 0;
                    } else {
                        i7 = Integer.MAX_VALUE;
                    }
                    notificationsController.U(i12, i7);
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z9) {
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
                h5Var.f29276e.b(0, !z9, true);
                notificationsSettingsActivity.f41316c.g(i11);
                return;
        }
    }

    public rw(org.telegram.ui.an anVar, int i7, int i10, boolean z9, ii0 ii0Var) {
        this.f25351e = anVar;
        this.f25349b = i7;
        this.f25350c = i10;
        this.d = z9;
        this.f25352f = ii0Var;
    }

    public rw(org.telegram.ui.Components.mb mbVar, ch.o0 o0Var, boolean z9, int i7, int i10) {
        this.f25351e = mbVar;
        this.f25352f = o0Var;
        this.d = z9;
        this.f25349b = i7;
        this.f25350c = i10;
    }

    public rw(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z9, org.telegram.ui.Cells.h5 h5Var, int i10) {
        this.f25351e = notificationsSettingsActivity;
        this.f25349b = i7;
        this.d = z9;
        this.f25352f = h5Var;
        this.f25350c = i10;
    }
}
