package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class r56 implements TextWatcher {
    public final byte a;
    public final v56 b;

    public r56(v56 v56Var, byte b) {
        this.a = b;
        this.b = v56Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        v56 v56Var = this.b;
        switch (b) {
            case 0:
                if (!v56Var.O) {
                    if (editable.toString().equals("0")) {
                        v56Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            v56Var.b0();
                            return;
                        } else {
                            v56Var.a0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        v56Var.b0();
                        return;
                    }
                }
                return;
            default:
                pv3.l(editable, v56Var.L.getPaint().getFontMetricsInt(), false);
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
