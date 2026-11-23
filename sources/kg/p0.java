package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
public final class p0 implements org.telegram.ui.ActionBar.q1, w10 {
    public final int f18446a;
    public final s0 f18447b;

    public p0(s0 s0Var, int i7) {
        this.f18446a = i7;
        this.f18447b = s0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18446a) {
            case 0:
                this.f18447b.f0();
                return;
            case 1:
                this.f18447b.finishFragment();
                return;
            default:
                this.f18447b.f0();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s0.b0(this.f18447b, (o41) obj, (View) obj2);
    }
}
