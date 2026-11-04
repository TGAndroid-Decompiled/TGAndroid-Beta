package ji;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;
import r0.k1;
public final class o implements s10, r0.m {
    public final q f16353a;

    @Override
    public k1 R0(View view, k1 k1Var) {
        this.f16353a.a0(k1Var.f54026a.f(519).d);
        return k1.f54025b;
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        q.Z(this.f16353a, (r31) obj);
    }
}
