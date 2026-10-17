package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class i5 implements g1 {
    public final r5 f15329a;
    public final o5 f15330b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f15330b = o5Var;
        this.f15329a = r5Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        c3 c3Var = this.f15330b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f15169a.u4(charSequence.toString());
        }
    }

    @Override
    public final void M(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f15329a.f15486b;
        if (pagetablecell != null) {
            g6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f15330b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15105a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean Q(boolean z10) {
        return this.f15330b.s(this.f15329a, z10);
    }

    @Override
    public final boolean R(h1 h1Var) {
        return false;
    }

    @Override
    public final void V(final h1 h1Var, final int i10, final int i11) {
        c3 c3Var;
        final n9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.f15330b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f15169a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != o5Var) && (k10 = o5Var.k(this.f15329a.f15486b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f15330b;
                        h1 h1Var2 = h1Var;
                        int length = h1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd() && textSelectionHelper.j0(o5Var2, k10, i10, i12)) {
                            o5Var2.G = true;
                            h1Var2.setSelection(i12);
                            o5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void c(h1 h1Var) {
        c3 c3Var = this.f15330b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f15169a;
            w3.N1(w3Var, h1Var);
            w3Var.f15586f3.n(h1Var, true);
        }
    }

    @Override
    public final boolean f() {
        o5 o5Var = this.f15330b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15105a != null) {
            return c3Var.f15169a.T4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f15330b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15105a != null && (h2Var = c3Var.f15169a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean q(h1 h1Var) {
        return false;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void l(h1 h1Var) {
    }
}
