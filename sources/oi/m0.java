package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.h9;
public final class m0 implements d1 {
    public final p0 f21807a;

    public m0(p0 p0Var) {
        this.f21807a = p0Var;
    }

    @Override
    public final void B() {
        a aVar;
        p0 p0Var = this.f21807a;
        z2 z2Var = p0Var.h;
        if (z2Var != null && (aVar = p0Var.f21869f) != null) {
            z2Var.a(aVar);
        }
    }

    @Override
    public final void I(CharSequence charSequence) {
        z2 z2Var = this.f21807a.h;
        if (z2Var != null && charSequence != null && charSequence.length() > 0) {
            z2Var.f22192a.w4(charSequence.toString());
        }
    }

    @Override
    public final void Z(e1 e1Var, int i7, int i10) {
        z2 z2Var;
        h9 textSelectionHelper;
        p0 p0Var = this.f21807a;
        if (!p0Var.f21870n && i7 != i10 && (z2Var = p0Var.h) != null && (textSelectionHelper = z2Var.f22192a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != p0Var) {
                p0Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 2));
            }
        }
    }

    @Override
    public final void b0(Editable editable) {
        p0 p0Var = this.f21807a;
        a aVar = p0Var.f21869f;
        if (aVar != null) {
            aVar.f21559s = true;
            aVar.f21558r = p0Var.d.f21665q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21544b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = a6.f(editable);
            }
        }
        z2 z2Var = p0Var.h;
        if (z2Var != null && p0Var.f21869f != null) {
            q3 q3Var = z2Var.f22192a;
            d2 d2Var = q3Var.R3;
            if (d2Var != null) {
                d2Var.g();
            }
            q3Var.f21931p3.onContentChanged();
        }
    }

    @Override
    public final void d(e1 e1Var) {
        z2 z2Var = this.f21807a.h;
        if (z2Var != null) {
            q3 q3Var = z2Var.f22192a;
            q3.Q1(q3Var, e1Var);
            q3Var.f21931p3.b(e1Var, true);
        }
    }

    @Override
    public final boolean g() {
        p0 p0Var = this.f21807a;
        z2 z2Var = p0Var.h;
        if (z2Var != null && p0Var.f21869f != null) {
            return z2Var.f22192a.V4();
        }
        return false;
    }

    @Override
    public final boolean h0(boolean z10) {
        return false;
    }

    @Override
    public final boolean o(e1 e1Var) {
        p0 p0Var = this.f21807a;
        if (p0Var.h != null && p0Var.f21869f != null && e1Var.length() == 0) {
            p0Var.h.a(p0Var.f21869f);
            return true;
        }
        return false;
    }

    @Override
    public final boolean q0(e1 e1Var) {
        return false;
    }

    @Override
    public final void z(e1 e1Var) {
        a aVar;
        q3 q3Var;
        ArrayList arrayList;
        int indexOf;
        p0 p0Var = this.f21807a;
        z2 z2Var = p0Var.h;
        if (z2Var != null && (aVar = p0Var.f21869f) != null && (indexOf = (arrayList = (q3Var = z2Var.f22192a).f21939t3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21544b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                q3Var.f39895g3.O(true);
            }
            int i7 = indexOf + 1;
            if (i7 < arrayList.size() && !((a) arrayList.get(i7)).f21549i && !q3.A3((a) arrayList.get(i7))) {
                q3Var.post(new k2(q3Var, (a) arrayList.get(i7), 24));
            }
        }
    }

    @Override
    public final void m(int i7, int i10) {
    }
}
