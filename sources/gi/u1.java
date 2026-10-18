package gi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
public final class u1 implements TextWatcher {
    public boolean f11501a;
    public final EditTextBoldCursor f11502b;
    public final int f11503c;
    public final sd0 d;

    public u1(EditTextBoldCursor editTextBoldCursor, int i10, sd0 sd0Var) {
        this.f11502b = editTextBoldCursor;
        this.f11503c = i10;
        this.d = sd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f11502b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f11501a) {
            int length = text.length();
            int i10 = this.f11503c;
            if (length > i10) {
                this.f11501a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f11501a = false;
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
