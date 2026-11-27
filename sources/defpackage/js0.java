package defpackage;

import android.os.Bundle;
public final class js0 extends uj3 {
    public final p I4;
    public final ls0 J4;

    public js0(ls0 ls0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.J4 = ls0Var;
        this.I4 = pVar;
    }

    @Override
    public final boolean e3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ls0 ls0Var = this.J4;
        if (!ls0Var.X1) {
            ls0Var.X1 = true;
            this.I4.a("USER_DECLINED", null);
        }
    }
}
