package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q61;
public final class q0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f11355a;
    public final u0 f11356b;

    public q0(u0 u0Var, int i10) {
        this.f11355a = i10;
        this.f11356b = u0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11355a) {
            case 0:
                this.f11356b.a0();
                return;
            case 1:
                this.f11356b.finishFragment();
                return;
            default:
                this.f11356b.a0();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f11356b, (q61) obj, (View) obj2);
    }
}
