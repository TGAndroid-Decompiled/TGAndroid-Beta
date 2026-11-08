package li;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class v5 implements f1 {
    public final a6 f18948a;

    public v5(a6 a6Var) {
        this.f18948a = a6Var;
    }

    @Override
    public final boolean E(g1 g1Var) {
        a6 a6Var = this.f18948a;
        a6Var.f18429f.N();
        g1 g1Var2 = a6Var.f18429f;
        g1Var2.setSelection(g1Var2.length());
        return true;
    }

    @Override
    public final void F(g1 g1Var) {
        a aVar;
        a6 a6Var = this.f18948a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && (aVar = a6Var.f18435y) != null) {
            t3.T1(((c3) x5Var).f18504a, aVar);
        }
    }

    @Override
    public final void T0(CharSequence charSequence) {
        x5 x5Var = this.f18948a.D;
        if (x5Var != null) {
            c3 c3Var = (c3) x5Var;
            if (charSequence != null && charSequence.length() > 0) {
                c3Var.f18504a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void b(g1 g1Var) {
        x5 x5Var = this.f18948a.D;
        if (x5Var != null) {
            t3 t3Var = ((c3) x5Var).f18504a;
            t3.Q1(t3Var, g1Var);
            t3Var.f18890o3.r(g1Var, true);
        }
    }

    @Override
    public final void f1(Editable editable) {
        a6 a6Var = this.f18948a;
        if (a6Var.f18435y != null) {
            a6Var.w();
            x5 x5Var = a6Var.D;
            if (x5Var != null) {
                t3 t3Var = ((c3) x5Var).f18504a;
                f2 f2Var = t3Var.Q3;
                if (f2Var != null) {
                    f2Var.g();
                }
                t3Var.f18890o3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = a6Var.f18435y.f18392b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                a6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                a6Var.invalidate();
                int measuredWidth = a6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (a6Var.g(measuredWidth, a6Var.getPaddingBottom() + a6Var.h.getMeasuredHeight() + a6Var.f18426b.getMeasuredHeight() + a6Var.getPaddingTop()) == a6Var.O) {
                        return;
                    }
                }
                a6Var.requestLayout();
            }
        }
    }

    @Override
    public final void l0(g1 g1Var, int i7, int i10) {
        x5 x5Var;
        i9 textSelectionHelper;
        a6 a6Var = this.f18948a;
        if (!a6Var.f18430n && i7 != i10 && (x5Var = a6Var.D) != null && (textSelectionHelper = ((c3) x5Var).f18504a.getTextSelectionHelper()) != null) {
            g1Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 6));
        }
    }

    @Override
    public final boolean l1(boolean z9) {
        return false;
    }

    @Override
    public final boolean m() {
        a6 a6Var = this.f18948a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && a6Var.f18435y != null) {
            return ((c3) x5Var).f18504a.V4();
        }
        return false;
    }

    @Override
    public final boolean s(g1 g1Var) {
        return false;
    }

    @Override
    public final void w(int i7, int i10) {
        f2 f2Var;
        a6 a6Var = this.f18948a;
        x5 x5Var = a6Var.D;
        if (x5Var != null && a6Var.f18435y != null && (f2Var = ((c3) x5Var).f18504a.Q3) != null) {
            f2Var.f(i7, i10);
        }
    }

    @Override
    public final void r0() {
    }
}
