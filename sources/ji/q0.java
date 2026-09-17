package ji;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class q0 implements g1 {
    public final t0 f14121a;

    public q0(t0 t0Var) {
        this.f14121a = t0Var;
    }

    @Override
    public final void C(h1 h1Var) {
        a aVar;
        v3 v3Var;
        ArrayList arrayList;
        int indexOf;
        t0 t0Var = this.f14121a;
        c3 c3Var = t0Var.h;
        if (c3Var != null && (aVar = t0Var.f14181f) != null && (indexOf = (arrayList = (v3Var = c3Var.f13842a).f14256l3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f13732b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                v3Var.Y2.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f13737i && !v3.w3((a) arrayList.get(i10))) {
                v3Var.post(new n2(v3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void N(Editable editable) {
        t0 t0Var = this.f14121a;
        a aVar = t0Var.f14181f;
        if (aVar != null) {
            aVar.f13747s = true;
            aVar.f13746r = t0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f13732b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = i6.f(editable);
            }
        }
        c3 c3Var = t0Var.h;
        if (c3Var != null && t0Var.f14181f != null) {
            v3 v3Var = c3Var.f13842a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.f14249h3.onContentChanged();
        }
    }

    @Override
    public final boolean R(boolean z10) {
        return false;
    }

    @Override
    public final void a(h1 h1Var) {
        c3 c3Var = this.f14121a.h;
        if (c3Var != null) {
            v3 v3Var = c3Var.f13842a;
            v3.L1(v3Var, h1Var);
            v3Var.f14249h3.v(h1Var, true);
        }
    }

    @Override
    public final boolean e() {
        t0 t0Var = this.f14121a;
        c3 c3Var = t0Var.h;
        if (c3Var != null && t0Var.f14181f != null) {
            return c3Var.f13842a.R4();
        }
        return false;
    }

    @Override
    public final boolean h(h1 h1Var) {
        t0 t0Var = this.f14121a;
        if (t0Var.h != null && t0Var.f14181f != null && h1Var.length() == 0) {
            t0Var.h.a(t0Var.f14181f);
            return true;
        }
        return false;
    }

    @Override
    public final boolean k(h1 h1Var) {
        return false;
    }

    @Override
    public final void o(h1 h1Var, int i10, int i11) {
        c3 c3Var;
        q9 textSelectionHelper;
        t0 t0Var = this.f14121a;
        if (!t0Var.f14182n && i10 != i11 && (c3Var = t0Var.h) != null && (textSelectionHelper = c3Var.f13842a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != t0Var) {
                t0Var.post(new fi.y4(this, h1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void r() {
        a aVar;
        t0 t0Var = this.f14121a;
        c3 c3Var = t0Var.h;
        if (c3Var != null && (aVar = t0Var.f14181f) != null) {
            c3Var.a(aVar);
        }
    }

    @Override
    public final void y(CharSequence charSequence) {
        c3 c3Var = this.f14121a.h;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f13842a.s4(charSequence.toString());
        }
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
