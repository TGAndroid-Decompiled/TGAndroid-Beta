package mi;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class d1 implements TextWatcher {
    public final h1 f19556a;

    public d1(h1 h1Var) {
        this.f19556a = h1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        h1 h1Var = this.f19556a;
        if (!h1Var.f19648d2 && h1Var.Z1 != null) {
            if (h1Var.f19656l2 && editable.length() > 0) {
                editable2 = editable;
                d6.o(editable2, 0, editable.length(), 1, true, h1Var.f19663s2);
            } else {
                editable2 = editable;
            }
            if (!h1Var.f19653i2 && !h1Var.f19649e2 && !h1Var.f19650f2) {
                h1Var.f19648d2 = true;
                boolean z10 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z10 = true;
                    }
                }
                h1Var.f19648d2 = false;
                if (z10) {
                    h1Var.Z1.V0(h1Var);
                    return;
                } else {
                    h1Var.Z1.B1(editable2);
                    return;
                }
            }
            h1Var.Z1.B1(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        g1 g1Var;
        h1 h1Var = this.f19556a;
        if (!h1Var.f19648d2 && (g1Var = h1Var.Z1) != null) {
            g1Var.A(i10, i11);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        h1 h1Var = this.f19556a;
        if (i10 > 0 && i11 == 0) {
            h1Var.f19664t2 = SystemClock.uptimeMillis();
        }
        boolean z10 = true;
        h1Var.f19661q2 = true;
        h1Var.M();
        if (h1Var.length() != 0) {
            z10 = false;
        }
        h1Var.setLongClickable(z10);
    }
}
