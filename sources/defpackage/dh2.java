package defpackage;

import android.view.View;
import java.io.Serializable;
public final class dh2 implements ee, oac {
    public final byte a;
    public final hh2 b;

    public dh2(hh2 hh2Var, byte b) {
        this.a = b;
        this.b = hh2Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.b.e0((c6c) obj, (View) obj2);
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                hh2Var.f0();
                return;
            case 1:
                hh2Var.finishFragment();
                return;
            default:
                hh2Var.f0();
                return;
        }
    }
}
