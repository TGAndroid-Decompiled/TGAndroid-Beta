package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jd0;
public final class z1 implements TextWatcher {
    public boolean f8742a;
    public final EditTextBoldCursor f8743b;
    public final int f8744c;
    public final jd0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, jd0 jd0Var) {
        this.f8743b = editTextBoldCursor;
        this.f8744c = i10;
        this.d = jd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f8743b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f8742a) {
            int length = text.length();
            int i10 = this.f8744c;
            if (length > i10) {
                this.f8742a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f8742a = false;
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
