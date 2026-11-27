package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
public final class tu7 extends l79 {
    public final byte a;
    public final Object b;

    public tu7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).f();
                return;
            case 1:
                d79 d79Var = (d79) obj;
                d79Var.M0(true);
                if (d79Var.r2) {
                    d79Var.r1 = -1;
                    if (d79Var.U1 == null) {
                        d79Var.F1.setEmpty();
                    }
                }
                d79Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.v0.f = true;
                boolean z = f11.a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.p0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(int i, int i2) {
        switch (this.a) {
            case 0:
                ((uu7) this.b).l(i + 1, i2);
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.b;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    StringBuilder p = bs2.p("onItemRangeChanged(", i, ", ", i2, ", ");
                    p.append(obj);
                    p.append(")");
                    iaVar.h(p.toString());
                    arrayList.add(iaVar.i(obj, 4, i, i2));
                    iaVar.b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    @Override
    public final void d(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).p(i + 1, i2);
                return;
            case 1:
                d79 d79Var = (d79) obj;
                d79Var.M0(true);
                View view = d79Var.q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    d79Var.r1 = -1;
                    d79Var.i1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeInserted(" + i + ", " + i2 + ")");
                    arrayList.add(iaVar.i(null, 1, i, i2));
                    iaVar.b = iaVar.b | 1;
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
    public final void e(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).l(i + 1, i2 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i != i2) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeMoved(" + i + ", " + i2 + ", 1)");
                    arrayList.add(iaVar.i(null, 8, i, i2));
                    iaVar.b = iaVar.b | 8;
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
    public final void f(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((uu7) obj).q(i + 1, i2);
                return;
            case 1:
                ((d79) obj).M0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                ia iaVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) iaVar.d;
                if (i2 >= 1) {
                    boolean z = f11.a;
                    iaVar.h("onItemRangeRemoved(" + i + ", " + i2 + ")");
                    arrayList.add(iaVar.i(null, 2, i, i2));
                    iaVar.b = iaVar.b | 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void g() {
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (recyclerView.I && recyclerView.H) {
            i79 i79Var = recyclerView.n;
            WeakHashMap weakHashMap = ihc.a;
            recyclerView.postOnAnimation(i79Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
