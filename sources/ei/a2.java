package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ld0;
public final class a2 implements TextWatcher {
    public boolean f8911a;
    public final EditTextBoldCursor f8912b;
    public final int f8913c;
    public final ld0 d;

    public a2(EditTextBoldCursor editTextBoldCursor, int i10, ld0 ld0Var) {
        this.f8912b = editTextBoldCursor;
        this.f8913c = i10;
        this.d = ld0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f8912b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f8911a) {
            int length = text.length();
            int i10 = this.f8913c;
            if (length > i10) {
                this.f8911a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f8911a = false;
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
