package ki;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class q0 implements g1 {
    public final t0 f15447a;

    public q0(t0 t0Var) {
        this.f15447a = t0Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        d3 d3Var = this.f15447a.h;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f15225a.u4(charSequence.toString());
        }
    }

    @Override
    public final void M(Editable editable) {
        t0 t0Var = this.f15447a;
        a aVar = t0Var.f15516f;
        if (aVar != null) {
            aVar.f15103s = true;
            aVar.f15102r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15089b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = e6.f(editable);
            }
        }
        d3 d3Var = t0Var.h;
        if (d3Var != null && t0Var.f15516f != null) {
            w3 w3Var = d3Var.f15225a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15586f3.onContentChanged();
        }
    }

    @Override
    public final boolean Q(boolean z10) {
        return false;
    }

    @Override
    public final boolean R(h1 h1Var) {
        return false;
    }

    @Override
    public final void V(h1 h1Var, int i10, int i11) {
        d3 d3Var;
        n9 textSelectionHelper;
        t0 t0Var = this.f15447a;
        if (!t0Var.f15517n && i10 != i11 && (d3Var = t0Var.h) != null && (textSelectionHelper = d3Var.f15225a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != t0Var) {
                t0Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void c(h1 h1Var) {
        d3 d3Var = this.f15447a.h;
        if (d3Var != null) {
            w3 w3Var = d3Var.f15225a;
            w3.N1(w3Var, h1Var);
            w3Var.f15586f3.n(h1Var, true);
        }
    }

    @Override
    public final boolean f() {
        t0 t0Var = this.f15447a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && t0Var.f15516f != null) {
            return d3Var.f15225a.T4();
        }
        return false;
    }

    @Override
    public final void l(h1 h1Var) {
        a aVar;
        w3 w3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.f15447a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && (aVar = t0Var.f15516f) != null && (indexOf = (arrayList = (w3Var = d3Var.f15225a).f15594j3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15089b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                w3Var.W2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f15093i && !w3.y3((a) arrayList.get(i10))) {
                w3Var.post(new o2(w3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void m() {
        a aVar;
        t0 t0Var = this.f15447a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && (aVar = t0Var.f15516f) != null) {
            d3Var.a(aVar);
        }
    }

    @Override
    public final boolean q(h1 h1Var) {
        t0 t0Var = this.f15447a;
        if (t0Var.h != null && t0Var.f15516f != null && h1Var.length() == 0) {
            t0Var.h.a(t0Var.f15516f);
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
