package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.sl0;
public final class d1 extends q0 {
    public final int f5676a;
    public final Object f5677b;

    public d1(Object obj, int i10) {
        this.f5676a = i10;
        this.f5677b = obj;
    }

    @Override
    public final void a() {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                recyclerView.f1240q0.f5745f = true;
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
                sl0 sl0Var = (sl0) this.f5677b;
                sl0Var.J0(true);
                if (sl0Var.f28756p2) {
                    sl0Var.f28755p1 = -1;
                    if (sl0Var.S1 == null) {
                        sl0Var.D1.setEmpty();
                    }
                }
                sl0Var.invalidate();
                return;
            default:
                ((tf.z0) this.f5677b).l();
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f5676a) {
            case 2:
                ((tf.z0) this.f5677b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
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
                    aVar.f4302b |= 4;
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
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f4302b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                sl0 sl0Var = (sl0) this.f5677b;
                sl0Var.J0(true);
                View view = sl0Var.f28753o1;
                if (view != null && view.getAlpha() == 0.0f) {
                    sl0Var.f28755p1 = -1;
                    sl0Var.f1();
                    return;
                }
                return;
            default:
                ((tf.z0) this.f5677b).s(i10 + 1, i11);
                return;
        }
    }

    @Override
    public void e(int i10, int i11) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f4302b |= 8;
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
                ((tf.z0) this.f5677b).q(i10 + 1, i11 + 2);
                return;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f4302b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((sl0) this.f5677b).J0(true);
                return;
            default:
                ((tf.z0) this.f5677b).t(i10 + 1, i11);
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f5677b;
        if (RecyclerView.O0 && recyclerView.E && recyclerView.D) {
            m0 m0Var = recyclerView.f1236n;
            WeakHashMap weakHashMap = r0.j0.f43118a;
            recyclerView.postOnAnimation(m0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
