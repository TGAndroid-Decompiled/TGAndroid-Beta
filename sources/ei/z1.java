package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.de0;
public final class z1 implements TextWatcher {
    public boolean f9515a;
    public final EditTextBoldCursor f9516b;
    public final int f9517c;
    public final de0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, de0 de0Var) {
        this.f9516b = editTextBoldCursor;
        this.f9517c = i10;
        this.d = de0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f9516b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f9515a) {
            int length = text.length();
            int i10 = this.f9517c;
            if (length > i10) {
                this.f9515a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f9515a = false;
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
