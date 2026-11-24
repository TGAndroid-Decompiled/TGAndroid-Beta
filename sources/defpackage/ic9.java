package defpackage;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class ic9 implements TextWatcher {
    public final mc9 a;

    public ic9(mc9 mc9Var) {
        this.a = mc9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        mc9 mc9Var = this.a;
        if (!mc9Var.i2 && mc9Var.e2 != null) {
            if (mc9Var.q2 && editable.length() > 0) {
                editable2 = editable;
                yi9.o(editable2, 0, editable.length(), 1, true, mc9Var.x2);
            } else {
                editable2 = editable;
            }
            if (!mc9Var.n2 && !mc9Var.j2 && !mc9Var.k2) {
                mc9Var.i2 = true;
                boolean z = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z = true;
                    }
                }
                mc9Var.i2 = false;
                lc9 lc9Var = mc9Var.e2;
                if (z) {
                    lc9Var.Y(mc9Var);
                    return;
                } else {
                    lc9Var.U(editable2);
                    return;
                }
            }
            mc9Var.e2.U(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        lc9 lc9Var;
        mc9 mc9Var = this.a;
        if (!mc9Var.i2 && (lc9Var = mc9Var.e2) != null) {
            lc9Var.l(i2, i3);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mc9 mc9Var = this.a;
        if (i2 > 0 && i3 == 0) {
            mc9Var.y2 = SystemClock.uptimeMillis();
        }
        boolean z = true;
        mc9Var.v2 = true;
        mc9Var.N();
        if (mc9Var.length() != 0) {
            z = false;
        }
        mc9Var.setLongClickable(z);
    }
}
