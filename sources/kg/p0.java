package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
public final class p0 implements org.telegram.ui.ActionBar.q1, u10 {
    public final int f18504a;
    public final s0 f18505b;

    public p0(s0 s0Var, int i7) {
        this.f18504a = i7;
        this.f18505b = s0Var;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18504a) {
            case 0:
                this.f18505b.f0();
                return;
            case 1:
                this.f18505b.finishFragment();
                return;
            default:
                this.f18505b.f0();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s0.b0(this.f18505b, (n41) obj, (View) obj2);
    }
}
