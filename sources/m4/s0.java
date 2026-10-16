package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nu;
public final class s0 implements e2.j, mu, bm0 {
    public final int f15365a;
    public final int f15366b;
    public final Object f15367c;
    public final Object d;

    public s0(i1 i1Var, Surface surface, int i10, int i11) {
        this.f15367c = i1Var;
        this.d = surface;
        this.f15365a = i10;
        this.f15366b = i11;
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f15367c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((e0) i1Var.f15204a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f15208i = null;
            return;
        }
        h1 h1Var = new h1(surface, this.f15365a, this.f15366b);
        i1Var.f15208i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int i11 = this.f15366b;
        ug.m1.R((ug.m1) this.f15367c, this.f15365a, (c6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        nu.k((nu) this.f15367c, this.f15365a, this.f15366b, (Runnable) this.d, str);
    }

    public s0(nu nuVar, int i10, int i11, Runnable runnable) {
        this.f15367c = nuVar;
        this.f15365a = i10;
        this.f15366b = i11;
        this.d = runnable;
    }

    public s0(ug.m1 m1Var, int i10, c6 c6Var, int i11) {
        this.f15367c = m1Var;
        this.f15365a = i10;
        this.d = c6Var;
        this.f15366b = i11;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
