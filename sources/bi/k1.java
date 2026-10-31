package bi;

import android.text.Editable;
import android.text.TextWatcher;
public final class k1 implements TextWatcher {
    public final n1 f3133a;

    public k1(n1 n1Var) {
        this.f3133a = n1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        n1 n1Var = this.f3133a;
        if (!n1Var.f3218c2 && n1Var.Y1 != null) {
            if (n1Var.f3226k2 && editable.length() > 0) {
                editable2 = editable;
                s6.o(editable2, 0, editable.length(), 1, true, n1Var.f3233r2);
            } else {
                editable2 = editable;
            }
            if (!n1Var.f3223h2 && !n1Var.f3219d2 && !n1Var.f3220e2) {
                n1Var.f3218c2 = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                n1Var.f3218c2 = false;
                if (z10) {
                    n1Var.Y1.e(n1Var);
                    return;
                } else {
                    n1Var.Y1.B(editable2);
                    return;
                }
            }
            n1Var.Y1.B(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m1 m1Var;
        n1 n1Var = this.f3133a;
        if (!n1Var.f3218c2 && (m1Var = n1Var.Y1) != null) {
            m1Var.h(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        n1 n1Var = this.f3133a;
        boolean z10 = true;
        n1Var.f3231p2 = true;
        n1Var.M();
        if (n1Var.length() != 0) {
            z10 = false;
        }
        n1Var.setLongClickable(z10);
    }
}
