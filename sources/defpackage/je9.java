package defpackage;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
public final class je9 implements TextWatcher {
    public final ne9 a;

    public je9(ne9 ne9Var) {
        this.a = ne9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Editable editable2;
        ne9 ne9Var = this.a;
        if (!ne9Var.i2 && ne9Var.e2 != null) {
            if (ne9Var.q2 && editable.length() > 0) {
                editable2 = editable;
                zk9.o(editable2, 0, editable.length(), 1, true, ne9Var.x2);
            } else {
                editable2 = editable;
            }
            if (!ne9Var.n2 && !ne9Var.j2 && !ne9Var.k2) {
                ne9Var.i2 = true;
                boolean z = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z = true;
                    }
                }
                ne9Var.i2 = false;
                me9 me9Var = ne9Var.e2;
                if (z) {
                    me9Var.W(ne9Var);
                    return;
                } else {
                    me9Var.S(editable2);
                    return;
                }
            }
            ne9Var.e2.S(editable2);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        me9 me9Var;
        ne9 ne9Var = this.a;
        if (!ne9Var.i2 && (me9Var = ne9Var.e2) != null) {
            me9Var.k(i2, i3);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ne9 ne9Var = this.a;
        if (i2 > 0 && i3 == 0) {
            ne9Var.y2 = SystemClock.uptimeMillis();
        }
        boolean z = true;
        ne9Var.v2 = true;
        ne9Var.N();
        if (ne9Var.length() != 0) {
            z = false;
        }
        ne9Var.setLongClickable(z);
    }
}
