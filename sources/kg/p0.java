package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.o41;
public final class p0 implements org.telegram.ui.ActionBar.q1, v10 {
    public final int f18443a;
    public final s0 f18444b;

    public p0(s0 s0Var, int i7) {
        this.f18443a = i7;
        this.f18444b = s0Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18443a) {
            case 0:
                this.f18444b.f0();
                return;
            case 1:
                this.f18444b.finishFragment();
                return;
            default:
                this.f18444b.f0();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        s0.b0(this.f18444b, (o41) obj, (View) obj2);
    }
}
