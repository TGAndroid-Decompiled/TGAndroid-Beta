package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class p1 implements Runnable {
    public final int f9782a;
    public final g2 f9783b;
    public final a f9784c;

    public p1(g2 g2Var, a aVar, int i10) {
        this.f9782a = i10;
        this.f9783b = g2Var;
        this.f9784c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f9782a;
        a aVar = this.f9784c;
        g2 g2Var = this.f9783b;
        switch (i10) {
            case 0:
                z3 z3Var = g2Var.P;
                ArrayList arrayList = z3.f9991s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                z3Var.T4(this.f9784c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                g2Var.P.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                g2Var.P.U4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                g2Var.P.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                z3 z3Var2 = g2Var.P;
                ArrayList arrayList2 = z3.f9991s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                z3Var2.T4(this.f9784c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                g2Var.P.V4(aVar, 0);
                return;
            case 6:
                g2Var.P.V4(aVar, 1);
                return;
            case 7:
                g2Var.P.V4(aVar, 2);
                return;
            case 8:
                g2Var.P.V4(aVar, 3);
                return;
            default:
                View y12 = g2Var.P.y1(aVar);
                if (y12 instanceof r4) {
                    ((r4) y12).h(aVar, g2Var.P.getMapDelegate());
                    return;
                } else {
                    g2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
