package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class o5 implements g1 {
    public final x5 f13458a;
    public final u5 f13459b;

    public o5(u5 u5Var, x5 x5Var) {
        this.f13459b = u5Var;
        this.f13458a = x5Var;
    }

    @Override
    public final void C(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f13458a.f13662b;
        if (pagetablecell != null) {
            m6.d(pagetablecell, editable);
        }
        u5 u5Var = this.f13459b;
        u5Var.v.requestLayout();
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null) {
            d3Var.a();
        }
    }

    @Override
    public final boolean E(boolean z10) {
        return this.f13459b.s(this.f13458a, z10);
    }

    @Override
    public final void a(h1 h1Var) {
        d3 d3Var = this.f13459b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f13235a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public final boolean d() {
        u5 u5Var = this.f13459b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null) {
            return d3Var.f13235a.T4();
        }
        return false;
    }

    @Override
    public final boolean e(h1 h1Var) {
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        u5 u5Var = this.f13459b;
        d3 d3Var = u5Var.E;
        if (d3Var != null && u5Var.f13123a != null && (h2Var = d3Var.f13235a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean m(h1 h1Var) {
        return false;
    }

    @Override
    public final void q(final h1 h1Var, final int i10, final int i11) {
        d3 d3Var;
        final o9 textSelectionHelper;
        final int k10;
        u5 u5Var = this.f13459b;
        if (!u5Var.G && i10 != i11 && (d3Var = u5Var.E) != null && (textSelectionHelper = d3Var.f13235a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != u5Var) && (k10 = u5Var.k(this.f13458a.f13662b)) >= 0) {
                u5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        u5 u5Var2 = o5.this.f13459b;
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
    public final void y(CharSequence charSequence) {
        d3 d3Var = this.f13459b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f13235a.u4(charSequence.toString());
        }
    }

    @Override
    public final void z(h1 h1Var) {
    }

    @Override
    public final void r() {
    }
}
