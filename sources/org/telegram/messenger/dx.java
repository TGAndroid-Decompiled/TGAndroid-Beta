package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
public final class dx implements Runnable {
    public final int f15316a = 0;
    public final int f15317b;
    public final int f15318c;
    public final boolean d;
    public final Object e;
    public final Object f15319f;

    public dx(qz qzVar, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = qzVar;
        this.f15319f = message;
        this.f15317b = i10;
        this.f15318c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document e;
        i2.u uVar;
        int i10;
        int i11 = this.f15316a;
        int i12 = this.f15318c;
        Object obj = this.f15319f;
        boolean z10 = this.d;
        int i13 = this.f15317b;
        Object obj2 = this.e;
        switch (i11) {
            case 0:
                qz qzVar = (qz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                qzVar.getMediaDataController().w0(message.dialog_id);
                qzVar.getNotificationCenter().k(21, Integer.valueOf(i13), Integer.valueOf(message.f19814id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i12), Boolean.valueOf(z10));
                qzVar.getNotificationCenter().k(22, Integer.valueOf(i13), Integer.valueOf(message.f19814id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i12), Boolean.valueOf(z10));
                qzVar.d0(i13);
                qzVar.i0(i13, z10);
                return;
            case 1:
                org.telegram.ui.un unVar = (org.telegram.ui.un) obj2;
                mj0 mj0Var = (mj0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = unVar.f42240e9;
                if (k1Var != null && unVar.fragmentView != null && !k1Var.isShowing()) {
                    Activity parentActivity = unVar.getParentActivity();
                    Typeface typeface = i0.f15999a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        unVar.f42240e9.showAtLocation(unVar.f42492z0, 51, i13, i12);
                        if (z10 && mj0Var != null) {
                            mj0Var.r(true);
                        }
                        i0.h3(new org.telegram.ui.mf(unVar, 25), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) obj2;
                sg.o0 o0Var = (sg.o0) obj;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                long j10 = o0Var.f48435g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.f15147s0).f18341r.get(o0Var.f48434f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e = org.telegram.ui.Components.f5.e(d20.f15147s0, j10);
                }
                if (e != null && Q != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(Q);
                    int i14 = gbVar.f26312a.h;
                    if (z10) {
                        uVar = new i2.u(i13, i12, Q, 9);
                    } else {
                        uVar = null;
                    }
                    a02.y(i14, e, uVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.l5 l5Var = (org.telegram.ui.Cells.l5) obj;
                if (i13 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i13);
                } else if (i13 != 4 && i13 != 5) {
                    ot notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i10 = 0;
                    } else {
                        i10 = Integer.MAX_VALUE;
                    }
                    notificationsController.U(i13, i10);
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
                    notificationsSettingsActivity.getNotificationsController().b0(i13);
                    notificationsSettingsActivity.getNotificationsController().m(i13);
                }
                l5Var.e.b(0, !z10, true);
                notificationsSettingsActivity.f33409c.g(i12);
                return;
        }
    }

    public dx(org.telegram.ui.un unVar, int i10, int i11, boolean z10, mj0 mj0Var) {
        this.e = unVar;
        this.f15317b = i10;
        this.f15318c = i11;
        this.d = z10;
        this.f15319f = mj0Var;
    }

    public dx(org.telegram.ui.Components.gb gbVar, sg.o0 o0Var, boolean z10, int i10, int i11) {
        this.e = gbVar;
        this.f15319f = o0Var;
        this.d = z10;
        this.f15317b = i10;
        this.f15318c = i11;
    }

    public dx(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.l5 l5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f15317b = i10;
        this.d = z10;
        this.f15319f = l5Var;
        this.f15318c = i11;
    }
}
