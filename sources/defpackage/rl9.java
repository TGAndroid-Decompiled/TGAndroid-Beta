package defpackage;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
public final class rl9 implements cg9 {
    public final am9 a;
    public final xl9 b;

    public rl9(xl9 xl9Var, am9 am9Var) {
        this.b = xl9Var;
        this.a = am9Var;
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void M(CharSequence charSequence) {
        xh9 xh9Var = this.b.F;
        if (xh9Var != null && charSequence != null && charSequence.length() > 0) {
            xh9Var.a.v4(charSequence.toString());
        }
    }

    @Override
    public final void Q(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            ajb.d(pagetablecell, editable);
        }
        xl9 xl9Var = this.b;
        xl9Var.w.requestLayout();
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            xh9Var.a();
        }
    }

    @Override
    public final boolean W(boolean z) {
        return this.b.u(this.a, z);
    }

    @Override
    public final void e(dg9 dg9Var) {
        xh9 xh9Var = this.b.F;
        if (xh9Var != null) {
            pi9 pi9Var = xh9Var.a;
            pi9Var.j4(dg9Var);
            pi9Var.p3.j(dg9Var, true);
        }
    }

    @Override
    public final boolean i() {
        xl9 xl9Var = this.b;
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            return xh9Var.a.W4();
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ch9 ch9Var;
        xl9 xl9Var = this.b;
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null && (ch9Var = xh9Var.a.R3) != null) {
            ch9Var.f(i, i2);
        }
    }

    @Override
    public final void s(final dg9 dg9Var, final int i, final int i2) {
        xh9 xh9Var;
        final amb textSelectionHelper;
        final int m;
        xl9 xl9Var = this.b;
        if (!xl9Var.H && i != i2 && (xh9Var = xl9Var.F) != null && (textSelectionHelper = xh9Var.a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.w() || textSelectionHelper.W != xl9Var) && (m = xl9Var.m(this.a.b)) >= 0) {
                xl9Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        xl9 xl9Var2 = rl9.this.b;
                        dg9 dg9Var2 = dg9Var;
                        int length = dg9Var2.length();
                        int i3 = i2;
                        if (length >= i3 && dg9Var2.getSelectionStart() != dg9Var2.getSelectionEnd() && textSelectionHelper.i0(xl9Var2, m, i, i3)) {
                            xl9Var2.H = true;
                            dg9Var2.setSelection(i3);
                            xl9Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void G() {
    }

    @Override
    public final void U(dg9 dg9Var) {
    }
}
