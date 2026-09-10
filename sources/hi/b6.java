package hi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class b6 implements j1 {
    public final g6 f9477a;

    public b6(g6 g6Var) {
        this.f9477a = g6Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        d6 d6Var = this.f9477a.f9627y;
        if (d6Var != null) {
            h3 h3Var = (h3) d6Var;
            if (charSequence != null && charSequence.length() > 0) {
                h3Var.f9636a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public final void G(Editable editable) {
        g6 g6Var = this.f9477a;
        if (g6Var.f9626x != null) {
            g6Var.w();
            d6 d6Var = g6Var.f9627y;
            if (d6Var != null) {
                z3 z3Var = ((h3) d6Var).f9636a;
                k2 k2Var = z3Var.J3;
                if (k2Var != null) {
                    k2Var.g();
                }
                z3Var.f10001h3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = g6Var.f9626x.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                g6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                g6Var.invalidate();
                int measuredWidth = g6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (g6Var.h(measuredWidth, g6Var.getPaddingBottom() + g6Var.h.getMeasuredHeight() + g6Var.f9619b.getMeasuredHeight() + g6Var.getPaddingTop()) == g6Var.O) {
                        return;
                    }
                }
                g6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return false;
    }

    @Override
    public final boolean P(k1 k1Var) {
        g6 g6Var = this.f9477a;
        g6Var.f9621f.r();
        k1 k1Var2 = g6Var.f9621f;
        k1Var2.setSelection(k1Var2.length());
        return true;
    }

    @Override
    public final void b(k1 k1Var) {
        d6 d6Var = this.f9477a.f9627y;
        if (d6Var != null) {
            z3 z3Var = ((h3) d6Var).f9636a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public final boolean f() {
        g6 g6Var = this.f9477a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && g6Var.f9626x != null) {
            return ((h3) d6Var).f9636a.R4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        k2 k2Var;
        g6 g6Var = this.f9477a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && g6Var.f9626x != null && (k2Var = ((h3) d6Var).f9636a.J3) != null) {
            k2Var.f(i10, i11);
        }
    }

    @Override
    public final void r(k1 k1Var, int i10, int i11) {
        d6 d6Var;
        s9 textSelectionHelper;
        g6 g6Var = this.f9477a;
        if (!g6Var.f9622n && i10 != i11 && (d6Var = g6Var.f9627y) != null && (textSelectionHelper = ((h3) d6Var).f9636a.getTextSelectionHelper()) != null) {
            k1Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void x(k1 k1Var) {
        a aVar;
        g6 g6Var = this.f9477a;
        d6 d6Var = g6Var.f9627y;
        if (d6Var != null && (aVar = g6Var.f9626x) != null) {
            z3.O1(((h3) d6Var).f9636a, aVar);
        }
    }

    @Override
    public final void t() {
    }
}
