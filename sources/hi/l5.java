package hi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class l5 implements j1 {
    public final u5 f9727a;
    public final r5 f9728b;

    public l5(r5 r5Var, u5 u5Var) {
        this.f9728b = r5Var;
        this.f9727a = u5Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        f3 f3Var = this.f9728b.E;
        if (f3Var != null && charSequence != null && charSequence.length() > 0) {
            f3Var.f9568a.s4(charSequence.toString());
        }
    }

    @Override
    public final boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public final void G(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f9727a.f9893b;
        if (pagetablecell != null) {
            l6.d(pagetablecell, editable);
        }
        r5 r5Var = this.f9728b;
        r5Var.v.requestLayout();
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null) {
            f3Var.a();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return this.f9728b.s(this.f9727a, z10);
    }

    @Override
    public final boolean P(k1 k1Var) {
        return false;
    }

    @Override
    public final void b(k1 k1Var) {
        f3 f3Var = this.f9728b.E;
        if (f3Var != null) {
            z3 z3Var = f3Var.f9568a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public final boolean f() {
        r5 r5Var = this.f9728b;
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null) {
            return f3Var.f9568a.R4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        k2 k2Var;
        r5 r5Var = this.f9728b;
        f3 f3Var = r5Var.E;
        if (f3Var != null && r5Var.f9464a != null && (k2Var = f3Var.f9568a.J3) != null) {
            k2Var.f(i10, i11);
        }
    }

    @Override
    public final void r(final k1 k1Var, final int i10, final int i11) {
        f3 f3Var;
        final s9 textSelectionHelper;
        final int k10;
        r5 r5Var = this.f9728b;
        if (!r5Var.G && i10 != i11 && (f3Var = r5Var.E) != null && (textSelectionHelper = f3Var.f9568a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != r5Var) && (k10 = r5Var.k(this.f9727a.f9893b)) >= 0) {
                r5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        r5 r5Var2 = l5.this.f9728b;
                        k1 k1Var2 = k1Var;
                        int length = k1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && k1Var2.getSelectionStart() != k1Var2.getSelectionEnd() && textSelectionHelper.k0(r5Var2, k10, i10, i12)) {
                            r5Var2.G = true;
                            k1Var2.setSelection(i12);
                            r5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void t() {
    }

    @Override
    public final void x(k1 k1Var) {
    }
}
