package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class t5 implements d1 {
    public final y5 f22019a;

    public t5(y5 y5Var) {
        this.f22019a = y5Var;
    }

    @Override
    public final void I(CharSequence charSequence) {
        v5 v5Var = this.f22019a.E;
        if (v5Var != null) {
            a3 a3Var = (a3) v5Var;
            if (charSequence != null && charSequence.length() > 0) {
                a3Var.f21571a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void Z(e1 e1Var, int i7, int i10) {
        v5 v5Var;
        h9 textSelectionHelper;
        y5 y5Var = this.f22019a;
        if (!y5Var.f22146n && i7 != i10 && (v5Var = y5Var.E) != null && (textSelectionHelper = ((a3) v5Var).f21571a.getTextSelectionHelper()) != null) {
            e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 6));
        }
    }

    @Override
    public final void b0(Editable editable) {
        y5 y5Var = this.f22019a;
        if (y5Var.f22151y != null) {
            y5Var.w();
            v5 v5Var = y5Var.E;
            if (v5Var != null) {
                q3 q3Var = ((a3) v5Var).f21571a;
                d2 d2Var = q3Var.R3;
                if (d2Var != null) {
                    d2Var.g();
                }
                q3Var.f21931p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = y5Var.f22151y.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                y5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                y5Var.invalidate();
                int measuredWidth = y5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (y5Var.g(measuredWidth, y5Var.getPaddingBottom() + y5Var.h.getMeasuredHeight() + y5Var.f22142b.getMeasuredHeight() + y5Var.getPaddingTop()) == y5Var.P) {
                        return;
                    }
                }
                y5Var.requestLayout();
            }
        }
    }

    @Override
    public final void d(e1 e1Var) {
        v5 v5Var = this.f22019a.E;
        if (v5Var != null) {
            q3 q3Var = ((a3) v5Var).f21571a;
            q3.Q1(q3Var, e1Var);
            q3Var.f21931p3.b(e1Var, true);
        }
    }

    @Override
    public final boolean g() {
        y5 y5Var = this.f22019a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && y5Var.f22151y != null) {
            return ((a3) v5Var).f21571a.V4();
        }
        return false;
    }

    @Override
    public final boolean h0(boolean z10) {
        return false;
    }

    @Override
    public final void m(int i7, int i10) {
        d2 d2Var;
        y5 y5Var = this.f22019a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && y5Var.f22151y != null && (d2Var = ((a3) v5Var).f21571a.R3) != null) {
            d2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean o(e1 e1Var) {
        y5 y5Var = this.f22019a;
        y5Var.f22145f.O();
        e1 e1Var2 = y5Var.f22145f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override
    public final boolean q0(e1 e1Var) {
        return false;
    }

    @Override
    public final void z(e1 e1Var) {
        a aVar;
        y5 y5Var = this.f22019a;
        v5 v5Var = y5Var.E;
        if (v5Var != null && (aVar = y5Var.f22151y) != null) {
            q3.T1(((a3) v5Var).f21571a, aVar);
        }
    }

    @Override
    public final void B() {
    }
}
