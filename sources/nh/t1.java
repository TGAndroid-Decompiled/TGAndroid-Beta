package nh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jc0;

public final class t1 implements TextWatcher {

    public boolean f18969a;

    public final EditTextBoldCursor f18970b;

    public final int f18971c;
    public final jc0 d;

    public t1(EditTextBoldCursor editTextBoldCursor, int i10, jc0 jc0Var) {
        this.f18970b = editTextBoldCursor;
        this.f18971c = i10;
        this.d = jc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18970b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18969a) {
            int length = text.length();
            int i10 = this.f18971c;
            if (length > i10) {
                this.f18969a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18969a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
