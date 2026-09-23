package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class f1 implements TextWatcher {
    public final i1 f11359a;

    public f1(i1 i1Var) {
        this.f11359a = i1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        i1 i1Var = this.f11359a;
        if (!i1Var.h && i1Var.f11415c != null) {
            if (i1Var.E && editable.length() > 0) {
                editable2 = editable;
                g6.o(editable2, 0, editable.length(), 1, true, i1Var.L);
            } else {
                editable2 = editable;
            }
            if (!i1Var.f11420w && !i1Var.f11417n && !i1Var.f11418r) {
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
                    i1Var.f11415c.m(i1Var);
                    return;
                } else {
                    i1Var.f11415c.W(editable2);
                    return;
                }
            }
            i1Var.f11415c.W(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        h1 h1Var;
        i1 i1Var = this.f11359a;
        if (!i1Var.h && (h1Var = i1Var.f11415c) != null) {
            h1Var.j(i11, i12);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        i1 i1Var = this.f11359a;
        boolean z10 = true;
        i1Var.J = true;
        i1Var.q();
        if (i1Var.length() != 0) {
            z10 = false;
        }
        i1Var.setLongClickable(z10);
    }
}
