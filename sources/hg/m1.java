package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.q61;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final z1 f11317a;

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.f11317a, (q61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        q61 q61Var = (q61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (q61Var.f17211a == 16) {
            Object obj6 = q61Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).f11178g) {
                this.f11317a.e0(q61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
