package defpackage;

import android.content.Context;
import android.text.Editable;
public final class d51 extends su3 {
    public final byte F;
    public final f51 G;

    public d51(f51 f51Var, Context context, String str, int i, ylb ylbVar, byte b) {
        super(context, str, false, false, i, ylbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = f51Var;
                super(context, str, true, false, i, ylbVar);
                return;
            default:
                this.G = f51Var;
                return;
        }
    }

    @Override
    public final void a(boolean z) {
        va vaVar;
        va vaVar2;
        byte b = this.F;
        f51 f51Var = this.G;
        switch (b) {
            case 0:
                if (z && (vaVar = f51Var.a) != null) {
                    vaVar.z0(2);
                    return;
                }
                return;
            default:
                if (z && (vaVar2 = f51Var.a) != null) {
                    vaVar2.z0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        byte b = this.F;
        f51 f51Var = this.G;
        switch (b) {
            case 0:
                f51Var.n.c(f51Var.s.getText().toString(), f51Var.w.getText().toString());
                f51Var.g0(true);
                return;
            default:
                f51Var.n.c(f51Var.s.getText().toString(), f51Var.w.getText().toString());
                f51Var.g0(true);
                return;
        }
    }
}
