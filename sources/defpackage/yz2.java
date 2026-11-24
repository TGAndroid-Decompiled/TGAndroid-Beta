package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class yz2 implements TextWatcher {
    public final gu2 a;
    public final wz2 b;

    public yz2(gu2 gu2Var, wz2 wz2Var) {
        this.a = gu2Var;
        this.b = wz2Var;
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
