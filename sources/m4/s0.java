package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.xl0;
public final class s0 implements e2.j, hu, xl0 {
    public final int f16725a;
    public final int f16726b;
    public final Object f16727c;
    public final Object d;

    public s0(i1 i1Var, Surface surface, int i10, int i11) {
        this.f16727c = i1Var;
        this.d = surface;
        this.f16725a = i10;
        this.f16726b = i11;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16727c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16565a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16569i = null;
            return;
        }
        h1 h1Var = new h1(surface, this.f16725a, this.f16726b);
        i1Var.f16569i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int i11 = this.f16726b;
        ug.m1.R((ug.m1) this.f16727c, this.f16725a, (d6) this.d, i11, view, i10);
    }

    @Override
    public void run(String str) {
        iu.k((iu) this.f16727c, this.f16725a, this.f16726b, (Runnable) this.d, str);
    }

    public s0(iu iuVar, int i10, int i11, Runnable runnable) {
        this.f16727c = iuVar;
        this.f16725a = i10;
        this.f16726b = i11;
        this.d = runnable;
    }

    public s0(ug.m1 m1Var, int i10, d6 d6Var, int i11) {
        this.f16727c = m1Var;
        this.f16725a = i10;
        this.d = d6Var;
        this.f16726b = i11;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
