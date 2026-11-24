package defpackage;

import org.telegram.tgnet.TLRPC;
public final class mr1 implements ue7 {
    public final boolean a;
    public final nr1 b;

    public mr1(nr1 nr1Var, boolean z) {
        this.b = nr1Var;
        this.a = z;
    }

    @Override
    public final void z(boolean z) {
        yv1 yv1Var = this.b.b;
        if (z) {
            TLRPC.User user = yv1Var.f;
            boolean z2 = this.a;
            if (user != null || z2) {
                cf7 messagesStorage = yv1Var.getMessagesStorage();
                messagesStorage.a.c(new fe7(messagesStorage, yv1Var.l6, new lr1((byte) 1, this, z2), (byte) 0));
                return;
            }
        }
        yv1Var.Ha(yv1Var.s4, z);
    }
}
