package jg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;
public final class p0 implements org.telegram.ui.ActionBar.b2, Utilities.Callback5 {
    public final int f15805a;
    public final t0 f15806b;

    public p0(t0 t0Var, int i10) {
        this.f15805a = i10;
        this.f15806b = t0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15805a) {
            case 0:
                this.f15806b.b0();
                return;
            case 1:
                this.f15806b.finishFragment();
                return;
            default:
                this.f15806b.b0();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t0.X(this.f15806b, (t61) obj, (View) obj2);
    }
}
