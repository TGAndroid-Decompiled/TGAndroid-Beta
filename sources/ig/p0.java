package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class p0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f12204a;
    public final u0 f12205b;

    public p0(u0 u0Var, int i10) {
        this.f12204a = i10;
        this.f12205b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12204a) {
            case 0:
                this.f12205b.a0();
                return;
            case 1:
                this.f12205b.finishFragment();
                return;
            default:
                this.f12205b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f12205b, (h51) obj, (View) obj2);
    }
}
