package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class n1 implements Runnable {
    public final int f11507a;
    public final e2 f11508b;
    public final a f11509c;

    public n1(e2 e2Var, a aVar, int i10) {
        this.f11507a = i10;
        this.f11508b = e2Var;
        this.f11509c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11507a;
        a aVar = this.f11509c;
        e2 e2Var = this.f11508b;
        switch (i10) {
            case 0:
                x3 x3Var = e2Var.P;
                ArrayList arrayList = x3.f11718s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var.U4(this.f11509c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                e2Var.P.V4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                e2Var.P.V4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                e2Var.P.V4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                x3 x3Var2 = e2Var.P;
                ArrayList arrayList2 = x3.f11718s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.U4(this.f11509c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                e2Var.P.W4(aVar, 0);
                return;
            case 6:
                e2Var.P.W4(aVar, 1);
                return;
            case 7:
                e2Var.P.W4(aVar, 2);
                return;
            case 8:
                e2Var.P.W4(aVar, 3);
                return;
            default:
                View z12 = e2Var.P.z1(aVar);
                if (z12 instanceof p4) {
                    ((p4) z12).h(aVar, e2Var.P.getMapDelegate());
                    return;
                } else {
                    e2Var.P.Y2.N(false);
                    return;
                }
        }
    }
}
