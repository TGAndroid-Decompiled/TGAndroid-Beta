package jg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t61;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final z1 f15779a;

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.X(this.f15779a, (t61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        t61 t61Var = (t61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (t61Var.f47037a == 16) {
            Object obj6 = t61Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).f15644g) {
                this.f15779a.f0(t61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
