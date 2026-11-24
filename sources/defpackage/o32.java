package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class o32 implements TextWatcher {
    public final r32 a;

    public o32(r32 r32Var) {
        this.a = r32Var;
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
