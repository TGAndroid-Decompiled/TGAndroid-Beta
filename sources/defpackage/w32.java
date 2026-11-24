package defpackage;

import org.telegram.tgnet.TLRPC;
public final class w32 implements gj {
    public final byte a;
    public final c42 b;
    public final TLRPC.TL_messageMediaVenue c;

    public w32(c42 c42Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = c42Var;
        this.c = tL_messageMediaVenue;
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        c42 c42Var = this.b;
        switch (b) {
            case 0:
                c42Var.o0.b(this.c, c42Var.p0, z, i, 0L);
                c42Var.b.a(true);
                return;
            default:
                c42Var.o0.b(this.c, c42Var.p0, z, i, 0L);
                c42Var.b.a(true);
                return;
        }
    }
}
