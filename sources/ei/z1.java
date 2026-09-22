package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kd0;
public final class z1 implements TextWatcher {
    public boolean f8759a;
    public final EditTextBoldCursor f8760b;
    public final int f8761c;
    public final kd0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, kd0 kd0Var) {
        this.f8760b = editTextBoldCursor;
        this.f8761c = i10;
        this.d = kd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f8760b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f8759a) {
            int length = text.length();
            int i10 = this.f8761c;
            if (length > i10) {
                this.f8759a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f8759a = false;
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
