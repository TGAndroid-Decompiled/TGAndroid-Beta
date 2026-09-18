package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class i5 implements h1 {
    public final r5 f11447a;
    public final o5 f11448b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f11448b = o5Var;
        this.f11447a = r5Var;
    }

    @Override
    public final void B(final i1 i1Var, final int i10, final int i11) {
        c3 c3Var;
        final q9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.f11448b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f11286a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != o5Var) && (k10 = o5Var.k(this.f11447a.f11607b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f11448b;
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
    public final void K(CharSequence charSequence) {
        c3 c3Var = this.f11448b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f11286a.u4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f11447a.f11607b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f11448b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return this.f11448b.s(this.f11447a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        c3 c3Var = this.f11448b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f11286a;
            w3.N1(w3Var, i1Var);
            w3Var.f11714h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        o5 o5Var = this.f11448b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null) {
            return c3Var.f11286a.T4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f11448b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11220a != null && (h2Var = c3Var.f11286a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        return false;
    }

    @Override
    public final void m(i1 i1Var) {
    }

    @Override
    public final void x() {
    }
}
