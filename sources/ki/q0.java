package ki;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
public final class q0 implements g1 {
    public final t0 f15453a;

    public q0(t0 t0Var) {
        this.f15453a = t0Var;
    }

    @Override
    public final void G(Editable editable) {
        t0 t0Var = this.f15453a;
        a aVar = t0Var.f15522f;
        if (aVar != null) {
            aVar.f15109s = true;
            aVar.f15108r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15095b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = e6.f(editable);
            }
        }
        d3 d3Var = t0Var.h;
        if (d3Var != null && t0Var.f15522f != null) {
            w3 w3Var = d3Var.f15231a;
            h2 h2Var = w3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f15592f3.onContentChanged();
        }
    }

    @Override
    public final boolean M(boolean z10) {
        return false;
    }

    @Override
    public final boolean P(h1 h1Var) {
        return false;
    }

    @Override
    public final void R(h1 h1Var, int i10, int i11) {
        d3 d3Var;
        n9 textSelectionHelper;
        t0 t0Var = this.f15453a;
        if (!t0Var.f15523n && i10 != i11 && (d3Var = t0Var.h) != null && (textSelectionHelper = d3Var.f15231a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != t0Var) {
                t0Var.post(new gi.m4(this, h1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void c(h1 h1Var) {
        d3 d3Var = this.f15453a.h;
        if (d3Var != null) {
            w3 w3Var = d3Var.f15231a;
            w3.N1(w3Var, h1Var);
            w3Var.f15592f3.o(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        t0 t0Var = this.f15453a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && t0Var.f15522f != null) {
            return d3Var.f15231a.T4();
        }
        return false;
    }

    @Override
    public final void k(h1 h1Var) {
        a aVar;
        w3 w3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.f15453a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && (aVar = t0Var.f15522f) != null && (indexOf = (arrayList = (w3Var = d3Var.f15231a).f15600j3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15095b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                w3Var.W2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f15099i && !w3.y3((a) arrayList.get(i10))) {
                w3Var.post(new o2(w3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void o() {
        a aVar;
        t0 t0Var = this.f15453a;
        d3 d3Var = t0Var.h;
        if (d3Var != null && (aVar = t0Var.f15522f) != null) {
            d3Var.a(aVar);
        }
    }

    @Override
    public final boolean s(h1 h1Var) {
        t0 t0Var = this.f15453a;
        if (t0Var.h != null && t0Var.f15522f != null && h1Var.length() == 0) {
            t0Var.h.a(t0Var.f15522f);
            return true;
        }
        return false;
    }

    @Override
    public final void x(CharSequence charSequence) {
        d3 d3Var = this.f15453a.h;
        if (d3Var != null && charSequence != null && charSequence.length() > 0) {
            d3Var.f15231a.u4(charSequence.toString());
        }
    }

    @Override
    public final void f(int i10, int i11) {
    }
}
