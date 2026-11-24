package defpackage;

import android.view.View;
public final class uy3 implements View.OnFocusChangeListener {
    public final t14 a;

    public uy3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            String[] F0 = gl.F0();
            t14 t14Var = this.a;
            t14Var.X0 = F0;
            hq6.d0(t14Var.d1).O(t14Var.X0, false);
        }
    }
}
