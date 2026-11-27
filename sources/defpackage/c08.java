package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class c08 implements TextWatcher {
    public boolean a;
    public final EditTextBoldCursor b;
    public final String c;
    public final b18 d;

    public c08(b18 b18Var, EditTextBoldCursor editTextBoldCursor, String str) {
        this.d = b18Var;
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
            editTextBoldCursor.setErrorText(ob6.M0(2131747176, null));
        } else {
            this.d.P0(editTextBoldCursor, this.c, editable, false);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
