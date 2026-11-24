package defpackage;

import org.telegram.tgnet.TLRPC;
public final class f65 implements jac {
    public final byte a;
    public final g95 b;

    public f65(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        g95 g95Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (b) {
            case 0:
                if (updates != null) {
                    oc7.r1(g95Var.n1.a).T3(updates, false);
                } else {
                    g95Var.getClass();
                }
                gm.c3(new v55(g95Var, (byte) 10));
                return;
            default:
                if (updates != null) {
                    oc7.r1(g95Var.n1.a).T3(updates, false);
                    return;
                }
                return;
        }
    }
}
