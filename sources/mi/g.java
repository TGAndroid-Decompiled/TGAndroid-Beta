package mi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g implements Runnable {
    public final int f19614a;
    public final p f19615b;
    public final a f19616c;

    public g(p pVar, a aVar, int i3) {
        this.f19614a = i3;
        this.f19615b = pVar;
        this.f19616c = aVar;
    }

    @Override
    public final void run() {
        int i3 = this.f19614a;
        a aVar = this.f19616c;
        p pVar = this.f19615b;
        switch (i3) {
            case 0:
                t3 t3Var = pVar.f19793r;
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof n4) {
                    ((n4) C1).g(aVar, t3Var.getMapDelegate());
                    return;
                } else {
                    t3Var.f35594g3.O(false);
                    return;
                }
            case 1:
                pVar.f19793r.Z4(aVar, 0);
                return;
            case 2:
                pVar.f19793r.Z4(aVar, 1);
                return;
            case 3:
                pVar.f19793r.Z4(aVar, 2);
                return;
            case 4:
                pVar.f19793r.Z4(aVar, 3);
                return;
            case 5:
                pVar.f19793r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                t3 t3Var2 = pVar.f19793r;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.f19616c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                t3 t3Var3 = pVar.f19793r;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var3.X4(this.f19616c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                pVar.f19793r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                pVar.f19793r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
