package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class hp1 implements a70 {
    public final zu1 a;

    public hp1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final void H(int i, int i2) {
        int i3;
        zu1 zu1Var = this.a;
        zu1Var.getMessagesController().V4(i, zu1Var.l6);
        if (zu1Var.s8 != null || zu1Var.r8 != null) {
            zu1Var.i6();
            UndoView undoView = zu1Var.N3;
            if (undoView == null) {
                return;
            }
            long j = zu1Var.l6;
            TLRPC.User user = zu1Var.f;
            TLRPC.UserFull userFull = zu1Var.s8;
            if (userFull != null) {
                i3 = userFull.ttl_period;
            } else {
                i3 = zu1Var.r8.ttl_period;
            }
            undoView.k(j, i2, user, Integer.valueOf(i3), null, null);
        }
    }

    @Override
    public final void dismiss() {
        n8 n8Var = this.a.g9;
        if (n8Var != null) {
            n8Var.dismiss();
        }
    }

    @Override
    public final void N() {
    }
}
