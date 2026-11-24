package defpackage;

import org.telegram.tgnet.TLRPC;
public final class md2 implements pmb {
    public final byte a;
    public final x02 b;
    public final rg1 c;

    public md2(x02 x02Var, rg1 rg1Var, byte b) {
        this.a = b;
        this.b = x02Var;
        this.c = rg1Var;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        rg1 rg1Var = this.c;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.I();
                rg1Var.a(wallPaper);
                return;
            default:
                x02Var.I();
                rg1Var.a(wallPaper);
                return;
        }
    }
}
