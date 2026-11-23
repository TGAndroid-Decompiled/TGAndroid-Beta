package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
import r0.l1;
public final class p implements u10, r0.m {
    public final r f20082a;

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        r.Z(this.f20082a, (n41) obj);
    }

    @Override
    public l1 l1(View view, l1 l1Var) {
        this.f20082a.a0(l1Var.f56381a.f(519).d);
        return l1.f56380b;
    }
}
