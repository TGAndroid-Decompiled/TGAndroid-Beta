package li;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f17216a;
    public final q f17217b;
    public final a f17218c;

    public f(q qVar, a aVar, int i10) {
        this.f17216a = i10;
        this.f17217b = qVar;
        this.f17218c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f17216a;
        a aVar = this.f17218c;
        q qVar = this.f17217b;
        switch (i10) {
            case 0:
                v3 v3Var = qVar.f17417r;
                View F1 = v3Var.F1(aVar);
                if (F1 instanceof o4) {
                    ((o4) F1).g(aVar, v3Var.getMapDelegate());
                    return;
                } else {
                    v3Var.f32504g3.O(false);
                    return;
                }
            case 1:
                qVar.f17417r.c5(aVar, 0);
                return;
            case 2:
                qVar.f17417r.c5(aVar, 1);
                return;
            case 3:
                qVar.f17417r.c5(aVar, 2);
                return;
            case 4:
                qVar.f17417r.c5(aVar, 3);
                return;
            case 5:
                qVar.f17417r.b5(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                v3 v3Var2 = qVar.f17417r;
                ArrayList arrayList = v3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                v3Var2.a5(this.f17218c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                v3 v3Var3 = qVar.f17417r;
                ArrayList arrayList2 = v3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                v3Var3.a5(this.f17218c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                qVar.f17417r.b5(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                qVar.f17417r.b5(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
