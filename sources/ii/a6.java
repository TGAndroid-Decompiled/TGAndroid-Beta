package ii;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class a6 implements h1 {
    public final f6 f12230a;

    public a6(f6 f6Var) {
        this.f12230a = f6Var;
    }

    @Override
    public final void B(Editable editable) {
        f6 f6Var = this.f12230a;
        if (f6Var.f12376x != null) {
            f6Var.w();
            c6 c6Var = f6Var.f12377y;
            if (c6Var != null) {
                x3 x3Var = ((f3) c6Var).f12361a;
                i2 i2Var = x3Var.Q3;
                if (i2Var != null) {
                    i2Var.g();
                }
                x3Var.f12769o3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = f6Var.f12376x.f12186b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                f6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                f6Var.invalidate();
                int measuredWidth = f6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (f6Var.h(measuredWidth, f6Var.getPaddingBottom() + f6Var.h.getMeasuredHeight() + f6Var.f12368b.getMeasuredHeight() + f6Var.getPaddingTop()) == f6Var.O) {
                        return;
                    }
                }
                f6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean G(boolean z10) {
        return false;
    }

    @Override
    public final void b(i1 i1Var) {
        c6 c6Var = this.f12230a.f12377y;
        if (c6Var != null) {
            x3 x3Var = ((f3) c6Var).f12361a;
            x3.O1(x3Var, i1Var);
            x3Var.f12769o3.P(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        f6 f6Var = this.f12230a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && f6Var.f12376x != null) {
            return ((f3) c6Var).f12361a.U4();
        }
        return false;
    }

    @Override
    public final void f(int i10, int i11) {
        i2 i2Var;
        f6 f6Var = this.f12230a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && f6Var.f12376x != null && (i2Var = ((f3) c6Var).f12361a.Q3) != null) {
            i2Var.f(i10, i11);
        }
    }

    @Override
    public final void l(i1 i1Var) {
        a aVar;
        f6 f6Var = this.f12230a;
        c6 c6Var = f6Var.f12377y;
        if (c6Var != null && (aVar = f6Var.f12376x) != null) {
            x3.R1(((f3) c6Var).f12361a, aVar);
        }
    }

    @Override
    public final boolean n(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean p(i1 i1Var) {
        f6 f6Var = this.f12230a;
        f6Var.f12371f.r();
        i1 i1Var2 = f6Var.f12371f;
        i1Var2.setSelection(i1Var2.length());
        return true;
    }

    @Override
    public final void t(i1 i1Var, int i10, int i11) {
        c6 c6Var;
        q9 textSelectionHelper;
        f6 f6Var = this.f12230a;
        if (!f6Var.f12372n && i10 != i11 && (c6Var = f6Var.f12377y) != null && (textSelectionHelper = ((f3) c6Var).f12361a.getTextSelectionHelper()) != null) {
            i1Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void x(CharSequence charSequence) {
        c6 c6Var = this.f12230a.f12377y;
        if (c6Var != null) {
            f3 f3Var = (f3) c6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f12361a.v4(charSequence.toString());
            }
        }
    }

    @Override
    public final void r() {
    }
}
