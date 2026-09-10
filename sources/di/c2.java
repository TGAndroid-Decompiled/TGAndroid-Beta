package di;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hd0;
public final class c2 implements TextWatcher {
    public boolean f6557a;
    public final EditTextBoldCursor f6558b;
    public final int f6559c;
    public final hd0 d;

    public c2(EditTextBoldCursor editTextBoldCursor, int i10, hd0 hd0Var) {
        this.f6558b = editTextBoldCursor;
        this.f6559c = i10;
        this.d = hd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f6558b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f6557a) {
            int length = text.length();
            int i10 = this.f6559c;
            if (length > i10) {
                this.f6557a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f6557a = false;
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
