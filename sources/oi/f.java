package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f22047a;
    public final o f22048b;
    public final a f22049c;

    public f(o oVar, a aVar, int i7) {
        this.f22047a = i7;
        this.f22048b = oVar;
        this.f22049c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22047a;
        a aVar = this.f22049c;
        o oVar = this.f22048b;
        switch (i7) {
            case 0:
                s3 s3Var = oVar.f22207r;
                View C1 = s3Var.C1(aVar);
                if (C1 instanceof l4) {
                    ((l4) C1).g(aVar, s3Var.getMapDelegate());
                    return;
                } else {
                    s3Var.f34607g3.O(false);
                    return;
                }
            case 1:
                oVar.f22207r.Z4(aVar, 0);
                return;
            case 2:
                oVar.f22207r.Z4(aVar, 1);
                return;
            case 3:
                oVar.f22207r.Z4(aVar, 2);
                return;
            case 4:
                oVar.f22207r.Z4(aVar, 3);
                return;
            case 5:
                oVar.f22207r.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                s3 s3Var2 = oVar.f22207r;
                ArrayList arrayList = s3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.X4(this.f22049c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                s3 s3Var3 = oVar.f22207r;
                ArrayList arrayList2 = s3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var3.X4(this.f22049c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                oVar.f22207r.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                oVar.f22207r.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
