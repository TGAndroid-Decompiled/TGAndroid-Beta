package defpackage;

import org.telegram.tgnet.TLRPC;
public final class nq1 implements bf7 {
    public final boolean a;
    public final oq1 b;

    public nq1(oq1 oq1Var, boolean z) {
        this.b = oq1Var;
        this.a = z;
    }

    @Override
    public final void A(boolean z) {
        zu1 zu1Var = this.b.b;
        if (z) {
            TLRPC.User user = zu1Var.f;
            boolean z2 = this.a;
            if (user != null || z2) {
                jf7 messagesStorage = zu1Var.getMessagesStorage();
                messagesStorage.a.c(new ke7(messagesStorage, zu1Var.l6, new mq1((byte) 1, this, z2), (byte) 0));
                return;
            }
        }
        zu1Var.Ia(zu1Var.s4, z);
    }
}
