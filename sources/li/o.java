package li;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
import r0.k1;
public final class o implements x10, r0.m {
    public final r f19620a;

    @Override
    public k1 M0(View view, k1 k1Var) {
        this.f19620a.a0(k1Var.f55682a.f(519).d);
        return k1.f55681b;
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        r.Z(this.f19620a, (b41) obj);
    }
}
