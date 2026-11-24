package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final a1 a;

    public v(a1 a1Var) {
        this.a = a1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        z0 z0Var;
        a1 a1Var = this.a;
        z0 z0Var2 = a1Var.t2;
        if (z0Var2 != null) {
            i = z0Var2.getSelectedTab();
        } else {
            i = 0;
        }
        if (i == 1 && (z0Var = a1Var.u2) != null && (z0Var.getSelectedTone() instanceof t0)) {
            a1Var.a1();
            a1Var.t1();
            a1Var.s1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
