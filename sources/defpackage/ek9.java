package defpackage;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
public final class ek9 implements me9 {
    public final nk9 a;
    public final kk9 b;

    public ek9(kk9 kk9Var, nk9 nk9Var) {
        this.b = kk9Var;
        this.a = nk9Var;
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        return false;
    }

    @Override
    public final void M(CharSequence charSequence) {
        kg9 kg9Var = this.b.F;
        if (kg9Var != null && charSequence != null && charSequence.length() > 0) {
            kg9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final void S(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.a.b;
        if (pagetablecell != null) {
            fhb.d(pagetablecell, editable);
        }
        kk9 kk9Var = this.b;
        kk9Var.w.requestLayout();
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null) {
            kg9Var.a();
        }
    }

    @Override
    public final boolean Z(boolean z) {
        return this.b.u(this.a, z);
    }

    @Override
    public final void d(ne9 ne9Var) {
        kg9 kg9Var = this.b.F;
        if (kg9Var != null) {
            ch9 ch9Var = kg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override
    public final boolean i() {
        kk9 kk9Var = this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null) {
            return kg9Var.a.V4();
        }
        return false;
    }

    @Override
    public final void k(int i, int i2) {
        of9 of9Var;
        kk9 kk9Var = this.b;
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null && (of9Var = kg9Var.a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void r(final ne9 ne9Var, final int i, final int i2) {
        kg9 kg9Var;
        final gkb textSelectionHelper;
        final int m;
        kk9 kk9Var = this.b;
        if (!kk9Var.H && i != i2 && (kg9Var = kk9Var.F) != null && (textSelectionHelper = kg9Var.a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.w() || textSelectionHelper.W != kk9Var) && (m = kk9Var.m(this.a.b)) >= 0) {
                kk9Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        kk9 kk9Var2 = ek9.this.b;
                        ne9 ne9Var2 = ne9Var;
                        int length = ne9Var2.length();
                        int i3 = i2;
                        if (length >= i3 && ne9Var2.getSelectionStart() != ne9Var2.getSelectionEnd() && textSelectionHelper.i0(kk9Var2, m, i, i3)) {
                            kk9Var2.H = true;
                            ne9Var2.setSelection(i3);
                            kk9Var2.H = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override
    public final void H() {
    }

    @Override
    public final void W(ne9 ne9Var) {
    }
}
