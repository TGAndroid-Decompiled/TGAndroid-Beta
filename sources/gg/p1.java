package gg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.wl0;
public final class p1 extends s4.j0 {
    public final int f9873a;
    public final Object f9874b;

    public p1(Object obj, int i10) {
        this.f9873a = i10;
        this.f9874b = obj;
    }

    @Override
    public final void a() {
        switch (this.f9873a) {
            case 0:
                ((q1) this.f9874b).l();
                return;
            case 1:
                wl0 wl0Var = (wl0) this.f9874b;
                wl0Var.K0(true);
                if (wl0Var.f30120s2) {
                    wl0Var.f30119s1 = -1;
                    if (wl0Var.V1 == null) {
                        wl0Var.G1.setEmpty();
                    }
                }
                wl0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9874b;
                recyclerView.l(null);
                recyclerView.f2855t0.f43121f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.m0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f9873a) {
            case 0:
                ((q1) this.f9874b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f9873a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f9874b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder k10 = hg.c.k("onItemRangeChanged(", i10, ", ", i11, ", ");
                        k10.append(obj);
                        k10.append(")");
                        aVar.i(k10.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f42462b |= 4;
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
        switch (this.f9873a) {
            case 0:
                ((q1) this.f9874b).s(i10 + 1, i11);
                return;
            case 1:
                wl0 wl0Var = (wl0) this.f9874b;
                wl0Var.K0(true);
                View view = wl0Var.f30117r1;
                if (view != null && view.getAlpha() == 0.0f) {
                    wl0Var.f30119s1 = -1;
                    wl0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9874b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f42462b |= 1;
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
        switch (this.f9873a) {
            case 0:
                ((q1) this.f9874b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f9874b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f42462b |= 8;
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
        switch (this.f9873a) {
            case 0:
                ((q1) this.f9874b).t(i10 + 1, i11);
                return;
            case 1:
                ((wl0) this.f9874b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f9874b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f42462b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f9874b;
        if (RecyclerView.R0 && recyclerView.H && recyclerView.G) {
            s4.g0 g0Var = recyclerView.f2846n;
            WeakHashMap weakHashMap = r0.i0.f42128a;
            recyclerView.postOnAnimation(g0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
