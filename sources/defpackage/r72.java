package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class r72 implements TextWatcher {
    public final q72 a;
    public final int b;
    public final s30 c;

    public r72(s30 s30Var, q72 q72Var, int i) {
        this.c = s30Var;
        this.a = q72Var;
        this.b = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        v72 v72Var = (v72) this.c.e;
        q72 q72Var = this.a;
        if (q72Var.getTag() != null) {
            return;
        }
        int i2 = this.b;
        if (i2 == 11) {
            i = v72Var.o0;
        } else {
            i = v72Var.n0;
        }
        u69 K = v72Var.s.K(i);
        if (K != null && v72Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            gw3.l(editable, q72Var.getEditField().getPaint().getFontMetricsInt(), false);
            v72Var.y.setDirection(1);
            v72Var.y.setDelegate(q72Var);
            v72Var.y.setTranslationY(K.a.getY());
            v72Var.y.d();
        }
        if (i2 == 11) {
            v72Var.P = editable;
        } else {
            v72Var.O = editable;
        }
        if (K != null) {
            v72Var.i0(i, K.a);
        }
        v72Var.S();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
