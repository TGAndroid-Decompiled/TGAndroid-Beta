package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r61;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final z1 f11317a;

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.f11317a, (r61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        r61 r61Var = (r61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (r61Var.f17175a == 16) {
            Object obj6 = r61Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).f11178g) {
                this.f11317a.e0(r61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
