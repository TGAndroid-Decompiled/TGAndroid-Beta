package ki;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f15307a;
    public final q f15308b;
    public final a f15309c;

    public f(q qVar, a aVar, int i10) {
        this.f15307a = i10;
        this.f15308b = qVar;
        this.f15309c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15307a;
        a aVar = this.f15309c;
        q qVar = this.f15308b;
        switch (i10) {
            case 0:
                w3 w3Var = qVar.f15508r;
                View F1 = w3Var.F1(aVar);
                if (F1 instanceof o4) {
                    ((o4) F1).g(aVar, w3Var.getMapDelegate());
                    return;
                } else {
                    w3Var.Z2.N(false);
                    return;
                }
            case 1:
                qVar.f15508r.c5(aVar, 0);
                return;
            case 2:
                qVar.f15508r.c5(aVar, 1);
                return;
            case 3:
                qVar.f15508r.c5(aVar, 2);
                return;
            case 4:
                qVar.f15508r.c5(aVar, 3);
                return;
            case 5:
                qVar.f15508r.b5(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                w3 w3Var2 = qVar.f15508r;
                ArrayList arrayList = w3.f15645t4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.a5(this.f15309c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                w3 w3Var3 = qVar.f15508r;
                ArrayList arrayList2 = w3.f15645t4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.a5(this.f15309c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                qVar.f15508r.b5(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                qVar.f15508r.b5(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
