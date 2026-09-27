package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class r0 implements h1 {
    public final u0 f11580a;

    public r0(u0 u0Var) {
        this.f11580a = u0Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.f11580a;
        if (!u0Var.f11651n && i10 != i11 && (e3Var = u0Var.h) != null && (textSelectionHelper = e3Var.f11345a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void L(CharSequence charSequence) {
        e3 e3Var = this.f11580a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f11345a.u4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        u0 u0Var = this.f11580a;
        a aVar = u0Var.f11650f;
        if (aVar != null) {
            aVar.f11208s = true;
            aVar.f11207r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11194b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = g6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f11650f != null) {
            x3 x3Var = e3Var.f11345a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f11731h3.onContentChanged();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        e3 e3Var = this.f11580a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f11345a;
            x3.N1(x3Var, i1Var);
            x3Var.f11731h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        u0 u0Var = this.f11580a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f11650f != null) {
            return e3Var.f11345a.T4();
        }
        return false;
    }

    @Override
    public final void m(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f11580a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f11650f) != null && (indexOf = (arrayList = (x3Var = e3Var.f11345a).f11738l3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11194b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.Y2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f11198i && !x3.y3((a) arrayList.get(i10))) {
                x3Var.post(new p2(x3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        u0 u0Var = this.f11580a;
        if (u0Var.h != null && u0Var.f11650f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f11650f);
            return true;
        }
        return false;
    }

    @Override
    public final void x() {
        a aVar;
        u0 u0Var = this.f11580a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f11650f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void j(int i10, int i11) {
    }
}
