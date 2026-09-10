package hi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g implements Runnable {
    public final int f9575a;
    public final s f9576b;
    public final a f9577c;

    public g(s sVar, a aVar, int i10) {
        this.f9575a = i10;
        this.f9576b = sVar;
        this.f9577c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f9575a;
        a aVar = this.f9577c;
        s sVar = this.f9576b;
        switch (i10) {
            case 0:
                z3 z3Var = sVar.f9835r;
                View y12 = z3Var.y1(aVar);
                if (y12 instanceof r4) {
                    ((r4) y12).h(aVar, z3Var.getMapDelegate());
                    return;
                } else {
                    z3Var.Y2.N(false);
                    return;
                }
            case 1:
                sVar.f9835r.V4(aVar, 0);
                return;
            case 2:
                sVar.f9835r.V4(aVar, 1);
                return;
            case 3:
                sVar.f9835r.V4(aVar, 2);
                return;
            case 4:
                sVar.f9835r.V4(aVar, 3);
                return;
            case 5:
                sVar.f9835r.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                z3 z3Var2 = sVar.f9835r;
                ArrayList arrayList = z3.f9991s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                z3Var2.T4(this.f9577c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                z3 z3Var3 = sVar.f9835r;
                ArrayList arrayList2 = z3.f9991s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                z3Var3.T4(this.f9577c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                sVar.f9835r.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                sVar.f9835r.U4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
