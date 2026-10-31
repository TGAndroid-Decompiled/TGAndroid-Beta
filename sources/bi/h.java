package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class h implements Runnable {
    public final int f3046a;
    public final t f3047b;
    public final a f3048c;

    public h(t tVar, a aVar, int i10) {
        this.f3046a = i10;
        this.f3047b = tVar;
        this.f3048c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f3046a;
        a aVar = this.f3048c;
        t tVar = this.f3047b;
        switch (i10) {
            case 0:
                d4 d4Var = tVar.f3350r;
                View C1 = d4Var.C1(aVar);
                if (C1 instanceof y4) {
                    ((y4) C1).g(aVar, d4Var.getMapDelegate());
                    return;
                } else {
                    d4Var.f30819f3.O(false);
                    return;
                }
            case 1:
                tVar.f3350r.Z4(aVar, 0);
                return;
            case 2:
                tVar.f3350r.Z4(aVar, 1);
                return;
            case 3:
                tVar.f3350r.Z4(aVar, 2);
                return;
            case 4:
                tVar.f3350r.Z4(aVar, 3);
                return;
            case 5:
                tVar.f3350r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                d4 d4Var2 = tVar.f3350r;
                ArrayList arrayList = d4.f2922z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                d4Var2.X4(this.f3048c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                d4 d4Var3 = tVar.f3350r;
                ArrayList arrayList2 = d4.f2922z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                d4Var3.X4(this.f3048c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                tVar.f3350r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                tVar.f3350r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
