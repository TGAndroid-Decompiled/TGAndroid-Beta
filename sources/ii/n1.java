package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class n1 implements Runnable {
    public final int f11512a;
    public final d2 f11513b;
    public final a f11514c;

    public n1(d2 d2Var, a aVar, int i10) {
        this.f11512a = i10;
        this.f11513b = d2Var;
        this.f11514c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11512a;
        a aVar = this.f11514c;
        d2 d2Var = this.f11513b;
        switch (i10) {
            case 0:
                w3 w3Var = d2Var.P;
                ArrayList arrayList = w3.f11704s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var.V4(this.f11514c, pageblockpullquote, 0, 0, false, false);
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
                w3 w3Var2 = d2Var.P;
                ArrayList arrayList2 = w3.f11704s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.V4(this.f11514c, pageblockblockquote, 0, 0, false, false);
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
                if (A1 instanceof o4) {
                    ((o4) A1).h(aVar, d2Var.P.getMapDelegate());
                    return;
                } else {
                    d2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
