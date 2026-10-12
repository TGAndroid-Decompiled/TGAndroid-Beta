package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.mm0;
public final class o1 extends s4.i0 {
    public final int f10694a;
    public final Object f10695b;

    public o1(Object obj, int i10) {
        this.f10694a = i10;
        this.f10695b = obj;
    }

    @Override
    public final void a() {
        switch (this.f10694a) {
            case 0:
                ((p1) this.f10695b).l();
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f10695b;
                mm0Var.K0(true);
                if (mm0Var.f27445q2) {
                    mm0Var.f27444q1 = -1;
                    if (mm0Var.T1 == null) {
                        mm0Var.E1.setEmpty();
                    }
                }
                mm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10695b;
                recyclerView.l(null);
                recyclerView.f2013u0.f44997f = true;
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
        switch (this.f10694a) {
            case 0:
                ((p1) this.f10695b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f10694a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10695b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder l4 = i2.d.l("onItemRangeChanged(", i10, ", ", i11, ", ");
                        l4.append(obj);
                        l4.append(")");
                        bVar.i(l4.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.f44822b |= 4;
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
        switch (this.f10694a) {
            case 0:
                ((p1) this.f10695b).s(i10 + 1, i11);
                return;
            case 1:
                mm0 mm0Var = (mm0) this.f10695b;
                mm0Var.K0(true);
                View view = mm0Var.f27442p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    mm0Var.f27444q1 = -1;
                    mm0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10695b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.f44822b |= 1;
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
        switch (this.f10694a) {
            case 0:
                ((p1) this.f10695b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f10695b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.f44822b |= 8;
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
        switch (this.f10694a) {
            case 0:
                ((p1) this.f10695b).t(i10 + 1, i11);
                return;
            case 1:
                ((mm0) this.f10695b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f10695b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.f44822b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f10695b;
        if (recyclerView.H && recyclerView.G) {
            s4.f0 f0Var = recyclerView.f2003n;
            WeakHashMap weakHashMap = r0.j0.f43732a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
