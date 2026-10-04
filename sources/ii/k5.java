package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class k5 implements h1 {
    public final t5 f12490a;
    public final q5 f12491b;

    public k5(q5 q5Var, t5 t5Var) {
        this.f12491b = q5Var;
        this.f12490a = t5Var;
    }

    @Override
    public final void B(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f12490a.f12662b;
        if (pagetablecell != null) {
            j6.d(pagetablecell, editable);
        }
        q5 q5Var = this.f12491b;
        q5Var.v.requestLayout();
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12204a != null) {
            d3Var.a();
        }
    }

    @Override
    public final boolean G(boolean z10) {
        return this.f12491b.s(this.f12490a, z10);
    }

    @Override
    public final void b(i1 i1Var) {
        d3 d3Var = this.f12491b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f12299a;
            x3.O1(x3Var, i1Var);
            x3Var.f12770o3.P(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        q5 q5Var = this.f12491b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12204a != null) {
            return d3Var.f12299a.U4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        i2 i2Var;
        q5 q5Var = this.f12491b;
        d3 d3Var = q5Var.E;
        if (d3Var != null && q5Var.f12204a != null && (i2Var = d3Var.f12299a.Q3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean n(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final void t(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final q9 textSelectionHelper;
        final int k10;
        q5 q5Var = this.f12491b;
        if (!q5Var.G && i10 != i11 && (d3Var = q5Var.E) != null && (textSelectionHelper = d3Var.f12299a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != q5Var) && (k10 = q5Var.k(this.f12490a.f12662b)) >= 0) {
                q5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        q5 q5Var2 = k5.this.f12491b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.k0(q5Var2, k10, i10, i12)) {
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
    public final void x(CharSequence charSequence) {
        d3 d3Var = this.f12491b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f12299a.v4(charSequence.toString());
        }
    }

    @Override
    public final void l(i1 i1Var) {
    }

    @Override
    public final void r() {
    }
}
