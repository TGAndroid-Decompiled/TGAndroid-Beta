package defpackage;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
public final class ci9 implements lc9 {
    public final li9 a;
    public final ii9 b;

    public ci9(ii9 ii9Var, li9 li9Var) {
        this.b = ii9Var;
        this.a = li9Var;
    }

    @Override
    public final boolean G(mc9 mc9Var) {
        return false;
    }

    @Override
    public final void O(CharSequence charSequence) {
        ge9 ge9Var = this.b.F;
        if (ge9Var != null && charSequence != null && charSequence.length() > 0) {
            ge9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            ffb.d(pagetablecell, editable);
        }
        ii9 ii9Var = this.b;
        ii9Var.w.requestLayout();
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            ge9Var.a();
        }
    }

    @Override
    public final boolean b0(boolean z) {
        return this.b.u(this.a, z);
    }

    @Override
    public final void d(mc9 mc9Var) {
        ge9 ge9Var = this.b.F;
        if (ge9Var != null) {
            ye9 ye9Var = ge9Var.a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override
    public final boolean i() {
        ii9 ii9Var = this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            return ge9Var.a.V4();
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ld9 ld9Var;
        ii9 ii9Var = this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null && (ld9Var = ge9Var.a.R3) != null) {
            ld9Var.f(i, i2);
        }
    }

    @Override
    public final void t(final mc9 mc9Var, final int i, final int i2) {
        ge9 ge9Var;
        final fib textSelectionHelper;
        final int m;
        ii9 ii9Var = this.b;
        if (!ii9Var.H && i != i2 && (ge9Var = ii9Var.F) != null && (textSelectionHelper = ge9Var.a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.w() || textSelectionHelper.W != ii9Var) && (m = ii9Var.m(this.a.b)) >= 0) {
                ii9Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        ii9 ii9Var2 = ci9.this.b;
                        mc9 mc9Var2 = mc9Var;
                        int length = mc9Var2.length();
                        int i3 = i2;
                        if (length >= i3 && mc9Var2.getSelectionStart() != mc9Var2.getSelectionEnd() && textSelectionHelper.i0(ii9Var2, m, i, i3)) {
                            ii9Var2.H = true;
                            mc9Var2.setSelection(i3);
                            ii9Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean z(mc9 mc9Var) {
        return false;
    }

    @Override
    public final void I() {
    }

    @Override
    public final void Y(mc9 mc9Var) {
    }
}
