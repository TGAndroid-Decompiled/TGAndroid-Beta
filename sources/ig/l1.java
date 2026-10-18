package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class l1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final x1 f12957a;

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        x1.W(this.f12957a, (f61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (f61Var.f44334a == 16) {
            Object obj6 = f61Var.G;
            if (!(obj6 instanceof z1) || !((z1) obj6).f13104g) {
                this.f12957a.e0(f61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
