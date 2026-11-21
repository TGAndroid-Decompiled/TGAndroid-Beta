package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
public final class g5 implements e1 {
    public final p5 f22150a;
    public final m5 f22151b;

    public g5(m5 m5Var, p5 p5Var) {
        this.f22151b = m5Var;
        this.f22150a = p5Var;
    }

    @Override
    public final void A(int i7, int i10) {
        g2 g2Var;
        m5 m5Var = this.f22151b;
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22528a != null && (g2Var = b3Var.f22021a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return this.f22151b.u(this.f22150a, z10);
    }

    @Override
    public final boolean J(f1 f1Var) {
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        b3 b3Var = this.f22151b.F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f22021a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean d2(f1 f1Var) {
        return false;
    }

    @Override
    public final void e(f1 f1Var) {
        b3 b3Var = this.f22151b.F;
        if (b3Var != null) {
            t3 t3Var = b3Var.f22021a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22425p3.k(f1Var, true);
        }
    }

    @Override
    public final boolean o() {
        m5 m5Var = this.f22151b;
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22528a != null) {
            return b3Var.f22021a.V4();
        }
        return false;
    }

    @Override
    public final void r1(final f1 f1Var, final int i7, final int i10) {
        b3 b3Var;
        final j9 textSelectionHelper;
        final int l10;
        m5 m5Var = this.f22151b;
        if (!m5Var.H && i7 != i10 && (b3Var = m5Var.F) != null && (textSelectionHelper = b3Var.f22021a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != m5Var) && (l10 = m5Var.l(this.f22150a.f22313b)) >= 0) {
                m5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        m5 m5Var2 = g5.this.f22151b;
                        f1 f1Var2 = f1Var;
                        int length = f1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && f1Var2.getSelectionStart() != f1Var2.getSelectionEnd() && textSelectionHelper.j0(m5Var2, l10, i7, i11)) {
                            m5Var2.H = true;
                            f1Var2.setSelection(i11);
                            m5Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void s1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f22150a.f22313b;
        if (pagetablecell != null) {
            e6.d(pagetablecell, editable);
        }
        m5 m5Var = this.f22151b;
        m5Var.f22245w.requestLayout();
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22528a != null) {
            b3Var.a();
        }
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void x0(f1 f1Var) {
    }
}
