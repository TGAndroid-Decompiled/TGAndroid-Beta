package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r61;
public final class q0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11354a;
    public final u0 f11355b;

    public q0(u0 u0Var, int i10) {
        this.f11354a = i10;
        this.f11355b = u0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11354a) {
            case 0:
                this.f11355b.a0();
                return;
            case 1:
                this.f11355b.finishFragment();
                return;
            default:
                this.f11355b.a0();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f11355b, (r61) obj, (View) obj2);
    }
}
