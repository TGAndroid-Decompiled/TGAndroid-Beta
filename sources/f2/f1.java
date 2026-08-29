package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.jl0;
public final class f1 extends r0 {
    public final int f6318a;
    public final Object f6319b;

    public f1(Object obj, int i10) {
        this.f6318a = i10;
        this.f6319b = obj;
    }

    @Override
    public final void a() {
        switch (this.f6318a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f6319b;
                recyclerView.l(null);
                recyclerView.f1847p0.f6396f = true;
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
                jl0 jl0Var = (jl0) this.f6319b;
                jl0Var.J0(true);
                if (jl0Var.f29715o2) {
                    jl0Var.f29714o1 = -1;
                    if (jl0Var.R1 == null) {
                        jl0Var.C1.setEmpty();
                    }
                }
                jl0Var.invalidate();
                return;
            default:
                ((rf.a1) this.f6319b).l();
                return;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f6318a) {
            case 2:
                ((rf.a1) this.f6319b).q(i10 + 1, i11);
                return;
            default:
                return;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f6318a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f6319b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("onItemRangeChanged(", i10, ", ", i11, ", ");
                        o10.append(obj);
                        o10.append(")");
                        aVar.i(o10.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f2027b |= 4;
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
        switch (this.f6318a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f6319b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f2027b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                jl0 jl0Var = (jl0) this.f6319b;
                jl0Var.J0(true);
                View view = jl0Var.f29712n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    jl0Var.f29714o1 = -1;
                    jl0Var.f1();
                    return;
                }
                return;
            default:
                ((rf.a1) this.f6319b).s(i10 + 1, i11);
                return;
        }
    }

    @Override
    public void e(int i10, int i11) {
        switch (this.f6318a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f6319b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f2027b |= 8;
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
                ((rf.a1) this.f6319b).q(i10 + 1, i11 + 2);
                return;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        switch (this.f6318a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f6319b;
                recyclerView.l(null);
                ba.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f2027b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((jl0) this.f6319b).J0(true);
                return;
            default:
                ((rf.a1) this.f6319b).t(i10 + 1, i11);
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f6319b;
        if (RecyclerView.N0 && recyclerView.D && recyclerView.C) {
            n0 n0Var = recyclerView.f1844n;
            WeakHashMap weakHashMap = r0.j0.f46829a;
            recyclerView.postOnAnimation(n0Var);
            return;
        }
        recyclerView.requestLayout();
    }
}
