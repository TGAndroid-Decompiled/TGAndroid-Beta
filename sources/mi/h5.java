package mi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class h5 implements g1 {
    public final q5 f19675a;
    public final n5 f19676b;

    public h5(n5 n5Var, q5 q5Var) {
        this.f19676b = n5Var;
        this.f19675a = q5Var;
    }

    @Override
    public final void A(int i3, int i10) {
        g2 g2Var;
        n5 n5Var = this.f19676b;
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null && (g2Var = b3Var.f19478a.R3) != null) {
            g2Var.f(i3, i10);
        }
    }

    @Override
    public final void B1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f19675a.f19843b;
        if (pagetablecell != null) {
            f6.d(pagetablecell, editable);
        }
        n5 n5Var = this.f19676b;
        n5Var.f19771w.requestLayout();
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null) {
            b3Var.a();
        }
    }

    @Override
    public final boolean M0(h1 h1Var) {
        return false;
    }

    @Override
    public final boolean X1(boolean z10) {
        return this.f19676b.u(this.f19675a, z10);
    }

    @Override
    public final boolean c0(h1 h1Var) {
        return false;
    }

    @Override
    public final void f(h1 h1Var) {
        b3 b3Var = this.f19676b.F;
        if (b3Var != null) {
            t3 t3Var = b3Var.f19478a;
            t3.Q1(t3Var, h1Var);
            t3Var.f19916p3.E(h1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        b3 b3Var = this.f19676b.F;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f19478a.w4(charSequence.toString());
        }
    }

    @Override
    public final void l(final h1 h1Var, final int i3, final int i10) {
        b3 b3Var;
        final h9 textSelectionHelper;
        final int l10;
        n5 n5Var = this.f19676b;
        if (!n5Var.H && i3 != i10 && (b3Var = n5Var.F) != null && (textSelectionHelper = b3Var.f19478a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != n5Var) && (l10 = n5Var.l(this.f19675a.f19843b)) >= 0) {
                n5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        n5 n5Var2 = h5.this.f19676b;
                        h1 h1Var2 = h1Var;
                        int length = h1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && h1Var2.getSelectionStart() != h1Var2.getSelectionEnd() && textSelectionHelper.j0(n5Var2, l10, i3, i11)) {
                            n5Var2.H = true;
                            h1Var2.setSelection(i11);
                            n5Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean m() {
        n5 n5Var = this.f19676b;
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null) {
            return b3Var.f19478a.V4();
        }
        return false;
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void V0(h1 h1Var) {
    }
}
