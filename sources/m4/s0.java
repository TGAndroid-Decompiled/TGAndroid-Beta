package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.xl0;
public final class s0 implements e2.j, hu, xl0 {
    public final int f16717a;
    public final int f16718b;
    public final Object f16719c;
    public final Object d;

    public s0(i1 i1Var, Surface surface, int i10, int i11) {
        this.f16719c = i1Var;
        this.d = surface;
        this.f16717a = i10;
        this.f16718b = i11;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16719c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16557a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16561i = null;
            return;
        }
        h1 h1Var = new h1(surface, this.f16717a, this.f16718b);
        i1Var.f16561i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int i11 = this.f16718b;
        ug.l1.R((ug.l1) this.f16719c, this.f16717a, (d6) this.d, i11, view, i10);
    }

    @Override
    public void run(String str) {
        iu.k((iu) this.f16719c, this.f16717a, this.f16718b, (Runnable) this.d, str);
    }

    public s0(iu iuVar, int i10, int i11, Runnable runnable) {
        this.f16719c = iuVar;
        this.f16717a = i10;
        this.f16718b = i11;
        this.d = runnable;
    }

    public s0(ug.l1 l1Var, int i10, d6 d6Var, int i11) {
        this.f16719c = l1Var;
        this.f16717a = i10;
        this.d = d6Var;
        this.f16718b = i11;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
