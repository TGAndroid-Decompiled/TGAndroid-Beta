package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h61;
public final class l1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final x1 f12955a;

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x1.W(this.f12955a, (h61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        h61 h61Var = (h61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h61Var.f44300a == 16) {
            Object obj6 = h61Var.G;
            if (!(obj6 instanceof z1) || !((z1) obj6).f13102g) {
                this.f12955a.e0(h61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
