package hi;

import android.text.Editable;
import android.text.TextWatcher;
public final class h1 implements TextWatcher {
    public final k1 f9632a;

    public h1(k1 k1Var) {
        this.f9632a = k1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        k1 k1Var = this.f9632a;
        if (!k1Var.h && k1Var.f9689c != null) {
            if (k1Var.E && editable.length() > 0) {
                editable2 = editable;
                i6.o(editable2, 0, editable.length(), 1, true, k1Var.L);
            } else {
                editable2 = editable;
            }
            if (!k1Var.f9694w && !k1Var.f9691n && !k1Var.f9692r) {
                k1Var.h = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                k1Var.h = false;
                if (z10) {
                    k1Var.f9689c.x(k1Var);
                    return;
                } else {
                    k1Var.f9689c.G(editable2);
                    return;
                }
            }
            k1Var.f9689c.G(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        j1 j1Var;
        k1 k1Var = this.f9632a;
        if (!k1Var.h && (j1Var = k1Var.f9689c) != null) {
            j1Var.h(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        k1 k1Var = this.f9632a;
        boolean z10 = true;
        k1Var.J = true;
        k1Var.q();
        if (k1Var.length() != 0) {
            z10 = false;
        }
        k1Var.setLongClickable(z10);
    }
}
