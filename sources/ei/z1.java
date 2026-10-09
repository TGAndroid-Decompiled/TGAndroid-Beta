package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zd0;
public final class z1 implements TextWatcher {
    public boolean f9518a;
    public final EditTextBoldCursor f9519b;
    public final int f9520c;
    public final zd0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, zd0 zd0Var) {
        this.f9519b = editTextBoldCursor;
        this.f9520c = i10;
        this.d = zd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f9519b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f9518a) {
            int length = text.length();
            int i10 = this.f9520c;
            if (length > i10) {
                this.f9518a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f9518a = false;
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
