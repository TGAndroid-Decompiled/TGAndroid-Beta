package ji;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f13916a;
    public final r f13917b;
    public final a f13918c;

    public f(r rVar, a aVar, int i10) {
        this.f13916a = i10;
        this.f13917b = rVar;
        this.f13918c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13916a;
        a aVar = this.f13918c;
        r rVar = this.f13917b;
        switch (i10) {
            case 0:
                v3 v3Var = rVar.f14159r;
                View y12 = v3Var.y1(aVar);
                if (y12 instanceof p4) {
                    ((p4) y12).h(aVar, v3Var.getMapDelegate());
                    return;
                } else {
                    v3Var.Y2.N(false);
                    return;
                }
            case 1:
                rVar.f14159r.V4(aVar, 0);
                return;
            case 2:
                rVar.f14159r.V4(aVar, 1);
                return;
            case 3:
                rVar.f14159r.V4(aVar, 2);
                return;
            case 4:
                rVar.f14159r.V4(aVar, 3);
                return;
            case 5:
                rVar.f14159r.U4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                v3 v3Var2 = rVar.f14159r;
                ArrayList arrayList = v3.f14265s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.T4(this.f13918c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                v3 v3Var3 = rVar.f14159r;
                ArrayList arrayList2 = v3.f14265s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var3.T4(this.f13918c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f14159r.U4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f14159r.U4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
