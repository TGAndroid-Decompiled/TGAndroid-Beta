package mi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class p0 implements g1 {
    public final s0 f19798a;

    public p0(s0 s0Var) {
        this.f19798a = s0Var;
    }

    @Override
    public final void B1(Editable editable) {
        s0 s0Var = this.f19798a;
        a aVar = s0Var.f19875f;
        if (aVar != null) {
            aVar.f19446s = true;
            aVar.f19445r = s0Var.d.f19656l2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f19431b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = d6.f(editable);
            }
        }
        c3 c3Var = s0Var.h;
        if (c3Var != null && s0Var.f19875f != null) {
            t3 t3Var = c3Var.f19543a;
            g2 g2Var = t3Var.R3;
            if (g2Var != null) {
                g2Var.g();
            }
            t3Var.f19916p3.onContentChanged();
        }
    }

    @Override
    public final boolean M0(h1 h1Var) {
        return false;
    }

    @Override
    public final void V0(h1 h1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        s0 s0Var = this.f19798a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && (aVar = s0Var.f19875f) != null && (indexOf = (arrayList = (t3Var = c3Var.f19543a).f19924t3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f19431b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                t3Var.f35594g3.O(true);
            }
            int i3 = indexOf + 1;
            if (i3 < arrayList.size() && !((a) arrayList.get(i3)).f19436i && !t3.A3((a) arrayList.get(i3))) {
                t3Var.post(new n2(t3Var, (a) arrayList.get(i3), 24));
            }
        }
    }

    @Override
    public final boolean X1(boolean z10) {
        return false;
    }

    @Override
    public final boolean c0(h1 h1Var) {
        s0 s0Var = this.f19798a;
        if (s0Var.h != null && s0Var.f19875f != null && h1Var.length() == 0) {
            s0Var.h.a(s0Var.f19875f);
            return true;
        }
        return false;
    }

    @Override
    public final void f(h1 h1Var) {
        c3 c3Var = this.f19798a.h;
        if (c3Var != null) {
            t3 t3Var = c3Var.f19543a;
            t3.Q1(t3Var, h1Var);
            t3Var.f19916p3.E(h1Var, true);
        }
    }

    @Override
    public final void g1(CharSequence charSequence) {
        c3 c3Var = this.f19798a.h;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f19543a.w4(charSequence.toString());
        }
    }

    @Override
    public final void l(h1 h1Var, int i3, int i10) {
        c3 c3Var;
        h9 textSelectionHelper;
        s0 s0Var = this.f19798a;
        if (!s0Var.f19876n && i3 != i10 && (c3Var = s0Var.h) != null && (textSelectionHelper = c3Var.f19543a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != s0Var) {
                s0Var.post(new ii.j4(this, h1Var, i10, textSelectionHelper, i3, 2));
            }
        }
    }

    @Override
    public final boolean m() {
        s0 s0Var = this.f19798a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && s0Var.f19875f != null) {
            return c3Var.f19543a.V4();
        }
        return false;
    }

    @Override
    public final void w0() {
        a aVar;
        s0 s0Var = this.f19798a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && (aVar = s0Var.f19875f) != null) {
            c3Var.a(aVar);
        }
    }

    @Override
    public final void A(int i3, int i10) {
    }
}
