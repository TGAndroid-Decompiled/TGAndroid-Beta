package defpackage;

import org.telegram.tgnet.TLRPC;
public final class g45 implements i8c {
    public final byte a;
    public final h75 b;

    public g45(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        h75 h75Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (b) {
            case 0:
                if (updates != null) {
                    na7.q1(h75Var.n1.a).Q3(updates, false);
                } else {
                    h75Var.getClass();
                }
                gl.d3(new w35(h75Var, (byte) 10));
                return;
            default:
                if (updates != null) {
                    na7.q1(h75Var.n1.a).Q3(updates, false);
                    return;
                }
                return;
        }
    }
}
