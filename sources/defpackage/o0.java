package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class o0 implements TextWatcher {
    public final byte a;
    public final s0 b;

    public o0(s0 s0Var, byte b) {
        this.a = b;
        this.b = s0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        s0 s0Var = this.b;
        switch (b) {
            case 0:
                s0Var.a1();
                return;
            default:
                s0Var.a1();
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
