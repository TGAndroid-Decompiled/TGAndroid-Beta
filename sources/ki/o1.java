package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
public final class o1 implements TextWatcher {
    public boolean f18811a;
    public final EditTextBoldCursor f18812b;
    public final int f18813c;
    public final xb0 d;

    public o1(EditTextBoldCursor editTextBoldCursor, int i7, xb0 xb0Var) {
        this.f18812b = editTextBoldCursor;
        this.f18813c = i7;
        this.d = xb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18812b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18811a) {
            int length = text.length();
            int i7 = this.f18813c;
            if (length > i7) {
                this.f18811a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18811a = false;
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
