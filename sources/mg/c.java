package mg;

import android.view.View;
import org.telegram.ui.ActionBar.z2;
public final class c implements org.telegram.ui.ActionBar.u1, r0.m {
    public final z2 f13080a;

    public c(z2 z2Var) {
        this.f13080a = z2Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.f13080a.b0(j1Var);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f13080a.dismiss();
        i2.l1(0, null);
    }
}
