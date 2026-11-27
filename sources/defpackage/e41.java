package defpackage;

import android.content.Context;
import android.text.Editable;
public final class e41 extends zt3 {
    public final byte F;
    public final g41 G;

    public e41(g41 g41Var, Context context, String str, int i, vnb vnbVar, byte b) {
        super(context, str, false, false, i, vnbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = g41Var;
                super(context, str, true, false, i, vnbVar);
                return;
            default:
                this.G = g41Var;
                return;
        }
    }

    @Override
    public final void a(boolean z) {
        wa waVar;
        wa waVar2;
        byte b = this.F;
        g41 g41Var = this.G;
        switch (b) {
            case 0:
                if (z && (waVar = g41Var.a) != null) {
                    waVar.A0(2);
                    return;
                }
                return;
            default:
                if (z && (waVar2 = g41Var.a) != null) {
                    waVar2.A0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        byte b = this.F;
        g41 g41Var = this.G;
        switch (b) {
            case 0:
                g41Var.n.c(g41Var.s.getText().toString(), g41Var.w.getText().toString());
                g41Var.f0(true);
                return;
            default:
                g41Var.n.c(g41Var.s.getText().toString(), g41Var.w.getText().toString());
                g41Var.f0(true);
                return;
        }
    }
}
