package ki;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xb0;
public final class o1 implements TextWatcher {
    public boolean f18814a;
    public final EditTextBoldCursor f18815b;
    public final int f18816c;
    public final xb0 d;

    public o1(EditTextBoldCursor editTextBoldCursor, int i7, xb0 xb0Var) {
        this.f18815b = editTextBoldCursor;
        this.f18816c = i7;
        this.d = xb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f18815b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f18814a) {
            int length = text.length();
            int i7 = this.f18816c;
            if (length > i7) {
                this.f18814a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f18814a = false;
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
