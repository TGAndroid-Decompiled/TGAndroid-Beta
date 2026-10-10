package gg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.rm0;
public final class o1 extends s4.k0 {
    public final int f10755a;
    public final Object f10756b;

    public o1(Object obj, int i10) {
        this.f10755a = i10;
        this.f10756b = obj;
    }

    @Override
    public final void a() {
        switch (this.f10755a) {
            case 0:
                ((p1) this.f10756b).l();
                return;
            case 1:
                rm0 rm0Var = (rm0) this.f10756b;
                rm0Var.K0(true);
                if (rm0Var.f30517q2) {
                    rm0Var.f30516q1 = -1;
                    if (rm0Var.T1 == null) {
                        rm0Var.E1.setEmpty();
                    }
                }
                rm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10756b;
                recyclerView.l(null);
                recyclerView.f3165u0.f47656f = true;
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
        switch (this.f10755a) {
            case 0:
                ((p1) this.f10756b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f10755a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10756b;
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
                    aVar.f47173b |= 4;
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
        switch (this.f10755a) {
            case 0:
                ((p1) this.f10756b).s(i10 + 1, i11);
                return;
            case 1:
                rm0 rm0Var = (rm0) this.f10756b;
                rm0Var.K0(true);
                View view = rm0Var.f30514p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    rm0Var.f30516q1 = -1;
                    rm0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10756b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f47173b |= 1;
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
        switch (this.f10755a) {
            case 0:
                ((p1) this.f10756b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10756b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f47173b |= 8;
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
        switch (this.f10755a) {
            case 0:
                ((p1) this.f10756b).t(i10 + 1, i11);
                return;
            case 1:
                ((rm0) this.f10756b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10756b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f47173b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f10756b;
        if (recyclerView.H && recyclerView.G) {
            s4.h0 h0Var = recyclerView.f3155n;
            WeakHashMap weakHashMap = r0.i0.f46810a;
            recyclerView.postOnAnimation(h0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
