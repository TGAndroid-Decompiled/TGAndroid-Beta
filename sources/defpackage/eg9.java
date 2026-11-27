package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class eg9 implements Runnable {
    public final byte a;
    public final yg9 b;
    public final mk0 c;

    public eg9(yg9 yg9Var, mk0 mk0Var, byte b) {
        this.a = b;
        this.b = yg9Var;
        this.c = mk0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        mk0 mk0Var = this.c;
        yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                View D1 = yg9Var.Q.D1(mk0Var);
                boolean z = D1 instanceof gj9;
                pi9 pi9Var = yg9Var.Q;
                if (z) {
                    ((gj9) D1).g(mk0Var, pi9Var.getMapDelegate());
                    return;
                } else {
                    pi9Var.g3.O(false);
                    return;
                }
            case 1:
                pi9 pi9Var2 = yg9Var.Q;
                ArrayList arrayList = pi9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                pi9Var2.Y4(this.c, pageblockpullquote, 0, 0, false, false);
                return;
            case 2:
                yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockPreformatted());
                return;
            case 3:
                yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockFooter());
                return;
            case 4:
                yg9Var.Q.Z4(mk0Var, new TL_iv.pageBlockParagraph());
                return;
            case 5:
                pi9 pi9Var3 = yg9Var.Q;
                ArrayList arrayList2 = pi9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                pi9Var3.Y4(this.c, pageblockblockquote, 0, 0, false, false);
                return;
            case 6:
                yg9Var.Q.a5(mk0Var, 0);
                return;
            case 7:
                yg9Var.Q.a5(mk0Var, 1);
                return;
            case 8:
                yg9Var.Q.a5(mk0Var, 2);
                return;
            default:
                yg9Var.Q.a5(mk0Var, 3);
                return;
        }
    }
}
