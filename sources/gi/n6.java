package gi;

import org.telegram.messenger.u10;
public final class n6 implements u10 {
    public final int f13305a;
    public final r6 f13306b;

    public n6(r6 r6Var, int i3) {
        this.f13305a = i3;
        this.f13306b = r6Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z10;
        switch (this.f13305a) {
            case 0:
                q6 q6Var = (q6) obj;
                r6 r6Var = this.f13306b;
                r6Var.I = null;
                r6Var.F = q6Var;
                if (q6Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r6Var.E = z10;
                r6Var.a();
                r6Var.invalidate();
                v8 v8Var = r6Var.f13513b;
                if (v8Var != null) {
                    v8Var.run();
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                q6 q6Var2 = this.f13306b.F;
                if (q6Var2 != null || d2Var == null) {
                    q6Var2.c(d2Var);
                    return;
                }
                return;
        }
    }
}
