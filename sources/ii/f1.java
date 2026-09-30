package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class f1 implements TextWatcher {
    public final i1 f11373a;

    public f1(i1 i1Var) {
        this.f11373a = i1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        i1 i1Var = this.f11373a;
        if (!i1Var.h && i1Var.f11429c != null) {
            if (i1Var.E && editable.length() > 0) {
                editable2 = editable;
                g6.o(editable2, 0, editable.length(), 1, true, i1Var.L);
            } else {
                editable2 = editable;
            }
            if (!i1Var.f11434w && !i1Var.f11431n && !i1Var.f11432r) {
                i1Var.h = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                i1Var.h = false;
                if (z10) {
                    i1Var.f11429c.m(i1Var);
                    return;
                } else {
                    i1Var.f11429c.U(editable2);
                    return;
                }
            }
            i1Var.f11429c.U(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        h1 h1Var;
        i1 i1Var = this.f11373a;
        if (!i1Var.h && (h1Var = i1Var.f11429c) != null) {
            h1Var.j(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        i1 i1Var = this.f11373a;
        boolean z10 = true;
        i1Var.J = true;
        i1Var.q();
        if (i1Var.length() != 0) {
            z10 = false;
        }
        i1Var.setLongClickable(z10);
    }
}
