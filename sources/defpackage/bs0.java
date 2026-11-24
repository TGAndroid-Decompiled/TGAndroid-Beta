package defpackage;

import android.os.Bundle;
public final class bs0 extends cj3 {
    public final p G4;
    public final ds0 H4;

    public bs0(ds0 ds0Var, Bundle bundle, p pVar) {
        super(bundle);
        this.H4 = ds0Var;
        this.G4 = pVar;
    }

    @Override
    public final boolean c3() {
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        ds0 ds0Var = this.H4;
        if (!ds0Var.X1) {
            ds0Var.X1 = true;
            this.G4.a("USER_DECLINED", null);
        }
    }
}
