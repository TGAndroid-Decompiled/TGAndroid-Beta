package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class fd9 implements TextWatcher {
    public final gd9 a;

    public fd9(gd9 gd9Var) {
        this.a = gd9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        gd9 gd9Var = this.a;
        if (gd9Var.d2 != null) {
            gd9Var.d2 = null;
            gd9Var.a2.i(jb6.M0(2131754024, null), true, true);
            l7c l7cVar = gd9Var.U1;
            if (l7cVar != null) {
                l7cVar.O(true);
            }
        }
        gd9Var.Y0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
