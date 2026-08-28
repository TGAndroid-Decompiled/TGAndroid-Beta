package mh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;
public final class u1 implements TextWatcher {
    public boolean f18154a;
    public final EditTextBoldCursor f18155b;
    public final int f18156c;
    public final fc0 d;

    public u1(EditTextBoldCursor editTextBoldCursor, int i9, fc0 fc0Var) {
        this.f18155b = editTextBoldCursor;
        this.f18156c = i9;
        this.d = fc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18155b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18154a) {
            int length = text.length();
            int i9 = this.f18156c;
            if (length > i9) {
                this.f18154a = true;
                text = text.subSequence(0, i9);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18154a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
