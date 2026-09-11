package fi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.zc0;
public final class z1 implements TextWatcher {
    public boolean f10128a;
    public final EditTextBoldCursor f10129b;
    public final int f10130c;
    public final zc0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, zc0 zc0Var) {
        this.f10129b = editTextBoldCursor;
        this.f10130c = i10;
        this.d = zc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f10129b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f10128a) {
            int length = text.length();
            int i10 = this.f10130c;
            if (length > i10) {
                this.f10128a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f10128a = false;
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
