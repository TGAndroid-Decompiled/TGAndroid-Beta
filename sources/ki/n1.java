package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yb0;
public final class n1 implements TextWatcher {
    public boolean f18824a;
    public final EditTextBoldCursor f18825b;
    public final int f18826c;
    public final yb0 d;

    public n1(EditTextBoldCursor editTextBoldCursor, int i7, yb0 yb0Var) {
        this.f18825b = editTextBoldCursor;
        this.f18826c = i7;
        this.d = yb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18825b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18824a) {
            int length = text.length();
            int i7 = this.f18826c;
            if (length > i7) {
                this.f18824a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18824a = false;
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
