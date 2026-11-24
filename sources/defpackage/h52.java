package defpackage;

import org.telegram.tgnet.TLRPC;
public final class h52 implements gk {
    public final byte a;
    public final n52 b;
    public final TLRPC.TL_messageMediaVenue c;

    public h52(n52 n52Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = n52Var;
        this.c = tL_messageMediaVenue;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                n52Var.o0.b(this.c, n52Var.p0, z, i, 0L);
                n52Var.b.a(true);
                return;
            default:
                n52Var.o0.b(this.c, n52Var.p0, z, i, 0L);
                n52Var.b.a(true);
                return;
        }
    }
}
