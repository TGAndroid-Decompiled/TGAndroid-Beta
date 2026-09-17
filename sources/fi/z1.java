package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
public final class z1 implements TextWatcher {
    public boolean f10156a;
    public final EditTextBoldCursor f10157b;
    public final int f10158c;
    public final zc0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, zc0 zc0Var) {
        this.f10157b = editTextBoldCursor;
        this.f10158c = i10;
        this.d = zc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f10157b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f10156a) {
            int length = text.length();
            int i10 = this.f10158c;
            if (length > i10) {
                this.f10156a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f10156a = false;
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
