package defpackage;

import android.view.View;
import java.io.Serializable;
public final class sf8 implements ed, n8c {
    public final byte a;
    public final uf8 b;

    public sf8(uf8 uf8Var, byte b) {
        this.a = b;
        this.b = uf8Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        if (((c4c) obj).d == 1) {
            ahb ahbVar = (ahb) view;
            boolean z = !ahbVar.e.h;
            uf8 uf8Var = this.b;
            uf8Var.n = z;
            ahbVar.setChecked(z);
            uf8Var.d.g3.O(true);
            uf8Var.Y(true);
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        uf8 uf8Var = this.b;
        switch (b) {
            case 0:
                uf8Var.c0();
                return;
            default:
                uf8Var.finishFragment();
                return;
        }
    }
}
