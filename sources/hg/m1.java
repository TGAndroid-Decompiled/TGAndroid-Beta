package hg;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.i51;
public final class m1 implements Utilities.Callback5, Utilities.Callback5Return {
    public final y1 f10359a;

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        y1.W(this.f10359a, (i51) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        if (i51Var.f15533a == 16) {
            Object obj6 = i51Var.G;
            if (!(obj6 instanceof a2) || !((a2) obj6).f10221g) {
                this.f10359a.e0(i51Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }
}
