package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f13257a;
    public final r f13258b;
    public final a f13259c;

    public f(r rVar, a aVar, int i10) {
        this.f13257a = i10;
        this.f13258b = rVar;
        this.f13259c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13257a;
        a aVar = this.f13259c;
        r rVar = this.f13258b;
        switch (i10) {
            case 0:
                x3 x3Var = rVar.f13483r;
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof r4) {
                    ((r4) A1).h(aVar, x3Var.getMapDelegate());
                    return;
                } else {
                    x3Var.W2.N(false);
                    return;
                }
            case 1:
                rVar.f13483r.X4(aVar, 0);
                return;
            case 2:
                rVar.f13483r.X4(aVar, 1);
                return;
            case 3:
                rVar.f13483r.X4(aVar, 2);
                return;
            case 4:
                rVar.f13483r.X4(aVar, 3);
                return;
            case 5:
                rVar.f13483r.W4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                x3 x3Var2 = rVar.f13483r;
                ArrayList arrayList = x3.f13619q4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.V4(this.f13259c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                x3 x3Var3 = rVar.f13483r;
                ArrayList arrayList2 = x3.f13619q4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.V4(this.f13259c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f13483r.W4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f13483r.W4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
