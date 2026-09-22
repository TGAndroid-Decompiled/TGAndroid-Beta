package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
public final class r0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f10396a;
    public final v0 f10397b;

    public r0(v0 v0Var, int i10) {
        this.f10396a = i10;
        this.f10397b = v0Var;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10396a) {
            case 0:
                this.f10397b.a0();
                return;
            case 1:
                this.f10397b.finishFragment();
                return;
            default:
                this.f10397b.a0();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v0.W(this.f10397b, (i51) obj, (View) obj2);
    }
}
