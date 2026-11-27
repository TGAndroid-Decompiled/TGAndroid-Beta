package defpackage;

import org.telegram.tgnet.TLRPC;
public final class de2 implements oqb {
    public final byte a;
    public final n12 b;
    public final ah1 c;

    public de2(n12 n12Var, ah1 ah1Var, byte b) {
        this.a = b;
        this.b = n12Var;
        this.c = ah1Var;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        ah1 ah1Var = this.c;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.H();
                ah1Var.a(wallPaper);
                return;
            default:
                n12Var.H();
                ah1Var.a(wallPaper);
                return;
        }
    }
}
