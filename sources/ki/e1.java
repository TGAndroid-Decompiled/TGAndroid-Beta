package ki;

import android.text.Editable;
import android.text.TextWatcher;
public final class e1 implements TextWatcher {
    public final h1 f15243a;

    public e1(h1 h1Var) {
        this.f15243a = h1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        h1 h1Var = this.f15243a;
        if (!h1Var.h && h1Var.f15301c != null) {
            if (h1Var.E && editable.length() > 0) {
                editable2 = editable;
                e6.o(editable2, 0, editable.length(), 1, true, h1Var.L);
            } else {
                editable2 = editable;
            }
            if (!h1Var.f15306w && !h1Var.f15303n && !h1Var.f15304r) {
                h1Var.h = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                h1Var.h = false;
                if (z10) {
                    h1Var.f15301c.k(h1Var);
                    return;
                } else {
                    h1Var.f15301c.G(editable2);
                    return;
                }
            }
            h1Var.f15301c.G(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        g1 g1Var;
        h1 h1Var = this.f15243a;
        if (!h1Var.h && (g1Var = h1Var.f15301c) != null) {
            g1Var.f(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        h1 h1Var = this.f15243a;
        boolean z10 = true;
        h1Var.J = true;
        h1Var.q();
        if (h1Var.length() != 0) {
            z10 = false;
        }
        h1Var.setLongClickable(z10);
    }
}
