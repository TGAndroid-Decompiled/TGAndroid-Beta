package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f13890a;
    public final r f13891b;
    public final a f13892c;

    public f(r rVar, a aVar, int i10) {
        this.f13890a = i10;
        this.f13891b = rVar;
        this.f13892c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13890a;
        a aVar = this.f13892c;
        r rVar = this.f13891b;
        switch (i10) {
            case 0:
                v3 v3Var = rVar.f14133r;
                View y12 = v3Var.y1(aVar);
                if (y12 instanceof p4) {
                    ((p4) y12).h(aVar, v3Var.getMapDelegate());
                    return;
                } else {
                    v3Var.Y2.N(false);
                    return;
                }
            case 1:
                rVar.f14133r.V4(aVar, 0);
                return;
            case 2:
                rVar.f14133r.V4(aVar, 1);
                return;
            case 3:
                rVar.f14133r.V4(aVar, 2);
                return;
            case 4:
                rVar.f14133r.V4(aVar, 3);
                return;
            case 5:
                rVar.f14133r.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                v3 v3Var2 = rVar.f14133r;
                ArrayList arrayList = v3.f14239s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.T4(this.f13892c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                v3 v3Var3 = rVar.f14133r;
                ArrayList arrayList2 = v3.f14239s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var3.T4(this.f13892c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f14133r.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f14133r.U4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
