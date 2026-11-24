package defpackage;

import android.view.View;
public final class e04 implements View.OnFocusChangeListener {
    public final e34 a;

    public e04(e34 e34Var) {
        this.a = e34Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = gm.F0();
            e34 e34Var = this.a;
            e34Var.X0 = F0;
            hs6.d0(e34Var.d1).O(e34Var.X0, false);
        }
    }
}
