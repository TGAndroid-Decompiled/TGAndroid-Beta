package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
public final class g62 implements TextWatcher {
    public final f62 a;
    public final int b;
    public final s20 c;

    public g62(s20 s20Var, f62 f62Var, int i) {
        this.c = s20Var;
        this.a = f62Var;
        this.b = i;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        k62 k62Var = (k62) this.c.e;
        f62 f62Var = this.a;
        if (f62Var.getTag() != null) {
            return;
        }
        int i2 = this.b;
        if (i2 == 11) {
            i = k62Var.o0;
        } else {
            i = k62Var.n0;
        }
        s49 K = k62Var.s.K(i);
        if (K != null && k62Var.y != null) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            vu3.l(editable, f62Var.getEditField().getPaint().getFontMetricsInt(), false);
            k62Var.y.setDirection(1);
            k62Var.y.setDelegate(f62Var);
            k62Var.y.setTranslationY(K.a.getY());
            k62Var.y.d();
        }
        if (i2 == 11) {
            k62Var.P = editable;
        } else {
            k62Var.O = editable;
        }
        if (K != null) {
            k62Var.i0(i, K.a);
        }
        k62Var.T();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
