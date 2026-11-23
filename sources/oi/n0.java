package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
public final class n0 implements e1 {
    public final q0 f22252a;

    public n0(q0 q0Var) {
        this.f22252a = q0Var;
    }

    @Override
    public final void E0() {
        a aVar;
        q0 q0Var = this.f22252a;
        c3 c3Var = q0Var.h;
        if (c3Var != null && (aVar = q0Var.f22326f) != null) {
            c3Var.a(aVar);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return false;
    }

    @Override
    public final boolean J(f1 f1Var) {
        q0 q0Var = this.f22252a;
        if (q0Var.h != null && q0Var.f22326f != null && f1Var.length() == 0) {
            q0Var.h.a(q0Var.f22326f);
            return true;
        }
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        c3 c3Var = this.f22252a.h;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f22045a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean d2(f1 f1Var) {
        return false;
    }

    @Override
    public final void e(f1 f1Var) {
        c3 c3Var = this.f22252a.h;
        if (c3Var != null) {
            t3 t3Var = c3Var.f22045a;
            t3.Q1(t3Var, f1Var);
            t3Var.f22428p3.k(f1Var, true);
        }
    }

    @Override
    public final boolean o() {
        q0 q0Var = this.f22252a;
        c3 c3Var = q0Var.h;
        if (c3Var != null && q0Var.f22326f != null) {
            return c3Var.f22045a.V4();
        }
        return false;
    }

    @Override
    public final void r1(f1 f1Var, int i7, int i10) {
        c3 c3Var;
        j9 textSelectionHelper;
        q0 q0Var = this.f22252a;
        if (!q0Var.f22327n && i7 != i10 && (c3Var = q0Var.h) != null && (textSelectionHelper = c3Var.f22045a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != q0Var) {
                q0Var.post(new jg.o1(this, f1Var, i10, textSelectionHelper, i7, 2));
            }
        }
    }

    @Override
    public final void s1(Editable editable) {
        q0 q0Var = this.f22252a;
        a aVar = q0Var.f22326f;
        if (aVar != null) {
            aVar.f21950s = true;
            aVar.f21949r = q0Var.d.f22112q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21935b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(editable);
            }
        }
        c3 c3Var = q0Var.h;
        if (c3Var != null && q0Var.f22326f != null) {
            t3 t3Var = c3Var.f22045a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.f22428p3.onContentChanged();
        }
    }

    @Override
    public final void x0(f1 f1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        q0 q0Var = this.f22252a;
        c3 c3Var = q0Var.h;
        if (c3Var != null && (aVar = q0Var.f22326f) != null && (indexOf = (arrayList = (t3Var = c3Var.f22045a).f22436t3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21935b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                t3Var.f35789g3.O(true);
            }
            int i7 = indexOf + 1;
            if (i7 < arrayList.size() && !((a) arrayList.get(i7)).f21940i && !t3.A3((a) arrayList.get(i7))) {
                t3Var.post(new n2(t3Var, (a) arrayList.get(i7), 24));
            }
        }
    }

    @Override
    public final void A(int i7, int i10) {
    }
}
