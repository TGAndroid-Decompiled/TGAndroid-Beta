package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gq1 implements y70 {
    public final yv1 a;

    public gq1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void dismiss() {
        m8 m8Var = this.a.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override
    public final void l(int i, int i2) {
        int i3;
        yv1 yv1Var = this.a;
        yv1Var.getMessagesController().P4(i, yv1Var.l6);
        if (yv1Var.s8 != null || yv1Var.r8 != null) {
            yv1Var.i6();
            UndoView undoView = yv1Var.N3;
            if (undoView == null) {
                return;
            }
            long j = yv1Var.l6;
            TLRPC.User user = yv1Var.f;
            TLRPC.UserFull userFull = yv1Var.s8;
            if (userFull != null) {
                i3 = userFull.ttl_period;
            } else {
                i3 = yv1Var.r8.ttl_period;
            }
            undoView.k(j, i2, user, Integer.valueOf(i3), null, null);
        }
    }

    @Override
    public final void n() {
    }
}
