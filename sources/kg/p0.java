package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
public final class p0 implements org.telegram.ui.ActionBar.q1, w10 {
    public final int f18409a;
    public final t0 f18410b;

    public p0(t0 t0Var, int i7) {
        this.f18409a = i7;
        this.f18410b = t0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18409a) {
            case 0:
                this.f18410b.f0();
                return;
            case 1:
                this.f18410b.finishFragment();
                return;
            default:
                this.f18410b.f0();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t0.b0(this.f18410b, (o41) obj, (View) obj2);
    }
}
