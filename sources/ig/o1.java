package ig;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.mm0;
public final class o1 extends s4.j0 {
    public final int f14194a;
    public final Object f14195b;

    public o1(Object obj, int i10) {
        this.f14194a = i10;
        this.f14195b = obj;
    }

    @Override
    public final void a() {
        switch (this.f14194a) {
            case 0:
                ((p1) this.f14195b).l();
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f14195b;
                mm0Var.K0(true);
                if (mm0Var.f30652q2) {
                    mm0Var.f30651q1 = -1;
                    if (mm0Var.T1 == null) {
                        mm0Var.E1.setEmpty();
                    }
                }
                mm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f14195b;
                recyclerView.l(null);
                recyclerView.f3080u0.f47697f = true;
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
        switch (this.f14194a) {
            case 0:
                ((p1) this.f14195b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f14194a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f14195b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder n10 = c3.h0.n("onItemRangeChanged(", i10, ", ", i11, ", ");
                        n10.append(obj);
                        n10.append(")");
                        bVar.i(n10.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.f47687b |= 4;
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
        switch (this.f14194a) {
            case 0:
                ((p1) this.f14195b).s(i10 + 1, i11);
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f14195b;
                mm0Var.K0(true);
                View view = mm0Var.f30649p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    mm0Var.f30651q1 = -1;
                    mm0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f14195b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.f47687b |= 1;
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
        switch (this.f14194a) {
            case 0:
                ((p1) this.f14195b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f14195b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.f47687b |= 8;
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
        switch (this.f14194a) {
            case 0:
                ((p1) this.f14195b).t(i10 + 1, i11);
                return;
            case 1:
                ((mm0) this.f14195b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f14195b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.f47687b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f14195b;
        if (recyclerView.H && recyclerView.G) {
            s4.g0 g0Var = recyclerView.f3070n;
            WeakHashMap weakHashMap = r0.i0.f47108a;
            recyclerView.postOnAnimation(g0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
