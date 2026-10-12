package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
public final class p0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11602a;
    public final u0 f11603b;

    public p0(u0 u0Var, int i10) {
        this.f11602a = i10;
        this.f11603b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11602a) {
            case 0:
                this.f11603b.a0();
                return;
            case 1:
                this.f11603b.finishFragment();
                return;
            default:
                this.f11603b.a0();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f11603b, (l61) obj, (View) obj2);
    }
}
