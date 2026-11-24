package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class te9 implements Runnable {
    public final byte a;
    public final jf9 b;
    public final ll0 c;

    public te9(jf9 jf9Var, ll0 ll0Var, byte b) {
        this.a = b;
        this.b = jf9Var;
        this.c = ll0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ll0 ll0Var = this.c;
        jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                ch9 ch9Var = jf9Var.Q;
                ArrayList arrayList = ch9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ch9Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockFooter());
                return;
            case 3:
                jf9Var.Q.Y4(ll0Var, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                ch9 ch9Var2 = jf9Var.Q;
                ArrayList arrayList2 = ch9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ch9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                jf9Var.Q.Z4(ll0Var, 0);
                return;
            case 6:
                jf9Var.Q.Z4(ll0Var, 1);
                return;
            case 7:
                jf9Var.Q.Z4(ll0Var, 2);
                return;
            case 8:
                jf9Var.Q.Z4(ll0Var, 3);
                return;
            default:
                View C1 = jf9Var.Q.C1(ll0Var);
                boolean z = C1 instanceof th9;
                ch9 ch9Var3 = jf9Var.Q;
                if (z) {
                    ((th9) C1).g(ll0Var, ch9Var3.getMapDelegate());
                    return;
                } else {
                    ch9Var3.g3.O(false);
                    return;
                }
        }
    }
}
