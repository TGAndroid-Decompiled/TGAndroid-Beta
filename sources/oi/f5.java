package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class f5 implements d1 {
    public final o5 f22065a;
    public final l5 f22066b;

    public f5(l5 l5Var, o5 o5Var) {
        this.f22066b = l5Var;
        this.f22065a = o5Var;
    }

    @Override
    public final void A(int i7, int i10) {
        e2 e2Var;
        l5 l5Var = this.f22066b;
        a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22442a != null && (e2Var = a3Var.f21935a.R3) != null) {
            e2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return this.f22066b.u(this.f22065a, z10);
    }

    @Override
    public final boolean J(e1 e1Var) {
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        a3 a3Var = this.f22066b.F;
        if (a3Var != null && charSequence != null && charSequence.length() > 0) {
            a3Var.f21935a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean d2(e1 e1Var) {
        return false;
    }

    @Override
    public final void e(e1 e1Var) {
        a3 a3Var = this.f22066b.F;
        if (a3Var != null) {
            s3 s3Var = a3Var.f21935a;
            s3.Q1(s3Var, e1Var);
            s3Var.f22337p3.k(e1Var, true);
        }
    }

    @Override
    public final boolean o() {
        l5 l5Var = this.f22066b;
        a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22442a != null) {
            return a3Var.f21935a.V4();
        }
        return false;
    }

    @Override
    public final void r1(final e1 e1Var, final int i7, final int i10) {
        a3 a3Var;
        final i9 textSelectionHelper;
        final int l10;
        l5 l5Var = this.f22066b;
        if (!l5Var.H && i7 != i10 && (a3Var = l5Var.F) != null && (textSelectionHelper = a3Var.f21935a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.x() || textSelectionHelper.W != l5Var) && (l10 = l5Var.l(this.f22065a.f22227b)) >= 0) {
                l5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        l5 l5Var2 = f5.this.f22066b;
                        e1 e1Var2 = e1Var;
                        int length = e1Var2.length();
                        int i11 = i10;
                        if (length >= i11 && e1Var2.getSelectionStart() != e1Var2.getSelectionEnd() && textSelectionHelper.j0(l5Var2, l10, i7, i11)) {
                            l5Var2.H = true;
                            e1Var2.setSelection(i11);
                            l5Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void s1(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f22065a.f22227b;
        if (pagetablecell != null) {
            d6.d(pagetablecell, editable);
        }
        l5 l5Var = this.f22066b;
        l5Var.f22168w.requestLayout();
        a3 a3Var = l5Var.F;
        if (a3Var != null && l5Var.f22442a != null) {
            a3Var.a();
        }
    }

    @Override
    public final void E0() {
    }

    @Override
    public final void x0(e1 e1Var) {
    }
}
