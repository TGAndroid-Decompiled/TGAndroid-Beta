package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class to1 implements y60 {
    public final mu1 a;

    public to1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override
    public final void dismiss() {
        m8 m8Var = this.a.g9;
        if (m8Var != null) {
            m8Var.dismiss();
        }
    }

    @Override
    public final void n(int i, int i2) {
        int i3;
        mu1 mu1Var = this.a;
        mu1Var.getMessagesController().M4(i, mu1Var.l6);
        if (mu1Var.s8 != null || mu1Var.r8 != null) {
            mu1Var.Z5();
            UndoView undoView = mu1Var.N3;
            if (undoView == null) {
                return;
            }
            long j = mu1Var.l6;
            TLRPC.User user = mu1Var.f;
            TLRPC.UserFull userFull = mu1Var.s8;
            if (userFull != null) {
                i3 = userFull.ttl_period;
            } else {
                i3 = mu1Var.r8.ttl_period;
            }
            undoView.k(j, i2, user, Integer.valueOf(i3), null, null);
        }
    }

    @Override
    public final void F() {
    }
}
