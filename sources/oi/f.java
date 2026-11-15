package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f21681a;
    public final o f21682b;
    public final a f21683c;

    public f(o oVar, a aVar, int i7) {
        this.f21681a = i7;
        this.f21682b = oVar;
        this.f21683c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f21681a;
        a aVar = this.f21683c;
        o oVar = this.f21682b;
        switch (i7) {
            case 0:
                q3 q3Var = oVar.f21848r;
                View C1 = q3Var.C1(aVar);
                if (C1 instanceof j4) {
                    ((j4) C1).g(aVar, q3Var.getMapDelegate());
                    return;
                } else {
                    q3Var.f39892g3.O(false);
                    return;
                }
            case 1:
                oVar.f21848r.Z4(aVar, 0);
                return;
            case 2:
                oVar.f21848r.Z4(aVar, 1);
                return;
            case 3:
                oVar.f21848r.Z4(aVar, 2);
                return;
            case 4:
                oVar.f21848r.Z4(aVar, 3);
                return;
            case 5:
                oVar.f21848r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                q3 q3Var2 = oVar.f21848r;
                ArrayList arrayList = q3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                q3Var2.X4(this.f21683c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                q3 q3Var3 = oVar.f21848r;
                ArrayList arrayList2 = q3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                q3Var3.X4(this.f21683c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                oVar.f21848r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                oVar.f21848r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
