package defpackage;

import android.os.Bundle;
public final class hh1 extends yv1 {
    public final my0 Gd;

    public hh1(Bundle bundle, my0 my0Var) {
        super(bundle);
        this.Gd = my0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        my0 my0Var = this.Gd;
        my0Var.X(null);
        my0Var.show();
    }
}
