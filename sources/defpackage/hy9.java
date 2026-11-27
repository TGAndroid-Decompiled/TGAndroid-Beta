package defpackage;

import android.view.View;
public final class hy9 implements nr7, fd {
    public final byte a;
    public final ky9 b;

    public hy9(ky9 ky9Var, byte b) {
        this.a = b;
        this.b = ky9Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 H0 = hl.H0(l2dVar, false);
        ky9 ky9Var = this.b;
        ky9Var.e = H0;
        ky9Var.c.setPadding(H0.a, H0.b, H0.c, H0.d);
        ky9Var.b.requestLayout();
        return l2d.b;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        ky9 ky9Var = this.b;
        switch (b) {
            case 1:
                id idVar2 = ky9Var.d0;
                if (idVar2 != null) {
                    idVar2.dismiss();
                    return;
                }
                return;
            default:
                id idVar3 = ky9Var.d0;
                if (idVar3 != null) {
                    idVar3.dismiss();
                    ky9Var.d0 = null;
                }
                ky9Var.dismiss();
                return;
        }
    }
}
