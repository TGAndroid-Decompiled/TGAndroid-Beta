package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ut0 implements TextWatcher {
    public boolean a;
    public final EditTextBoldCursor b;
    public final int c;
    public final lu7 d;

    public ut0(EditTextBoldCursor editTextBoldCursor, int i, lu7 lu7Var) {
        this.b = editTextBoldCursor;
        this.c = i;
        this.d = lu7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.a) {
            int length = text.length();
            int i = this.c;
            if (length > i) {
                this.a = true;
                text = text.subSequence(0, i);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
