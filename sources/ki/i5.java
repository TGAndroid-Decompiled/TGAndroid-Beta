package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class i5 implements g1 {
    public final r5 f15395a;
    public final o5 f15396b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f15396b = o5Var;
        this.f15395a = r5Var;
    }

    @Override
    public final void G(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f15395a.f15552b;
        if (pagetablecell != null) {
            g6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f15396b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean M(boolean z10) {
        return this.f15396b.r(this.f15395a, z10);
    }

    @Override
    public final boolean P(h1 h1Var) {
        return false;
    }

    @Override
    public final void R(final h1 h1Var, final int i10, final int i11) {
        c3 c3Var;
        final o9 textSelectionHelper;
        final int j10;
        o5 o5Var = this.f15396b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f15232a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != o5Var) && (j10 = o5Var.j(this.f15395a.f15552b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f15396b;
                        h1 h1Var2 = h1Var;
                        int length = h1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd() && textSelectionHelper.j0(o5Var2, j10, i10, i12)) {
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
        c3 c3Var = this.f15396b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f15232a;
            w3.S1(w3Var, h1Var);
            w3Var.f15656i3.o(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        o5 o5Var = this.f15396b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null) {
            return c3Var.f15232a.Y4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f15396b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f15157a != null && (h2Var = c3Var.f15232a.K3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean s(h1 h1Var) {
        return false;
    }

    @Override
    public final void x(CharSequence charSequence) {
        c3 c3Var = this.f15396b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f15232a.z4(charSequence.toString());
        }
    }

    @Override
    public final void k(h1 h1Var) {
    }

    @Override
    public final void m() {
    }
}
