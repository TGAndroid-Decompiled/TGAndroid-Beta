package fg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.vl0;
public final class q1 extends s4.j0 {
    public final int f8185a;
    public final Object f8186b;

    public q1(Object obj, int i10) {
        this.f8185a = i10;
        this.f8186b = obj;
    }

    @Override
    public final void a() {
        switch (this.f8185a) {
            case 0:
                ((r1) this.f8186b).l();
                return;
            case 1:
                vl0 vl0Var = (vl0) this.f8186b;
                vl0Var.J0(true);
                if (vl0Var.f27993s2) {
                    vl0Var.f27992s1 = -1;
                    if (vl0Var.V1 == null) {
                        vl0Var.G1.setEmpty();
                    }
                }
                vl0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f8186b;
                recyclerView.l(null);
                recyclerView.f1555t0.f41771f = true;
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
        switch (this.f8185a) {
            case 0:
                ((r1) this.f8186b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f8185a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f8186b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder n10 = hc.b.n("onItemRangeChanged(", i10, ", ", i11, ", ");
                        n10.append(obj);
                        n10.append(")");
                        m0Var.i(n10.toString());
                    }
                    arrayList.add(m0Var.j(4, i10, obj, i11));
                    m0Var.f40808b |= 4;
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
        switch (this.f8185a) {
            case 0:
                ((r1) this.f8186b).s(i10 + 1, i11);
                return;
            case 1:
                vl0 vl0Var = (vl0) this.f8186b;
                vl0Var.J0(true);
                View view = vl0Var.f27990r1;
                if (view != null && view.getAlpha() == 0.0f) {
                    vl0Var.f27992s1 = -1;
                    vl0Var.e1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f8186b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(m0Var.j(1, i10, null, i11));
                    m0Var.f40808b |= 1;
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
        switch (this.f8185a) {
            case 0:
                ((r1) this.f8186b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f8186b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(m0Var.j(8, i10, null, i11));
                    m0Var.f40808b |= 8;
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
        switch (this.f8185a) {
            case 0:
                ((r1) this.f8186b).t(i10 + 1, i11);
                return;
            case 1:
                ((vl0) this.f8186b).J0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f8186b;
                recyclerView.l(null);
                qg.m0 m0Var = recyclerView.d;
                ArrayList arrayList = (ArrayList) m0Var.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        m0Var.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(m0Var.j(2, i10, null, i11));
                    m0Var.f40808b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f8186b;
        if (RecyclerView.R0 && recyclerView.H && recyclerView.G) {
            s4.g0 g0Var = recyclerView.f1546n;
            WeakHashMap weakHashMap = r0.i0.f41062a;
            recyclerView.postOnAnimation(g0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
