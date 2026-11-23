package hi;

import org.telegram.messenger.y10;
public final class j6 implements y10 {
    public final int f14831a;
    public final n6 f14832b;

    public j6(n6 n6Var, int i7) {
        this.f14831a = i7;
        this.f14832b = n6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f14831a) {
            case 0:
                m6 m6Var = (m6) obj;
                n6 n6Var = this.f14832b;
                n6Var.I = null;
                n6Var.F = m6Var;
                if (m6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n6Var.E = z10;
                n6Var.a();
                n6Var.invalidate();
                r8 r8Var = n6Var.f15107b;
                if (r8Var != null) {
                    r8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                m6 m6Var2 = this.f14832b.F;
                if (m6Var2 != null || g2Var == null) {
                    m6Var2.c(g2Var);
                    return;
                }
                return;
        }
    }
}
