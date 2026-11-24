package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class j13 implements TextWatcher {
    public final mv2 a;
    public final h13 b;

    public j13(mv2 mv2Var, h13 h13Var) {
        this.a = mv2Var;
        this.b = h13Var;
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
