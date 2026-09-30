package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class z5 implements h1 {
    public final e6 f11810a;

    public z5(e6 e6Var) {
        this.f11810a = e6Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        b6 b6Var;
        q9 textSelectionHelper;
        e6 e6Var = this.f11810a;
        if (!e6Var.f11364n && i10 != i11 && (b6Var = e6Var.f11369y) != null && (textSelectionHelper = ((f3) b6Var).f11377a.getTextSelectionHelper()) != null) {
            i1Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        b6 b6Var = this.f11810a.f11369y;
        if (b6Var != null) {
            f3 f3Var = (f3) b6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f11377a.v4(charSequence.toString());
            }
        }
    }

    @Override
    public final void U(Editable editable) {
        e6 e6Var = this.f11810a;
        if (e6Var.f11368x != null) {
            e6Var.w();
            b6 b6Var = e6Var.f11369y;
            if (b6Var != null) {
                x3 x3Var = ((f3) b6Var).f11377a;
                i2 i2Var = x3Var.Q3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f11748o3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = e6Var.f11368x.f11205b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                e6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                e6Var.invalidate();
                int measuredWidth = e6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (e6Var.h(measuredWidth, e6Var.getPaddingBottom() + e6Var.h.getMeasuredHeight() + e6Var.f11361b.getMeasuredHeight() + e6Var.getPaddingTop()) == e6Var.O) {
                        return;
                    }
                }
                e6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        b6 b6Var = this.f11810a.f11369y;
        if (b6Var != null) {
            x3 x3Var = ((f3) b6Var).f11377a;
            x3.O1(x3Var, i1Var);
            x3Var.f11748o3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        e6 e6Var = this.f11810a;
        b6 b6Var = e6Var.f11369y;
        if (b6Var != null && e6Var.f11368x != null) {
            return ((f3) b6Var).f11377a.U4();
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11) {
        i2 i2Var;
        e6 e6Var = this.f11810a;
        b6 b6Var = e6Var.f11369y;
        if (b6Var != null && e6Var.f11368x != null && (i2Var = ((f3) b6Var).f11377a.Q3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void m(i1 i1Var) {
        a aVar;
        e6 e6Var = this.f11810a;
        b6 b6Var = e6Var.f11369y;
        if (b6Var != null && (aVar = e6Var.f11368x) != null) {
            x3.R1(((f3) b6Var).f11377a, aVar);
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        e6 e6Var = this.f11810a;
        e6Var.f11363f.r();
        i1 i1Var2 = e6Var.f11363f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override
    public final void x() {
    }
}
