package li;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class c1 implements TextWatcher {
    public final g1 f18496a;

    public c1(g1 g1Var) {
        this.f18496a = g1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        g1 g1Var = this.f18496a;
        if (!g1Var.f18583c2 && g1Var.Y1 != null) {
            if (g1Var.f18590k2 && editable.length() > 0) {
                editable2 = editable;
                c6.o(editable2, 0, editable.length(), 1, true, g1Var.f18597r2);
            } else {
                editable2 = editable;
            }
            if (!g1Var.f18587h2 && !g1Var.d2 && !g1Var.f18584e2) {
                g1Var.f18583c2 = true;
                boolean z9 = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z9 = true;
                    }
                }
                g1Var.f18583c2 = false;
                if (z9) {
                    g1Var.Y1.F(g1Var);
                    return;
                } else {
                    g1Var.Y1.f1(editable2);
                    return;
                }
            }
            g1Var.Y1.f1(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        f1 f1Var;
        g1 g1Var = this.f18496a;
        if (!g1Var.f18583c2 && (f1Var = g1Var.Y1) != null) {
            f1Var.w(i10, i11);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        g1 g1Var = this.f18496a;
        if (i10 > 0 && i11 == 0) {
            g1Var.f18598s2 = SystemClock.uptimeMillis();
        }
        boolean z9 = true;
        g1Var.f18595p2 = true;
        g1Var.M();
        if (g1Var.length() != 0) {
            z9 = false;
        }
        g1Var.setLongClickable(z9);
    }
}
