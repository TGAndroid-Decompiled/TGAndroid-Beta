package defpackage;

import android.view.View;
public final class pz3 implements View.OnFocusChangeListener {
    public final o24 a;

    public pz3(o24 o24Var) {
        this.a = o24Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = hl.F0();
            o24 o24Var = this.a;
            o24Var.X0 = F0;
            ls6.d0(o24Var.d1).O(o24Var.X0, false);
        }
    }
}
