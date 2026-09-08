package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h51;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final y1 f12178a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y1.W(this.f12178a, (h51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (h51Var.f44098a == 16) {
            Object obj6 = h51Var.G;
            if (!(obj6 instanceof a2) || !((a2) obj6).f12023g) {
                this.f12178a.e0(h51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
