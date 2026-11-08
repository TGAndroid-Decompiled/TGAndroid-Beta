package fi;

import android.os.Build;
import c8.zc;
public final class t6 implements oi.n, oi.m {
    public final w6 f12859a;

    public t6(w6 w6Var) {
        this.f12859a = w6Var;
    }

    @Override
    public int h() {
        w6 w6Var = this.f12859a;
        w6Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, w6Var.I0);
    }

    @Override
    public void l(int i7) {
        w6 w6Var = this.f12859a;
        dh.g gVar = w6Var.d2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (zc.a(i7, 4)) {
                gVar.h(w6Var.X0.e());
            }
            gVar.e(w6Var.f13038g2, w6Var.f28619b.getWidth(), w6Var.f28619b.getHeight());
        }
    }
}
