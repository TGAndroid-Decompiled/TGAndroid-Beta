package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class j5 implements h1 {
    public final s5 f11470a;
    public final p5 f11471b;

    public j5(p5 p5Var, s5 s5Var) {
        this.f11471b = p5Var;
        this.f11470a = s5Var;
    }

    @Override
    public final void B(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final q9 textSelectionHelper;
        final int k10;
        p5 p5Var = this.f11471b;
        if (!p5Var.G && i10 != i11 && (d3Var = p5Var.E) != null && (textSelectionHelper = d3Var.f11307a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != p5Var) && (k10 = p5Var.k(this.f11470a.f11631b)) >= 0) {
                p5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        p5 p5Var2 = j5.this.f11471b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.k0(p5Var2, k10, i10, i12)) {
                            p5Var2.G = true;
                            i1Var2.setSelection(i12);
                            p5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        d3 d3Var = this.f11471b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f11307a.v4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f11470a.f11631b;
        if (pagetablecell != null) {
            i6.d(pagetablecell, editable);
        }
        p5 p5Var = this.f11471b;
        p5Var.v.requestLayout();
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11221a != null) {
            d3Var.a();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return this.f11471b.s(this.f11470a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        d3 d3Var = this.f11471b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f11307a;
            x3.O1(x3Var, i1Var);
            x3Var.f11748o3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        p5 p5Var = this.f11471b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11221a != null) {
            return d3Var.f11307a.U4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        i2 i2Var;
        p5 p5Var = this.f11471b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11221a != null && (i2Var = d3Var.f11307a.Q3) != null) {
            i2Var.f(i10, i11);
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
