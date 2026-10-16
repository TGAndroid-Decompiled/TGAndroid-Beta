package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m61;
public final class p0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f11606a;
    public final u0 f11607b;

    public p0(u0 u0Var, int i10) {
        this.f11606a = i10;
        this.f11607b = u0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11606a) {
            case 0:
                this.f11607b.a0();
                return;
            case 1:
                this.f11607b.finishFragment();
                return;
            default:
                this.f11607b.a0();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        u0.W(this.f11607b, (m61) obj, (View) obj2);
    }
}
