package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;
public final class n1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final z1 f10355a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.f10355a, (w51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (w51Var.f15715a == 16) {
            Object obj6 = w51Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).f10209g) {
                this.f10355a.e0(w51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
