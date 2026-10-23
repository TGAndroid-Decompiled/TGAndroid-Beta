package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
public final class p0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f13020a;
    public final s0 f13021b;

    public p0(s0 s0Var, int i10) {
        this.f13020a = i10;
        this.f13021b = s0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f13020a) {
            case 0:
                this.f13021b.a0();
                return;
            case 1:
                this.f13021b.finishFragment();
                return;
            default:
                this.f13021b.a0();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        s0.W(this.f13021b, (m61) obj, (View) obj2);
    }
}
