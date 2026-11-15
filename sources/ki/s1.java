package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
public final class s1 implements TextWatcher {
    public boolean f18543a;
    public final EditTextBoldCursor f18544b;
    public final int f18545c;
    public final mb0 d;

    public s1(EditTextBoldCursor editTextBoldCursor, int i7, mb0 mb0Var) {
        this.f18544b = editTextBoldCursor;
        this.f18545c = i7;
        this.d = mb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18544b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18543a) {
            int length = text.length();
            int i7 = this.f18545c;
            if (length > i7) {
                this.f18543a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18543a = false;
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
