package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public class kl0 {
    public final gx4 a;
    public final gx4 b;
    public final gx4 c;
    public int d;
    public int e;
    public e59 f;
    public e59 g;
    public zec h;
    public ViewGroup i;
    public qw4 j;
    public boolean k;

    public kl0(gx4 gx4Var, gx4 gx4Var2, gx4 gx4Var3) {
        this.a = gx4Var;
        this.b = gx4Var2;
        this.c = gx4Var3;
    }

    public final il0 a(View view) {
        return c(view, null, false);
    }

    public final il0 b(View view, al0 al0Var) {
        return c(view, al0Var, false);
    }

    public il0 c(View view, al0 al0Var, boolean z) {
        il0 il0Var;
        gx4 gx4Var = this.c;
        gx4 gx4Var2 = this.a;
        gx4 gx4Var3 = this.b;
        if (gx4Var2 == gx4Var3 && gx4Var3 == gx4Var) {
            if (gx4Var2 instanceof jl0) {
                il0Var = ((jl0) gx4Var2).b();
            } else {
                il0Var = new il0(gx4Var2, gx4Var2, gx4Var2);
            }
        } else {
            il0 il0Var2 = new il0(gx4Var2, gx4Var3, gx4Var);
            if (gx4Var2 instanceof jl0) {
                ((jl0) gx4Var2).c(il0Var2);
            }
            if (gx4Var3 != gx4Var2 && (gx4Var3 instanceof jl0)) {
                ((jl0) gx4Var3).c(il0Var2);
            }
            if (gx4Var != gx4Var2 && gx4Var != gx4Var3 && (gx4Var instanceof jl0)) {
                ((jl0) gx4Var).c(il0Var2);
            }
            il0Var = il0Var2;
        }
        if (this.k && !il0Var.Y) {
            il0Var.Y = true;
            il0Var.b0 = true;
        }
        il0Var.p(al0Var);
        int i = this.d;
        int i2 = this.e;
        il0Var.L = i;
        il0Var.M = i2;
        e59 e59Var = this.g;
        if (e59Var != null && view != null) {
            e59Var.add(view);
        }
        qw4 qw4Var = this.j;
        if (qw4Var != null && view != null) {
            qw4Var.c.add(new pw4(view, il0Var));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new o(il0Var, new WeakReference(view), (byte) 17), z);
        }
        e59 e59Var2 = this.f;
        if (e59Var2 != null) {
            e59Var2.add(il0Var);
        }
        return il0Var;
    }

    public final void d() {
        e59 e59Var = this.g;
        if (e59Var != null) {
            Iterator it = e59Var.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(zec zecVar, ViewGroup viewGroup) {
        this.h = zecVar;
        this.i = viewGroup;
    }
}
