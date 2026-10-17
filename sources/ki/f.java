package ki;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f implements Runnable {
    public final int f15243a;
    public final q f15244b;
    public final a f15245c;

    public f(q qVar, a aVar, int i10) {
        this.f15243a = i10;
        this.f15244b = qVar;
        this.f15245c = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15243a;
        a aVar = this.f15245c;
        q qVar = this.f15244b;
        switch (i10) {
            case 0:
                w3 w3Var = qVar.f15442r;
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof o4) {
                    ((o4) A1).h(aVar, w3Var.getMapDelegate());
                    return;
                } else {
                    w3Var.W2.N(false);
                    return;
                }
            case 1:
                qVar.f15442r.X4(aVar, 0);
                return;
            case 2:
                qVar.f15442r.X4(aVar, 1);
                return;
            case 3:
                qVar.f15442r.X4(aVar, 2);
                return;
            case 4:
                qVar.f15442r.X4(aVar, 3);
                return;
            case 5:
                qVar.f15442r.W4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                w3 w3Var2 = qVar.f15442r;
                ArrayList arrayList = w3.f15578q4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                w3Var2.V4(this.f15245c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                w3 w3Var3 = qVar.f15442r;
                ArrayList arrayList2 = w3.f15578q4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                w3Var3.V4(this.f15245c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                qVar.f15442r.W4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            default:
                qVar.f15442r.W4(aVar, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
