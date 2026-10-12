package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class d6 implements g1 {
    public final i6 f13234a;

    public d6(i6 i6Var) {
        this.f13234a = i6Var;
    }

    @Override
    public final boolean C(h1 h1Var) {
        return false;
    }

    @Override
    public final boolean F0(boolean z10) {
        return false;
    }

    @Override
    public final void U(h1 h1Var, int i10, int i11) {
        f6 f6Var;
        o9 textSelectionHelper;
        i6 i6Var = this.f13234a;
        if (!i6Var.f13338n && i10 != i11 && (f6Var = i6Var.f13343y) != null && (textSelectionHelper = ((f3) f6Var).f13268a.getTextSelectionHelper()) != null) {
            h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void a(h1 h1Var) {
        f6 f6Var = this.f13234a.f13343y;
        if (f6Var != null) {
            x3 x3Var = ((f3) f6Var).f13268a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public final void g0(CharSequence charSequence) {
        f6 f6Var = this.f13234a.f13343y;
        if (f6Var != null) {
            f3 f3Var = (f3) f6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f13268a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final boolean h() {
        i6 i6Var = this.f13234a;
        f6 f6Var = i6Var.f13343y;
        if (f6Var != null && i6Var.f13342x != null) {
            return ((f3) f6Var).f13268a.T4();
        }
        return false;
    }

    @Override
    public final boolean l(h1 h1Var) {
        i6 i6Var = this.f13234a;
        i6Var.f13337f.r();
        h1 h1Var2 = i6Var.f13337f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void p(int i10, int i11) {
        h2 h2Var;
        i6 i6Var = this.f13234a;
        f6 f6Var = i6Var.f13343y;
        if (f6Var != null && i6Var.f13342x != null && (h2Var = ((f3) f6Var).f13268a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final void p0(h1 h1Var) {
        a aVar;
        i6 i6Var = this.f13234a;
        f6 f6Var = i6Var.f13343y;
        if (f6Var != null && (aVar = i6Var.f13342x) != null) {
            x3.Q1(((f3) f6Var).f13268a, aVar);
        }
    }

    @Override
    public final void s0(Editable editable) {
        i6 i6Var = this.f13234a;
        if (i6Var.f13342x != null) {
            i6Var.w();
            f6 f6Var = i6Var.f13343y;
            if (f6Var != null) {
                x3 x3Var = ((f3) f6Var).f13268a;
                h2 h2Var = x3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                x3Var.f13627f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = i6Var.f13342x.f13103b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                i6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                i6Var.invalidate();
                int measuredWidth = i6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (i6Var.h(measuredWidth, i6Var.getPaddingBottom() + i6Var.h.getMeasuredHeight() + i6Var.f13335b.getMeasuredHeight() + i6Var.getPaddingTop()) == i6Var.O) {
                        return;
                    }
                }
                i6Var.requestLayout();
            }
        }
    }

    @Override
    public final void W() {
    }
}
