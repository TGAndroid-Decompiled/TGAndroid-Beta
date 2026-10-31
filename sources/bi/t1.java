package bi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 implements Runnable {
    public final int f3357a;
    public final k2 f3358b;
    public final a f3359c;

    public t1(k2 k2Var, a aVar, int i10) {
        this.f3357a = i10;
        this.f3358b = k2Var;
        this.f3359c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f3357a;
        a aVar = this.f3359c;
        k2 k2Var = this.f3358b;
        switch (i10) {
            case 0:
                d4 d4Var = k2Var.P;
                ArrayList arrayList = d4.f2922z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                d4Var.X4(this.f3359c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                k2Var.P.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                d4 d4Var2 = k2Var.P;
                ArrayList arrayList2 = d4.f2922z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                d4Var2.X4(this.f3359c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                k2Var.P.Z4(aVar, 0);
                return;
            case 6:
                k2Var.P.Z4(aVar, 1);
                return;
            case 7:
                k2Var.P.Z4(aVar, 2);
                return;
            case 8:
                k2Var.P.Z4(aVar, 3);
                return;
            default:
                View C1 = k2Var.P.C1(aVar);
                if (C1 instanceof y4) {
                    ((y4) C1).g(aVar, k2Var.P.getMapDelegate());
                    return;
                } else {
                    k2Var.P.f30819f3.O(false);
                    return;
                }
        }
    }
}
