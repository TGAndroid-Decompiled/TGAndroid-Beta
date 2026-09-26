package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class r0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback5 {
    public final int f10382a;
    public final v0 f10383b;

    public r0(v0 v0Var, int i10) {
        this.f10382a = i10;
        this.f10383b = v0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f10382a) {
            case 0:
                this.f10383b.a0();
                return;
            case 1:
                this.f10383b.finishFragment();
                return;
            default:
                this.f10383b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0.W(this.f10383b, (w51) obj, (View) obj2);
    }
}
