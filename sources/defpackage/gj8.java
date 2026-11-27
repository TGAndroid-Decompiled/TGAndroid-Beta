package defpackage;

import android.view.View;
import java.io.Serializable;
public final class gj8 implements fd, ncc {
    public final byte a;
    public final ij8 b;

    public gj8(ij8 ij8Var, byte b) {
        this.a = b;
        this.b = ij8Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        if (((b8c) obj).d == 1) {
            wkb wkbVar = (wkb) view;
            boolean z = !wkbVar.e.h;
            ij8 ij8Var = this.b;
            ij8Var.n = z;
            wkbVar.setChecked(z);
            ij8Var.d.g3.O(true);
            ij8Var.Y(true);
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        ij8 ij8Var = this.b;
        switch (b) {
            case 0:
                ij8Var.c0();
                return;
            default:
                ij8Var.finishFragment();
                return;
        }
    }
}
