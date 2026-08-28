package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.wk0;
public final class i1 extends t0 {
    public final int f5388a;
    public final Object f5389b;

    public i1(Object obj, int i9) {
        this.f5388a = i9;
        this.f5389b = obj;
    }

    @Override
    public final void a() {
        switch (this.f5388a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5389b;
                recyclerView.l(null);
                recyclerView.f1357p0.f5473f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.m0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 1:
                ((of.k1) this.f5389b).l();
                return;
            default:
                wk0 wk0Var = (wk0) this.f5389b;
                wk0Var.J0(true);
                if (wk0Var.f34266o2) {
                    wk0Var.f34265o1 = -1;
                    if (wk0Var.R1 == null) {
                        wk0Var.C1.setEmpty();
                    }
                }
                wk0Var.invalidate();
                return;
        }
    }

    @Override
    public void b(int i9, int i10) {
        switch (this.f5388a) {
            case 1:
                ((of.k1) this.f5389b).q(i9 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i9, int i10, Object obj) {
        switch (this.f5388a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5389b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder o6 = e2.c.o("onItemRangeChanged(", i9, ", ", i10, ", ");
                        o6.append(obj);
                        o6.append(")");
                        bVar.i(o6.toString());
                    }
                    arrayList.add(bVar.j(4, i9, obj, i10));
                    bVar.f5316b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i9, i10, obj);
                return;
        }
    }

    @Override
    public final void d(int i9, int i10) {
        switch (this.f5388a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5389b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i9 + ", " + i10 + ")");
                    }
                    arrayList.add(bVar.j(1, i9, null, i10));
                    bVar.f5316b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((of.k1) this.f5389b).s(i9 + 1, i10);
                return;
            default:
                wk0 wk0Var = (wk0) this.f5389b;
                wk0Var.J0(true);
                View view = wk0Var.f34263n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    wk0Var.f34265o1 = -1;
                    wk0Var.f1();
                    return;
                }
                return;
        }
    }

    @Override
    public void e(int i9, int i10) {
        switch (this.f5388a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5389b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i9 != i10) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i9 + ", " + i10 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i9, null, i10));
                    bVar.f5316b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((of.k1) this.f5389b).q(i9 + 1, i10 + 2);
                return;
            default:
                return;
        }
    }

    @Override
    public final void f(int i9, int i10) {
        switch (this.f5388a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5389b;
                recyclerView.l(null);
                b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i9 + ", " + i10 + ")");
                    }
                    arrayList.add(bVar.j(2, i9, null, i10));
                    bVar.f5316b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((of.k1) this.f5389b).t(i9 + 1, i10);
                return;
            default:
                ((wk0) this.f5389b).J0(true);
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f5389b;
        if (RecyclerView.N0 && recyclerView.D && recyclerView.C) {
            q0 q0Var = recyclerView.f1354n;
            WeakHashMap weakHashMap = r0.j0.f46915a;
            recyclerView.postOnAnimation(q0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
