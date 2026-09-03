package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.sl0;
public final class e1 extends r0 {
    public final int f5752a;
    public final Object f5753b;

    public e1(Object obj, int i10) {
        this.f5752a = i10;
        this.f5753b = obj;
    }

    @Override
    public final void a() {
        switch (this.f5752a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5753b;
                recyclerView.l(null);
                recyclerView.f1339q0.f5831f = true;
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
                sl0 sl0Var = (sl0) this.f5753b;
                sl0Var.J0(true);
                if (sl0Var.f31112p2) {
                    sl0Var.f31111p1 = -1;
                    if (sl0Var.S1 == null) {
                        sl0Var.D1.setEmpty();
                    }
                }
                sl0Var.invalidate();
                return;
            default:
                ((uf.z0) this.f5753b).l();
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f5752a) {
            case 2:
                ((uf.z0) this.f5753b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f5752a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5753b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m9 = e2.c.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m9.append(obj);
                        m9.append(")");
                        aVar.i(m9.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f4382b |= 4;
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
        switch (this.f5752a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5753b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f4382b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sl0 sl0Var = (sl0) this.f5753b;
                sl0Var.J0(true);
                View view = sl0Var.f31109o1;
                if (view != null && view.getAlpha() == 0.0f) {
                    sl0Var.f31111p1 = -1;
                    sl0Var.e1();
                    return;
                }
                return;
            default:
                ((uf.z0) this.f5753b).s(i10 + 1, i11);
                return;
        }
    }

    @Override
    public void e(int i10, int i11) {
        switch (this.f5752a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5753b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f4382b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
            default:
                return;
            case 2:
                ((uf.z0) this.f5753b).q(i10 + 1, i11 + 2);
                return;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        switch (this.f5752a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5753b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f4382b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((sl0) this.f5753b).J0(true);
                return;
            default:
                ((uf.z0) this.f5753b).t(i10 + 1, i11);
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f5753b;
        if (RecyclerView.O0 && recyclerView.E && recyclerView.D) {
            n0 n0Var = recyclerView.f1335n;
            WeakHashMap weakHashMap = r0.j0.f46469a;
            recyclerView.postOnAnimation(n0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
