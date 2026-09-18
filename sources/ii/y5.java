package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class y5 implements h1 {
    public final d6 f11784a;

    public y5(d6 d6Var) {
        this.f11784a = d6Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        a6 a6Var;
        q9 textSelectionHelper;
        d6 d6Var = this.f11784a;
        if (!d6Var.f11341n && i10 != i11 && (a6Var = d6Var.f11346y) != null && (textSelectionHelper = ((e3) a6Var).f11357a.getTextSelectionHelper()) != null) {
            i1Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        a6 a6Var = this.f11784a.f11346y;
        if (a6Var != null) {
            e3 e3Var = (e3) a6Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f11357a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void U(Editable editable) {
        d6 d6Var = this.f11784a;
        if (d6Var.f11345x != null) {
            d6Var.w();
            a6 a6Var = d6Var.f11346y;
            if (a6Var != null) {
                w3 w3Var = ((e3) a6Var).f11357a;
                h2 h2Var = w3Var.J3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f11714h3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = d6Var.f11345x.f11204b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                d6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                d6Var.invalidate();
                int measuredWidth = d6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (d6Var.h(measuredWidth, d6Var.getPaddingBottom() + d6Var.h.getMeasuredHeight() + d6Var.f11338b.getMeasuredHeight() + d6Var.getPaddingTop()) == d6Var.O) {
                        return;
                    }
                }
                d6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        a6 a6Var = this.f11784a.f11346y;
        if (a6Var != null) {
            w3 w3Var = ((e3) a6Var).f11357a;
            w3.N1(w3Var, i1Var);
            w3Var.f11714h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        d6 d6Var = this.f11784a;
        a6 a6Var = d6Var.f11346y;
        if (a6Var != null && d6Var.f11345x != null) {
            return ((e3) a6Var).f11357a.T4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        h2 h2Var;
        d6 d6Var = this.f11784a;
        a6 a6Var = d6Var.f11346y;
        if (a6Var != null && d6Var.f11345x != null && (h2Var = ((e3) a6Var).f11357a.J3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void m(i1 i1Var) {
        a aVar;
        d6 d6Var = this.f11784a;
        a6 a6Var = d6Var.f11346y;
        if (a6Var != null && (aVar = d6Var.f11345x) != null) {
            w3.Q1(((e3) a6Var).f11357a, aVar);
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        d6 d6Var = this.f11784a;
        d6Var.f11340f.r();
        i1 i1Var2 = d6Var.f11340f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override
    public final void x() {
    }
}
