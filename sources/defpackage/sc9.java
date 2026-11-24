package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class sc9 implements Runnable {
    public final byte a;
    public final hd9 b;
    public final lk0 c;

    public sc9(hd9 hd9Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = hd9Var;
        this.c = lk0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                ye9 ye9Var = hd9Var.Q;
                ArrayList arrayList = ye9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ye9Var.X4(this.c, pageblockpullquote, 0, 0, false, false);
                return;
            case 1:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockPreformatted());
                return;
            case 2:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockFooter());
                return;
            case 3:
                hd9Var.Q.Y4(lk0Var, new TL_iv.pageBlockParagraph());
                return;
            case 4:
                ye9 ye9Var2 = hd9Var.Q;
                ArrayList arrayList2 = ye9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ye9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                return;
            case 5:
                hd9Var.Q.Z4(lk0Var, 0);
                return;
            case 6:
                hd9Var.Q.Z4(lk0Var, 1);
                return;
            case 7:
                hd9Var.Q.Z4(lk0Var, 2);
                return;
            case 8:
                hd9Var.Q.Z4(lk0Var, 3);
                return;
            default:
                View C1 = hd9Var.Q.C1(lk0Var);
                boolean z = C1 instanceof pf9;
                ye9 ye9Var3 = hd9Var.Q;
                if (z) {
                    ((pf9) C1).g(lk0Var, ye9Var3.getMapDelegate());
                    return;
                } else {
                    ye9Var3.g3.O(false);
                    return;
                }
        }
    }
}
