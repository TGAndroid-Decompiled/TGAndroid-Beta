package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f11370a;
    public final r f11371b;
    public final a f11372c;

    public f(r rVar, a aVar, int i10) {
        this.f11370a = i10;
        this.f11371b = rVar;
        this.f11372c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f11370a;
        a aVar = this.f11372c;
        r rVar = this.f11371b;
        switch (i10) {
            case 0:
                x3 x3Var = rVar.f11586r;
                View B1 = x3Var.B1(aVar);
                if (B1 instanceof p4) {
                    ((p4) B1).h(aVar, x3Var.getMapDelegate());
                    return;
                } else {
                    x3Var.f28778f3.N(false);
                    return;
                }
            case 1:
                rVar.f11586r.Y4(aVar, 0);
                return;
            case 2:
                rVar.f11586r.Y4(aVar, 1);
                return;
            case 3:
                rVar.f11586r.Y4(aVar, 2);
                return;
            case 4:
                rVar.f11586r.Y4(aVar, 3);
                return;
            case 5:
                rVar.f11586r.X4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                x3 x3Var2 = rVar.f11586r;
                ArrayList arrayList = x3.f11732z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.W4(this.f11372c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                x3 x3Var3 = rVar.f11586r;
                ArrayList arrayList2 = x3.f11732z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.W4(this.f11372c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f11586r.X4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f11586r.X4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
