package defpackage;

import org.telegram.ui.ActionBar.d;
public final class hq9 implements p8c {
    public final byte a;
    public final lq9 b;

    public hq9(lq9 lq9Var, byte b) {
        this.a = b;
        this.b = lq9Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        lq9 lq9Var = this.b;
        switch (b) {
            case 0:
                kq9 kq9Var = (kq9) obj;
                lq9Var.I = null;
                lq9Var.F = kq9Var;
                if (kq9Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                lq9Var.E = z;
                lq9Var.a();
                lq9Var.invalidate();
                d6b d6bVar = lq9Var.b;
                if (d6bVar != null) {
                    d6bVar.run();
                    return;
                }
                return;
            default:
                d dVar = (d) obj;
                kq9 kq9Var2 = lq9Var.F;
                if (kq9Var2 != null || dVar == null) {
                    kq9Var2.c(dVar);
                    return;
                }
                return;
        }
    }
}
