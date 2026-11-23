package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class k1 implements Runnable {
    public final int f22156a;
    public final a2 f22157b;
    public final a f22158c;

    public k1(a2 a2Var, a aVar, int i7) {
        this.f22156a = i7;
        this.f22157b = a2Var;
        this.f22158c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22156a;
        a aVar = this.f22158c;
        a2 a2Var = this.f22157b;
        switch (i7) {
            case 0:
                s3 s3Var = a2Var.Q;
                ArrayList arrayList = s3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var.X4(this.f22158c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                a2Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                a2Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                a2Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                s3 s3Var2 = a2Var.Q;
                ArrayList arrayList2 = s3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.X4(this.f22158c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                a2Var.Q.Z4(aVar, 0);
                return;
            case 6:
                a2Var.Q.Z4(aVar, 1);
                return;
            case 7:
                a2Var.Q.Z4(aVar, 2);
                return;
            case 8:
                a2Var.Q.Z4(aVar, 3);
                return;
            default:
                View C1 = a2Var.Q.C1(aVar);
                if (C1 instanceof l4) {
                    ((l4) C1).g(aVar, a2Var.Q.getMapDelegate());
                    return;
                } else {
                    a2Var.Q.f35742g3.O(false);
                    return;
                }
        }
    }
}
