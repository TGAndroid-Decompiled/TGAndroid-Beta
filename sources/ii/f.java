package ii;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f12353a;
    public final r f12354b;
    public final a f12355c;

    public f(r rVar, a aVar, int i10) {
        this.f12353a = i10;
        this.f12354b = rVar;
        this.f12355c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12353a;
        a aVar = this.f12355c;
        r rVar = this.f12354b;
        switch (i10) {
            case 0:
                x3 x3Var = rVar.f12602r;
                View B1 = x3Var.B1(aVar);
                if (B1 instanceof q4) {
                    ((q4) B1).h(aVar, x3Var.getMapDelegate());
                    return;
                } else {
                    x3Var.f25245f3.N(false);
                    return;
                }
            case 1:
                rVar.f12602r.Y4(aVar, 0);
                return;
            case 2:
                rVar.f12602r.Y4(aVar, 1);
                return;
            case 3:
                rVar.f12602r.Y4(aVar, 2);
                return;
            case 4:
                rVar.f12602r.Y4(aVar, 3);
                return;
            case 5:
                rVar.f12602r.X4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                x3 x3Var2 = rVar.f12602r;
                ArrayList arrayList = x3.f12753z4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                x3Var2.W4(this.f12355c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                x3 x3Var3 = rVar.f12602r;
                ArrayList arrayList2 = x3.f12753z4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                x3Var3.W4(this.f12355c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                rVar.f12602r.X4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                rVar.f12602r.X4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
