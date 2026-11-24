package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.NumberTextView;
public final class wi implements TextWatcher {
    public final short a;
    public final NumberTextView b;

    public wi(int i, NumberTextView numberTextView) {
        this.a = i;
        this.b = numberTextView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z = false;
        int codePointCount = this.a - Character.codePointCount(editable, 0, editable.length());
        NumberTextView numberTextView = this.b;
        if (codePointCount < 30) {
            if (numberTextView.getVisibility() == 0) {
                z = true;
            }
            numberTextView.a(codePointCount, z);
            gm.R3(numberTextView, true);
            return;
        }
        gm.R3(numberTextView, false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
