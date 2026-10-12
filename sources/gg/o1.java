package gg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.wm0;
public final class o1 extends s4.k0 {
    public final int f10753a;
    public final Object f10754b;

    public o1(Object obj, int i10) {
        this.f10753a = i10;
        this.f10754b = obj;
    }

    @Override
    public final void a() {
        switch (this.f10753a) {
            case 0:
                ((p1) this.f10754b).l();
                return;
            case 1:
                wm0 wm0Var = (wm0) this.f10754b;
                wm0Var.K0(true);
                if (wm0Var.f32473q2) {
                    wm0Var.f32472q1 = -1;
                    if (wm0Var.T1 == null) {
                        wm0Var.E1.setEmpty();
                    }
                }
                wm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10754b;
                recyclerView.l(null);
                recyclerView.f3163u0.f47851f = true;
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
        switch (this.f10753a) {
            case 0:
                ((p1) this.f10754b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f10753a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10754b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m10 = hg.c.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m10.append(obj);
                        m10.append(")");
                        aVar.i(m10.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f47351b |= 4;
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
        switch (this.f10753a) {
            case 0:
                ((p1) this.f10754b).s(i10 + 1, i11);
                return;
            case 1:
                wm0 wm0Var = (wm0) this.f10754b;
                wm0Var.K0(true);
                View view = wm0Var.f32470p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    wm0Var.f32472q1 = -1;
                    wm0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10754b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f47351b |= 1;
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
        switch (this.f10753a) {
            case 0:
                ((p1) this.f10754b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10754b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f47351b |= 8;
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
        switch (this.f10753a) {
            case 0:
                ((p1) this.f10754b).t(i10 + 1, i11);
                return;
            case 1:
                ((wm0) this.f10754b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10754b;
                recyclerView.l(null);
                ra.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f47351b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f10754b;
        if (recyclerView.H && recyclerView.G) {
            s4.h0 h0Var = recyclerView.f3153n;
            WeakHashMap weakHashMap = r0.i0.f46989a;
            recyclerView.postOnAnimation(h0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
