package defpackage;

import android.os.Bundle;
public final class jt0 extends nk3 {
    public final p I4;
    public final lt0 J4;

    public jt0(lt0 lt0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.J4 = lt0Var;
        this.I4 = pVar;
    }

    @Override
    public final boolean e3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        lt0 lt0Var = this.J4;
        if (!lt0Var.X1) {
            lt0Var.X1 = true;
            this.I4.a("USER_DECLINED", null);
        }
    }
}
