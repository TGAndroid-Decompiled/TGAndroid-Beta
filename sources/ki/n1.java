package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
public final class n1 implements TextWatcher {
    public boolean f18790a;
    public final EditTextBoldCursor f18791b;
    public final int f18792c;
    public final yb0 d;

    public n1(EditTextBoldCursor editTextBoldCursor, int i7, yb0 yb0Var) {
        this.f18791b = editTextBoldCursor;
        this.f18792c = i7;
        this.d = yb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18791b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18790a) {
            int length = text.length();
            int i7 = this.f18792c;
            if (length > i7) {
                this.f18790a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18790a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
