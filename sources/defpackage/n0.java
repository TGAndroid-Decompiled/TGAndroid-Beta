package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final byte a;
    public final r0 b;

    public n0(r0 r0Var, byte b) {
        this.a = b;
        this.b = r0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        r0 r0Var = this.b;
        switch (b) {
            case 0:
                r0Var.Z0();
                return;
            default:
                r0Var.Z0();
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
