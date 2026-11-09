package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class l1 implements Runnable {
    public final int f18682a;
    public final b2 f18683b;
    public final a f18684c;

    public l1(b2 b2Var, a aVar, int i7) {
        this.f18682a = i7;
        this.f18683b = b2Var;
        this.f18684c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18682a;
        a aVar = this.f18684c;
        b2 b2Var = this.f18683b;
        switch (i7) {
            case 0:
                t3 t3Var = b2Var.P;
                ArrayList arrayList = t3.f18873z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var.X4(this.f18684c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                b2Var.P.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                b2Var.P.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                b2Var.P.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                t3 t3Var2 = b2Var.P;
                ArrayList arrayList2 = t3.f18873z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.f18684c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                b2Var.P.Z4(aVar, 0);
                return;
            case 6:
                b2Var.P.Z4(aVar, 1);
                return;
            case 7:
                b2Var.P.Z4(aVar, 2);
                return;
            case 8:
                b2Var.P.Z4(aVar, 3);
                return;
            default:
                View C1 = b2Var.P.C1(aVar);
                if (C1 instanceof m4) {
                    ((m4) C1).g(aVar, b2Var.P.getMapDelegate());
                    return;
                } else {
                    b2Var.P.f37556f3.O(false);
                    return;
                }
        }
    }
}
