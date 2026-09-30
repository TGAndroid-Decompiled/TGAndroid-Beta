package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class r0 implements h1 {
    public final u0 f11577a;

    public r0(u0 u0Var) {
        this.f11577a = u0Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.f11577a;
        if (!u0Var.f11648n && i10 != i11 && (e3Var = u0Var.h) != null && (textSelectionHelper = e3Var.f11342a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        e3 e3Var = this.f11577a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f11342a.t4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        u0 u0Var = this.f11577a;
        a aVar = u0Var.f11647f;
        if (aVar != null) {
            aVar.f11205s = true;
            aVar.f11204r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11191b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = g6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f11647f != null) {
            x3 x3Var = e3Var.f11342a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f11728h3.onContentChanged();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        e3 e3Var = this.f11577a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f11342a;
            x3.M1(x3Var, i1Var);
            x3Var.f11728h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        u0 u0Var = this.f11577a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f11647f != null) {
            return e3Var.f11342a.S4();
        }
        return false;
    }

    @Override
    public final void m(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f11577a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f11647f) != null && (indexOf = (arrayList = (x3Var = e3Var.f11342a).f11735l3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11191b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.Y2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f11195i && !x3.x3((a) arrayList.get(i10))) {
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
        u0 u0Var = this.f11577a;
        if (u0Var.h != null && u0Var.f11647f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f11647f);
            return true;
        }
        return false;
    }

    @Override
    public final void x() {
        a aVar;
        u0 u0Var = this.f11577a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f11647f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void j(int i10, int i11) {
    }
}
