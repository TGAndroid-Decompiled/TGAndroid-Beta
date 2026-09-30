package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.y51;
public final class n1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final z1 f10369a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        z1.W(this.f10369a, (y51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        y51 y51Var = (y51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (y51Var.f15731a == 16) {
            Object obj6 = y51Var.G;
            if (!(obj6 instanceof b2) || !((b2) obj6).f10223g) {
                this.f10369a.e0(y51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
