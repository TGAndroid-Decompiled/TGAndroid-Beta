package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.md0;
public final class z1 implements TextWatcher {
    public boolean f8754a;
    public final EditTextBoldCursor f8755b;
    public final int f8756c;
    public final md0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, md0 md0Var) {
        this.f8755b = editTextBoldCursor;
        this.f8756c = i10;
        this.d = md0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f8755b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f8754a) {
            int length = text.length();
            int i10 = this.f8756c;
            if (length > i10) {
                this.f8754a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f8754a = false;
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
