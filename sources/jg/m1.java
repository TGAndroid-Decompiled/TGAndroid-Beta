package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.ek0;
public final class m1 extends v4.k0 {
    public final int f17615a;
    public final Object f17616b;

    public m1(Object obj, int i7) {
        this.f17615a = i7;
        this.f17616b = obj;
    }

    @Override
    public final void a() {
        int i7 = this.f17615a;
        Object obj = this.f17616b;
        switch (i7) {
            case 0:
                ((n1) obj).f();
                return;
            case 1:
                ek0 ek0Var = (ek0) obj;
                ek0Var.K0(true);
                if (ek0Var.f34879r2) {
                    ek0Var.f34878r1 = -1;
                    if (ek0Var.U1 == null) {
                        ek0Var.F1.setEmpty();
                    }
                }
                ek0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f2836v0.f59132f = true;
                boolean z10 = s2.f26730a;
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
        switch (this.f17615a) {
            case 0:
                ((n1) this.f17616b).k(i7 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i7, int i10, Object obj) {
        switch (this.f17615a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f17616b;
                recyclerView.l(null);
                ug.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26730a;
                    StringBuilder n10 = i5.c.n("onItemRangeChanged(", i7, ", ", i10, ", ");
                    n10.append(obj);
                    n10.append(")");
                    m0Var.h(n10.toString());
                    arrayList.add(m0Var.i(4, i7, obj, i10));
                    m0Var.f58817b |= 4;
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
        int i11 = this.f17615a;
        Object obj = this.f17616b;
        switch (i11) {
            case 0:
                ((n1) obj).o(i7 + 1, i10);
                return;
            case 1:
                ek0 ek0Var = (ek0) obj;
                ek0Var.K0(true);
                View view = ek0Var.f34876q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    ek0Var.f34878r1 = -1;
                    ek0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26730a;
                    m0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(m0Var.i(1, i7, null, i10));
                    m0Var.f58817b = m0Var.f58817b | 1;
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
        int i11 = this.f17615a;
        Object obj = this.f17616b;
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
                ug.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i7 != i10) {
                    boolean z10 = s2.f26730a;
                    m0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(m0Var.i(8, i7, null, i10));
                    m0Var.f58817b = m0Var.f58817b | 8;
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
        int i11 = this.f17615a;
        Object obj = this.f17616b;
        switch (i11) {
            case 0:
                ((n1) obj).p(i7 + 1, i10);
                return;
            case 1:
                ((ek0) obj).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i10 >= 1) {
                    boolean z10 = s2.f26730a;
                    m0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(m0Var.i(2, i7, null, i10));
                    m0Var.f58817b = m0Var.f58817b | 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f17616b;
        if (recyclerView.I && recyclerView.H) {
            v4.h0 h0Var = recyclerView.f2825n;
            WeakHashMap weakHashMap = r0.i0.f56289a;
            recyclerView.postOnAnimation(h0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
