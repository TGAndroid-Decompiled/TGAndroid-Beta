package defpackage;

import android.content.Context;
import android.text.Editable;
public final class w31 extends it3 {
    public final byte F;
    public final y31 G;

    public w31(y31 y31Var, Context context, String str, int i, wjb wjbVar, byte b) {
        super(context, str, false, false, i, wjbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = y31Var;
                super(context, str, true, false, i, wjbVar);
                return;
            default:
                this.G = y31Var;
                return;
        }
    }

    @Override
    public final void a(boolean z) {
        va vaVar;
        va vaVar2;
        byte b = this.F;
        y31 y31Var = this.G;
        switch (b) {
            case 0:
                if (z && (vaVar = y31Var.a) != null) {
                    vaVar.z0(2);
                    return;
                }
                return;
            default:
                if (z && (vaVar2 = y31Var.a) != null) {
                    vaVar2.z0(3);
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(Editable editable) {
        byte b = this.F;
        y31 y31Var = this.G;
        switch (b) {
            case 0:
                y31Var.n.c(y31Var.s.getText().toString(), y31Var.w.getText().toString());
                y31Var.f0(true);
                return;
            default:
                y31Var.n.c(y31Var.s.getText().toString(), y31Var.w.getText().toString());
                y31Var.f0(true);
                return;
        }
    }
}
