package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class n1 implements Runnable {
    public final int f11510a;
    public final e2 f11511b;
    public final a f11512c;

    public n1(e2 e2Var, a aVar, int i10) {
        this.f11510a = i10;
        this.f11511b = e2Var;
        this.f11512c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11510a;
        a aVar = this.f11512c;
        e2 e2Var = this.f11511b;
        switch (i10) {
            case 0:
                x3 x3Var = e2Var.P;
                ArrayList arrayList = x3.f11721s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var.V4(this.f11512c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                e2Var.P.W4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                e2Var.P.W4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                e2Var.P.W4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                x3 x3Var2 = e2Var.P;
                ArrayList arrayList2 = x3.f11721s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.V4(this.f11512c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                e2Var.P.X4(aVar, 0);
                return;
            case 6:
                e2Var.P.X4(aVar, 1);
                return;
            case 7:
                e2Var.P.X4(aVar, 2);
                return;
            case 8:
                e2Var.P.X4(aVar, 3);
                return;
            default:
                View A1 = e2Var.P.A1(aVar);
                if (A1 instanceof p4) {
                    ((p4) A1).h(aVar, e2Var.P.getMapDelegate());
                    return;
                } else {
                    e2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
