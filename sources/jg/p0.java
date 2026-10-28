package jg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class p0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f15804a;
    public final t0 f15805b;

    public p0(t0 t0Var, int i10) {
        this.f15804a = i10;
        this.f15805b = t0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15804a) {
            case 0:
                this.f15805b.b0();
                return;
            case 1:
                this.f15805b.finishFragment();
                return;
            default:
                this.f15805b.b0();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t0.X(this.f15805b, (u61) obj, (View) obj2);
    }
}
