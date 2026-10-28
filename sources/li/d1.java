package li;

import android.text.Editable;
import android.text.TextWatcher;
public final class d1 implements TextWatcher {
    public final g1 f17180a;

    public d1(g1 g1Var) {
        this.f17180a = g1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        g1 g1Var = this.f17180a;
        if (!g1Var.h && g1Var.f17247c != null) {
            if (g1Var.E && editable.length() > 0) {
                editable2 = editable;
                f6.o(editable2, 0, editable.length(), 1, true, g1Var.L);
            } else {
                editable2 = editable;
            }
            if (!g1Var.f17252w && !g1Var.f17249n && !g1Var.f17250r) {
                g1Var.h = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                g1Var.h = false;
                if (z10) {
                    g1Var.f17247c.t(g1Var);
                    return;
                } else {
                    g1Var.f17247c.Y(editable2);
                    return;
                }
            }
            g1Var.f17247c.Y(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        f1 f1Var;
        g1 g1Var = this.f17180a;
        if (!g1Var.h && (f1Var = g1Var.f17247c) != null) {
            f1Var.k(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g1 g1Var = this.f17180a;
        boolean z10 = true;
        g1Var.J = true;
        g1Var.q();
        if (g1Var.length() != 0) {
            z10 = false;
        }
        g1Var.setLongClickable(z10);
    }
}
