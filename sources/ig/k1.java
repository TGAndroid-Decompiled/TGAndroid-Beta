package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.l61;
public final class k1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final w1 f12983a;

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        w1.W(this.f12983a, (l61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (l61Var.f44712a == 16) {
            Object obj6 = l61Var.G;
            if (!(obj6 instanceof y1) || !((y1) obj6).f13133g) {
                this.f12983a.e0(l61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
