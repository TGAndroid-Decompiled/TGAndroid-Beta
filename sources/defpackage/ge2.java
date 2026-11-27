package defpackage;

import org.telegram.tgnet.TLRPC;
public final class ge2 implements oqb {
    public final byte a;
    public final he2 b;

    public ge2(he2 he2Var, byte b) {
        this.a = b;
        this.b = he2Var;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        he2 he2Var = this.b;
        switch (b) {
            case 0:
                oe2 oe2Var = he2Var.a;
                oe2Var.R1.H();
                oe2Var.dismiss();
                return;
            default:
                oe2 oe2Var2 = he2Var.a;
                oe2Var2.R1.H();
                oe2Var2.dismiss();
                return;
        }
    }
}
