package bi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class t5 implements m1 {
    public final c6 f3366a;
    public final z5 f3367b;

    public t5(z5 z5Var, c6 c6Var) {
        this.f3367b = z5Var;
        this.f3366a = c6Var;
    }

    @Override
    public final void B(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f3366a.f2906b;
        if (pagetablecell != null) {
            w6.d(pagetablecell, editable);
        }
        z5 z5Var = this.f3367b;
        z5Var.f3483w.requestLayout();
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null) {
            k3Var.a();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return this.f3367b.u(this.f3366a, z10);
    }

    @Override
    public final boolean I(n1 n1Var) {
        return false;
    }

    @Override
    public final void b(n1 n1Var) {
        k3 k3Var = this.f3367b.E;
        if (k3Var != null) {
            d4 d4Var = k3Var.f3169a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    @Override
    public final boolean f() {
        z5 z5Var = this.f3367b;
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null) {
            return k3Var.f3169a.V4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        o2 o2Var;
        z5 z5Var = this.f3367b;
        k3 k3Var = z5Var.E;
        if (k3Var != null && z5Var.f2881a != null && (o2Var = k3Var.f3169a.Q3) != null) {
            o2Var.f(i10, i11);
        }
    }

    @Override
    public final void i(final n1 n1Var, final int i10, final int i11) {
        k3 k3Var;
        final k9 textSelectionHelper;
        final int l4;
        z5 z5Var = this.f3367b;
        if (!z5Var.G && i10 != i11 && (k3Var = z5Var.E) != null && (textSelectionHelper = k3Var.f3169a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != z5Var) && (l4 = z5Var.l(this.f3366a.f2906b)) >= 0) {
                z5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        z5 z5Var2 = t5.this.f3367b;
                        n1 n1Var2 = n1Var;
                        int length = n1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && n1Var2.getSelectionStart() != n1Var2.getSelectionEnd() && textSelectionHelper.j0(z5Var2, l4, i10, i12)) {
                            z5Var2.G = true;
                            n1Var2.setSelection(i12);
                            z5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void w(CharSequence charSequence) {
        k3 k3Var = this.f3367b.E;
        if (k3Var != null && charSequence != null && charSequence.length() > 0) {
            k3Var.f3169a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean x(n1 n1Var) {
        return false;
    }

    @Override
    public final void r() {
    }

    @Override
    public final void e(n1 n1Var) {
    }
}
