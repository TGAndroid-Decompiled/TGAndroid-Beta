package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vb0;
public final class n1 implements TextWatcher {
    public boolean f18893a;
    public final EditTextBoldCursor f18894b;
    public final int f18895c;
    public final vb0 d;

    public n1(EditTextBoldCursor editTextBoldCursor, int i7, vb0 vb0Var) {
        this.f18894b = editTextBoldCursor;
        this.f18895c = i7;
        this.d = vb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18894b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18893a) {
            int length = text.length();
            int i7 = this.f18895c;
            if (length > i7) {
                this.f18893a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18893a = false;
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
