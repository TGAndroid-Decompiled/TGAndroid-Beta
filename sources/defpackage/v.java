package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final b1 a;

    public v(b1 b1Var) {
        this.a = b1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        a1 a1Var;
        b1 b1Var = this.a;
        a1 a1Var2 = b1Var.t2;
        if (a1Var2 != null) {
            i = a1Var2.getSelectedTab();
        } else {
            i = 0;
        }
        if (i == 1 && (a1Var = b1Var.u2) != null && (a1Var.getSelectedTone() instanceof u0)) {
            b1Var.b1();
            b1Var.v1();
            b1Var.u1(true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
