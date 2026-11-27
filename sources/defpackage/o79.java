package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public abstract class o79 {
    public pq8 a;
    public ArrayList b;
    public short c;
    public short d;
    public short e;
    public short f;
    public short g;
    public Interpolator h;
    public Interpolator i;
    public Interpolator j;
    public Interpolator k;
    public short l;

    public static int b(f89 f89Var) {
        int i = f89Var.l;
        int i2 = i & 14;
        if (f89Var.h()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = f89Var.d;
            int b = f89Var.b();
            if (i3 != -1 && b != -1 && i3 != b) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    public abstract boolean a(f89 f89Var, l09 l09Var, l09 l09Var2);

    public boolean c(f89 f89Var, List list) {
        return f89Var.a instanceof tk3;
    }

    public final void d(f89 f89Var) {
        pq8 pq8Var = this.a;
        if (pq8Var != null) {
            RecyclerView recyclerView = (RecyclerView) pq8Var.b;
            boolean z = true;
            f89Var.q(true);
            View view = f89Var.a;
            if (f89Var.j != null && f89Var.k == null) {
                f89Var.j = null;
            }
            f89Var.k = null;
            if ((f89Var.l & 16) == 0) {
                oh2 oh2Var = recyclerView.b;
                recyclerView.B0();
                rx6 rx6Var = recyclerView.e;
                zg2 zg2Var = (zg2) rx6Var.c;
                i09 i09Var = (i09) rx6Var.b;
                int indexOfChild = ((RecyclerView) i09Var.b).indexOfChild(view);
                if (indexOfChild == -1) {
                    rx6Var.A0(view);
                } else if (zg2Var.w(indexOfChild)) {
                    zg2Var.y(indexOfChild);
                    rx6Var.A0(view);
                    i09Var.N(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    f89 V = RecyclerView.V(view);
                    oh2Var.l(V);
                    oh2Var.i(V);
                }
                recyclerView.C0(!z);
                if (!z && f89Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d69 d69Var = (d69) arrayList.get(i);
            d69Var.a.k(d69Var.b, d69Var.c, d69Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f89 f89Var);

    public abstract void g();

    public long h() {
        return this.c;
    }

    public long i() {
        return Math.max(this.f, this.g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public l09 l(c89 c89Var, f89 f89Var, int i, List list) {
        l09 l09Var = new l09((byte) 4);
        View view = f89Var.a;
        l09Var.b = view.getLeft();
        l09Var.c = view.getTop();
        view.getRight();
        view.getBottom();
        return l09Var;
    }

    public abstract void m();

    public final void n(long j) {
        ?? r1 = (int) j;
        this.c = r1;
        this.e = r1;
        this.d = r1;
        this.f = r1;
        this.g = r1;
    }

    public final void o(Interpolator interpolator) {
        this.h = interpolator;
        this.i = interpolator;
        this.j = interpolator;
        this.k = interpolator;
    }
}
