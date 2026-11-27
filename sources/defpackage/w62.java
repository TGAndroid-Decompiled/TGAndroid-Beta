package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class w62 implements TextWatcher {
    public final v62 a;
    public final int b;
    public final t20 c;

    public w62(t20 t20Var, v62 v62Var, int i) {
        this.c = t20Var;
        this.a = v62Var;
        this.b = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        a72 a72Var = (a72) this.c.e;
        v62 v62Var = this.a;
        if (v62Var.getTag() != null) {
            return;
        }
        int i2 = this.b;
        if (i2 == 11) {
            i = a72Var.o0;
        } else {
            i = a72Var.n0;
        }
        f89 L = a72Var.s.L(i);
        if (L != null && a72Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            pv3.l(editable, v62Var.getEditField().getPaint().getFontMetricsInt(), false);
            a72Var.y.setDirection(1);
            a72Var.y.setDelegate(v62Var);
            a72Var.y.setTranslationY(L.a.getY());
            a72Var.y.d();
        }
        if (i2 == 11) {
            a72Var.P = editable;
        } else {
            a72Var.O = editable;
        }
        if (L != null) {
            a72Var.h0(i, L.a);
        }
        a72Var.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
