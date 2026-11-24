package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class o56 implements TextWatcher {
    public final byte a;
    public final s56 b;

    public o56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 0:
                if (!s56Var.O) {
                    if (editable.toString().equals("0")) {
                        s56Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            s56Var.c0();
                            return;
                        } else {
                            s56Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        s56Var.c0();
                        return;
                    }
                }
                return;
            default:
                gw3.l(editable, s56Var.L.getPaint().getFontMetricsInt(), false);
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
