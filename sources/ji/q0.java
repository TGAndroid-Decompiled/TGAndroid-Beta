package ji;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class q0 implements g1 {
    public final t0 f13473a;

    public q0(t0 t0Var) {
        this.f13473a = t0Var;
    }

    @Override
    public final void C(Editable editable) {
        t0 t0Var = this.f13473a;
        a aVar = t0Var.f13524f;
        if (aVar != null) {
            aVar.f13121s = true;
            aVar.f13120r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13107b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = k6.f(editable);
            }
        }
        e3 e3Var = t0Var.h;
        if (e3Var != null && t0Var.f13524f != null) {
            x3 x3Var = e3Var.f13244a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13630f3.onContentChanged();
        }
    }

    @Override
    public final boolean E(boolean z10) {
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        e3 e3Var = this.f13473a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f13244a;
            x3.N1(x3Var, h1Var);
            x3Var.f13630f3.V(h1Var, true);
        }
    }

    @Override
    public final boolean d() {
        t0 t0Var = this.f13473a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && t0Var.f13524f != null) {
            return e3Var.f13244a.T4();
        }
        return false;
    }

    @Override
    public final boolean e(h1 h1Var) {
        t0 t0Var = this.f13473a;
        if (t0Var.h != null && t0Var.f13524f != null && h1Var.length() == 0) {
            t0Var.h.a(t0Var.f13524f);
            return true;
        }
        return false;
    }

    @Override
    public final boolean m(h1 h1Var) {
        return false;
    }

    @Override
    public final void q(h1 h1Var, int i10, int i11) {
        e3 e3Var;
        o9 textSelectionHelper;
        t0 t0Var = this.f13473a;
        if (!t0Var.f13525n && i10 != i11 && (e3Var = t0Var.h) != null && (textSelectionHelper = e3Var.f13244a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != t0Var) {
                t0Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void r() {
        a aVar;
        t0 t0Var = this.f13473a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && (aVar = t0Var.f13524f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        e3 e3Var = this.f13473a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f13244a.u4(charSequence.toString());
        }
    }

    @Override
    public final void z(h1 h1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.f13473a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && (aVar = t0Var.f13524f) != null && (indexOf = (arrayList = (x3Var = e3Var.f13244a).f13638j3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13107b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.W2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f13111i && !x3.y3((a) arrayList.get(i10))) {
                x3Var.post(new o2(x3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void f(int i10, int i11) {
    }
}
