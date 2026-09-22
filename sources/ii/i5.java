package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r9;
public final class i5 implements h1 {
    public final r5 f11448a;
    public final o5 f11449b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f11449b = o5Var;
        this.f11448a = r5Var;
    }

    @Override
    public final void I(CharSequence charSequence) {
        c3 c3Var = this.f11449b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f11287a.u4(charSequence.toString());
        }
    }

    @Override
    public final void R(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f11448a.f11608b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f11449b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11221a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean V(boolean z10) {
        return this.f11449b.s(this.f11448a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        c3 c3Var = this.f11449b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f11287a;
            w3.N1(w3Var, i1Var);
            w3Var.f11715h3.x(i1Var, true);
        }
    }

    @Override
    public final boolean d() {
        o5 o5Var = this.f11449b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11221a != null) {
            return c3Var.f11287a.T4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f11449b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11221a != null && (h2Var = c3Var.f11287a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean s(i1 i1Var) {
        return false;
    }

    @Override
    public final void z(final i1 i1Var, final int i10, final int i11) {
        c3 c3Var;
        final r9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.f11449b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f11287a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != o5Var) && (k10 = o5Var.k(this.f11448a.f11608b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f11449b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.k0(o5Var2, k10, i10, i12)) {
                            o5Var2.G = true;
                            i1Var2.setSelection(i12);
                            o5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void l(i1 i1Var) {
    }

    @Override
    public final void v() {
    }
}
