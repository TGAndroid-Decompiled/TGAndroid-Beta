package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class te9 implements TextWatcher {
    public final ue9 a;

    public te9(ue9 ue9Var) {
        this.a = ue9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ue9 ue9Var = this.a;
        if (ue9Var.d2 != null) {
            ue9Var.d2 = null;
            ue9Var.a2.i(ob6.M0(2131754052, null), true, true);
            l9c l9cVar = ue9Var.U1;
            if (l9cVar != null) {
                l9cVar.O(true);
            }
        }
        ue9Var.Z0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
