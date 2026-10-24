package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.play_billing.k3;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.lm0;
public final class o1 extends s4.i0 {
    public final int f12033a;
    public final Object f12034b;

    public o1(Object obj, int i10) {
        this.f12033a = i10;
        this.f12034b = obj;
    }

    @Override
    public final void a() {
        switch (this.f12033a) {
            case 0:
                ((p1) this.f12034b).l();
                return;
            case 1:
                lm0 lm0Var = (lm0) this.f12034b;
                lm0Var.K0(true);
                if (lm0Var.f28402q2) {
                    lm0Var.f28401q1 = -1;
                    if (lm0Var.T1 == null) {
                        lm0Var.E1.setEmpty();
                    }
                }
                lm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12034b;
                recyclerView.l(null);
                recyclerView.f3634u0.f46501f = true;
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
        switch (this.f12033a) {
            case 0:
                ((p1) this.f12034b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f12033a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12034b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder k10 = k3.k("onItemRangeChanged(", i10, ", ", i11, ", ");
                        k10.append(obj);
                        k10.append(")");
                        bVar.i(k10.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.f46326b |= 4;
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
        switch (this.f12033a) {
            case 0:
                ((p1) this.f12034b).s(i10 + 1, i11);
                return;
            case 1:
                lm0 lm0Var = (lm0) this.f12034b;
                lm0Var.K0(true);
                View view = lm0Var.f28399p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    lm0Var.f28401q1 = -1;
                    lm0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12034b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.f46326b |= 1;
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
        switch (this.f12033a) {
            case 0:
                ((p1) this.f12034b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12034b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.f46326b |= 8;
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
        switch (this.f12033a) {
            case 0:
                ((p1) this.f12034b).t(i10 + 1, i11);
                return;
            case 1:
                ((lm0) this.f12034b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12034b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.f46326b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f12034b;
        if (recyclerView.H && recyclerView.G) {
            s4.f0 f0Var = recyclerView.f3624n;
            WeakHashMap weakHashMap = r0.i0.f45241a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
