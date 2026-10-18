package hg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.im0;
public final class o1 extends s4.i0 {
    public final int f12007a;
    public final Object f12008b;

    public o1(Object obj, int i10) {
        this.f12007a = i10;
        this.f12008b = obj;
    }

    @Override
    public final void a() {
        switch (this.f12007a) {
            case 0:
                ((p1) this.f12008b).l();
                return;
            case 1:
                im0 im0Var = (im0) this.f12008b;
                im0Var.K0(true);
                if (im0Var.f27290q2) {
                    im0Var.f27289q1 = -1;
                    if (im0Var.T1 == null) {
                        im0Var.E1.setEmpty();
                    }
                }
                im0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12008b;
                recyclerView.l(null);
                recyclerView.f3631u0.f46069f = true;
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
        switch (this.f12007a) {
            case 0:
                ((p1) this.f12008b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f12007a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12008b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder m10 = i2.d.m("onItemRangeChanged(", i10, ", ", i11, ", ");
                        m10.append(obj);
                        m10.append(")");
                        bVar.i(m10.toString());
                    }
                    arrayList.add(bVar.j(4, i10, obj, i11));
                    bVar.f45894b |= 4;
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
        switch (this.f12007a) {
            case 0:
                ((p1) this.f12008b).s(i10 + 1, i11);
                return;
            case 1:
                im0 im0Var = (im0) this.f12008b;
                im0Var.K0(true);
                View view = im0Var.f27287p1;
                if (view != null && view.getAlpha() == 0.0f) {
                    im0Var.f27289q1 = -1;
                    im0Var.f1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12008b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(1, i10, null, i11));
                    bVar.f45894b |= 1;
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
        switch (this.f12007a) {
            case 0:
                ((p1) this.f12008b).q(i10 + 1, i11 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f12008b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(bVar.j(8, i10, null, i11));
                    bVar.f45894b |= 8;
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
        switch (this.f12007a) {
            case 0:
                ((p1) this.f12008b).t(i10 + 1, i11);
                return;
            case 1:
                ((im0) this.f12008b).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f12008b;
                recyclerView.l(null);
                s4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        bVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(bVar.j(2, i10, null, i11));
                    bVar.f45894b |= 2;
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
        RecyclerView recyclerView = (RecyclerView) this.f12008b;
        if (recyclerView.H && recyclerView.G) {
            s4.f0 f0Var = recyclerView.f3621n;
            WeakHashMap weakHashMap = r0.i0.f44818a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
