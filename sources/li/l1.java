package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class l1 implements Runnable {
    public final int f17339a;
    public final b2 f17340b;
    public final a f17341c;

    public l1(b2 b2Var, a aVar, int i10) {
        this.f17339a = i10;
        this.f17340b = b2Var;
        this.f17341c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f17339a;
        a aVar = this.f17341c;
        b2 b2Var = this.f17340b;
        switch (i10) {
            case 0:
                v3 v3Var = b2Var.P;
                ArrayList arrayList = v3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var.a5(this.f17341c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                b2Var.P.b5(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                b2Var.P.b5(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                b2Var.P.b5(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                v3 v3Var2 = b2Var.P;
                ArrayList arrayList2 = v3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.a5(this.f17341c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                b2Var.P.c5(aVar, 0);
                return;
            case 6:
                b2Var.P.c5(aVar, 1);
                return;
            case 7:
                b2Var.P.c5(aVar, 2);
                return;
            case 8:
                b2Var.P.c5(aVar, 3);
                return;
            default:
                View F1 = b2Var.P.F1(aVar);
                if (F1 instanceof o4) {
                    ((o4) F1).g(aVar, b2Var.P.getMapDelegate());
                    return;
                } else {
                    b2Var.P.f32504g3.O(false);
                    return;
                }
        }
    }
}
