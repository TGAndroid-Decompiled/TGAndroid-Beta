package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class o36 implements TextWatcher {
    public final byte a;
    public final s36 b;

    public o36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                if (!s36Var.O) {
                    if (editable.toString().equals("0")) {
                        s36Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            s36Var.b0();
                            return;
                        } else {
                            s36Var.a0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        s36Var.b0();
                        return;
                    }
                }
                return;
            default:
                vu3.l(editable, s36Var.L.getPaint().getFontMetricsInt(), false);
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
