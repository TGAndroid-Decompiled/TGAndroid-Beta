package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class e5 implements d1 {
    public final n5 f21679a;
    public final k5 f21680b;

    public e5(k5 k5Var, n5 n5Var) {
        this.f21680b = k5Var;
        this.f21679a = n5Var;
    }

    @Override
    public final void I(CharSequence charSequence) {
        y2 y2Var = this.f21680b.F;
        if (y2Var != null && charSequence != null && charSequence.length() > 0) {
            y2Var.f22138a.w4(charSequence.toString());
        }
    }

    @Override
    public final void Z(final e1 e1Var, final int i7, final int i10) {
        y2 y2Var;
        final h9 textSelectionHelper;
        final int l10;
        k5 k5Var = this.f21680b;
        if (!k5Var.H && i7 != i10 && (y2Var = k5Var.F) != null && (textSelectionHelper = y2Var.f22138a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != k5Var) && (l10 = k5Var.l(this.f21679a.f21846b)) >= 0) {
                k5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        k5 k5Var2 = e5.this.f21680b;
                        e1 e1Var2 = e1Var;
                        int length = e1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd() && textSelectionHelper.j0(k5Var2, l10, i7, i11)) {
                            k5Var2.H = true;
                            e1Var2.setSelection(i11);
                            k5Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void b0(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f21679a.f21846b;
        if (pagetablecell != null) {
            c6.d(pagetablecell, editable);
        }
        k5 k5Var = this.f21680b;
        k5Var.f21778w.requestLayout();
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null) {
            y2Var.a();
        }
    }

    @Override
    public final void d(e1 e1Var) {
        y2 y2Var = this.f21680b.F;
        if (y2Var != null) {
            q3 q3Var = y2Var.f22138a;
            q3.Q1(q3Var, e1Var);
            q3Var.f21931p3.b(e1Var, true);
        }
    }

    @Override
    public final boolean g() {
        k5 k5Var = this.f21680b;
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null) {
            return y2Var.f22138a.V4();
        }
        return false;
    }

    @Override
    public final boolean h0(boolean z10) {
        return this.f21680b.u(this.f21679a, z10);
    }

    @Override
    public final void m(int i7, int i10) {
        d2 d2Var;
        k5 k5Var = this.f21680b;
        y2 y2Var = k5Var.F;
        if (y2Var != null && k5Var.f22106a != null && (d2Var = y2Var.f22138a.R3) != null) {
            d2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean o(e1 e1Var) {
        return false;
    }

    @Override
    public final boolean q0(e1 e1Var) {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void z(e1 e1Var) {
    }
}
