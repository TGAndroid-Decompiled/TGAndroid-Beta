package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f11364a;
    public final r f11365b;
    public final a f11366c;

    public f(r rVar, a aVar, int i10) {
        this.f11364a = i10;
        this.f11365b = rVar;
        this.f11366c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11364a;
        a aVar = this.f11366c;
        r rVar = this.f11365b;
        switch (i10) {
            case 0:
                w3 w3Var = rVar.f11591r;
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof o4) {
                    ((o4) A1).h(aVar, w3Var.getMapDelegate());
                    return;
                } else {
                    w3Var.Y2.N(false);
                    return;
                }
            case 1:
                rVar.f11591r.X4(aVar, 0);
                return;
            case 2:
                rVar.f11591r.X4(aVar, 1);
                return;
            case 3:
                rVar.f11591r.X4(aVar, 2);
                return;
            case 4:
                rVar.f11591r.X4(aVar, 3);
                return;
            case 5:
                rVar.f11591r.W4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                w3 w3Var2 = rVar.f11591r;
                ArrayList arrayList = w3.f11704s4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.V4(this.f11366c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                w3 w3Var3 = rVar.f11591r;
                ArrayList arrayList2 = w3.f11704s4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.V4(this.f11366c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f11591r.W4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f11591r.W4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
