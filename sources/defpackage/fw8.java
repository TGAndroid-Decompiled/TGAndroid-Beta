package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fw8 implements TextWatcher {
    public final byte a;
    public final gw8 b;

    public fw8(gw8 gw8Var, byte b) {
        this.a = b;
        this.b = gw8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        gw8 gw8Var = this.b;
        switch (b) {
            case 0:
                gw8Var.Z(true);
                return;
            case 1:
                if (!gw8Var.L) {
                    EditTextBoldCursor editTextBoldCursor = gw8Var.a[1];
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
                    gw8Var.L = true;
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
                    gw8Var.L = false;
                    gw8Var.Z(true);
                    return;
                }
                return;
            default:
                gw8Var.Z(true);
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
