package gg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.v51;
public final class s1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final h2 f9035a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        h2.W(this.f9035a, (v51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (v51Var.f14046a == 16) {
            Object obj6 = v51Var.G;
            if (!(obj6 instanceof j2) || !((j2) obj6).f8921g) {
                this.f9035a.e0(v51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
