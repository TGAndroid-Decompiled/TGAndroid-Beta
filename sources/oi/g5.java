package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class g5 implements e1 {
    public final p5 f22219a;
    public final m5 f22220b;

    public g5(m5 m5Var, p5 p5Var) {
        this.f22220b = m5Var;
        this.f22219a = p5Var;
    }

    @Override
    public final void T(CharSequence charSequence) {
        b3 b3Var = this.f22220b.F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f22090a.w4(charSequence.toString());
        }
    }

    @Override
    public final void d(f1 f1Var) {
        b3 b3Var = this.f22220b.F;
        if (b3Var != null) {
            t3 t3Var = b3Var.f22090a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22495p3.b(f1Var, true);
        }
    }

    @Override
    public final void e0(final f1 f1Var, final int i7, final int i10) {
        b3 b3Var;
        final i9 textSelectionHelper;
        final int l10;
        m5 m5Var = this.f22220b;
        if (!m5Var.H && i7 != i10 && (b3Var = m5Var.F) != null && (textSelectionHelper = b3Var.f22090a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != m5Var) && (l10 = m5Var.l(this.f22219a.f22382b)) >= 0) {
                m5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        m5 m5Var2 = g5.this.f22220b;
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
    public final void g0(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f22219a.f22382b;
        if (pagetablecell != null) {
            e6.d(pagetablecell, editable);
        }
        m5 m5Var = this.f22220b;
        m5Var.f22316w.requestLayout();
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null) {
            b3Var.a();
        }
    }

    @Override
    public final boolean i() {
        m5 m5Var = this.f22220b;
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null) {
            return b3Var.f22090a.V4();
        }
        return false;
    }

    @Override
    public final void m(int i7, int i10) {
        g2 g2Var;
        m5 m5Var = this.f22220b;
        b3 b3Var = m5Var.F;
        if (b3Var != null && m5Var.f22598a != null && (g2Var = b3Var.f22090a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean m0(boolean z10) {
        return this.f22220b.u(this.f22219a, z10);
    }

    @Override
    public final boolean o(f1 f1Var) {
        return false;
    }

    @Override
    public final boolean t0(f1 f1Var) {
        return false;
    }

    @Override
    public final void F() {
    }

    @Override
    public final void A(f1 f1Var) {
    }
}
