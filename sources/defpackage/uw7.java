package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uw7 implements TextWatcher {
    public boolean a;
    public final EditTextBoldCursor b;
    public final String c;
    public final vx7 d;

    public uw7(vx7 vx7Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = vx7Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (this.a) {
            return;
        }
        boolean z = true;
        this.a = true;
        int i = 0;
        while (true) {
            if (i < editable.length()) {
                char charAt = editable.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && !((charAt >= '0' && charAt <= '9') || charAt == '-' || charAt == ' '))) {
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        this.a = false;
        EditTextBoldCursor editTextBoldCursor = this.b;
        if (z) {
            editTextBoldCursor.setErrorText(k96.M0(2131747256, null));
        } else {
            this.d.O0(editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
