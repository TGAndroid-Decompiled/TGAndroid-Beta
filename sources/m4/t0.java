package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.ju;
public final class t0 implements e2.j, iu, bm0 {
    public final int f18250a;
    public final int f18251b;
    public final Object f18252c;
    public final Object d;

    public t0(j1 j1Var, Surface surface, int i10, int i11) {
        this.f18252c = j1Var;
        this.d = surface;
        this.f18250a = i10;
        this.f18251b = i11;
    }

    @Override
    public void accept(Object obj) {
        j1 j1Var = (j1) this.f18252c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.f18090a.get()).getClass();
        if (surface == null) {
            n1Var.T(null);
            j1Var.f18094i = null;
            return;
        }
        i1 i1Var = new i1(surface, this.f18250a, this.f18251b);
        j1Var.f18094i = i1Var;
        n1Var.T(i1Var);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        int i11 = this.f18251b;
        vg.n1.Q((vg.n1) this.f18252c, this.f18250a, (u6) this.d, i11, view, i10);
    }

    @Override
    public void run(String str) {
        ju.k((ju) this.f18252c, this.f18250a, this.f18251b, (Runnable) this.d, str);
    }

    public t0(ju juVar, int i10, int i11, Runnable runnable) {
        this.f18252c = juVar;
        this.f18250a = i10;
        this.f18251b = i11;
        this.d = runnable;
    }

    public t0(vg.n1 n1Var, int i10, u6 u6Var, int i11) {
        this.f18252c = n1Var;
        this.f18250a = i10;
        this.d = u6Var;
        this.f18251b = i11;
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}
