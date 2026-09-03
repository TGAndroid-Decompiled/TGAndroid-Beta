package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.rl0;
public final class d1 extends q0 {
    public final int f5665a;
    public final Object f5666b;

    public d1(Object obj, int i10) {
        this.f5665a = i10;
        this.f5666b = obj;
    }

    @Override
    public final void a() {
        switch (this.f5665a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5666b;
                recyclerView.l(null);
                recyclerView.f1251q0.f5734f = true;
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
                rl0 rl0Var = (rl0) this.f5666b;
                rl0Var.J0(true);
                if (rl0Var.f28517p2) {
                    rl0Var.f28516p1 = -1;
                    if (rl0Var.S1 == null) {
                        rl0Var.D1.setEmpty();
                    }
                }
                rl0Var.invalidate();
                return;
            default:
                ((tf.z0) this.f5666b).l();
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f5665a) {
            case 2:
                ((tf.z0) this.f5666b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f5665a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5666b;
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
                    aVar.f4283b |= 4;
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
        switch (this.f5665a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5666b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f4283b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rl0 rl0Var = (rl0) this.f5666b;
                rl0Var.J0(true);
                View view = rl0Var.f28514o1;
                if (view != null && view.getAlpha() == 0.0f) {
                    rl0Var.f28516p1 = -1;
                    rl0Var.e1();
                    return;
                }
                return;
            default:
                ((tf.z0) this.f5666b).s(i10 + 1, i11);
                return;
        }
    }

    @Override
    public void e(int i10, int i11) {
        switch (this.f5665a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5666b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f4283b |= 8;
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
                ((tf.z0) this.f5666b).q(i10 + 1, i11 + 2);
                return;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        switch (this.f5665a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5666b;
                recyclerView.l(null);
                da.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f4283b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((rl0) this.f5666b).J0(true);
                return;
            default:
                ((tf.z0) this.f5666b).t(i10 + 1, i11);
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f5666b;
        if (RecyclerView.O0 && recyclerView.E && recyclerView.D) {
            m0 m0Var = recyclerView.f1247n;
            WeakHashMap weakHashMap = r0.j0.f43142a;
            recyclerView.postOnAnimation(m0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
