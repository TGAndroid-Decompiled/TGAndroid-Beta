package ii;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.x31;
import r0.k1;
public final class q implements a20, r0.m {
    public final s f15593a;

    @Override
    public k1 S0(View view, k1 k1Var) {
        this.f15593a.a0(k1Var.f54213a.f(519).d);
        return k1.f54212b;
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s.Z(this.f15593a, (x31) obj);
    }
}
