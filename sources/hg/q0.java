package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
public final class q0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f10393a;
    public final u0 f10394b;

    public q0(u0 u0Var, int i10) {
        this.f10393a = i10;
        this.f10394b = u0Var;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10393a) {
            case 0:
                this.f10394b.a0();
                return;
            case 1:
                this.f10394b.finishFragment();
                return;
            default:
                this.f10394b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f10394b, (y51) obj, (View) obj2);
    }
}
