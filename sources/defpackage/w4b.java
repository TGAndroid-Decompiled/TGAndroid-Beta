package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.NumberTextView;
public final class w4b implements TextWatcher {
    public final NumberTextView a;
    public final v4b b;

    public w4b(NumberTextView numberTextView, v4b v4bVar) {
        this.a = numberTextView;
        this.b = v4bVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.a.a(50 - Character.codePointCount(editable, 0, editable.length()), true);
        this.b.setErrorText(null);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
