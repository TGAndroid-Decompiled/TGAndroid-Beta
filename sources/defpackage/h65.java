package defpackage;

import org.telegram.tgnet.TLRPC;
public final class h65 implements icc {
    public final byte a;
    public final j95 b;

    public h65(j95 j95Var, byte b) {
        this.a = b;
        this.b = j95Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        j95 j95Var = this.b;
        TLRPC.Updates updates = (TLRPC.Updates) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        switch (b) {
            case 0:
                if (updates != null) {
                    uc7.s1(j95Var.n1.a).Y3(updates, false);
                } else {
                    j95Var.getClass();
                }
                hl.c3(new z55(j95Var, (byte) 8));
                return;
            default:
                if (updates != null) {
                    uc7.s1(j95Var.n1.a).Y3(updates, false);
                    return;
                }
                return;
        }
    }
}
