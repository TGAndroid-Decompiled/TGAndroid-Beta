package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class o5 implements g1 {
    public final x5 f13455a;
    public final u5 f13456b;

    public o5(u5 u5Var, x5 x5Var) {
        this.f13456b = u5Var;
        this.f13455a = x5Var;
    }

    @Override
    public final boolean C(h1 h1Var) {
        return false;
    }

    @Override
    public final boolean F0(boolean z10) {
        return this.f13456b.s(this.f13455a, z10);
    }

    @Override
    public final void U(final h1 h1Var, final int i10, final int i11) {
        d3 d3Var;
        final o9 textSelectionHelper;
        final int k10;
        u5 u5Var = this.f13456b;
        if (!u5Var.G && i10 != i11 && (d3Var = u5Var.E) != null && (textSelectionHelper = d3Var.f13231a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != u5Var) && (k10 = u5Var.k(this.f13455a.f13659b)) >= 0) {
                u5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        u5 u5Var2 = o5.this.f13456b;
                        h1 h1Var2 = h1Var;
                        int length = h1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd() && textSelectionHelper.j0(u5Var2, k10, i10, i12)) {
                            u5Var2.G = true;
                            h1Var2.setSelection(i12);
                            u5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void a(h1 h1Var) {
        d3 d3Var = this.f13456b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f13231a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public final void g0(CharSequence charSequence) {
        d3 d3Var = this.f13456b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f13231a.u4(charSequence.toString());
        }
    }

    @Override
    public final boolean h() {
        u5 u5Var = this.f13456b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13119a != null) {
            return d3Var.f13231a.T4();
        }
        return false;
    }

    @Override
    public final boolean l(h1 h1Var) {
        return false;
    }

    @Override
    public final void p(int i10, int i11) {
        h2 h2Var;
        u5 u5Var = this.f13456b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13119a != null && (h2Var = d3Var.f13231a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void s0(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f13455a.f13659b;
        if (pagetablecell != null) {
            m6.d(pagetablecell, editable);
        }
        u5 u5Var = this.f13456b;
        u5Var.v.requestLayout();
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13119a != null) {
            d3Var.a();
        }
    }

    @Override
    public final void W() {
    }

    @Override
    public final void p0(h1 h1Var) {
    }
}
