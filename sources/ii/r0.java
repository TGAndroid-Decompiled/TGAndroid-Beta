package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class r0 implements h1 {
    public final u0 f12607a;

    public r0(u0 u0Var) {
        this.f12607a = u0Var;
    }

    @Override
    public final void B(Editable editable) {
        u0 u0Var = this.f12607a;
        a aVar = u0Var.f12678f;
        if (aVar != null) {
            aVar.f12201s = true;
            aVar.f12200r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12186b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = h6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12678f != null) {
            x3 x3Var = e3Var.f12348a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12769o3.onContentChanged();
        }
    }

    @Override
    public final boolean G(boolean z10) {
        return false;
    }

    @Override
    public final void b(i1 i1Var) {
        e3 e3Var = this.f12607a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f12348a;
            x3.O1(x3Var, i1Var);
            x3Var.f12769o3.P(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        u0 u0Var = this.f12607a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12678f != null) {
            return e3Var.f12348a.U4();
        }
        return false;
    }

    @Override
    public final void l(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f12607a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12678f) != null && (indexOf = (arrayList = (x3Var = e3Var.f12348a).f12777s3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12186b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.f25244f3.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f12191i && !x3.z3((a) arrayList.get(i10))) {
                x3Var.post(new p2(x3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean n(i1 i1Var) {
        return false;
    }

    @Override
    public final boolean p(i1 i1Var) {
        u0 u0Var = this.f12607a;
        if (u0Var.h != null && u0Var.f12678f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f12678f);
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        a aVar;
        u0 u0Var = this.f12607a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12678f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void t(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.f12607a;
        if (!u0Var.f12679n && i10 != i11 && (e3Var = u0Var.h) != null && (textSelectionHelper = e3Var.f12348a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void x(CharSequence charSequence) {
        e3 e3Var = this.f12607a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f12348a.v4(charSequence.toString());
        }
    }

    @Override
    public final void f(int i10, int i11) {
    }
}
