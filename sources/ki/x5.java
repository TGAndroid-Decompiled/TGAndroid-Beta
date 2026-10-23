package ki;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class x5 implements g1 {
    public final c6 f15716a;

    public x5(c6 c6Var) {
        this.f15716a = c6Var;
    }

    @Override
    public final void G(Editable editable) {
        c6 c6Var = this.f15716a;
        if (c6Var.f15245x != null) {
            c6Var.v();
            z5 z5Var = c6Var.f15246y;
            if (z5Var != null) {
                w3 w3Var = ((e3) z5Var).f15303a;
                h2 h2Var = w3Var.K3;
                if (h2Var != null) {
                    h2Var.g();
                }
                w3Var.f15656i3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = c6Var.f15245x.f15141b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                c6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                c6Var.invalidate();
                int measuredWidth = c6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (c6Var.g(measuredWidth, c6Var.getPaddingBottom() + c6Var.h.getMeasuredHeight() + c6Var.f15238b.getMeasuredHeight() + c6Var.getPaddingTop()) == c6Var.O) {
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
        o9 textSelectionHelper;
        c6 c6Var = this.f15716a;
        if (!c6Var.f15241n && i10 != i11 && (z5Var = c6Var.f15246y) != null && (textSelectionHelper = ((e3) z5Var).f15303a.getTextSelectionHelper()) != null) {
            h1Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void c(h1 h1Var) {
        z5 z5Var = this.f15716a.f15246y;
        if (z5Var != null) {
            w3 w3Var = ((e3) z5Var).f15303a;
            w3.S1(w3Var, h1Var);
            w3Var.f15656i3.o(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        c6 c6Var = this.f15716a;
        z5 z5Var = c6Var.f15246y;
        if (z5Var != null && c6Var.f15245x != null) {
            return ((e3) z5Var).f15303a.Y4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        c6 c6Var = this.f15716a;
        z5 z5Var = c6Var.f15246y;
        if (z5Var != null && c6Var.f15245x != null && (h2Var = ((e3) z5Var).f15303a.K3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void k(h1 h1Var) {
        a aVar;
        c6 c6Var = this.f15716a;
        z5 z5Var = c6Var.f15246y;
        if (z5Var != null && (aVar = c6Var.f15245x) != null) {
            w3.V1(((e3) z5Var).f15303a, aVar);
        }
    }

    @Override
    public final boolean s(h1 h1Var) {
        c6 c6Var = this.f15716a;
        c6Var.f15240f.r();
        h1 h1Var2 = c6Var.f15240f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void x(CharSequence charSequence) {
        z5 z5Var = this.f15716a.f15246y;
        if (z5Var != null) {
            e3 e3Var = (e3) z5Var;
            if (charSequence != null && charSequence.length() > 0) {
                e3Var.f15303a.z4(charSequence.toString());
            }
        }
    }

    @Override
    public final void m() {
    }
}
