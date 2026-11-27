package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class l5c extends v79 {
    public final byte a = 1;
    public int b;
    public final Object c;

    public l5c(bn0 bn0Var, int i) {
        this.c = bn0Var;
        this.b = i;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        ltc ltcVar;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    this.b = 0;
                    return;
                }
                return;
            default:
                if (i == 1 && (ltcVar = ((uqc) ((bn0) this.c).c).j0) != null) {
                    ltcVar.a();
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
                o5c o5cVar = (o5c) obj;
                d6c d6cVar = o5cVar.n1;
                this.b += i2;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.b) > hl.L(96.0f)) {
                    View findFocus = d6cVar.findFocus();
                    if (findFocus == null) {
                        findFocus = d6cVar;
                    }
                    hl.t1(findFocus);
                }
                if (i2 != 0 && d6cVar.c()) {
                    o5cVar.o1 = d6cVar.getContentTopOffset();
                    o5cVar.b.invalidate();
                    return;
                }
                return;
            default:
                int i3 = this.b;
                uqc uqcVar = (uqc) ((bn0) obj).c;
                if (i3 == 0) {
                    uqcVar.G0();
                    return;
                } else {
                    recyclerView.post(new cpc(uqcVar, (byte) 3));
                    return;
                }
        }
    }

    public l5c(o5c o5cVar) {
        this.c = o5cVar;
    }
}
