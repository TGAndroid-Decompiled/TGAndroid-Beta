package org.telegram.messenger;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
public final class ex implements Runnable {
    public final int f15651a = 0;
    public final int f15652b;
    public final int f15653c;
    public final boolean d;
    public final Object e;
    public final Object f15654f;

    public ex(rz rzVar, TLRPC.Message message, int i10, int i11, boolean z10) {
        this.e = rzVar;
        this.f15654f = message;
        this.f15652b = i10;
        this.f15653c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document e;
        i2.u uVar;
        int i10;
        int i11 = this.f15651a;
        int i12 = this.f15653c;
        Object obj = this.f15654f;
        boolean z10 = this.d;
        int i13 = this.f15652b;
        Object obj2 = this.e;
        switch (i11) {
            case 0:
                rz rzVar = (rz) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                rzVar.getMediaDataController().w0(message.dialog_id);
                rzVar.getNotificationCenter().k(21, Integer.valueOf(i13), Integer.valueOf(message.f19815id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i12), Boolean.valueOf(z10));
                rzVar.getNotificationCenter().k(22, Integer.valueOf(i13), Integer.valueOf(message.f19815id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i12), Boolean.valueOf(z10));
                rzVar.d0(i13);
                rzVar.i0(i13, z10);
                return;
            case 1:
                org.telegram.ui.un unVar = (org.telegram.ui.un) obj2;
                nj0 nj0Var = (nj0) obj;
                org.telegram.ui.ActionBar.k1 k1Var = unVar.f42051e9;
                if (k1Var != null && unVar.fragmentView != null && !k1Var.isShowing()) {
                    Activity parentActivity = unVar.getParentActivity();
                    Typeface typeface = i0.f16145a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        unVar.f42051e9.showAtLocation(unVar.f42303z0, 51, i13, i12);
                        if (z10 && nj0Var != null) {
                            nj0Var.r(true);
                        }
                        i0.h3(new org.telegram.ui.ng(unVar, 11), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Components.gb gbVar = (org.telegram.ui.Components.gb) obj2;
                sg.o0 o0Var = (sg.o0) obj;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                long j10 = o0Var.f48446g;
                if (j10 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(e20.f15506s0).f18670r.get(o0Var.f48445f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e = org.telegram.ui.Components.f5.e(e20.f15506s0, j10);
                }
                if (e != null && Q != null) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(Q);
                    int i14 = gbVar.f26377a.h;
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
                    pt notificationsController = notificationsSettingsActivity.getNotificationsController();
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
                notificationsSettingsActivity.f33416c.g(i12);
                return;
        }
    }

    public ex(org.telegram.ui.un unVar, int i10, int i11, boolean z10, nj0 nj0Var) {
        this.e = unVar;
        this.f15652b = i10;
        this.f15653c = i11;
        this.d = z10;
        this.f15654f = nj0Var;
    }

    public ex(org.telegram.ui.Components.gb gbVar, sg.o0 o0Var, boolean z10, int i10, int i11) {
        this.e = gbVar;
        this.f15654f = o0Var;
        this.d = z10;
        this.f15652b = i10;
        this.f15653c = i11;
    }

    public ex(NotificationsSettingsActivity notificationsSettingsActivity, int i10, boolean z10, org.telegram.ui.Cells.l5 l5Var, int i11) {
        this.e = notificationsSettingsActivity;
        this.f15652b = i10;
        this.d = z10;
        this.f15654f = l5Var;
        this.f15653c = i11;
    }
}
