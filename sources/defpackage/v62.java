package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class v62 implements Runnable {
    public final byte a;
    public final e72 b;
    public final lk0 c;

    public v62(e72 e72Var, lk0 lk0Var, byte b) {
        this.a = b;
        this.b = e72Var;
        this.c = lk0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lk0 lk0Var = this.c;
        e72 e72Var = this.b;
        switch (b) {
            case 0:
                ye9 ye9Var = e72Var.r;
                View C1 = ye9Var.C1(lk0Var);
                if (C1 instanceof pf9) {
                    ((pf9) C1).g(lk0Var, ye9Var.getMapDelegate());
                    return;
                } else {
                    ye9Var.g3.O(false);
                    return;
                }
            case 1:
                e72Var.r.Z4(lk0Var, 0);
                return;
            case 2:
                e72Var.r.Z4(lk0Var, 1);
                return;
            case 3:
                e72Var.r.Z4(lk0Var, 2);
                return;
            case 4:
                e72Var.r.Z4(lk0Var, 3);
                return;
            case 5:
                e72Var.r.Y4(lk0Var, new TL_iv.pageBlockParagraph());
                return;
            case 6:
                ye9 ye9Var2 = e72Var.r;
                ArrayList arrayList = ye9.A4;
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                ye9Var2.X4(this.c, pageblockblockquote, 0, 0, false, false);
                return;
            case 7:
                ye9 ye9Var3 = e72Var.r;
                ArrayList arrayList2 = ye9.A4;
                TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                pageblockpullquote.caption = new TL_iv.textEmpty();
                ye9Var3.X4(this.c, pageblockpullquote, 0, 0, false, false);
                return;
            case 8:
                e72Var.r.Y4(lk0Var, new TL_iv.pageBlockPreformatted());
                return;
            default:
                e72Var.r.Y4(lk0Var, new TL_iv.pageBlockFooter());
                return;
        }
    }
}
