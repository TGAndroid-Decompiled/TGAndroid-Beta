package hi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lb0;
public final class r1 implements TextWatcher {
    public boolean f14922a;
    public final EditTextBoldCursor f14923b;
    public final int f14924c;
    public final lb0 d;

    public r1(EditTextBoldCursor editTextBoldCursor, int i7, lb0 lb0Var) {
        this.f14923b = editTextBoldCursor;
        this.f14924c = i7;
        this.d = lb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f14923b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f14922a) {
            int length = text.length();
            int i7 = this.f14924c;
            if (length > i7) {
                this.f14922a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f14922a = false;
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
