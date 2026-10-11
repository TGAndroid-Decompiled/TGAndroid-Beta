package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class a6 implements h1 {
    public final f6 f12277a;

    public a6(f6 f6Var) {
        this.f12277a = f6Var;
    }

    @Override
    public final void E(CharSequence charSequence) {
        c6 c6Var = this.f12277a.f12424y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f12410a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void L(Editable editable) {
        f6 f6Var = this.f12277a;
        if (f6Var.f12423x != null) {
            f6Var.w();
            c6 c6Var = f6Var.f12424y;
            if (c6Var != null) {
                x3 x3Var = ((f3) c6Var).f12410a;
                i2 i2Var = x3Var.H3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f12808f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = f6Var.f12423x.f12233b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                f6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                f6Var.invalidate();
                int measuredWidth = f6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (f6Var.h(measuredWidth, f6Var.getPaddingBottom() + f6Var.h.getMeasuredHeight() + f6Var.f12415b.getMeasuredHeight() + f6Var.getPaddingTop()) == f6Var.O) {
                        return;
                    }
                }
                f6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean N(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        c6 c6Var = this.f12277a.f12424y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).f12410a;
            x3.N1(x3Var, i1Var);
            x3Var.f12808f3.x(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        f6 f6Var = this.f12277a;
        c6 c6Var = f6Var.f12424y;
        if (c6Var != null && f6Var.f12423x != null) {
            return ((f3) c6Var).f12410a.T4();
        }
        return false;
    }

    @Override
    public final void i(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.f12277a;
        c6 c6Var = f6Var.f12424y;
        if (c6Var != null && f6Var.f12423x != null && (i2Var = ((f3) c6Var).f12410a.H3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void k(i1 i1Var) {
        a aVar;
        f6 f6Var = this.f12277a;
        c6 c6Var = f6Var.f12424y;
        if (c6Var != null && (aVar = f6Var.f12423x) != null) {
            x3.Q1(((f3) c6Var).f12410a, aVar);
        }
    }

    @Override
    public final boolean m(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean r(i1 i1Var) {
        f6 f6Var = this.f12277a;
        f6Var.f12418f.r();
        i1 i1Var2 = f6Var.f12418f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override
    public final void x(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        o9 textSelectionHelper;
        f6 f6Var = this.f12277a;
        if (!f6Var.f12419n && i10 != i11 && (c6Var = f6Var.f12424y) != null && (textSelectionHelper = ((f3) c6Var).f12410a.getTextSelectionHelper()) != null) {
            i1Var.post(new ei.w4(this, i1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void u() {
    }
}
