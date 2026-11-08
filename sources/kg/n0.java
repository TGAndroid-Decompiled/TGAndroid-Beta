package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.x31;
public final class n0 implements org.telegram.ui.ActionBar.r1, a20 {
    public final int f17447a;
    public final q0 f17448b;

    public n0(q0 q0Var, int i7) {
        this.f17447a = i7;
        this.f17448b = q0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f17447a) {
            case 0:
                this.f17448b.f0();
                return;
            case 1:
                this.f17448b.finishFragment();
                return;
            default:
                this.f17448b.f0();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        q0.b0(this.f17448b, (x31) obj, (View) obj2);
    }
}
