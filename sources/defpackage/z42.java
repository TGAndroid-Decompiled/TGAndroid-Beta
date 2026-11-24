package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class z42 implements TextWatcher {
    public final c52 a;

    public z42(c52 c52Var) {
        this.a = c52Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.a.i0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
