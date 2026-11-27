package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ah1 implements pcc {
    public final byte a;
    public final wh1 b;

    public ah1(wh1 wh1Var, byte b) {
        this.a = b;
        this.b = wh1Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        wh1 wh1Var = this.b;
        switch (b) {
            case 0:
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) obj;
                wh1Var.F = wallPaper;
                wh1Var.G = wallPaper;
                wh1Var.H = wallPaper;
                wh1Var.e1(false);
                wh1Var.h1(false);
                hl.d3(new bh1(wh1Var, (byte) 0), 350L);
                return;
            case 1:
                wh1Var.X0((wg1) obj);
                return;
            default:
                wh1Var.d1((TL_stories.TL_premium_boostsStatus) obj);
                return;
        }
    }
}
