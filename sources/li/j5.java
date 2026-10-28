package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class j5 implements f1 {
    public final s5 f17313a;
    public final p5 f17314b;

    public j5(p5 p5Var, s5 s5Var) {
        this.f17314b = p5Var;
        this.f17313a = s5Var;
    }

    @Override
    public final void E(final g1 g1Var, final int i10, final int i11) {
        b3 b3Var;
        final s9 textSelectionHelper;
        final int j10;
        p5 p5Var = this.f17314b;
        if (!p5Var.G && i10 != i11 && (b3Var = p5Var.E) != null && (textSelectionHelper = b3Var.f17153a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != p5Var) && (j10 = p5Var.j(this.f17313a.f17475b)) >= 0) {
                p5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        p5 p5Var2 = j5.this.f17314b;
                        g1 g1Var2 = g1Var;
                        int length = g1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && g1Var2.getSelectionStart() != g1Var2.getSelectionEnd() && textSelectionHelper.j0(p5Var2, j10, i10, i12)) {
                            p5Var2.G = true;
                            g1Var2.setSelection(i12);
                            p5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void T(CharSequence charSequence) {
        b3 b3Var = this.f17314b.E;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f17153a.z4(charSequence.toString());
        }
    }

    @Override
    public final void Y(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f17313a.f17475b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        p5 p5Var = this.f17314b;
        p5Var.v.requestLayout();
        b3 b3Var = p5Var.E;
        if (b3Var != null && p5Var.f17652a != null) {
            b3Var.a();
        }
    }

    @Override
    public final void b(g1 g1Var) {
        b3 b3Var = this.f17314b.E;
        if (b3Var != null) {
            v3 v3Var = b3Var.f17153a;
            v3.S1(v3Var, g1Var);
            v3Var.f17556p3.s(g1Var, true);
        }
    }

    @Override
    public final boolean e() {
        p5 p5Var = this.f17314b;
        b3 b3Var = p5Var.E;
        if (b3Var != null && p5Var.f17652a != null) {
            return b3Var.f17153a.Y4();
        }
        return false;
    }

    @Override
    public final boolean f0(boolean z10) {
        return this.f17314b.r(this.f17313a, z10);
    }

    @Override
    public final boolean g(g1 g1Var) {
        return false;
    }

    @Override
    public final void k(int i10, int i11) {
        f2 f2Var;
        p5 p5Var = this.f17314b;
        b3 b3Var = p5Var.E;
        if (b3Var != null && p5Var.f17652a != null && (f2Var = b3Var.f17153a.R3) != null) {
            f2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(g1 g1Var) {
        return false;
    }

    @Override
    public final void t(g1 g1Var) {
    }

    @Override
    public final void R() {
    }
}
