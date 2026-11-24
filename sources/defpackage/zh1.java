package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zh1 implements qac {
    public final byte a;
    public final vi1 b;

    public zh1(vi1 vi1Var, byte b) {
        this.a = b;
        this.b = vi1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        vi1 vi1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                vi1Var.F = wallPaper;
                vi1Var.G = wallPaper;
                vi1Var.H = wallPaper;
                vi1Var.e1(false);
                vi1Var.h1(false);
                gm.d3(new ai1(vi1Var, (byte) 1), 350L);
                return;
            case 1:
                vi1Var.X0((vh1) obj);
                return;
            default:
                vi1Var.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
