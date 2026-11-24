package defpackage;

import android.view.View;
public final class hkc implements yr3 {
    public final byte a;
    public final nkc b;

    public hkc(nkc nkcVar, byte b) {
        this.a = b;
        this.b = nkcVar;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        nkc nkcVar = this.b;
        switch (b) {
            case 0:
                nkcVar.C = f;
                nkcVar.a.invalidate();
                return;
            case 1:
                nkcVar.c0 = f;
                uk1 uk1Var = nkcVar.a;
                uk1Var.invalidate();
                if (uk1Var.getParent() instanceof View) {
                    ((View) uk1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                nkcVar.a0 = f;
                uk1 uk1Var2 = nkcVar.a;
                uk1Var2.invalidate();
                if (uk1Var2.getParent() instanceof View) {
                    ((View) uk1Var2.getParent()).invalidate();
                    return;
                }
                return;
        }
    }
}
