package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ck0;
public final class m1 extends v4.k0 {
    public final int f17587a;
    public final Object f17588b;

    public m1(Object obj, int i7) {
        this.f17587a = i7;
        this.f17588b = obj;
    }

    @Override
    public final void a() {
        int i7 = this.f17587a;
        Object obj = this.f17588b;
        switch (i7) {
            case 0:
                ((n1) obj).f();
                return;
            case 1:
                ck0 ck0Var = (ck0) obj;
                ck0Var.K0(true);
                if (ck0Var.f34080r2) {
                    ck0Var.f34079r1 = -1;
                    if (ck0Var.U1 == null) {
                        ck0Var.F1.setEmpty();
                    }
                }
                ck0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f2817v0.f59090f = true;
                boolean z10 = s2.f26721a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void b(int i7, int i10) {
        switch (this.f17587a) {
            case 0:
                ((n1) this.f17588b).k(i7 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i7, int i10, Object obj) {
        switch (this.f17587a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f17588b;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26721a;
                    StringBuilder n10 = i5.c.n("onItemRangeChanged(", i7, ", ", i10, ", ");
                    n10.append(obj);
                    n10.append(")");
                    n0Var.h(n10.toString());
                    arrayList.add(n0Var.i(4, i7, obj, i10));
                    n0Var.f58780b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i7, i10, obj);
                return;
        }
    }

    @Override
    public final void d(int i7, int i10) {
        int i11 = this.f17587a;
        Object obj = this.f17588b;
        switch (i11) {
            case 0:
                ((n1) obj).o(i7 + 1, i10);
                return;
            case 1:
                ck0 ck0Var = (ck0) obj;
                ck0Var.K0(true);
                View view = ck0Var.f34077q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    ck0Var.f34079r1 = -1;
                    ck0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26721a;
                    n0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(n0Var.i(1, i7, null, i10));
                    n0Var.f58780b = n0Var.f58780b | 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i7, int i10) {
        int i11 = this.f17587a;
        Object obj = this.f17588b;
        switch (i11) {
            case 0:
                ((n1) obj).k(i7 + 1, i10 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i7 != i10) {
                    boolean z10 = s2.f26721a;
                    n0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(n0Var.i(8, i7, null, i10));
                    n0Var.f58780b = n0Var.f58780b | 8;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void f(int i7, int i10) {
        int i11 = this.f17587a;
        Object obj = this.f17588b;
        switch (i11) {
            case 0:
                ((n1) obj).p(i7 + 1, i10);
                return;
            case 1:
                ((ck0) obj).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.n0 n0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) n0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26721a;
                    n0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(n0Var.i(2, i7, null, i10));
                    n0Var.f58780b = n0Var.f58780b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void g() {
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.f17588b;
        if (recyclerView.I && recyclerView.H) {
            v4.h0 h0Var = recyclerView.f2806n;
            WeakHashMap weakHashMap = r0.i0.f56244a;
            recyclerView.postOnAnimation(h0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
