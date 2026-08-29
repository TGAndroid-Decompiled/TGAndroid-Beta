package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jk0;
public abstract class u0 {
    public ha.c f6484a;
    public ArrayList f6485b;
    public long f6486c;
    public long d;
    public long f6487e;
    public long f6488f;
    public long f6489g;
    public TimeInterpolator h;
    public TimeInterpolator f6490i;
    public TimeInterpolator f6491j;
    public TimeInterpolator f6492k;
    public long f6493l;

    public static int b(n1 n1Var) {
        int i10 = n1Var.f6441l;
        int i11 = i10 & 14;
        if (n1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = n1Var.d;
            int b10 = n1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(n1 n1Var, a5.e eVar, a5.e eVar2);

    public abstract boolean c(n1 n1Var, List list);

    public final void d(n1 n1Var) {
        ha.c cVar = this.f6484a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f7981b;
            boolean z10 = true;
            n1Var.q(true);
            View view = n1Var.f6432a;
            if (n1Var.f6439j != null && n1Var.f6440k == null) {
                n1Var.f6439j = null;
            }
            n1Var.f6440k = null;
            if ((n1Var.f6441l & 16) == 0) {
                d1 d1Var = recyclerView.f1829b;
                recyclerView.y0();
                androidx.biometric.e eVar = recyclerView.f1834e;
                c cVar2 = (c) eVar.f1031c;
                ag.o1 o1Var = (ag.o1) eVar.f1030b;
                int indexOfChild = ((RecyclerView) o1Var.f624b).indexOfChild(view);
                if (indexOfChild == -1) {
                    eVar.B(view);
                } else if (cVar2.D(indexOfChild)) {
                    cVar2.G(indexOfChild);
                    eVar.B(view);
                    o1Var.k(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    n1 U = RecyclerView.U(view);
                    d1Var.k(U);
                    d1Var.h(U);
                }
                recyclerView.z0(!z10);
                if (!z10 && n1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f6485b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jk0 jk0Var = (jk0) arrayList.get(i10);
            jk0Var.f29683a.c(jk0Var.f29684b, jk0Var.f29685c, jk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(n1 n1Var);

    public abstract void g();

    public long h() {
        return this.f6486c;
    }

    public long i() {
        return Math.max(this.f6488f, this.f6489g);
    }

    public long j() {
        return this.f6487e;
    }

    public abstract boolean k();

    public a5.e l(k1 k1Var, n1 n1Var, int i10, List list) {
        ?? obj = new Object();
        View view = n1Var.f6432a;
        obj.f165a = view.getLeft();
        obj.f166b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f6486c = j10;
        this.f6487e = j10;
        this.d = j10;
        this.f6488f = j10;
        this.f6489g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f6490i = timeInterpolator;
        this.f6491j = timeInterpolator;
        this.f6492k = timeInterpolator;
    }
}
