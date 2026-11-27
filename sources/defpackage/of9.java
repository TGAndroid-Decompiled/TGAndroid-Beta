package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class of9 implements cg9 {
    public final rf9 a;

    public of9(rf9 rf9Var) {
        this.a = rf9Var;
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        rf9 rf9Var = this.a;
        if (rf9Var.h != null && rf9Var.f != null && dg9Var.length() == 0) {
            rf9Var.h.a(rf9Var.f);
            return true;
        }
        return false;
    }

    @Override
    public final void G() {
        mk0 mk0Var;
        rf9 rf9Var = this.a;
        yh9 yh9Var = rf9Var.h;
        if (yh9Var != null && (mk0Var = rf9Var.f) != null) {
            yh9Var.a(mk0Var);
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        yh9 yh9Var = this.a.h;
        if (yh9Var != null && charSequence != null && charSequence.length() > 0) {
            yh9Var.a.v4(charSequence.toString());
        }
    }

    @Override
    public final void Q(Editable editable) {
        rf9 rf9Var = this.a;
        mk0 mk0Var = rf9Var.f;
        if (mk0Var != null) {
            mk0Var.s = true;
            mk0Var.r = rf9Var.d.r2;
        }
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = mm9.f(editable);
            }
        }
        yh9 yh9Var = rf9Var.h;
        if (yh9Var != null && rf9Var.f != null) {
            pi9 pi9Var = yh9Var.a;
            ch9 ch9Var = pi9Var.R3;
            if (ch9Var != null) {
                ch9Var.g();
            }
            pi9Var.p3.onContentChanged();
        }
    }

    @Override
    public final void U(dg9 dg9Var) {
        mk0 mk0Var;
        pi9 pi9Var;
        ArrayList arrayList;
        int indexOf;
        rf9 rf9Var = this.a;
        yh9 yh9Var = rf9Var.h;
        if (yh9Var != null && (mk0Var = rf9Var.f) != null && (indexOf = (arrayList = (pi9Var = yh9Var.a).t3).indexOf(mk0Var)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) mk0Var.b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                pi9Var.g3.O(true);
            }
            int i = indexOf + 1;
            if (i < arrayList.size() && !((mk0) arrayList.get(i)).i && !pi9.u3((mk0) arrayList.get(i))) {
                pi9Var.post(new jh9(pi9Var, (mk0) arrayList.get(i), (byte) 25));
            }
        }
    }

    @Override
    public final boolean W(boolean z) {
        return false;
    }

    @Override
    public final void e(dg9 dg9Var) {
        yh9 yh9Var = this.a.h;
        if (yh9Var != null) {
            pi9 pi9Var = yh9Var.a;
            pi9Var.j4(dg9Var);
            pi9Var.p3.j(dg9Var, true);
        }
    }

    @Override
    public final boolean i() {
        rf9 rf9Var = this.a;
        yh9 yh9Var = rf9Var.h;
        if (yh9Var != null && rf9Var.f != null) {
            return yh9Var.a.W4();
        }
        return false;
    }

    @Override
    public final void s(dg9 dg9Var, int i, int i2) {
        yh9 yh9Var;
        amb textSelectionHelper;
        rf9 rf9Var = this.a;
        if (!rf9Var.n && i != i2 && (yh9Var = rf9Var.h) != null && (textSelectionHelper = yh9Var.a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.w() || textSelectionHelper.W != rf9Var) {
                rf9Var.post(new hz0(this, dg9Var, i2, textSelectionHelper, i, (byte) 3));
            }
        }
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void l(int i, int i2) {
    }
}
