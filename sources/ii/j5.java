package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r9;
public final class j5 implements h1 {
    public final s5 f11456a;
    public final p5 f11457b;

    public j5(p5 p5Var, s5 s5Var) {
        this.f11457b = p5Var;
        this.f11456a = s5Var;
    }

    @Override
    public final void D(final i1 i1Var, final int i10, final int i11) {
        d3 d3Var;
        final r9 textSelectionHelper;
        final int k10;
        p5 p5Var = this.f11457b;
        if (!p5Var.G && i10 != i11 && (d3Var = p5Var.E) != null && (textSelectionHelper = d3Var.f11293a.getTextSelectionHelper()) != null) {
            if ((!textSelectionHelper.y() || textSelectionHelper.W != p5Var) && (k10 = p5Var.k(this.f11456a.f11617b)) >= 0) {
                p5Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        p5 p5Var2 = j5.this.f11457b;
                        i1 i1Var2 = i1Var;
                        int length = i1Var2.length();
                        int i12 = i11;
                        if (length >= i12 && i1Var2.getSelectionStart() != i1Var2.getSelectionEnd() && textSelectionHelper.k0(p5Var2, k10, i10, i12)) {
                            p5Var2.G = true;
                            i1Var2.setSelection(i12);
                            p5Var2.G = false;
                        }
                    }
                });
            }
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        d3 d3Var = this.f11457b.E;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f11293a.t4(charSequence.toString());
        }
    }

    @Override
    public final void W(Editable editable) {
        TL_iv.pageTableCell pagetablecell = this.f11456a.f11617b;
        if (pagetablecell != null) {
            i6.d(pagetablecell, editable);
        }
        p5 p5Var = this.f11457b;
        p5Var.v.requestLayout();
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11207a != null) {
            d3Var.a();
        }
    }

    @Override
    public final boolean b0(boolean z10) {
        return this.f11457b.s(this.f11456a, z10);
    }

    @Override
    public final void c(i1 i1Var) {
        d3 d3Var = this.f11457b.E;
        if (d3Var != null) {
            x3 x3Var = d3Var.f11293a;
            x3.M1(x3Var, i1Var);
            x3Var.f11728h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        p5 p5Var = this.f11457b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11207a != null) {
            return d3Var.f11293a.S4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        i2 i2Var;
        p5 p5Var = this.f11457b;
        d3 d3Var = p5Var.E;
        if (d3Var != null && p5Var.f11207a != null && (i2Var = d3Var.f11293a.J3) != null) {
            i2Var.f(i10, i11);
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
