package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class n1 implements Runnable {
    public final int f11509a;
    public final d2 f11510b;
    public final a f11511c;

    public n1(d2 d2Var, a aVar, int i10) {
        this.f11509a = i10;
        this.f11510b = d2Var;
        this.f11511c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11509a;
        a aVar = this.f11511c;
        d2 d2Var = this.f11510b;
        switch (i10) {
            case 0:
                w3 w3Var = d2Var.P;
                ArrayList arrayList = w3.f11701s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var.U4(this.f11511c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                d2Var.P.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                d2Var.P.V4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                d2Var.P.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                w3 w3Var2 = d2Var.P;
                ArrayList arrayList2 = w3.f11701s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.U4(this.f11511c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                d2Var.P.W4(aVar, 0);
                return;
            case 6:
                d2Var.P.W4(aVar, 1);
                return;
            case 7:
                d2Var.P.W4(aVar, 2);
                return;
            case 8:
                d2Var.P.W4(aVar, 3);
                return;
            default:
                View z12 = d2Var.P.z1(aVar);
                if (z12 instanceof o4) {
                    ((o4) z12).h(aVar, d2Var.P.getMapDelegate());
                    return;
                } else {
                    d2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
