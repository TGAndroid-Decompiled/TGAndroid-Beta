package hi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mb0;
public final class r1 implements TextWatcher {
    public boolean f14925a;
    public final EditTextBoldCursor f14926b;
    public final int f14927c;
    public final mb0 d;

    public r1(EditTextBoldCursor editTextBoldCursor, int i7, mb0 mb0Var) {
        this.f14926b = editTextBoldCursor;
        this.f14927c = i7;
        this.d = mb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f14926b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f14925a) {
            int length = text.length();
            int i7 = this.f14927c;
            if (length > i7) {
                this.f14925a = true;
                text = text.subSequence(0, i7);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f14925a = false;
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
