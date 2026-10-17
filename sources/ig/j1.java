package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class j1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final v1 f12937a;

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        v1.W(this.f12937a, (f61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (f61Var.f44314a == 16) {
            Object obj6 = f61Var.G;
            if (!(obj6 instanceof x1) || !((x1) obj6).f13084g) {
                this.f12937a.e0(f61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
