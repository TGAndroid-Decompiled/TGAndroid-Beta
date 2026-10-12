package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;
public final class y1 implements TextWatcher {
    public boolean f9673a;
    public final EditTextBoldCursor f9674b;
    public final int f9675c;
    public final yd0 d;

    public y1(EditTextBoldCursor editTextBoldCursor, int i10, yd0 yd0Var) {
        this.f9674b = editTextBoldCursor;
        this.f9675c = i10;
        this.d = yd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f9674b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f9673a) {
            int length = text.length();
            int i10 = this.f9675c;
            if (length > i10) {
                this.f9673a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f9673a = false;
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
