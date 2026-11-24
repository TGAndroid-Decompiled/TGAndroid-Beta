package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public abstract class b49 {
    public g29 a;
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

    public static int b(s49 s49Var) {
        int i = s49Var.l;
        int i2 = i & 14;
        if (s49Var.h()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = s49Var.d;
            int b = s49Var.b();
            if (i3 != -1 && b != -1 && i3 != b) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    public abstract boolean a(s49 s49Var, zw8 zw8Var, zw8 zw8Var2);

    public boolean c(s49 s49Var, List list) {
        return s49Var.a instanceof ck3;
    }

    public final void d(s49 s49Var) {
        g29 g29Var = this.a;
        if (g29Var != null) {
            RecyclerView recyclerView = (RecyclerView) g29Var.b;
            boolean z = true;
            s49Var.q(true);
            View view = s49Var.a;
            if (s49Var.j != null && s49Var.k == null) {
                s49Var.j = null;
            }
            s49Var.k = null;
            if ((s49Var.l & 16) == 0) {
                wg2 wg2Var = recyclerView.b;
                recyclerView.A0();
                mv6 mv6Var = recyclerView.e;
                hg2 hg2Var = (hg2) mv6Var.c;
                ln8 ln8Var = (ln8) mv6Var.b;
                int indexOfChild = ((RecyclerView) ln8Var.b).indexOfChild(view);
                if (indexOfChild == -1) {
                    mv6Var.u0(view);
                } else if (hg2Var.x(indexOfChild)) {
                    hg2Var.z(indexOfChild);
                    mv6Var.u0(view);
                    ln8Var.J(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    s49 U = RecyclerView.U(view);
                    wg2Var.l(U);
                    wg2Var.i(U);
                }
                recyclerView.B0(!z);
                if (!z && s49Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o29 o29Var = (o29) arrayList.get(i);
            o29Var.a.k(o29Var.b, o29Var.c, o29Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(s49 s49Var);

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

    public zw8 l(p49 p49Var, s49 s49Var, int i, List list) {
        zw8 zw8Var = new zw8((byte) 4);
        View view = s49Var.a;
        zw8Var.b = view.getLeft();
        zw8Var.c = view.getTop();
        view.getRight();
        view.getBottom();
        return zw8Var;
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
