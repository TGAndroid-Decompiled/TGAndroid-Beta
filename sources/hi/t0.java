package hi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class t0 implements j1 {
    public final w0 f9853a;

    public t0(w0 w0Var) {
        this.f9853a = w0Var;
    }

    @Override
    public final void D(CharSequence charSequence) {
        g3 g3Var = this.f9853a.h;
        if (g3Var != null && charSequence != null && charSequence.length() > 0) {
            g3Var.f9614a.s4(charSequence.toString());
        }
    }

    @Override
    public final boolean F(k1 k1Var) {
        return false;
    }

    @Override
    public final void G(Editable editable) {
        w0 w0Var = this.f9853a;
        a aVar = w0Var.f9921f;
        if (aVar != null) {
            aVar.f9435s = true;
            aVar.f9434r = w0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f9421b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(editable);
            }
        }
        g3 g3Var = w0Var.h;
        if (g3Var != null && w0Var.f9921f != null) {
            z3 z3Var = g3Var.f9614a;
            k2 k2Var = z3Var.J3;
            if (k2Var != null) {
                k2Var.g();
            }
            z3Var.f10001h3.onContentChanged();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return false;
    }

    @Override
    public final boolean P(k1 k1Var) {
        w0 w0Var = this.f9853a;
        if (w0Var.h != null && w0Var.f9921f != null && k1Var.length() == 0) {
            w0Var.h.a(w0Var.f9921f);
            return true;
        }
        return false;
    }

    @Override
    public final void b(k1 k1Var) {
        g3 g3Var = this.f9853a.h;
        if (g3Var != null) {
            z3 z3Var = g3Var.f9614a;
            z3.L1(z3Var, k1Var);
            z3Var.f10001h3.C(k1Var, true);
        }
    }

    @Override
    public final boolean f() {
        w0 w0Var = this.f9853a;
        g3 g3Var = w0Var.h;
        if (g3Var != null && w0Var.f9921f != null) {
            return g3Var.f9614a.R4();
        }
        return false;
    }

    @Override
    public final void r(k1 k1Var, int i10, int i11) {
        g3 g3Var;
        s9 textSelectionHelper;
        w0 w0Var = this.f9853a;
        if (!w0Var.f9922n && i10 != i11 && (g3Var = w0Var.h) != null && (textSelectionHelper = g3Var.f9614a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != w0Var) {
                w0Var.post(new di.b5(this, k1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void t() {
        a aVar;
        w0 w0Var = this.f9853a;
        g3 g3Var = w0Var.h;
        if (g3Var != null && (aVar = w0Var.f9921f) != null) {
            g3Var.a(aVar);
        }
    }

    @Override
    public final void x(k1 k1Var) {
        a aVar;
        z3 z3Var;
        ArrayList arrayList;
        int indexOf;
        w0 w0Var = this.f9853a;
        g3 g3Var = w0Var.h;
        if (g3Var != null && (aVar = w0Var.f9921f) != null && (indexOf = (arrayList = (z3Var = g3Var.f9614a).f10008l3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f9421b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                z3Var.Y2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f9425i && !z3.w3((a) arrayList.get(i10))) {
                z3Var.post(new r2(z3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
