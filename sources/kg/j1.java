package kg;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.r2;
import org.telegram.ui.Components.tj0;
public final class j1 extends u4.j0 {
    public final int f17059a;
    public final Object f17060b;

    public j1(Object obj, int i3) {
        this.f17059a = i3;
        this.f17060b = obj;
    }

    @Override
    public final void a() {
        int i3 = this.f17059a;
        Object obj = this.f17060b;
        switch (i3) {
            case 0:
                ((k1) obj).f();
                return;
            case 1:
                tj0 tj0Var = (tj0) obj;
                tj0Var.K0(true);
                if (tj0Var.f38466r2) {
                    tj0Var.f38465r1 = -1;
                    if (tj0Var.U1 == null) {
                        tj0Var.F1.setEmpty();
                    }
                }
                tj0Var.invalidate();
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                recyclerView.f2300v0.f55494f = true;
                boolean z10 = r2.f25040a;
                recyclerView.d.h("notifyDataSetChanged()");
                recyclerView.n0(true);
                if (!recyclerView.d.g()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void b(int i3, int i10) {
        switch (this.f17059a) {
            case 0:
                ((k1) this.f17060b).k(i3 + 1, i10);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i3, int i10, Object obj) {
        switch (this.f17059a) {
            case 2:
                RecyclerView recyclerView = (RecyclerView) this.f17060b;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f25040a;
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m("onItemRangeChanged(", i3, ", ", i10, ", ");
                    m10.append(obj);
                    m10.append(")");
                    bVar.h(m10.toString());
                    arrayList.add(bVar.i(4, i3, obj, i10));
                    bVar.f55504b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.c(i3, i10, obj);
                return;
        }
    }

    @Override
    public final void d(int i3, int i10) {
        int i11 = this.f17059a;
        Object obj = this.f17060b;
        switch (i11) {
            case 0:
                ((k1) obj).o(i3 + 1, i10);
                return;
            case 1:
                tj0 tj0Var = (tj0) obj;
                tj0Var.K0(true);
                View view = tj0Var.f38463q1;
                if (view != null && view.getAlpha() == 0.0f) {
                    tj0Var.f38465r1 = -1;
                    tj0Var.g1();
                    return;
                }
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f25040a;
                    bVar.h("onItemRangeInserted(" + i3 + ", " + i10 + ")");
                    arrayList.add(bVar.i(1, i3, null, i10));
                    bVar.f55504b = bVar.f55504b | 1;
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
    public void e(int i3, int i10) {
        int i11 = this.f17059a;
        Object obj = this.f17060b;
        switch (i11) {
            case 0:
                ((k1) obj).k(i3 + 1, i10 + 2);
                return;
            case 1:
            default:
                return;
            case 2:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i3 != i10) {
                    boolean z10 = r2.f25040a;
                    bVar.h("onItemRangeMoved(" + i3 + ", " + i10 + ", 1)");
                    arrayList.add(bVar.i(8, i3, null, i10));
                    bVar.f55504b = bVar.f55504b | 8;
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
    public final void f(int i3, int i10) {
        int i11 = this.f17059a;
        Object obj = this.f17060b;
        switch (i11) {
            case 0:
                ((k1) obj).p(i3 + 1, i10);
                return;
            case 1:
                ((tj0) obj).K0(true);
                return;
            default:
                RecyclerView recyclerView = (RecyclerView) obj;
                recyclerView.l(null);
                u4.b bVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) bVar.d;
                if (i10 >= 1) {
                    boolean z10 = r2.f25040a;
                    bVar.h("onItemRangeRemoved(" + i3 + ", " + i10 + ")");
                    arrayList.add(bVar.i(2, i3, null, i10));
                    bVar.f55504b = bVar.f55504b | 2;
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
        int[] iArr = RecyclerView.R0;
        RecyclerView recyclerView = (RecyclerView) this.f17060b;
        if (recyclerView.I && recyclerView.H) {
            u4.f0 f0Var = recyclerView.f2289n;
            WeakHashMap weakHashMap = r0.i0.f54015a;
            recyclerView.postOnAnimation(f0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
