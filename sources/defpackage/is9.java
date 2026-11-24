package defpackage;

import org.telegram.ui.ActionBar.d;
public final class is9 implements qac {
    public final byte a;
    public final ms9 b;

    public is9(ms9 ms9Var, byte b) {
        this.a = b;
        this.b = ms9Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        ms9 ms9Var = this.b;
        switch (b) {
            case 0:
                ls9 ls9Var = (ls9) obj;
                ms9Var.I = null;
                ms9Var.F = ls9Var;
                if (ls9Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                ms9Var.E = z;
                ms9Var.a();
                ms9Var.invalidate();
                f8b f8bVar = ms9Var.b;
                if (f8bVar != null) {
                    f8bVar.run();
                    return;
                }
                return;
            default:
                d dVar = (d) obj;
                ls9 ls9Var2 = ms9Var.F;
                if (ls9Var2 != null || dVar == null) {
                    ls9Var2.c(dVar);
                    return;
                }
                return;
        }
    }
}
