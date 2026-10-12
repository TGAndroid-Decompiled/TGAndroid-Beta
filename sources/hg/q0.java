package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u61;
public final class q0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11353a;
    public final u0 f11354b;

    public q0(u0 u0Var, int i10) {
        this.f11353a = i10;
        this.f11354b = u0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11353a) {
            case 0:
                this.f11354b.a0();
                return;
            case 1:
                this.f11354b.finishFragment();
                return;
            default:
                this.f11354b.a0();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f11354b, (u61) obj, (View) obj2);
    }
}
