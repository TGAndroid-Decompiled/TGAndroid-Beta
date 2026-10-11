package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class r0 implements h1 {
    public final u0 f12654a;

    public r0(u0 u0Var) {
        this.f12654a = u0Var;
    }

    @Override
    public final void E(CharSequence charSequence) {
        e3 e3Var = this.f12654a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f12393a.u4(charSequence.toString());
        }
    }

    @Override
    public final void L(Editable editable) {
        u0 u0Var = this.f12654a;
        a aVar = u0Var.f12725f;
        if (aVar != null) {
            aVar.f12248s = true;
            aVar.f12247r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12233b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = h6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12725f != null) {
            x3 x3Var = e3Var.f12393a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12808f3.onContentChanged();
        }
    }

    @Override
    public final boolean N(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        e3 e3Var = this.f12654a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f12393a;
            x3.N1(x3Var, i1Var);
            x3Var.f12808f3.x(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        u0 u0Var = this.f12654a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12725f != null) {
            return e3Var.f12393a.T4();
        }
        return false;
    }

    @Override
    public final void k(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f12654a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12725f) != null && (indexOf = (arrayList = (x3Var = e3Var.f12393a).j3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12233b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.W2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f12238i && !x3.y3((a) arrayList.get(i10))) {
                x3Var.post(new p2(x3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean m(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean r(i1 i1Var) {
        u0 u0Var = this.f12654a;
        if (u0Var.h != null && u0Var.f12725f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f12725f);
            return true;
        }
        return false;
    }

    @Override
    public final void u() {
        a aVar;
        u0 u0Var = this.f12654a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12725f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void x(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        o9 textSelectionHelper;
        u0 u0Var = this.f12654a;
        if (!u0Var.f12726n && i10 != i11 && (e3Var = u0Var.h) != null && (textSelectionHelper = e3Var.f12393a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.w4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
