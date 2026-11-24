package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class l72 implements y60 {
    public final m8[] a;
    public final o72 b;

    public l72(o72 o72Var, m8[] m8VarArr) {
        this.b = o72Var;
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
    public final void n(int i, int i2) {
        int i3;
        mu1 mu1Var = this.b.H;
        if (mu1Var != null) {
            mu1Var.getMessagesController().N4(i, mu1Var.a());
            TLRPC.ChatFull chatFull = mu1Var.r8;
            TLRPC.UserFull userFull = mu1Var.s8;
            if (userFull != null || chatFull != null) {
                mu1Var.b6();
                UndoView undoView = mu1Var.N3;
                if (undoView != null) {
                    long a = mu1Var.a();
                    TLRPC.User h = mu1Var.h();
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
    public final void N() {
    }
}
