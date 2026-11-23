package oi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class b1 implements TextWatcher {
    public final f1 f22052a;

    public b1(f1 f1Var) {
        this.f22052a = f1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        f1 f1Var = this.f22052a;
        if (!f1Var.f22170i2 && f1Var.f22166e2 != null) {
            if (f1Var.f22178q2 && editable.length() > 0) {
                editable2 = editable;
                c6.o(editable2, 0, editable.length(), 1, true, f1Var.f22185x2);
            } else {
                editable2 = editable;
            }
            if (!f1Var.f22175n2 && !f1Var.f22171j2 && !f1Var.f22172k2) {
                f1Var.f22170i2 = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                f1Var.f22170i2 = false;
                if (z10) {
                    f1Var.f22166e2.A(f1Var);
                    return;
                } else {
                    f1Var.f22166e2.g0(editable2);
                    return;
                }
            }
            f1Var.f22166e2.g0(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e1 e1Var;
        f1 f1Var = this.f22052a;
        if (!f1Var.f22170i2 && (e1Var = f1Var.f22166e2) != null) {
            e1Var.m(i10, i11);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        f1 f1Var = this.f22052a;
        if (i10 > 0 && i11 == 0) {
            f1Var.f22186y2 = SystemClock.uptimeMillis();
        }
        boolean z10 = true;
        f1Var.f22183v2 = true;
        f1Var.N();
        if (f1Var.length() != 0) {
            z10 = false;
        }
        f1Var.setLongClickable(z10);
    }
}
