package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class v08 implements TextWatcher {
    public final int a;
    public final x08 b;

    public v08(x08 x08Var, int i) {
        this.b = x08Var;
        this.a = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        x08 x08Var = this.b;
        if (!x08Var.I && (length = editable.length()) >= 1) {
            int i = this.a;
            if (length > 1) {
                String obj = editable.toString();
                x08Var.I = true;
                for (int i2 = 0; i2 < Math.min(x08Var.P - i, length); i2++) {
                    if (i2 == 0) {
                        editable.replace(0, length, obj.substring(i2, i2 + 1));
                    } else {
                        x08Var.d[i + i2].setText(obj.substring(i2, i2 + 1));
                    }
                }
                x08Var.I = false;
            }
            if (i != x08Var.P - 1) {
                int i3 = i + 1;
                EditTextBoldCursor editTextBoldCursor = x08Var.d[i3];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                x08Var.d[i3].requestFocus();
            }
            int i4 = x08Var.P;
            if (i == i4 - 1 || (i == i4 - 2 && length >= 2)) {
                code = x08Var.getCode();
                if (code.length() == x08Var.P) {
                    x08Var.h(null);
                }
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
