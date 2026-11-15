package jg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.uj0;
public final class m1 extends v4.j0 {
    public final int f17204a;
    public final Object f17205b;

    public m1(Object obj, int i7) {
        this.f17204a = i7;
        this.f17205b = obj;
    }

    @Override
    public final void a() {
        int i7 = this.f17204a;
        Object obj = this.f17205b;
        switch (i7) {
            case 0:
                ((n1) obj).f();
                return;
            case 1:
                uj0 uj0Var = (uj0) obj;
                uj0Var.K0(true);
                if (uj0Var.f40075r2) {
                    uj0Var.f40074r1 = -1;
                    if (uj0Var.U1 == null) {
                        uj0Var.F1.setEmpty();
                    }
                }
                uj0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f2825v0.f58504f = true;
                boolean z10 = r2.f26206a;
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
        switch (this.f17204a) {
            case 0:
                ((n1) this.f17205b).k(i7 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i7, int i10, Object obj) {
        switch (this.f17204a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f17205b;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f26206a;
                    StringBuilder n10 = i5.c.n("onItemRangeChanged(", i7, ", ", i10, ", ");
                    n10.append(obj);
                    n10.append(")");
                    l0Var.h(n10.toString());
                    arrayList.add(l0Var.i(4, i7, obj, i10));
                    l0Var.f58197b |= 4;
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
        int i11 = this.f17204a;
        Object obj = this.f17205b;
        switch (i11) {
            case 0:
                ((n1) obj).o(i7 + 1, i10);
                return;
            case 1:
                uj0 uj0Var = (uj0) obj;
                uj0Var.K0(true);
                View view = uj0Var.f40072q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    uj0Var.f40074r1 = -1;
                    uj0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f26206a;
                    l0Var.h("onItemRangeInserted(" + i7 + ", " + i10 + ")");
                    arrayList.add(l0Var.i(1, i7, null, i10));
                    l0Var.f58197b = l0Var.f58197b | 1;
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
        int i11 = this.f17204a;
        Object obj = this.f17205b;
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
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i7 != i10) {
                    boolean z10 = r2.f26206a;
                    l0Var.h("onItemRangeMoved(" + i7 + ", " + i10 + ", 1)");
                    arrayList.add(l0Var.i(8, i7, null, i10));
                    l0Var.f58197b = l0Var.f58197b | 8;
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
        int i11 = this.f17204a;
        Object obj = this.f17205b;
        switch (i11) {
            case 0:
                ((n1) obj).p(i7 + 1, i10);
                return;
            case 1:
                ((uj0) obj).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ug.l0 l0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) l0Var.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f26206a;
                    l0Var.h("onItemRangeRemoved(" + i7 + ", " + i10 + ")");
                    arrayList.add(l0Var.i(2, i7, null, i10));
                    l0Var.f58197b = l0Var.f58197b | 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f17205b;
        if (recyclerView.I && recyclerView.H) {
            v4.f0 f0Var = recyclerView.f2814n;
            WeakHashMap weakHashMap = r0.i0.f55671a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
