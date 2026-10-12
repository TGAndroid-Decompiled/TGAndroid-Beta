package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class m1 implements Runnable {
    public final int f13399a;
    public final d2 f13400b;
    public final a f13401c;

    public m1(d2 d2Var, a aVar, int i10) {
        this.f13399a = i10;
        this.f13400b = d2Var;
        this.f13401c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13399a;
        a aVar = this.f13401c;
        d2 d2Var = this.f13400b;
        switch (i10) {
            case 0:
                x3 x3Var = d2Var.P;
                ArrayList arrayList = x3.f13619q4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var.V4(this.f13401c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                d2Var.P.W4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                d2Var.P.W4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                d2Var.P.W4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                x3 x3Var2 = d2Var.P;
                ArrayList arrayList2 = x3.f13619q4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.V4(this.f13401c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                d2Var.P.X4(aVar, 0);
                return;
            case 6:
                d2Var.P.X4(aVar, 1);
                return;
            case 7:
                d2Var.P.X4(aVar, 2);
                return;
            case 8:
                d2Var.P.X4(aVar, 3);
                return;
            default:
                View A1 = d2Var.P.A1(aVar);
                if (A1 instanceof r4) {
                    ((r4) A1).h(aVar, d2Var.P.getMapDelegate());
                    return;
                } else {
                    d2Var.P.W2.N(false);
                    return;
                }
        }
    }
}
