package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class m1 implements Runnable {
    public final int f14078a;
    public final c2 f14079b;
    public final a f14080c;

    public m1(c2 c2Var, a aVar, int i10) {
        this.f14078a = i10;
        this.f14079b = c2Var;
        this.f14080c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14078a;
        a aVar = this.f14080c;
        c2 c2Var = this.f14079b;
        switch (i10) {
            case 0:
                v3 v3Var = c2Var.P;
                ArrayList arrayList = v3.f14265s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var.T4(this.f14080c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                c2Var.P.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                c2Var.P.U4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                c2Var.P.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                v3 v3Var2 = c2Var.P;
                ArrayList arrayList2 = v3.f14265s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.T4(this.f14080c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                c2Var.P.V4(aVar, 0);
                return;
            case 6:
                c2Var.P.V4(aVar, 1);
                return;
            case 7:
                c2Var.P.V4(aVar, 2);
                return;
            case 8:
                c2Var.P.V4(aVar, 3);
                return;
            default:
                View y12 = c2Var.P.y1(aVar);
                if (y12 instanceof p4) {
                    ((p4) y12).h(aVar, c2Var.P.getMapDelegate());
                    return;
                } else {
                    c2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
