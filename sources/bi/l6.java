package bi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class l6 implements m1 {
    public final q6 f3193a;

    public l6(q6 q6Var) {
        this.f3193a = q6Var;
    }

    @Override
    public final void B(Editable editable) {
        q6 q6Var = this.f3193a;
        if (q6Var.f3309y != null) {
            q6Var.w();
            n6 n6Var = q6Var.D;
            if (n6Var != null) {
                d4 d4Var = ((m3) n6Var).f3203a;
                o2 o2Var = d4Var.Q3;
                if (o2Var != null) {
                    o2Var.g();
                }
                d4Var.f2938o3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = q6Var.f3309y.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                q6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                q6Var.invalidate();
                int measuredWidth = q6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (q6Var.g(measuredWidth, q6Var.getPaddingBottom() + q6Var.h.getMeasuredHeight() + q6Var.f3301b.getMeasuredHeight() + q6Var.getPaddingTop()) == q6Var.O) {
                        return;
                    }
                }
                q6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return false;
    }

    @Override
    public final boolean I(n1 n1Var) {
        return false;
    }

    @Override
    public final void b(n1 n1Var) {
        n6 n6Var = this.f3193a.D;
        if (n6Var != null) {
            d4 d4Var = ((m3) n6Var).f3203a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    @Override
    public final void e(n1 n1Var) {
        a aVar;
        q6 q6Var = this.f3193a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && (aVar = q6Var.f3309y) != null) {
            d4.S1(((m3) n6Var).f3203a, aVar);
        }
    }

    @Override
    public final boolean f() {
        q6 q6Var = this.f3193a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && q6Var.f3309y != null) {
            return ((m3) n6Var).f3203a.V4();
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
        o2 o2Var;
        q6 q6Var = this.f3193a;
        n6 n6Var = q6Var.D;
        if (n6Var != null && q6Var.f3309y != null && (o2Var = ((m3) n6Var).f3203a.Q3) != null) {
            o2Var.f(i10, i11);
        }
    }

    @Override
    public final void i(n1 n1Var, int i10, int i11) {
        n6 n6Var;
        k9 textSelectionHelper;
        q6 q6Var = this.f3193a;
        if (!q6Var.f3304n && i10 != i11 && (n6Var = q6Var.D) != null && (textSelectionHelper = ((m3) n6Var).f3203a.getTextSelectionHelper()) != null) {
            n1Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 4));
        }
    }

    @Override
    public final void w(CharSequence charSequence) {
        n6 n6Var = this.f3193a.D;
        if (n6Var != null) {
            m3 m3Var = (m3) n6Var;
            if (charSequence != null && charSequence.length() > 0) {
                m3Var.f3203a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean x(n1 n1Var) {
        q6 q6Var = this.f3193a;
        q6Var.f3303f.N();
        n1 n1Var2 = q6Var.f3303f;
        n1Var2.setSelection(n1Var2.length());
        return true;
    }

    @Override
    public final void r() {
    }
}
