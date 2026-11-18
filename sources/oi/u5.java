package oi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class u5 implements d1 {
    public final z5 f22396a;

    public u5(z5 z5Var) {
        this.f22396a = z5Var;
    }

    @Override
    public final void A(int i7, int i10) {
        e2 e2Var;
        z5 z5Var = this.f22396a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && z5Var.f22568y != null && (e2Var = ((c3) w5Var).f21973a.R3) != null) {
            e2Var.f(i7, i10);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return false;
    }

    @Override
    public final boolean J(e1 e1Var) {
        z5 z5Var = this.f22396a;
        z5Var.f22562f.O();
        e1 e1Var2 = z5Var.f22562f;
        e1Var2.setSelection(e1Var2.length());
        return true;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        w5 w5Var = this.f22396a.E;
        if (w5Var != null) {
            c3 c3Var = (c3) w5Var;
            if (charSequence != null && charSequence.length() > 0) {
                c3Var.f21973a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean d2(e1 e1Var) {
        return false;
    }

    @Override
    public final void e(e1 e1Var) {
        w5 w5Var = this.f22396a.E;
        if (w5Var != null) {
            s3 s3Var = ((c3) w5Var).f21973a;
            s3.Q1(s3Var, e1Var);
            s3Var.f22337p3.k(e1Var, true);
        }
    }

    @Override
    public final boolean o() {
        z5 z5Var = this.f22396a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && z5Var.f22568y != null) {
            return ((c3) w5Var).f21973a.V4();
        }
        return false;
    }

    @Override
    public final void r1(e1 e1Var, int i7, int i10) {
        w5 w5Var;
        i9 textSelectionHelper;
        z5 z5Var = this.f22396a;
        if (!z5Var.f22563n && i7 != i10 && (w5Var = z5Var.E) != null && (textSelectionHelper = ((c3) w5Var).f21973a.getTextSelectionHelper()) != null) {
            e1Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 6));
        }
    }

    @Override
    public final void s1(Editable editable) {
        z5 z5Var = this.f22396a;
        if (z5Var.f22568y != null) {
            z5Var.w();
            w5 w5Var = z5Var.E;
            if (w5Var != null) {
                s3 s3Var = ((c3) w5Var).f21973a;
                e2 e2Var = s3Var.R3;
                if (e2Var != null) {
                    e2Var.g();
                }
                s3Var.f22337p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = z5Var.f22568y.f21910b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                z5Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                z5Var.invalidate();
                int measuredWidth = z5Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (z5Var.g(measuredWidth, z5Var.getPaddingBottom() + z5Var.h.getMeasuredHeight() + z5Var.f22559b.getMeasuredHeight() + z5Var.getPaddingTop()) == z5Var.P) {
                        return;
                    }
                }
                z5Var.requestLayout();
            }
        }
    }

    @Override
    public final void x0(e1 e1Var) {
        a aVar;
        z5 z5Var = this.f22396a;
        w5 w5Var = z5Var.E;
        if (w5Var != null && (aVar = z5Var.f22568y) != null) {
            s3.T1(((c3) w5Var).f21973a, aVar);
        }
    }

    @Override
    public final void E0() {
    }
}
