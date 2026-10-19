package gi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.sd0;
public final class u1 implements TextWatcher {
    public boolean f11498a;
    public final EditTextBoldCursor f11499b;
    public final int f11500c;
    public final sd0 d;

    public u1(EditTextBoldCursor editTextBoldCursor, int i10, sd0 sd0Var) {
        this.f11499b = editTextBoldCursor;
        this.f11500c = i10;
        this.d = sd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f11499b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f11498a) {
            int length = text.length();
            int i10 = this.f11500c;
            if (length > i10) {
                this.f11498a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f11498a = false;
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
