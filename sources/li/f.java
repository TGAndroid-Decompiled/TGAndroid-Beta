package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f18549a;
    public final p f18550b;
    public final a f18551c;

    public f(p pVar, a aVar, int i7) {
        this.f18549a = i7;
        this.f18550b = pVar;
        this.f18551c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f18549a;
        a aVar = this.f18551c;
        p pVar = this.f18550b;
        switch (i7) {
            case 0:
                t3 t3Var = pVar.f18760r;
                View C1 = t3Var.C1(aVar);
                if (C1 instanceof m4) {
                    ((m4) C1).g(aVar, t3Var.getMapDelegate());
                    return;
                } else {
                    t3Var.f37556f3.O(false);
                    return;
                }
            case 1:
                pVar.f18760r.Z4(aVar, 0);
                return;
            case 2:
                pVar.f18760r.Z4(aVar, 1);
                return;
            case 3:
                pVar.f18760r.Z4(aVar, 2);
                return;
            case 4:
                pVar.f18760r.Z4(aVar, 3);
                return;
            case 5:
                pVar.f18760r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                t3 t3Var2 = pVar.f18760r;
                ArrayList arrayList = t3.f18873z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                t3Var2.X4(this.f18551c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                t3 t3Var3 = pVar.f18760r;
                ArrayList arrayList2 = t3.f18873z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                t3Var3.X4(this.f18551c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                pVar.f18760r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                pVar.f18760r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
