package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
public abstract class d69 {
    public et8 a;
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

    public static int b(u69 u69Var) {
        int i = u69Var.l;
        int i2 = i & 14;
        if (u69Var.h()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = u69Var.d;
            int b = u69Var.b();
            if (i3 != -1 && b != -1 && i3 != b) {
                return i2 | 2048;
            }
            return i2;
        }
        return i2;
    }

    public abstract boolean a(u69 u69Var, az8 az8Var, az8 az8Var2);

    public boolean c(u69 u69Var, List list) {
        return u69Var.a instanceof ml3;
    }

    public final void d(u69 u69Var) {
        et8 et8Var = this.a;
        if (et8Var != null) {
            RecyclerView recyclerView = (RecyclerView) et8Var.b;
            boolean z = true;
            u69Var.q(true);
            View view = u69Var.a;
            if (u69Var.j != null && u69Var.k == null) {
                u69Var.j = null;
            }
            u69Var.k = null;
            if ((u69Var.l & 16) == 0) {
                ki2 ki2Var = recyclerView.b;
                recyclerView.A0();
                mx6 mx6Var = recyclerView.e;
                vh2 vh2Var = (vh2) mx6Var.c;
                ai4 ai4Var = (ai4) mx6Var.b;
                int indexOfChild = ((RecyclerView) ai4Var.b).indexOfChild(view);
                if (indexOfChild == -1) {
                    mx6Var.y0(view);
                } else if (vh2Var.x(indexOfChild)) {
                    vh2Var.z(indexOfChild);
                    mx6Var.y0(view);
                    ai4Var.S(indexOfChild);
                } else {
                    z = false;
                }
                if (z) {
                    u69 U = RecyclerView.U(view);
                    ki2Var.l(U);
                    ki2Var.i(U);
                }
                recyclerView.B0(!z);
                if (!z && u69Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r49 r49Var = (r49) arrayList.get(i);
            r49Var.a.l(r49Var.b, r49Var.c, r49Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(u69 u69Var);

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

    public az8 l(r69 r69Var, u69 u69Var, int i, List list) {
        az8 az8Var = new az8((byte) 4);
        View view = u69Var.a;
        az8Var.b = view.getLeft();
        az8Var.c = view.getTop();
        view.getRight();
        view.getBottom();
        return az8Var;
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
