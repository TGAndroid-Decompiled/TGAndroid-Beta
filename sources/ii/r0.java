package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class r0 implements h1 {
    public final u0 f11596a;

    public r0(u0 u0Var) {
        this.f11596a = u0Var;
    }

    @Override
    public final void B(i1 i1Var, int i10, int i11) {
        d3 d3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.f11596a;
        if (!u0Var.f11653n && i10 != i11 && (d3Var = u0Var.h) != null && (textSelectionHelper = d3Var.f11333a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.x4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void K(CharSequence charSequence) {
        d3 d3Var = this.f11596a.h;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f11333a.u4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        u0 u0Var = this.f11596a;
        a aVar = u0Var.f11652f;
        if (aVar != null) {
            aVar.f11218s = true;
            aVar.f11217r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f11204b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(editable);
            }
        }
        d3 d3Var = u0Var.h;
        if (d3Var != null && u0Var.f11652f != null) {
            w3 w3Var = d3Var.f11333a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f11714h3.onContentChanged();
        }
    }

    @Override
    public final boolean X(boolean z10) {
        return false;
    }

    @Override
    public final void c(i1 i1Var) {
        d3 d3Var = this.f11596a.h;
        if (d3Var != null) {
            w3 w3Var = d3Var.f11333a;
            w3.N1(w3Var, i1Var);
            w3Var.f11714h3.t(i1Var, true);
        }
    }

    @Override
    public final boolean f() {
        u0 u0Var = this.f11596a;
        d3 d3Var = u0Var.h;
        if (d3Var != null && u0Var.f11652f != null) {
            return d3Var.f11333a.T4();
        }
        return false;
    }

    @Override
    public final void m(i1 i1Var) {
        a aVar;
        w3 w3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f11596a;
        d3 d3Var = u0Var.h;
        if (d3Var != null && (aVar = u0Var.f11652f) != null && (indexOf = (arrayList = (w3Var = d3Var.f11333a).f11721l3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f11204b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                w3Var.Y2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f11208i && !w3.y3((a) arrayList.get(i10))) {
                w3Var.post(new o2(w3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean p(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean t(i1 i1Var) {
        u0 u0Var = this.f11596a;
        if (u0Var.h != null && u0Var.f11652f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f11652f);
            return true;
        }
        return false;
    }

    @Override
    public final void x() {
        a aVar;
        u0 u0Var = this.f11596a;
        d3 d3Var = u0Var.h;
        if (d3Var != null && (aVar = u0Var.f11652f) != null) {
            d3Var.a(aVar);
        }
    }

    @Override
    public final void j(int i10, int i11) {
    }
}
