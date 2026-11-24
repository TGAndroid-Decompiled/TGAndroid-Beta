package defpackage;

import android.text.TextWatcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vw7 implements TextWatcher {
    public final byte a;
    public final Object b;
    public String c;
    public final Object d;

    public vw7(xl2 xl2Var) {
        this.a = (byte) 3;
        this.d = xl2Var;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    @Override
    public final void afterTextChanged(android.text.Editable r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw7.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                this.c = charSequence.toString();
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public vw7(vx7 vx7Var, EditTextBoldCursor editTextBoldCursor, String str, byte b) {
        this.a = b;
        this.d = vx7Var;
        this.b = editTextBoldCursor;
        this.c = str;
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

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }
}
