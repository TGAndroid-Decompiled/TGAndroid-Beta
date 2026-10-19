package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class x5 implements g1 {
    public final c6 f15655a;

    public x5(c6 c6Var) {
        this.f15655a = c6Var;
    }

    @Override
    public final void G(Editable editable) {
        c6 c6Var = this.f15655a;
        if (c6Var.f15187x != null) {
            c6Var.w();
            z5 z5Var = c6Var.f15188y;
            if (z5Var != null) {
                w3 w3Var = ((e3) z5Var).f15245a;
                h2 h2Var = w3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f15592f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = c6Var.f15187x.f15095b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                c6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                c6Var.invalidate();
                int measuredWidth = c6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (c6Var.h(measuredWidth, c6Var.getPaddingBottom() + c6Var.h.getMeasuredHeight() + c6Var.f15180b.getMeasuredHeight() + c6Var.getPaddingTop()) == c6Var.O) {
                        return;
                    }
                }
                c6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean M(boolean z10) {
        return false;
    }

    @Override
    public final boolean P(h1 h1Var) {
        return false;
    }

    @Override
    public final void R(h1 h1Var, int i10, int i11) {
        z5 z5Var;
        n9 textSelectionHelper;
        c6 c6Var = this.f15655a;
        if (!c6Var.f15183n && i10 != i11 && (z5Var = c6Var.f15188y) != null && (textSelectionHelper = ((e3) z5Var).f15245a.getTextSelectionHelper()) != null) {
            h1Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void c(h1 h1Var) {
        z5 z5Var = this.f15655a.f15188y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).f15245a;
            w3.N1(w3Var, h1Var);
            w3Var.f15592f3.o(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        c6 c6Var = this.f15655a;
        z5 z5Var = c6Var.f15188y;
        if (z5Var != null && c6Var.f15187x != null) {
            return ((e3) z5Var).f15245a.T4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.f15655a;
        z5 z5Var = c6Var.f15188y;
        if (z5Var != null && c6Var.f15187x != null && (h2Var = ((e3) z5Var).f15245a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void k(h1 h1Var) {
        a aVar;
        c6 c6Var = this.f15655a;
        z5 z5Var = c6Var.f15188y;
        if (z5Var != null && (aVar = c6Var.f15187x) != null) {
            w3.Q1(((e3) z5Var).f15245a, aVar);
        }
    }

    @Override
    public final boolean s(h1 h1Var) {
        c6 c6Var = this.f15655a;
        c6Var.f15182f.r();
        h1 h1Var2 = c6Var.f15182f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void x(CharSequence charSequence) {
        z5 z5Var = this.f15655a.f15188y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f15245a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void o() {
    }
}
