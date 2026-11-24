package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class eu8 implements TextWatcher {
    public final byte a;
    public final fu8 b;

    public eu8(fu8 fu8Var, byte b) {
        this.a = b;
        this.b = fu8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        fu8 fu8Var = this.b;
        switch (b) {
            case 0:
                fu8Var.Y(true);
                return;
            case 1:
                if (!fu8Var.L) {
                    EditTextBoldCursor editTextBoldCursor = fu8Var.a[1];
                    int selectionStart = editTextBoldCursor.getSelectionStart();
                    String obj = editTextBoldCursor.getText().toString();
                    StringBuilder sb = new StringBuilder(obj.length());
                    int i = 0;
                    while (i < obj.length()) {
                        int i2 = i + 1;
                        String substring = obj.substring(i, i2);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i = i2;
                    }
                    fu8Var.L = true;
                    int intValue = Utilities.z(sb.toString()).intValue();
                    if (intValue >= 0 && intValue <= 65535 && obj.equals(sb.toString())) {
                        if (selectionStart >= 0) {
                            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                        }
                    } else if (intValue < 0) {
                        editTextBoldCursor.setText("0");
                    } else if (intValue > 65535) {
                        editTextBoldCursor.setText("65535");
                    } else {
                        editTextBoldCursor.setText(sb.toString());
                    }
                    fu8Var.L = false;
                    fu8Var.Y(true);
                    return;
                }
                return;
            default:
                fu8Var.Y(true);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }
}
