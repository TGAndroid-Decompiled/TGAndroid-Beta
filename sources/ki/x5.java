package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class x5 implements g1 {
    public final c6 f15649a;

    public x5(c6 c6Var) {
        this.f15649a = c6Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        z5 z5Var = this.f15649a.f15182y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f15239a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void M(Editable editable) {
        c6 c6Var = this.f15649a;
        if (c6Var.f15181x != null) {
            c6Var.w();
            z5 z5Var = c6Var.f15182y;
            if (z5Var != null) {
                w3 w3Var = ((e3) z5Var).f15239a;
                h2 h2Var = w3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f15586f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = c6Var.f15181x.f15089b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                c6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                c6Var.invalidate();
                int measuredWidth = c6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (c6Var.h(measuredWidth, c6Var.getPaddingBottom() + c6Var.h.getMeasuredHeight() + c6Var.f15174b.getMeasuredHeight() + c6Var.getPaddingTop()) == c6Var.O) {
                        return;
                    }
                }
                c6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean Q(boolean z10) {
        return false;
    }

    @Override
    public final boolean R(h1 h1Var) {
        return false;
    }

    @Override
    public final void V(h1 h1Var, int i10, int i11) {
        z5 z5Var;
        n9 textSelectionHelper;
        c6 c6Var = this.f15649a;
        if (!c6Var.f15177n && i10 != i11 && (z5Var = c6Var.f15182y) != null && (textSelectionHelper = ((e3) z5Var).f15239a.getTextSelectionHelper()) != null) {
            h1Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void c(h1 h1Var) {
        z5 z5Var = this.f15649a.f15182y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).f15239a;
            w3.N1(w3Var, h1Var);
            w3Var.f15586f3.n(h1Var, true);
        }
    }

    @Override
    public final boolean f() {
        c6 c6Var = this.f15649a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && c6Var.f15181x != null) {
            return ((e3) z5Var).f15239a.T4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.f15649a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && c6Var.f15181x != null && (h2Var = ((e3) z5Var).f15239a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void l(h1 h1Var) {
        a aVar;
        c6 c6Var = this.f15649a;
        z5 z5Var = c6Var.f15182y;
        if (z5Var != null && (aVar = c6Var.f15181x) != null) {
            w3.Q1(((e3) z5Var).f15239a, aVar);
        }
    }

    @Override
    public final boolean q(h1 h1Var) {
        c6 c6Var = this.f15649a;
        c6Var.f15176f.r();
        h1 h1Var2 = c6Var.f15176f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void m() {
    }
}
