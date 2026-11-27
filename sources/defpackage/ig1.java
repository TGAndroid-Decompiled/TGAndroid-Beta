package defpackage;

import android.os.Bundle;
public final class ig1 extends zu1 {
    public final nx0 Jd;

    public ig1(Bundle bundle, nx0 nx0Var) {
        super(bundle);
        this.Jd = nx0Var;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nx0 nx0Var = this.Jd;
        nx0Var.X(null);
        nx0Var.show();
    }
}
