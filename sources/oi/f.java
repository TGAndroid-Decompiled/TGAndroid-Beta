package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f22091a;
    public final o f22092b;
    public final a f22093c;

    public f(o oVar, a aVar, int i7) {
        this.f22091a = i7;
        this.f22092b = oVar;
        this.f22093c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22091a;
        a aVar = this.f22093c;
        o oVar = this.f22092b;
        switch (i7) {
            case 0:
                t3 t3Var = oVar.f22267r;
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof m4) {
                    ((m4) C1).g(aVar, t3Var.getMapDelegate());
                    return;
                } else {
                    t3Var.f35796g3.O(false);
                    return;
                }
            case 1:
                oVar.f22267r.Z4(aVar, 0);
                return;
            case 2:
                oVar.f22267r.Z4(aVar, 1);
                return;
            case 3:
                oVar.f22267r.Z4(aVar, 2);
                return;
            case 4:
                oVar.f22267r.Z4(aVar, 3);
                return;
            case 5:
                oVar.f22267r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                t3 t3Var2 = oVar.f22267r;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.f22093c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                t3 t3Var3 = oVar.f22267r;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var3.X4(this.f22093c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                oVar.f22267r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                oVar.f22267r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
