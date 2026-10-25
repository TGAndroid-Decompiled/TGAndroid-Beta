package hi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rd0;
public final class b2 implements TextWatcher {
    public boolean f12889a;
    public final EditTextBoldCursor f12890b;
    public final int f12891c;
    public final rd0 d;

    public b2(EditTextBoldCursor editTextBoldCursor, int i10, rd0 rd0Var) {
        this.f12890b = editTextBoldCursor;
        this.f12891c = i10;
        this.d = rd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f12890b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f12889a) {
            int length = text.length();
            int i10 = this.f12891c;
            if (length > i10) {
                this.f12889a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f12889a = false;
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
