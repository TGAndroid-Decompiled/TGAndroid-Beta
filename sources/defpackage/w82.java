package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class w82 implements y70 {
    public final m8[] a;
    public final z82 b;

    public w82(z82 z82Var, m8[] m8VarArr) {
        this.b = z82Var;
        this.a = m8VarArr;
    }

    @Override
    public final void dismiss() {
        m8 m8Var = this.a[0];
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override
    public final void l(int i, int i2) {
        int i3;
        yv1 yv1Var = this.b.H;
        if (yv1Var != null) {
            yv1Var.getMessagesController().P4(i, yv1Var.a());
            TLRPC.ChatFull chatFull = yv1Var.r8;
            TLRPC.UserFull userFull = yv1Var.s8;
            if (userFull != null || chatFull != null) {
                yv1Var.i6();
                UndoView undoView = yv1Var.N3;
                if (undoView != null) {
                    long a = yv1Var.a();
                    TLRPC.User h = yv1Var.h();
                    if (userFull != null) {
                        i3 = userFull.ttl_period;
                    } else {
                        i3 = chatFull.ttl_period;
                    }
                    undoView.k(a, i2, h, Integer.valueOf(i3), null, null);
                }
            }
        }
    }

    @Override
    public final void n() {
    }
}
