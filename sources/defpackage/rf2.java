package defpackage;

import android.view.View;
import java.io.Serializable;
public final class rf2 implements ed, n8c {
    public final byte a;
    public final uf2 b;

    public rf2(uf2 uf2Var, byte b) {
        this.a = b;
        this.b = uf2Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.b.d0((c4c) obj, (View) obj2);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        uf2 uf2Var = this.b;
        switch (b) {
            case 0:
                uf2Var.e0();
                return;
            case 1:
                uf2Var.finishFragment();
                return;
            default:
                uf2Var.e0();
                return;
        }
    }
}
