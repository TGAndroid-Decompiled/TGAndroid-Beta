package oi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 implements Runnable {
    public final int f22115a;
    public final z1 f22116b;
    public final a f22117c;

    public j1(z1 z1Var, a aVar, int i7) {
        this.f22115a = i7;
        this.f22116b = z1Var;
        this.f22117c = aVar;
    }

    @Override
    public final void run() {
        int i7 = this.f22115a;
        a aVar = this.f22117c;
        z1 z1Var = this.f22116b;
        switch (i7) {
            case 0:
                s3 s3Var = z1Var.Q;
                ArrayList arrayList = s3.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                s3Var.X4(this.f22117c, pageblockpullquote, 0, 0, false, false);
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
                s3 s3Var2 = z1Var.Q;
                ArrayList arrayList2 = s3.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                s3Var2.X4(this.f22117c, pageblockblockquote, 0, 0, false, false);
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
                if (C1 instanceof l4) {
                    ((l4) C1).g(aVar, z1Var.Q.getMapDelegate());
                    return;
                } else {
                    z1Var.Q.f34607g3.O(false);
                    return;
                }
        }
    }
}
