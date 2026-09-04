package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class p0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f12178a;
    public final u0 f12179b;

    public p0(u0 u0Var, int i10) {
        this.f12178a = i10;
        this.f12179b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12178a) {
            case 0:
                this.f12179b.a0();
                return;
            case 1:
                this.f12179b.finishFragment();
                return;
            default:
                this.f12179b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f12179b, (h51) obj, (View) obj2);
    }
}
