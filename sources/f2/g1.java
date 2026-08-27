package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.ui.Components.zk0;

public final class g1 extends s0 {

    public final int f5676a;

    public final Object f5677b;

    public g1(Object obj, int i10) {
        this.f5676a = i10;
        this.f5677b = obj;
    }

    @Override
    public final void a() {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                recyclerView.f1853p0.f5761f = true;
                if (BuildVars.DEBUG_VERSION) {
                    recyclerView.d.i("notifyDataSetChanged()");
                }
                recyclerView.m0(true);
                if (!recyclerView.d.h()) {
                    recyclerView.requestLayout();
                }
                break;
            case 1:
                zk0 zk0Var = (zk0) this.f5677b;
                zk0Var.J0(true);
                if (zk0Var.f35283o2) {
                    zk0Var.f35282o1 = -1;
                    if (zk0Var.R1 == null) {
                        zk0Var.C1.setEmpty();
                    }
                }
                zk0Var.invalidate();
                break;
            default:
                ((pf.z0) this.f5677b).l();
                break;
        }
    }

    @Override
    public void b(int i10, int i11) {
        switch (this.f5676a) {
            case 2:
                ((pf.z0) this.f5677b).q(i10 + 1, i11);
                break;
        }
    }

    @Override
    public void c(int i10, int i11, Object obj) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("onItemRangeChanged(", i10, ", ", i11, ", ");
                        sbP.append(obj);
                        sbP.append(")");
                        aVar.i(sbP.toString());
                    }
                    arrayList.add(aVar.j(4, i10, obj, i11));
                    aVar.f200b |= 4;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            default:
                super.c(i10, i11, obj);
                break;
        }
    }

    @Override
    public final void d(int i10, int i11) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeInserted(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(1, i10, null, i11));
                    aVar.f200b |= 1;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                zk0 zk0Var = (zk0) this.f5677b;
                zk0Var.J0(true);
                View view = zk0Var.f35280n1;
                if (view != null && view.getAlpha() == 0.0f) {
                    zk0Var.f35282o1 = -1;
                    zk0Var.f1();
                    break;
                }
                break;
            default:
                ((pf.z0) this.f5677b).s(i10 + 1, i11);
                break;
        }
    }

    @Override
    public void e(int i10, int i11) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i10 != i11) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeMoved(" + i10 + ", " + i11 + ", 1)");
                    }
                    arrayList.add(aVar.j(8, i10, null, i11));
                    aVar.f200b |= 8;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 2:
                ((pf.z0) this.f5677b).q(i10 + 1, i11 + 2);
                break;
        }
    }

    @Override
    public final void f(int i10, int i11) {
        switch (this.f5676a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5677b;
                recyclerView.l(null);
                aa.a aVar = recyclerView.d;
                ArrayList arrayList = (ArrayList) aVar.d;
                if (i11 >= 1) {
                    if (BuildVars.DEBUG_VERSION) {
                        aVar.i("onItemRangeRemoved(" + i10 + ", " + i11 + ")");
                    }
                    arrayList.add(aVar.j(2, i10, null, i11));
                    aVar.f200b |= 2;
                    if (arrayList.size() == 1) {
                        g();
                    }
                    break;
                }
                break;
            case 1:
                ((zk0) this.f5677b).J0(true);
                break;
            default:
                ((pf.z0) this.f5677b).t(i10 + 1, i11);
                break;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f5677b;
        if (!RecyclerView.N0 || !recyclerView.D || !recyclerView.C) {
            recyclerView.requestLayout();
            return;
        }
        o0 o0Var = recyclerView.f1850n;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        recyclerView.postOnAnimation(o0Var);
    }
}
