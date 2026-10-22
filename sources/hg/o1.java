package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.jm0;
public final class o1 extends s4.i0 {
    public final int f12006a;
    public final Object f12007b;

    public o1(Object obj, int i10) {
        this.f12006a = i10;
        this.f12007b = obj;
    }

    @Override
    public final void a() {
        switch (this.f12006a) {
            case 0:
                ((p1) this.f12007b).l();
                return;
            case 1:
                jm0 jm0Var = (jm0) this.f12007b;
                jm0Var.K0(true);
                if (jm0Var.f27588q2) {
                    jm0Var.f27587q1 = -1;
                    if (jm0Var.T1 == null) {
                        jm0Var.E1.setEmpty();
                    }
                }
                jm0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12007b;
                recyclerView.l(null);
                recyclerView.f3627u0.f46079f = true;
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
        switch (this.f12006a) {
            case 0:
                ((p1) this.f12007b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f12006a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12007b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m10 = i2.e.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m10.append(obj);
                        m10.append(")");
                        bVar.i(m10.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.f45904b |= 4;
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
        switch (this.f12006a) {
            case 0:
                ((p1) this.f12007b).s(i10 + 1, i11);
                return;
            case 1:
                jm0 jm0Var = (jm0) this.f12007b;
                jm0Var.K0(true);
                View view = jm0Var.f27585p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    jm0Var.f27587q1 = -1;
                    jm0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12007b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.f45904b |= 1;
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
        switch (this.f12006a) {
            case 0:
                ((p1) this.f12007b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12007b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.f45904b |= 8;
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
        switch (this.f12006a) {
            case 0:
                ((p1) this.f12007b).t(i10 + 1, i11);
                return;
            case 1:
                ((jm0) this.f12007b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12007b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.f45904b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f12007b;
        if (recyclerView.H && recyclerView.G) {
            s4.f0 f0Var = recyclerView.f3617n;
            WeakHashMap weakHashMap = r0.i0.f44829a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
