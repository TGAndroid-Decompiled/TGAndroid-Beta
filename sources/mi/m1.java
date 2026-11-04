package mi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class m1 implements Runnable {
    public final int f19742a;
    public final c2 f19743b;
    public final a f19744c;

    public m1(c2 c2Var, a aVar, int i3) {
        this.f19742a = i3;
        this.f19743b = c2Var;
        this.f19744c = aVar;
    }

    @Override
    public final void run() {
        int i3 = this.f19742a;
        a aVar = this.f19744c;
        c2 c2Var = this.f19743b;
        switch (i3) {
            case 0:
                t3 t3Var = c2Var.Q;
                ArrayList arrayList = t3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var.X4(this.f19744c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                c2Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                t3 t3Var2 = c2Var.Q;
                ArrayList arrayList2 = t3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.f19744c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                c2Var.Q.Z4(aVar, 0);
                return;
            case 6:
                c2Var.Q.Z4(aVar, 1);
                return;
            case 7:
                c2Var.Q.Z4(aVar, 2);
                return;
            case 8:
                c2Var.Q.Z4(aVar, 3);
                return;
            default:
                View C1 = c2Var.Q.C1(aVar);
                if (C1 instanceof n4) {
                    ((n4) C1).g(aVar, c2Var.Q.getMapDelegate());
                    return;
                } else {
                    c2Var.Q.f35594g3.O(false);
                    return;
                }
        }
    }
}
