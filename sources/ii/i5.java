package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class i5 implements h1 {
    public final r5 f11444a;
    public final o5 f11445b;

    public i5(o5 o5Var, r5 r5Var) {
        this.f11445b = o5Var;
        this.f11444a = r5Var;
    }

    @Override
    public final void D(final i1 i1Var, final int i10, final int i11) {
        c3 c3Var;
        final q9 textSelectionHelper;
        final int k10;
        o5 o5Var = this.f11445b;
        if (!o5Var.G && i10 != i11 && (c3Var = o5Var.E) != null && (textSelectionHelper = c3Var.f11283a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != o5Var) && (k10 = o5Var.k(this.f11444a.f11604b)) >= 0) {
                o5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        o5 o5Var2 = i5.this.f11445b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.k0(o5Var2, k10, i10, i12)) {
                            o5Var2.G = true;
                            i1Var2.setSelection(i12);
                            o5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        c3 c3Var = this.f11445b.E;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f11283a.t4(charSequence.toString());
        }
    }

    @Override
    public final void W(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f11444a.f11604b;
        if (pagetablecell != null) {
            h6.d(pagetablecell, editable);
        }
        o5 o5Var = this.f11445b;
        o5Var.v.requestLayout();
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11217a != null) {
            c3Var.a();
        }
    }

    @Override
    public final boolean b0(boolean z10) {
        return this.f11445b.s(this.f11444a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        c3 c3Var = this.f11445b.E;
        if (c3Var != null) {
            w3 w3Var = c3Var.f11283a;
            w3.M1(w3Var, i1Var);
            w3Var.f11711h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        o5 o5Var = this.f11445b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11217a != null) {
            return c3Var.f11283a.S4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        h2 h2Var;
        o5 o5Var = this.f11445b;
        c3 c3Var = o5Var.E;
        if (c3Var != null && o5Var.f11217a != null && (h2Var = c3Var.f11283a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean q(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        return false;
    }

    @Override
    public final void m(i1 i1Var) {
    }

    @Override
    public final void x() {
    }
}
