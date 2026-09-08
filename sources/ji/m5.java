package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class m5 implements g1 {
    public final v5 f14091a;
    public final s5 f14092b;

    public m5(s5 s5Var, v5 v5Var) {
        this.f14092b = s5Var;
        this.f14091a = v5Var;
    }

    @Override
    public final void N(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f14091a.f14304b;
        if (pagetablecell != null) {
            k6.d(pagetablecell, editable);
        }
        s5 s5Var = this.f14092b;
        s5Var.v.requestLayout();
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13775a != null) {
            b3Var.a();
        }
    }

    @Override
    public final boolean R(boolean z10) {
        return this.f14092b.s(this.f14091a, z10);
    }

    @Override
    public final void a(h1 h1Var) {
        b3 b3Var = this.f14092b.E;
        if (b3Var != null) {
            v3 v3Var = b3Var.f13816a;
            v3.L1(v3Var, h1Var);
            v3Var.f14275h3.v(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        s5 s5Var = this.f14092b;
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13775a != null) {
            return b3Var.f13816a.R4();
        }
        return false;
    }

    @Override
    public final boolean h(h1 h1Var) {
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        g2 g2Var;
        s5 s5Var = this.f14092b;
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13775a != null && (g2Var = b3Var.f13816a.J3) != null) {
            g2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean k(h1 h1Var) {
        return false;
    }

    @Override
    public final void o(final h1 h1Var, final int i10, final int i11) {
        b3 b3Var;
        final q9 textSelectionHelper;
        final int k10;
        s5 s5Var = this.f14092b;
        if (!s5Var.G && i10 != i11 && (b3Var = s5Var.E) != null && (textSelectionHelper = b3Var.f13816a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != s5Var) && (k10 = s5Var.k(this.f14091a.f14304b)) >= 0) {
                s5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        s5 s5Var2 = m5.this.f14092b;
                        h1 h1Var2 = h1Var;
                        int length = h1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd() && textSelectionHelper.k0(s5Var2, k10, i10, i12)) {
                            s5Var2.G = true;
                            h1Var2.setSelection(i12);
                            s5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        b3 b3Var = this.f14092b.E;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f13816a.s4(charSequence.toString());
        }
    }

    @Override
    public final void r() {
    }

    @Override
    public final void C(h1 h1Var) {
    }
}
