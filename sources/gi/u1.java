package gi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vd0;
public final class u1 implements TextWatcher {
    public boolean f11524a;
    public final EditTextBoldCursor f11525b;
    public final int f11526c;
    public final vd0 d;

    public u1(EditTextBoldCursor editTextBoldCursor, int i10, vd0 vd0Var) {
        this.f11525b = editTextBoldCursor;
        this.f11526c = i10;
        this.d = vd0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f11525b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f11524a) {
            int length = text.length();
            int i10 = this.f11526c;
            if (length > i10) {
                this.f11524a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f11524a = false;
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
