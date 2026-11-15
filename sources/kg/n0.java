package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
public final class n0 implements org.telegram.ui.ActionBar.q1, x10 {
    public final int f18005a;
    public final q0 f18006b;

    public n0(q0 q0Var, int i7) {
        this.f18005a = i7;
        this.f18006b = q0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18005a) {
            case 0:
                this.f18006b.f0();
                return;
            case 1:
                this.f18006b.finishFragment();
                return;
            default:
                this.f18006b.f0();
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        q0.b0(this.f18006b, (b41) obj, (View) obj2);
    }
}
