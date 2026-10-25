package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ju;
public final class t0 implements e2.j, iu, am0 {
    public final int f18251a;
    public final int f18252b;
    public final Object f18253c;
    public final Object d;

    public t0(j1 j1Var, Surface surface, int i10, int i11) {
        this.f18253c = j1Var;
        this.d = surface;
        this.f18251a = i10;
        this.f18252b = i11;
    }

    @Override
    public void accept(Object obj) {
        j1 j1Var = (j1) this.f18253c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.f18091a.get()).getClass();
        if (surface == null) {
            n1Var.T(null);
            j1Var.f18095i = null;
            return;
        }
        i1 i1Var = new i1(surface, this.f18251a, this.f18252b);
        j1Var.f18095i = i1Var;
        n1Var.T(i1Var);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        int i11 = this.f18252b;
        vg.n1.Q((vg.n1) this.f18253c, this.f18251a, (u6) this.d, i11, view, i10);
    }

    @Override
    public void run(String str) {
        ju.k((ju) this.f18253c, this.f18251a, this.f18252b, (Runnable) this.d, str);
    }

    public t0(ju juVar, int i10, int i11, Runnable runnable) {
        this.f18253c = juVar;
        this.f18251a = i10;
        this.f18252b = i11;
        this.d = runnable;
    }

    public t0(vg.n1 n1Var, int i10, u6 u6Var, int i11) {
        this.f18253c = n1Var;
        this.f18251a = i10;
        this.d = u6Var;
        this.f18252b = i11;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
