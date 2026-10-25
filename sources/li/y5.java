package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class y5 implements f1 {
    public final d6 f17652a;

    public y5(d6 d6Var) {
        this.f17652a = d6Var;
    }

    @Override
    public final void E(g1 g1Var, int i10, int i11) {
        a6 a6Var;
        s9 textSelectionHelper;
        d6 d6Var = this.f17652a;
        if (!d6Var.f17198n && i10 != i11 && (a6Var = d6Var.f17203y) != null && (textSelectionHelper = ((d3) a6Var).f17189a.getTextSelectionHelper()) != null) {
            g1Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void T(CharSequence charSequence) {
        a6 a6Var = this.f17652a.f17203y;
        if (a6Var != null) {
            d3 d3Var = (d3) a6Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f17189a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public final void Y(Editable editable) {
        d6 d6Var = this.f17652a;
        if (d6Var.f17202x != null) {
            d6Var.v();
            a6 a6Var = d6Var.f17203y;
            if (a6Var != null) {
                v3 v3Var = ((d3) a6Var).f17189a;
                f2 f2Var = v3Var.R3;
                if (f2Var != null) {
                    f2Var.g();
                }
                v3Var.f17557p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = d6Var.f17202x.f17054b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                d6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                d6Var.invalidate();
                int measuredWidth = d6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (d6Var.g(measuredWidth, d6Var.getPaddingBottom() + d6Var.h.getMeasuredHeight() + d6Var.f17195b.getMeasuredHeight() + d6Var.getPaddingTop()) == d6Var.O) {
                        return;
                    }
                }
                d6Var.requestLayout();
            }
        }
    }

    @Override
    public final void b(g1 g1Var) {
        a6 a6Var = this.f17652a.f17203y;
        if (a6Var != null) {
            v3 v3Var = ((d3) a6Var).f17189a;
            v3.S1(v3Var, g1Var);
            v3Var.f17557p3.s(g1Var, true);
        }
    }

    @Override
    public final boolean e() {
        d6 d6Var = this.f17652a;
        a6 a6Var = d6Var.f17203y;
        if (a6Var != null && d6Var.f17202x != null) {
            return ((d3) a6Var).f17189a.Y4();
        }
        return false;
    }

    @Override
    public final boolean f0(boolean z10) {
        return false;
    }

    @Override
    public final boolean g(g1 g1Var) {
        return false;
    }

    @Override
    public final void k(int i10, int i11) {
        f2 f2Var;
        d6 d6Var = this.f17652a;
        a6 a6Var = d6Var.f17203y;
        if (a6Var != null && d6Var.f17202x != null && (f2Var = ((d3) a6Var).f17189a.R3) != null) {
            f2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean o(g1 g1Var) {
        d6 d6Var = this.f17652a;
        d6Var.f17197f.r();
        g1 g1Var2 = d6Var.f17197f;
        g1Var2.setSelection(g1Var2.length());
        return true;
    }

    @Override
    public final void t(g1 g1Var) {
        a aVar;
        d6 d6Var = this.f17652a;
        a6 a6Var = d6Var.f17203y;
        if (a6Var != null && (aVar = d6Var.f17202x) != null) {
            v3.V1(((d3) a6Var).f17189a, aVar);
        }
    }

    @Override
    public final void R() {
    }
}
