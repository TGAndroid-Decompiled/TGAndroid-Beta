package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class b6 implements g1 {
    public final g6 f13821a;

    public b6(g6 g6Var) {
        this.f13821a = g6Var;
    }

    @Override
    public final void C(h1 h1Var) {
        a aVar;
        g6 g6Var = this.f13821a;
        d6 d6Var = g6Var.f13965y;
        if (d6Var != null && (aVar = g6Var.f13964x) != null) {
            v3.O1(((d3) d6Var).f13887a, aVar);
        }
    }

    @Override
    public final void N(Editable editable) {
        g6 g6Var = this.f13821a;
        if (g6Var.f13964x != null) {
            g6Var.w();
            d6 d6Var = g6Var.f13965y;
            if (d6Var != null) {
                v3 v3Var = ((d3) d6Var).f13887a;
                g2 g2Var = v3Var.J3;
                if (g2Var != null) {
                    g2Var.g();
                }
                v3Var.f14275h3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = g6Var.f13964x.f13758b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                g6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                g6Var.invalidate();
                int measuredWidth = g6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (g6Var.h(measuredWidth, g6Var.getPaddingBottom() + g6Var.h.getMeasuredHeight() + g6Var.f13956b.getMeasuredHeight() + g6Var.getPaddingTop()) == g6Var.O) {
                        return;
                    }
                }
                g6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean R(boolean z10) {
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        d6 d6Var = this.f13821a.f13965y;
        if (d6Var != null) {
            v3 v3Var = ((d3) d6Var).f13887a;
            v3.L1(v3Var, h1Var);
            v3Var.f14275h3.v(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        g6 g6Var = this.f13821a;
        d6 d6Var = g6Var.f13965y;
        if (d6Var != null && g6Var.f13964x != null) {
            return ((d3) d6Var).f13887a.R4();
        }
        return false;
    }

    @Override
    public final boolean h(h1 h1Var) {
        g6 g6Var = this.f13821a;
        g6Var.f13959f.r();
        h1 h1Var2 = g6Var.f13959f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void i(int i10, int i11) {
        g2 g2Var;
        g6 g6Var = this.f13821a;
        d6 d6Var = g6Var.f13965y;
        if (d6Var != null && g6Var.f13964x != null && (g2Var = ((d3) d6Var).f13887a.J3) != null) {
            g2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean k(h1 h1Var) {
        return false;
    }

    @Override
    public final void o(h1 h1Var, int i10, int i11) {
        d6 d6Var;
        q9 textSelectionHelper;
        g6 g6Var = this.f13821a;
        if (!g6Var.f13960n && i10 != i11 && (d6Var = g6Var.f13965y) != null && (textSelectionHelper = ((d3) d6Var).f13887a.getTextSelectionHelper()) != null) {
            h1Var.post(new fi.y4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        d6 d6Var = this.f13821a.f13965y;
        if (d6Var != null) {
            d3 d3Var = (d3) d6Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f13887a.s4(charSequence.toString());
            }
        }
    }

    @Override
    public final void r() {
    }
}
