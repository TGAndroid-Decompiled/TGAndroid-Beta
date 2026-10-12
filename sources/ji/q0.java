package ji;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.o9;
public final class q0 implements g1 {
    public final t0 f13470a;

    public q0(t0 t0Var) {
        this.f13470a = t0Var;
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
        e3 e3Var;
        o9 textSelectionHelper;
        t0 t0Var = this.f13470a;
        if (!t0Var.f13522n && i10 != i11 && (e3Var = t0Var.h) != null && (textSelectionHelper = e3Var.f13241a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != t0Var) {
                t0Var.post(new fi.x4(this, h1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void W() {
        a aVar;
        t0 t0Var = this.f13470a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && (aVar = t0Var.f13521f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void a(h1 h1Var) {
        e3 e3Var = this.f13470a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f13241a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public final void g0(CharSequence charSequence) {
        e3 e3Var = this.f13470a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f13241a.u4(charSequence.toString());
        }
    }

    @Override
    public final boolean h() {
        t0 t0Var = this.f13470a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && t0Var.f13521f != null) {
            return e3Var.f13241a.T4();
        }
        return false;
    }

    @Override
    public final boolean l(h1 h1Var) {
        t0 t0Var = this.f13470a;
        if (t0Var.h != null && t0Var.f13521f != null && h1Var.length() == 0) {
            t0Var.h.a(t0Var.f13521f);
            return true;
        }
        return false;
    }

    @Override
    public final void p0(h1 h1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.f13470a;
        e3 e3Var = t0Var.h;
        if (e3Var != null && (aVar = t0Var.f13521f) != null && (indexOf = (arrayList = (x3Var = e3Var.f13241a).f13635j3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13103b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.W2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f13107i && !x3.y3((a) arrayList.get(i10))) {
                x3Var.post(new o2(x3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void s0(Editable editable) {
        t0 t0Var = this.f13470a;
        a aVar = t0Var.f13521f;
        if (aVar != null) {
            aVar.f13117s = true;
            aVar.f13116r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13103b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = k6.f(editable);
            }
        }
        e3 e3Var = t0Var.h;
        if (e3Var != null && t0Var.f13521f != null) {
            x3 x3Var = e3Var.f13241a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13627f3.onContentChanged();
        }
    }

    @Override
    public final void p(int i10, int i11) {
    }
}
