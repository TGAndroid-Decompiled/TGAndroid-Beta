package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jc4 implements TextWatcher {
    public final byte a;
    public boolean b;
    public final EditTextBoldCursor c;

    public jc4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.c = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        switch (b) {
            case 0:
                if (!this.b && editable.length() > 32) {
                    this.b = true;
                    editable.delete(32, editable.length());
                    gl.A3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.b = false;
                    return;
                }
                return;
            default:
                if (!this.b && editable.length() > 40) {
                    this.b = true;
                    editable.delete(40, editable.length());
                    gl.A3(editTextBoldCursor);
                    try {
                        editTextBoldCursor.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    this.b = false;
                    return;
                }
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
}
