package mi;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class w5 implements g1 {
    public final b6 f20010a;

    public w5(b6 b6Var) {
        this.f20010a = b6Var;
    }

    @Override
    public final void A(int i3, int i10) {
        g2 g2Var;
        b6 b6Var = this.f20010a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && b6Var.f19491y != null && (g2Var = ((d3) y5Var).f19561a.R3) != null) {
            g2Var.f(i3, i10);
        }
    }

    @Override
    public final void B1(Editable editable) {
        b6 b6Var = this.f20010a;
        if (b6Var.f19491y != null) {
            b6Var.w();
            y5 y5Var = b6Var.E;
            if (y5Var != null) {
                t3 t3Var = ((d3) y5Var).f19561a;
                g2 g2Var = t3Var.R3;
                if (g2Var != null) {
                    g2Var.g();
                }
                t3Var.f19916p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = b6Var.f19491y.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                b6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                b6Var.invalidate();
                int measuredWidth = b6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (b6Var.g(measuredWidth, b6Var.getPaddingBottom() + b6Var.h.getMeasuredHeight() + b6Var.f19482b.getMeasuredHeight() + b6Var.getPaddingTop()) == b6Var.P) {
                        return;
                    }
                }
                b6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean M0(h1 h1Var) {
        return false;
    }

    @Override
    public final void V0(h1 h1Var) {
        a aVar;
        b6 b6Var = this.f20010a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && (aVar = b6Var.f19491y) != null) {
            t3.T1(((d3) y5Var).f19561a, aVar);
        }
    }

    @Override
    public final boolean X1(boolean z10) {
        return false;
    }

    @Override
    public final boolean c0(h1 h1Var) {
        b6 b6Var = this.f20010a;
        b6Var.f19485f.N();
        h1 h1Var2 = b6Var.f19485f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void f(h1 h1Var) {
        y5 y5Var = this.f20010a.E;
        if (y5Var != null) {
            t3 t3Var = ((d3) y5Var).f19561a;
            t3.Q1(t3Var, h1Var);
            t3Var.f19916p3.E(h1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        y5 y5Var = this.f20010a.E;
        if (y5Var != null) {
            d3 d3Var = (d3) y5Var;
            if (charSequence != null && charSequence.length() > 0) {
                d3Var.f19561a.w4(charSequence.toString());
            }
        }
    }

    @Override
    public final void l(h1 h1Var, int i3, int i10) {
        y5 y5Var;
        h9 textSelectionHelper;
        b6 b6Var = this.f20010a;
        if (!b6Var.f19486n && i3 != i10 && (y5Var = b6Var.E) != null && (textSelectionHelper = ((d3) y5Var).f19561a.getTextSelectionHelper()) != null) {
            h1Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 6));
        }
    }

    @Override
    public final boolean m() {
        b6 b6Var = this.f20010a;
        y5 y5Var = b6Var.E;
        if (y5Var != null && b6Var.f19491y != null) {
            return ((d3) y5Var).f19561a.V4();
        }
        return false;
    }

    @Override
    public final void w0() {
    }
}
