package defpackage;

import org.telegram.tgnet.TLRPC;
public final class m42 implements hj {
    public final byte a;
    public final s42 b;
    public final TLRPC.TL_messageMediaVenue c;

    public m42(s42 s42Var, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, byte b) {
        this.a = b;
        this.b = s42Var;
        this.c = tL_messageMediaVenue;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        s42 s42Var = this.b;
        switch (b) {
            case 0:
                s42Var.o0.b(this.c, s42Var.p0, z, i, 0L);
                s42Var.b.a(true);
                return;
            default:
                s42Var.o0.b(this.c, s42Var.p0, z, i, 0L);
                s42Var.b.a(true);
                return;
        }
    }
}
