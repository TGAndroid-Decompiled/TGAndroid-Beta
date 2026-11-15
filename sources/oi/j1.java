package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 implements Runnable {
    public final int f21750a;
    public final z1 f21751b;
    public final a f21752c;

    public j1(z1 z1Var, a aVar, int i7) {
        this.f21750a = i7;
        this.f21751b = z1Var;
        this.f21752c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f21750a;
        a aVar = this.f21752c;
        z1 z1Var = this.f21751b;
        switch (i7) {
            case 0:
                q3 q3Var = z1Var.Q;
                ArrayList arrayList = q3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                q3Var.X4(this.f21752c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockFooter());
                return;
            case 3:
                z1Var.Q.Y4(aVar, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                q3 q3Var2 = z1Var.Q;
                ArrayList arrayList2 = q3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                q3Var2.X4(this.f21752c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                z1Var.Q.Z4(aVar, 0);
                return;
            case 6:
                z1Var.Q.Z4(aVar, 1);
                return;
            case 7:
                z1Var.Q.Z4(aVar, 2);
                return;
            case 8:
                z1Var.Q.Z4(aVar, 3);
                return;
            default:
                View C1 = z1Var.Q.C1(aVar);
                if (C1 instanceof j4) {
                    ((j4) C1).g(aVar, z1Var.Q.getMapDelegate());
                    return;
                } else {
                    z1Var.Q.f39895g3.O(false);
                    return;
                }
        }
    }
}
