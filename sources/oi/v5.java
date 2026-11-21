package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
public final class v5 implements e1 {
    public final a6 f22483a;

    public v5(a6 a6Var) {
        this.f22483a = a6Var;
    }

    @Override
    public final void A(int i7, int i10) {
        g2 g2Var;
        a6 a6Var = this.f22483a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f21975y != null && (g2Var = ((d3) x5Var).f22053a.R3) != null) {
            g2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return false;
    }

    @Override
    public final boolean J(f1 f1Var) {
        a6 a6Var = this.f22483a;
        a6Var.f21969f.O();
        f1 f1Var2 = a6Var.f21969f;
        f1Var2.setSelection(f1Var2.length());
        return true;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        x5 x5Var = this.f22483a.E;
        if (x5Var != null) {
            d3 d3Var = (d3) x5Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f22053a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean d2(f1 f1Var) {
        return false;
    }

    @Override
    public final void e(f1 f1Var) {
        x5 x5Var = this.f22483a.E;
        if (x5Var != null) {
            t3 t3Var = ((d3) x5Var).f22053a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22425p3.k(f1Var, true);
        }
    }

    @Override
    public final boolean o() {
        a6 a6Var = this.f22483a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && a6Var.f21975y != null) {
            return ((d3) x5Var).f22053a.V4();
        }
        return false;
    }

    @Override
    public final void r1(f1 f1Var, int i7, int i10) {
        x5 x5Var;
        j9 textSelectionHelper;
        a6 a6Var = this.f22483a;
        if (!a6Var.f21970n && i7 != i10 && (x5Var = a6Var.E) != null && (textSelectionHelper = ((d3) x5Var).f22053a.getTextSelectionHelper()) != null) {
            f1Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 6));
        }
    }

    @Override
    public final void s1(Editable editable) {
        a6 a6Var = this.f22483a;
        if (a6Var.f21975y != null) {
            a6Var.w();
            x5 x5Var = a6Var.E;
            if (x5Var != null) {
                t3 t3Var = ((d3) x5Var).f22053a;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.g();
                }
                t3Var.f22425p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = a6Var.f21975y.f21932b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a6Var.invalidate();
                int measuredWidth = a6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (a6Var.g(measuredWidth, a6Var.getPaddingBottom() + a6Var.h.getMeasuredHeight() + a6Var.f21966b.getMeasuredHeight() + a6Var.getPaddingTop()) == a6Var.P) {
                        return;
                    }
                }
                a6Var.requestLayout();
            }
        }
    }

    @Override
    public final void x0(f1 f1Var) {
        a aVar;
        a6 a6Var = this.f22483a;
        x5 x5Var = a6Var.E;
        if (x5Var != null && (aVar = a6Var.f21975y) != null) {
            t3.T1(((d3) x5Var).f22053a, aVar);
        }
    }

    @Override
    public final void E0() {
    }
}
