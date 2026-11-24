package defpackage;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
public final class tk9 implements me9 {
    public final xk9 a;

    public tk9(xk9 xk9Var) {
        this.a = xk9Var;
    }

    @Override
    public final boolean G(ne9 ne9Var) {
        ne9 ne9Var2 = this.a.f;
        ne9Var2.O();
        ne9Var2.setSelection(ne9Var2.length());
        return true;
    }

    @Override
    public final void M(CharSequence charSequence) {
        uk9 uk9Var = this.a.E;
        if (uk9Var != null) {
            mg9 mg9Var = (mg9) uk9Var;
            if (charSequence != null && charSequence.length() > 0) {
                mg9Var.a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void S(Editable editable) {
        xk9 xk9Var = this.a;
        if (xk9Var.y != null) {
            xk9Var.v();
            uk9 uk9Var = xk9Var.E;
            if (uk9Var != null) {
                ch9 ch9Var = ((mg9) uk9Var).a;
                of9 of9Var = ch9Var.R3;
                if (of9Var != null) {
                    of9Var.g();
                }
                ch9Var.p3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = xk9Var.y.b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                xk9Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                xk9Var.invalidate();
                int measuredWidth = xk9Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (xk9Var.e(measuredWidth, xk9Var.getPaddingBottom() + xk9Var.h.getMeasuredHeight() + xk9Var.b.getMeasuredHeight() + xk9Var.getPaddingTop()) == xk9Var.P) {
                        return;
                    }
                }
                xk9Var.requestLayout();
            }
        }
    }

    @Override
    public final void W(ne9 ne9Var) {
        ll0 ll0Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && (ll0Var = xk9Var.y) != null) {
            ((mg9) uk9Var).a.T3(ll0Var);
        }
    }

    @Override
    public final boolean Z(boolean z) {
        return false;
    }

    @Override
    public final void d(ne9 ne9Var) {
        uk9 uk9Var = this.a.E;
        if (uk9Var != null) {
            ch9 ch9Var = ((mg9) uk9Var).a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override
    public final boolean i() {
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && xk9Var.y != null) {
            return ((mg9) uk9Var).a.V4();
        }
        return false;
    }

    @Override
    public final void k(int i, int i2) {
        of9 of9Var;
        xk9 xk9Var = this.a;
        uk9 uk9Var = xk9Var.E;
        if (uk9Var != null && xk9Var.y != null && (of9Var = ((mg9) uk9Var).a.R3) != null) {
            of9Var.f(i, i2);
        }
    }

    @Override
    public final void r(ne9 ne9Var, int i, int i2) {
        uk9 uk9Var;
        gkb textSelectionHelper;
        xk9 xk9Var = this.a;
        if (!xk9Var.n && i != i2 && (uk9Var = xk9Var.E) != null && (textSelectionHelper = ((mg9) uk9Var).a.getTextSelectionHelper()) != null) {
            ne9Var.post(new g01(this, ne9Var, i2, textSelectionHelper, i, (byte) 7));
        }
    }

    @Override
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override
    public final void H() {
    }
}
