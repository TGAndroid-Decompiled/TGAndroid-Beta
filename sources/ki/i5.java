package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class i5 implements g1 {
    public final r5 f15337a;
    public final o5 f15338b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f15338b = o5Var;
        this.f15337a = r5Var;
    }

    @Override
    public final void G(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f15337a.f15494b;
        if (pagetablecell != null) {
            g6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f15338b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15113a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean M(boolean z10) {
        return this.f15338b.s(this.f15337a, z10);
    }

    @Override
    public final boolean P(h1 h1Var) {
        return false;
    }

    @Override
    public final void R(final h1 h1Var, final int i10, final int i11) {
        c3 c3Var;
        final n9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.f15338b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f15177a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != o5Var) && (k10 = o5Var.k(this.f15337a.f15494b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f15338b;
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
        c3 c3Var = this.f15338b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f15177a;
            w3.N1(w3Var, h1Var);
            w3Var.f15594f3.o(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        o5 o5Var = this.f15338b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15113a != null) {
            return c3Var.f15177a.T4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f15338b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15113a != null && (h2Var = c3Var.f15177a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean s(h1 h1Var) {
        return false;
    }

    @Override
    public final void x(CharSequence charSequence) {
        c3 c3Var = this.f15338b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f15177a.u4(charSequence.toString());
        }
    }

    @Override
    public final void k(h1 h1Var) {
    }

    @Override
    public final void o() {
    }
}
