package hi;

import android.os.Build;
import c8.ed;
public final class r6 implements ri.n, ri.m {
    public final v6 f15307a;

    public r6(v6 v6Var) {
        this.f15307a = v6Var;
    }

    @Override
    public int e() {
        v6 v6Var = this.f15307a;
        v6Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, v6Var.J0);
    }

    @Override
    public void l(int i7) {
        v6 v6Var = this.f15307a;
        dh.g gVar = v6Var.f15538h2;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (ed.a(i7, 4)) {
                gVar.h(v6Var.Y0.e());
            }
            gVar.e(v6Var.f15541k2, v6Var.f30142b.getWidth(), v6Var.f30142b.getHeight());
        }
    }
}
