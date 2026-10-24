package m4;

import android.view.Surface;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.gu;
public final class s0 implements e2.j, fu, am0 {
    public final int f16786a;
    public final int f16787b;
    public final Object f16788c;
    public final Object d;

    public s0(i1 i1Var, Surface surface, int i10, int i11) {
        this.f16788c = i1Var;
        this.d = surface;
        this.f16786a = i10;
        this.f16787b = i11;
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) this.f16788c;
        Surface surface = (Surface) this.d;
        m1 m1Var = (m1) obj;
        ((f0) i1Var.f16626a.get()).getClass();
        if (surface == null) {
            m1Var.T(null);
            i1Var.f16630i = null;
            return;
        }
        h1 h1Var = new h1(surface, this.f16786a, this.f16787b);
        i1Var.f16630i = h1Var;
        m1Var.T(h1Var);
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f16787b;
        ug.l1.Q((ug.l1) this.f16788c, this.f16786a, (g6) this.d, i11, view, i10);
    }

    @Override
    public void run(String str) {
        gu.k((gu) this.f16788c, this.f16786a, this.f16787b, (Runnable) this.d, str);
    }

    public s0(gu guVar, int i10, int i11, Runnable runnable) {
        this.f16788c = guVar;
        this.f16786a = i10;
        this.f16787b = i11;
        this.d = runnable;
    }

    public s0(ug.l1 l1Var, int i10, g6 g6Var, int i11) {
        this.f16788c = l1Var;
        this.f16786a = i10;
        this.d = g6Var;
        this.f16787b = i11;
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}
