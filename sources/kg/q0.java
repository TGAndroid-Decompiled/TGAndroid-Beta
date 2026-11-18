package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
public final class q0 implements org.telegram.ui.ActionBar.r1, v10 {
    public final int f18423a;
    public final t0 f18424b;

    public q0(t0 t0Var, int i7) {
        this.f18423a = i7;
        this.f18424b = t0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18423a) {
            case 0:
                this.f18424b.f0();
                return;
            case 1:
                this.f18424b.finishFragment();
                return;
            default:
                this.f18424b.f0();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t0.b0(this.f18424b, (l41) obj, (View) obj2);
    }
}
