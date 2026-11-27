package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class c82 implements a70 {
    public final n8[] a;
    public final f82 b;

    public c82(f82 f82Var, n8[] n8VarArr) {
        this.b = f82Var;
        this.a = n8VarArr;
    }

    @Override
    public final void H(int i, int i2) {
        int i3;
        zu1 zu1Var = this.b.H;
        if (zu1Var != null) {
            zu1Var.getMessagesController().V4(i, zu1Var.a());
            TLRPC.ChatFull chatFull = zu1Var.r8;
            TLRPC.UserFull userFull = zu1Var.s8;
            if (userFull != null || chatFull != null) {
                zu1Var.i6();
                UndoView undoView = zu1Var.N3;
                if (undoView != null) {
                    long a = zu1Var.a();
                    TLRPC.User h = zu1Var.h();
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
    public final void dismiss() {
        n8 n8Var = this.a[0];
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }

    @Override
    public final void N() {
    }
}
