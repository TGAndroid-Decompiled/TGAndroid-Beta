package oi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class a1 implements TextWatcher {
    public final e1 f21923a;

    public a1(e1 e1Var) {
        this.f21923a = e1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        e1 e1Var = this.f21923a;
        if (!e1Var.f22040i2 && e1Var.f22036e2 != null) {
            if (e1Var.f22048q2 && editable.length() > 0) {
                editable2 = editable;
                b6.o(editable2, 0, editable.length(), 1, true, e1Var.f22055x2);
            } else {
                editable2 = editable;
            }
            if (!e1Var.f22045n2 && !e1Var.f22041j2 && !e1Var.f22042k2) {
                e1Var.f22040i2 = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                e1Var.f22040i2 = false;
                if (z10) {
                    e1Var.f22036e2.x0(e1Var);
                    return;
                } else {
                    e1Var.f22036e2.s1(editable2);
                    return;
                }
            }
            e1Var.f22036e2.s1(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        d1 d1Var;
        e1 e1Var = this.f21923a;
        if (!e1Var.f22040i2 && (d1Var = e1Var.f22036e2) != null) {
            d1Var.A(i10, i11);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        e1 e1Var = this.f21923a;
        if (i10 > 0 && i11 == 0) {
            e1Var.f22056y2 = SystemClock.uptimeMillis();
        }
        boolean z10 = true;
        e1Var.f22053v2 = true;
        e1Var.N();
        if (e1Var.length() != 0) {
            z10 = false;
        }
        e1Var.setLongClickable(z10);
    }
}
