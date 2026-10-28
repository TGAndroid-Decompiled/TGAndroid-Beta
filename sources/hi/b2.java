package hi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
public final class b2 implements TextWatcher {
    public boolean f12888a;
    public final EditTextBoldCursor f12889b;
    public final int f12890c;
    public final sd0 d;

    public b2(EditTextBoldCursor editTextBoldCursor, int i10, sd0 sd0Var) {
        this.f12889b = editTextBoldCursor;
        this.f12890c = i10;
        this.d = sd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f12889b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f12888a) {
            int length = text.length();
            int i10 = this.f12890c;
            if (length > i10) {
                this.f12888a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f12888a = false;
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
