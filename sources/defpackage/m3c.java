package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class m3c extends k69 {
    public final byte a = 1;
    public int b;
    public final Object c;

    public m3c(bo0 bo0Var, int i) {
        this.c = bo0Var;
        this.b = i;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        brc brcVar;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b = 0;
                    return;
                }
                return;
            default:
                if (i == 1 && (brcVar = ((goc) ((bo0) this.c).c).j0) != null) {
                    brcVar.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                p3c p3cVar = (p3c) obj;
                d4c d4cVar = p3cVar.n1;
                this.b += i2;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > gm.L(96.0f)) {
                    View findFocus = d4cVar.findFocus();
                    if (findFocus == null) {
                        findFocus = d4cVar;
                    }
                    gm.t1(findFocus);
                }
                if (i2 != 0 && d4cVar.c()) {
                    p3cVar.o1 = d4cVar.getContentTopOffset();
                    p3cVar.b.invalidate();
                    return;
                }
                return;
            default:
                int i3 = this.b;
                goc gocVar = (goc) ((bo0) obj).c;
                if (i3 == 0) {
                    gocVar.H0();
                    return;
                } else {
                    recyclerView.post(new pmc(gocVar, (byte) 14));
                    return;
                }
        }
    }

    public m3c(p3c p3cVar) {
        this.c = p3cVar;
    }
}
