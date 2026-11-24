package defpackage;

import android.view.View;
import java.io.Serializable;
public final class uh8 implements ee, oac {
    public final byte a;
    public final wh8 b;

    public uh8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        if (((c6c) obj).d == 1) {
            bjb bjbVar = (bjb) view;
            boolean z = !bjbVar.e.h;
            wh8 wh8Var = this.b;
            wh8Var.n = z;
            bjbVar.setChecked(z);
            wh8Var.d.g3.O(true);
            wh8Var.Z(true);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.d0();
                return;
            default:
                wh8Var.finishFragment();
                return;
        }
    }
}
