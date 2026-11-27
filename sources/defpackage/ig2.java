package defpackage;

import android.view.View;
import java.io.Serializable;
public final class ig2 implements fd, ncc {
    public final byte a;
    public final mg2 b;

    public ig2(mg2 mg2Var, byte b) {
        this.a = b;
        this.b = mg2Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.b.d0((b8c) obj, (View) obj2);
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        mg2 mg2Var = this.b;
        switch (b) {
            case 0:
                mg2Var.e0();
                return;
            case 1:
                mg2Var.finishFragment();
                return;
            default:
                mg2Var.e0();
                return;
        }
    }
}
