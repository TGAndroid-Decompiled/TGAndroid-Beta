package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class e42 implements TextWatcher {
    public final h42 a;

    public e42(h42 h42Var) {
        this.a = h42Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.a.h0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
