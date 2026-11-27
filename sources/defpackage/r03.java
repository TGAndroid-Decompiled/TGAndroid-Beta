package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class r03 implements TextWatcher {
    public final bv2 a;
    public final p03 b;

    public r03(bv2 bv2Var, p03 p03Var) {
        this.a = bv2Var;
        this.b = p03Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.a.run();
        this.b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
