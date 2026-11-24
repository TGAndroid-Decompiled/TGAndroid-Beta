package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rg1 implements p8c {
    public final byte a;
    public final nh1 b;

    public rg1(nh1 nh1Var, byte b) {
        this.a = b;
        this.b = nh1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        nh1 nh1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                nh1Var.F = wallPaper;
                nh1Var.G = wallPaper;
                nh1Var.H = wallPaper;
                nh1Var.d1(false);
                nh1Var.g1(false);
                gl.d3(new sg1(nh1Var, (byte) 1), 350L);
                return;
            case 1:
                nh1Var.W0((ng1) obj);
                return;
            default:
                nh1Var.c1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
