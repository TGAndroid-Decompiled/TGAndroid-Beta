package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class k5 implements h1 {
    public final t5 f12538a;
    public final q5 f12539b;

    public k5(q5 q5Var, t5 t5Var) {
        this.f12539b = q5Var;
        this.f12538a = t5Var;
    }

    @Override
    public final void E(CharSequence charSequence) {
        d3 d3Var = this.f12539b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f12346a.u4(charSequence.toString());
        }
    }

    @Override
    public final void L(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f12538a.f12708b;
        if (pagetablecell != null) {
            j6.d(pagetablecell, editable);
        }
        q5 q5Var = this.f12539b;
        q5Var.v.requestLayout();
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null) {
            d3Var.a();
        }
    }

    @Override
    public final boolean N(boolean z10) {
        return this.f12539b.s(this.f12538a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        d3 d3Var = this.f12539b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f12346a;
            x3.N1(x3Var, i1Var);
            x3Var.f12808f3.x(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        q5 q5Var = this.f12539b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null) {
            return d3Var.f12346a.T4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = this.f12539b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12250a != null && (i2Var = d3Var.f12346a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean m(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean r(i1 i1Var) {
        return false;
    }

    @Override
    public final void x(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final o9 textSelectionHelper;
        final int k10;
        q5 q5Var = this.f12539b;
        if (!q5Var.G && i10 != i11 && (d3Var = q5Var.E) != null && (textSelectionHelper = d3Var.f12346a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != q5Var) && (k10 = q5Var.k(this.f12538a.f12708b)) >= 0) {
                q5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        q5 q5Var2 = k5.this.f12539b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.j0(q5Var2, k10, i10, i12)) {
                            q5Var2.G = true;
                            i1Var2.setSelection(i12);
                            q5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void k(i1 i1Var) {
    }

    @Override
    public final void u() {
    }
}
