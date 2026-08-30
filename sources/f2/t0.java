package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uk0;
public abstract class t0 {
    public o5.i f5835a;
    public ArrayList f5836b;
    public long f5837c;
    public long d;
    public long e;
    public long f5838f;
    public long f5839g;
    public TimeInterpolator h;
    public TimeInterpolator f5840i;
    public TimeInterpolator f5841j;
    public TimeInterpolator f5842k;
    public long f5843l;

    public static int b(l1 l1Var) {
        int i10 = l1Var.f5793l;
        int i11 = i10 & 14;
        if (l1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = l1Var.d;
            int b10 = l1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(l1 l1Var, c5.e eVar, c5.e eVar2);

    public abstract boolean c(l1 l1Var, List list);

    public final void d(l1 l1Var) {
        o5.i iVar = this.f5835a;
        if (iVar != null) {
            RecyclerView recyclerView = (RecyclerView) iVar.f16457b;
            boolean z4 = true;
            l1Var.q(true);
            View view = l1Var.f5785a;
            if (l1Var.f5791j != null && l1Var.f5792k == null) {
                l1Var.f5791j = null;
            }
            l1Var.f5792k = null;
            if ((l1Var.f5793l & 16) == 0) {
                bf.f fVar = recyclerView.f1222b;
                recyclerView.y0();
                androidx.biometric.e eVar = recyclerView.e;
                c cVar = (c) eVar.f479c;
                a3.c cVar2 = (a3.c) eVar.f478b;
                int indexOfChild = ((RecyclerView) cVar2.f46b).indexOfChild(view);
                if (indexOfChild == -1) {
                    eVar.C(view);
                } else if (cVar.C(indexOfChild)) {
                    cVar.E(indexOfChild);
                    eVar.C(view);
                    cVar2.P(indexOfChild);
                } else {
                    z4 = false;
                }
                if (z4) {
                    l1 U = RecyclerView.U(view);
                    fVar.k(U);
                    fVar.h(U);
                }
                recyclerView.z0(!z4);
                if (!z4 && l1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f5836b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            uk0 uk0Var = (uk0) arrayList.get(i10);
            uk0Var.f29247a.c(uk0Var.f29248b, uk0Var.f29249c, uk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(l1 l1Var);

    public abstract void g();

    public long h() {
        return this.f5837c;
    }

    public long i() {
        return Math.max(this.f5838f, this.f5839g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public c5.e l(i1 i1Var, l1 l1Var, int i10, List list) {
        ?? obj = new Object();
        View view = l1Var.f5785a;
        obj.f2085a = view.getLeft();
        obj.f2086b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f5837c = j10;
        this.e = j10;
        this.d = j10;
        this.f5838f = j10;
        this.f5839g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f5840i = timeInterpolator;
        this.f5841j = timeInterpolator;
        this.f5842k = timeInterpolator;
    }
}
