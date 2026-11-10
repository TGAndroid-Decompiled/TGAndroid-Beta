package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.pj0;
public final class n1 extends v4.i0 {
    public final int f16864a;
    public final Object f16865b;

    public n1(Object obj, int i7) {
        this.f16864a = i7;
        this.f16865b = obj;
    }

    @Override
    public final void a() {
        int i7 = this.f16864a;
        Object obj = this.f16865b;
        switch (i7) {
            case 0:
                ((o1) obj).f();
                return;
            case 1:
                pj0 pj0Var = (pj0) obj;
                pj0Var.K0(true);
                if (pj0Var.f36986q2) {
                    pj0Var.f36985q1 = -1;
                    if (pj0Var.T1 == null) {
                        pj0Var.E1.setEmpty();
                    }
                }
                pj0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f2867u0.f57010f = true;
                boolean z9 = r2.f25216a;
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
        switch (this.f16864a) {
            case 0:
                ((o1) this.f16865b).k(i7 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i7, int i10, Object obj) {
        switch (this.f16864a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f16865b;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.f25216a;
                    StringBuilder o4 = g.o("onItemRangeChanged(", i7, ", ", i10, ", ");
                    o4.append(obj);
                    o4.append(")");
                    k0Var.h(o4.toString());
                    arrayList.add(k0Var.i(4, i7, obj, i10));
                    k0Var.f56687b |= 4;
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
        int i11 = this.f16864a;
        Object obj = this.f16865b;
        switch (i11) {
            case 0:
                ((o1) obj).o(i7 + 1, i10);
                return;
            case 1:
                pj0 pj0Var = (pj0) obj;
                pj0Var.K0(true);
                View view = pj0Var.f36983p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    pj0Var.f36985q1 = -1;
                    pj0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.f25216a;
                    k0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(k0Var.i(1, i7, null, i10));
                    k0Var.f56687b = k0Var.f56687b | 1;
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
        int i11 = this.f16864a;
        Object obj = this.f16865b;
        switch (i11) {
            case 0:
                ((o1) obj).k(i7 + 1, i10 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i7 != i10) {
                    boolean z9 = r2.f25216a;
                    k0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(k0Var.i(8, i7, null, i10));
                    k0Var.f56687b = k0Var.f56687b | 8;
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
        int i11 = this.f16864a;
        Object obj = this.f16865b;
        switch (i11) {
            case 0:
                ((o1) obj).p(i7 + 1, i10);
                return;
            case 1:
                ((pj0) obj).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.k0 k0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) k0Var.d;
                if (i10 >= 1) {
                    boolean z9 = r2.f25216a;
                    k0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(k0Var.i(2, i7, null, i10));
                    k0Var.f56687b = k0Var.f56687b | 2;
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
        int[] iArr = RecyclerView.Q0;
        RecyclerView recyclerView = (RecyclerView) this.f16865b;
        if (recyclerView.H && recyclerView.G) {
            v4.f0 f0Var = recyclerView.f2857n;
            WeakHashMap weakHashMap = r0.i0.f54202a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
