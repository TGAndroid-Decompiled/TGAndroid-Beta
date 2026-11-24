package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class fb9 implements TextWatcher {
    public final gb9 a;

    public fb9(gb9 gb9Var) {
        this.a = gb9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        gb9 gb9Var = this.a;
        if (gb9Var.d2 != null) {
            gb9Var.d2 = null;
            gb9Var.a2.i(k96.M0(2131754056, null), true, true);
            l5c l5cVar = gb9Var.U1;
            if (l5cVar != null) {
                l5cVar.O(true);
            }
        }
        gb9Var.Y0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
