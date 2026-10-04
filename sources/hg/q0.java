package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
public final class q0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f11303a;
    public final u0 f11304b;

    public q0(u0 u0Var, int i10) {
        this.f11303a = i10;
        this.f11304b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11303a) {
            case 0:
                this.f11304b.Z();
                return;
            case 1:
                this.f11304b.finishFragment();
                return;
            default:
                this.f11304b.Z();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.U(this.f11304b, (g61) obj, (View) obj2);
    }
}
