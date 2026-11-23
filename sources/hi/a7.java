package hi;

import android.os.Build;
import c8.ed;
public final class a7 implements ri.n, ri.m {
    public final e7 f14194a;

    public a7(e7 e7Var) {
        this.f14194a = e7Var;
    }

    @Override
    public int j() {
        e7 e7Var = this.f14194a;
        e7Var.getClass();
        return org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, e7Var.J0);
    }

    @Override
    public void k(int i7) {
        e7 e7Var = this.f14194a;
        dh.g gVar = e7Var.f14381h2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (ed.a(i7, 4)) {
                gVar.h(e7Var.Y0.e());
            }
            gVar.e(e7Var.f14384k2, e7Var.f30226b.getWidth(), e7Var.f30226b.getHeight());
        }
    }
}
