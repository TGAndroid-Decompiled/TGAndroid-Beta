package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
public final class z1 implements TextWatcher {
    public boolean f8755a;
    public final EditTextBoldCursor f8756b;
    public final int f8757c;
    public final yc0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, yc0 yc0Var) {
        this.f8756b = editTextBoldCursor;
        this.f8757c = i10;
        this.d = yc0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f8756b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f8755a) {
            int length = text.length();
            int i10 = this.f8757c;
            if (length > i10) {
                this.f8755a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f8755a = false;
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
