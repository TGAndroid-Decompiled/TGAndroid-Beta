package defpackage;

import android.os.Bundle;
public final class zf1 extends mu1 {
    public final fx0 vd;

    public zf1(Bundle bundle, fx0 fx0Var) {
        super(bundle);
        this.vd = fx0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fx0 fx0Var = this.vd;
        fx0Var.X(null);
        fx0Var.show();
    }
}
