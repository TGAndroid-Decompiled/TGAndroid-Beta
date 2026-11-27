package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public class ll0 {
    public final mz4 a;
    public final mz4 b;
    public final mz4 c;
    public int d;
    public int e;
    public r89 f;
    public r89 g;
    public yic h;
    public ViewGroup i;
    public vy4 j;
    public boolean k;

    public ll0(mz4 mz4Var, mz4 mz4Var2, mz4 mz4Var3) {
        this.a = mz4Var;
        this.b = mz4Var2;
        this.c = mz4Var3;
    }

    public final jl0 a(View view) {
        return c(view, null, false);
    }

    public final jl0 b(View view, bl0 bl0Var) {
        return c(view, bl0Var, false);
    }

    public jl0 c(View view, bl0 bl0Var, boolean z) {
        jl0 jl0Var;
        mz4 mz4Var = this.c;
        mz4 mz4Var2 = this.a;
        mz4 mz4Var3 = this.b;
        if (mz4Var2 == mz4Var3 && mz4Var3 == mz4Var) {
            if (mz4Var2 instanceof kl0) {
                jl0Var = ((kl0) mz4Var2).b();
            } else {
                jl0Var = new jl0(mz4Var2, mz4Var2, mz4Var2);
            }
        } else {
            jl0 jl0Var2 = new jl0(mz4Var2, mz4Var3, mz4Var);
            if (mz4Var2 instanceof kl0) {
                ((kl0) mz4Var2).c(jl0Var2);
            }
            if (mz4Var3 != mz4Var2 && (mz4Var3 instanceof kl0)) {
                ((kl0) mz4Var3).c(jl0Var2);
            }
            if (mz4Var != mz4Var2 && mz4Var != mz4Var3 && (mz4Var instanceof kl0)) {
                ((kl0) mz4Var).c(jl0Var2);
            }
            jl0Var = jl0Var2;
        }
        if (this.k && !jl0Var.Y) {
            jl0Var.Y = true;
            jl0Var.b0 = true;
        }
        jl0Var.p(bl0Var);
        int i = this.d;
        int i2 = this.e;
        jl0Var.L = i;
        jl0Var.M = i2;
        r89 r89Var = this.g;
        if (r89Var != null && view != null) {
            r89Var.add(view);
        }
        vy4 vy4Var = this.j;
        if (vy4Var != null && view != null) {
            vy4Var.c.add(new uy4(view, jl0Var));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new o(jl0Var, new WeakReference(view), (byte) 17), z);
        }
        r89 r89Var2 = this.f;
        if (r89Var2 != null) {
            r89Var2.add(jl0Var);
        }
        return jl0Var;
    }

    public final void d() {
        r89 r89Var = this.g;
        if (r89Var != null) {
            Iterator it = r89Var.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(yic yicVar, ViewGroup viewGroup) {
        this.h = yicVar;
        this.i = viewGroup;
    }
}
