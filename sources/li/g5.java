package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class g5 implements f1 {
    public final p5 f18610a;
    public final m5 f18611b;

    public g5(m5 m5Var, p5 p5Var) {
        this.f18611b = m5Var;
        this.f18610a = p5Var;
    }

    @Override
    public final boolean E(g1 g1Var) {
        return false;
    }

    @Override
    public final void T0(CharSequence charSequence) {
        a3 a3Var = this.f18611b.E;
        if (a3Var != null && charSequence != null && charSequence.length() > 0) {
            a3Var.f18416a.w4(charSequence.toString());
        }
    }

    @Override
    public final void b(g1 g1Var) {
        a3 a3Var = this.f18611b.E;
        if (a3Var != null) {
            t3 t3Var = a3Var.f18416a;
            t3.Q1(t3Var, g1Var);
            t3Var.f18887o3.r(g1Var, true);
        }
    }

    @Override
    public final void f1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f18610a.f18776b;
        if (pagetablecell != null) {
            e6.d(pagetablecell, editable);
        }
        m5 m5Var = this.f18611b;
        m5Var.f18708w.requestLayout();
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null) {
            a3Var.a();
        }
    }

    @Override
    public final void l0(final g1 g1Var, final int i7, final int i10) {
        a3 a3Var;
        final i9 textSelectionHelper;
        final int l10;
        m5 m5Var = this.f18611b;
        if (!m5Var.G && i7 != i10 && (a3Var = m5Var.E) != null && (textSelectionHelper = a3Var.f18416a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != m5Var) && (l10 = m5Var.l(this.f18610a.f18776b)) >= 0) {
                m5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        m5 m5Var2 = g5.this.f18611b;
                        g1 g1Var2 = g1Var;
                        int length = g1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && g1Var2.getSelectionStart() != g1Var2.getSelectionEnd() && textSelectionHelper.j0(m5Var2, l10, i7, i11)) {
                            m5Var2.G = true;
                            g1Var2.setSelection(i11);
                            m5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean l1(boolean z9) {
        return this.f18611b.u(this.f18610a, z9);
    }

    @Override
    public final boolean m() {
        m5 m5Var = this.f18611b;
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null) {
            return a3Var.f18416a.V4();
        }
        return false;
    }

    @Override
    public final boolean s(g1 g1Var) {
        return false;
    }

    @Override
    public final void w(int i7, int i10) {
        f2 f2Var;
        m5 m5Var = this.f18611b;
        a3 a3Var = m5Var.E;
        if (a3Var != null && m5Var.f18986a != null && (f2Var = a3Var.f18416a.Q3) != null) {
            f2Var.f(i7, i10);
        }
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void F(g1 g1Var) {
    }
}
