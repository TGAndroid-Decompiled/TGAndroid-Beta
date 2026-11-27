package defpackage;

import org.telegram.ui.ActionBar.e;
public final class zt9 implements pcc {
    public final byte a;
    public final du9 b;

    public zt9(du9 du9Var, byte b) {
        this.a = b;
        this.b = du9Var;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        byte b = this.a;
        du9 du9Var = this.b;
        switch (b) {
            case 0:
                cu9 cu9Var = (cu9) obj;
                du9Var.I = null;
                du9Var.F = cu9Var;
                if (cu9Var != null) {
                    z = true;
                } else {
                    z = false;
                }
                du9Var.E = z;
                du9Var.a();
                du9Var.invalidate();
                bab babVar = du9Var.b;
                if (babVar != null) {
                    babVar.run();
                    return;
                }
                return;
            default:
                e eVar = (e) obj;
                cu9 cu9Var2 = du9Var.F;
                if (cu9Var2 != null || eVar == null) {
                    cu9Var2.c(eVar);
                    return;
                }
                return;
        }
    }
}
