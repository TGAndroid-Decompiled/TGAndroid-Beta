package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f11361a;
    public final r f11362b;
    public final a f11363c;

    public f(r rVar, a aVar, int i10) {
        this.f11361a = i10;
        this.f11362b = rVar;
        this.f11363c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11361a;
        a aVar = this.f11363c;
        r rVar = this.f11362b;
        switch (i10) {
            case 0:
                w3 w3Var = rVar.f11588r;
                View z12 = w3Var.z1(aVar);
                if (z12 instanceof o4) {
                    ((o4) z12).h(aVar, w3Var.getMapDelegate());
                    return;
                } else {
                    w3Var.Y2.N(false);
                    return;
                }
            case 1:
                rVar.f11588r.W4(aVar, 0);
                return;
            case 2:
                rVar.f11588r.W4(aVar, 1);
                return;
            case 3:
                rVar.f11588r.W4(aVar, 2);
                return;
            case 4:
                rVar.f11588r.W4(aVar, 3);
                return;
            case 5:
                rVar.f11588r.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                w3 w3Var2 = rVar.f11588r;
                ArrayList arrayList = w3.f11701s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.U4(this.f11363c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                w3 w3Var3 = rVar.f11588r;
                ArrayList arrayList2 = w3.f11701s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.U4(this.f11363c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f11588r.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f11588r.V4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
