package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.o20;
import org.telegram.ui.Components.a51;
public final class o1 implements org.telegram.ui.ActionBar.u1, o20 {
    public final int f664a;
    public final t1 f665b;

    public o1(t1 t1Var, int i10) {
        this.f664a = i10;
        this.f665b = t1Var;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f664a) {
            case 0:
                this.f665b.e0();
                return;
            case 1:
                this.f665b.finishFragment();
                return;
            default:
                this.f665b.e0();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        t1.a0(this.f665b, (a51) obj, (View) obj2);
    }
}
