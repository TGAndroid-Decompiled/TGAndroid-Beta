package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class q0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f12996a;
    public final t0 f12997b;

    public q0(t0 t0Var, int i10) {
        this.f12996a = i10;
        this.f12997b = t0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12996a) {
            case 0:
                this.f12997b.a0();
                return;
            case 1:
                this.f12997b.finishFragment();
                return;
            default:
                this.f12997b.a0();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        t0.W(this.f12997b, (f61) obj, (View) obj2);
    }
}
