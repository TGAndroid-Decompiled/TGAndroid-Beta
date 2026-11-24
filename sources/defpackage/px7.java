package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class px7 implements TextWatcher {
    public final int a;
    public final rx7 b;

    public px7(rx7 rx7Var, int i) {
        this.b = rx7Var;
        this.a = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        String code;
        rx7 rx7Var = this.b;
        if (!rx7Var.I && (length = editable.length()) >= 1) {
            int i = this.a;
            if (length > 1) {
                String obj = editable.toString();
                rx7Var.I = true;
                for (int i2 = 0; i2 < Math.min(rx7Var.P - i, length); i2++) {
                    if (i2 == 0) {
                        editable.replace(0, length, obj.substring(i2, i2 + 1));
                    } else {
                        rx7Var.d[i + i2].setText(obj.substring(i2, i2 + 1));
                    }
                }
                rx7Var.I = false;
            }
            if (i != rx7Var.P - 1) {
                int i3 = i + 1;
                EditTextBoldCursor editTextBoldCursor = rx7Var.d[i3];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                rx7Var.d[i3].requestFocus();
            }
            int i4 = rx7Var.P;
            if (i == i4 - 1 || (i == i4 - 2 && length >= 2)) {
                code = rx7Var.getCode();
                if (code.length() == rx7Var.P) {
                    rx7Var.h(null);
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
