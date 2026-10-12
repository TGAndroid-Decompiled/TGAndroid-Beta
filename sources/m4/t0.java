package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nu;
public final class t0 implements e2.j, mu, bm0 {
    public final int f15635a;
    public final int f15636b;
    public final Object f15637c;
    public final Object d;

    public t0(j1 j1Var, Surface surface, int i10, int i11) {
        this.f15637c = j1Var;
        this.d = surface;
        this.f15635a = i10;
        this.f15636b = i11;
    }

    @Override
    public void accept(Object obj) {
        j1 j1Var = (j1) this.f15637c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.f15474a.get()).getClass();
        if (surface == null) {
            n1Var.T(null);
            j1Var.f15478i = null;
            return;
        }
        i1 i1Var = new i1(surface, this.f15635a, this.f15636b);
        j1Var.f15478i = i1Var;
        n1Var.T(i1Var);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int i11 = this.f15636b;
        ug.m1.R((ug.m1) this.f15637c, this.f15635a, (c6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        nu.k((nu) this.f15637c, this.f15635a, this.f15636b, (Runnable) this.d, str);
    }

    public t0(nu nuVar, int i10, int i11, Runnable runnable) {
        this.f15637c = nuVar;
        this.f15635a = i10;
        this.f15636b = i11;
        this.d = runnable;
    }

    public t0(ug.m1 m1Var, int i10, c6 c6Var, int i11) {
        this.f15637c = m1Var;
        this.f15635a = i10;
        this.d = c6Var;
        this.f15636b = i11;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
