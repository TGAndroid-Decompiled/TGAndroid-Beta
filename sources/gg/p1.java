package gg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.yl0;
public final class p1 extends s4.j0 {
    public final int f9892a;
    public final Object f9893b;

    public p1(Object obj, int i10) {
        this.f9892a = i10;
        this.f9893b = obj;
    }

    @Override
    public final void a() {
        switch (this.f9892a) {
            case 0:
                ((q1) this.f9893b).l();
                return;
            case 1:
                yl0 yl0Var = (yl0) this.f9893b;
                yl0Var.L0(true);
                if (yl0Var.f30710s2) {
                    yl0Var.f30709s1 = -1;
                    if (yl0Var.V1 == null) {
                        yl0Var.G1.setEmpty();
                    }
                }
                yl0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9893b;
                recyclerView.l(null);
                recyclerView.f2862t0.f43156f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.n0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f9892a) {
            case 0:
                ((q1) this.f9893b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f9892a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f9893b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder l4 = hg.k0.l("onItemRangeChanged(", i10, ", ", i11, ", ");
                        l4.append(obj);
                        l4.append(")");
                        aVar.i(l4.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f42497b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i10, i11, obj);
                return;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        switch (this.f9892a) {
            case 0:
                ((q1) this.f9893b).s(i10 + 1, i11);
                return;
            case 1:
                yl0 yl0Var = (yl0) this.f9893b;
                yl0Var.L0(true);
                View view = yl0Var.f30707r1;
                if (view != null && view.getAlpha() == 0.0f) {
                    yl0Var.f30709s1 = -1;
                    yl0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9893b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f42497b |= 1;
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
    public void e(int i10, int i11) {
        switch (this.f9892a) {
            case 0:
                ((q1) this.f9893b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f9893b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f42497b |= 8;
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
    public final void f(int i10, int i11) {
        switch (this.f9892a) {
            case 0:
                ((q1) this.f9893b).t(i10 + 1, i11);
                return;
            case 1:
                ((yl0) this.f9893b).L0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9893b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f42497b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f9893b;
        if (RecyclerView.R0 && recyclerView.H && recyclerView.G) {
            s4.g0 g0Var = recyclerView.f2853n;
            WeakHashMap weakHashMap = r0.i0.f42163a;
            recyclerView.postOnAnimation(g0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
