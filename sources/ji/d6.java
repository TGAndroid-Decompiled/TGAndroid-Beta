package ji;

import android.text.Editable;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class d6 implements g1 {
    public final i6 f13237a;

    public d6(i6 i6Var) {
        this.f13237a = i6Var;
    }

    @Override
    public final void C(Editable editable) {
        i6 i6Var = this.f13237a;
        if (i6Var.f13345x != null) {
            i6Var.w();
            f6 f6Var = i6Var.f13346y;
            if (f6Var != null) {
                x3 x3Var = ((f3) f6Var).f13271a;
                h2 h2Var = x3Var.H3;
                if (h2Var != null) {
                    h2Var.g();
                }
                x3Var.f13630f3.onContentChanged();
            }
            TL_iv.PageBlock pageBlock = i6Var.f13345x.f13107b;
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                i6Var.invalidate();
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                i6Var.invalidate();
                int measuredWidth = i6Var.getMeasuredWidth();
                if (measuredWidth > 0) {
                    if (i6Var.h(measuredWidth, i6Var.getPaddingBottom() + i6Var.h.getMeasuredHeight() + i6Var.f13338b.getMeasuredHeight() + i6Var.getPaddingTop()) == i6Var.O) {
                        return;
                    }
                }
                i6Var.requestLayout();
            }
        }
    }

    @Override
    public final boolean E(boolean z10) {
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        f6 f6Var = this.f13237a.f13346y;
        if (f6Var != null) {
            x3 x3Var = ((f3) f6Var).f13271a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public final boolean d() {
        i6 i6Var = this.f13237a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && i6Var.f13345x != null) {
            return ((f3) f6Var).f13271a.T4();
        }
        return false;
    }

    @Override
    public final boolean e(h1 h1Var) {
        i6 i6Var = this.f13237a;
        i6Var.f13340f.r();
        h1 h1Var2 = i6Var.f13340f;
        h1Var2.setSelection(h1Var2.length());
        return true;
    }

    @Override
    public final void f(int i10, int i11) {
        h2 h2Var;
        i6 i6Var = this.f13237a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && i6Var.f13345x != null && (h2Var = ((f3) f6Var).f13271a.H3) != null) {
            h2Var.f(i10, i11);
        }
    }

    @Override
    public final boolean m(h1 h1Var) {
        return false;
    }

    @Override
    public final void q(h1 h1Var, int i10, int i11) {
        f6 f6Var;
        o9 textSelectionHelper;
        i6 i6Var = this.f13237a;
        if (!i6Var.f13341n && i10 != i11 && (f6Var = i6Var.f13346y) != null && (textSelectionHelper = ((f3) f6Var).f13271a.getTextSelectionHelper()) != null) {
            h1Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 6));
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        f6 f6Var = this.f13237a.f13346y;
        if (f6Var != null) {
            f3 f3Var = (f3) f6Var;
            if (charSequence != null && charSequence.length() > 0) {
                f3Var.f13271a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public final void z(h1 h1Var) {
        a aVar;
        i6 i6Var = this.f13237a;
        f6 f6Var = i6Var.f13346y;
        if (f6Var != null && (aVar = i6Var.f13345x) != null) {
            x3.Q1(((f3) f6Var).f13271a, aVar);
        }
    }

    @Override
    public final void r() {
    }
}
