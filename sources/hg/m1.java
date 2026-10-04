package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g61;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final y1 f11266a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y1.U(this.f11266a, (g61) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (g61Var.f17187a == 16) {
            Object obj6 = g61Var.G;
            if (!(obj6 instanceof a2) || !((a2) obj6).f11109g) {
                this.f11266a.e0(g61Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
