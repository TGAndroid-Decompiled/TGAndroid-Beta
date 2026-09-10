package gg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
public final class u0 implements org.telegram.ui.ActionBar.c2, Utilities.Callback5 {
    public final int f9045a;
    public final y0 f9046b;

    public u0(y0 y0Var, int i10) {
        this.f9045a = i10;
        this.f9046b = y0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f9045a) {
            case 0:
                this.f9046b.a0();
                return;
            case 1:
                this.f9046b.finishFragment();
                return;
            default:
                this.f9046b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y0.W(this.f9046b, (v51) obj, (View) obj2);
    }
}
