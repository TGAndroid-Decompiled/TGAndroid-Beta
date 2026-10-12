package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class z5 implements h1 {
    public final e6 f12879a;

    public z5(e6 e6Var) {
        this.f12879a = e6Var;
    }

    @Override
    public final void D(i1 i1Var, int i10, int i11) {
        b6 b6Var;
        o9 textSelectionHelper;
        e6 e6Var = this.f12879a;
        if (!e6Var.f12405n && i10 != i11 && (b6Var = e6Var.f12410y) != null && (textSelectionHelper = ((f3) b6Var).f12419a.getTextSelectionHelper()) != null) {
            i1Var.post(new ei.w4(this, i1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        b6 b6Var = this.f12879a.f12410y;
        if (b6Var != null) {
            f3 f3Var = (f3) b6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f12419a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void S(Editable editable) {
        e6 e6Var = this.f12879a;
        if (e6Var.f12409x != null) {
            e6Var.w();
            b6 b6Var = e6Var.f12410y;
            if (b6Var != null) {
                x3 x3Var = ((f3) b6Var).f12419a;
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f12807f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = e6Var.f12409x.f12232b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                e6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                e6Var.invalidate();
                int measuredWidth = e6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (e6Var.h(measuredWidth, e6Var.getPaddingBottom() + e6Var.h.getMeasuredHeight() + e6Var.f12401b.getMeasuredHeight() + e6Var.getPaddingTop()) == e6Var.O) {
                        return;
                    }
                }
                e6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean U(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        b6 b6Var = this.f12879a.f12410y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).f12419a;
            x3.N1(x3Var, i1Var);
            x3Var.f12807f3.w(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        e6 e6Var = this.f12879a;
        b6 b6Var = e6Var.f12410y;
        if (b6Var != null && e6Var.f12409x != null) {
            return ((f3) b6Var).f12419a.T4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        i2 i2Var;
        e6 e6Var = this.f12879a;
        b6 b6Var = e6Var.f12410y;
        if (b6Var != null && e6Var.f12409x != null && (i2Var = ((f3) b6Var).f12419a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void l(i1 i1Var) {
        a aVar;
        e6 e6Var = this.f12879a;
        b6 b6Var = e6Var.f12410y;
        if (b6Var != null && (aVar = e6Var.f12409x) != null) {
            x3.Q1(((f3) b6Var).f12419a, aVar);
        }
    }

    @Override
    public final boolean o(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean w(i1 i1Var) {
        e6 e6Var = this.f12879a;
        e6Var.f12404f.r();
        i1 i1Var2 = e6Var.f12404f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override
    public final void y() {
    }
}
