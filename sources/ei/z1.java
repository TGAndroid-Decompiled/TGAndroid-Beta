package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ae0;
public final class z1 implements TextWatcher {
    public boolean f9517a;
    public final EditTextBoldCursor f9518b;
    public final int f9519c;
    public final ae0 d;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, ae0 ae0Var) {
        this.f9518b = editTextBoldCursor;
        this.f9519c = i10;
        this.d = ae0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f9518b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f9517a) {
            int length = text.length();
            int i10 = this.f9519c;
            if (length > i10) {
                this.f9517a = true;
                text = text.subSequence(0, i10);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f9517a = false;
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
