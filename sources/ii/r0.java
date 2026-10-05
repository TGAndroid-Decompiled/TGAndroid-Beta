package ii;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.q9;
public final class r0 implements h1 {
    public final u0 f12608a;

    public r0(u0 u0Var) {
        this.f12608a = u0Var;
    }

    @Override
    public final void B(Editable editable) {
        u0 u0Var = this.f12608a;
        a aVar = u0Var.f12679f;
        if (aVar != null) {
            aVar.f12202s = true;
            aVar.f12201r = u0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f12187b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = h6.f(editable);
            }
        }
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12679f != null) {
            x3 x3Var = e3Var.f12349a;
            i2 i2Var = x3Var.Q3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f12770o3.onContentChanged();
        }
    }

    @Override
    public final boolean C(boolean z10) {
        return false;
    }

    @Override
    public final void b(i1 i1Var) {
        e3 e3Var = this.f12608a.h;
        if (e3Var != null) {
            x3 x3Var = e3Var.f12349a;
            x3.N1(x3Var, i1Var);
            x3Var.f12770o3.P(i1Var, true);
        }
    }

    @Override
    public final boolean e() {
        u0 u0Var = this.f12608a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && u0Var.f12679f != null) {
            return e3Var.f12349a.T4();
        }
        return false;
    }

    @Override
    public final void l(i1 i1Var) {
        a aVar;
        x3 x3Var;
        ArrayList arrayList;
        int indexOf;
        u0 u0Var = this.f12608a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12679f) != null && (indexOf = (arrayList = (x3Var = e3Var.f12349a).f12778s3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f12187b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                x3Var.f26034f3.N(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f12192i && !x3.y3((a) arrayList.get(i10))) {
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
        u0 u0Var = this.f12608a;
        if (u0Var.h != null && u0Var.f12679f != null && i1Var.length() == 0) {
            u0Var.h.a(u0Var.f12679f);
            return true;
        }
        return false;
    }

    @Override
    public final void r() {
        a aVar;
        u0 u0Var = this.f12608a;
        e3 e3Var = u0Var.h;
        if (e3Var != null && (aVar = u0Var.f12679f) != null) {
            e3Var.a(aVar);
        }
    }

    @Override
    public final void t(i1 i1Var, int i10, int i11) {
        e3 e3Var;
        q9 textSelectionHelper;
        u0 u0Var = this.f12608a;
        if (!u0Var.f12680n && i10 != i11 && (e3Var = u0Var.h) != null && (textSelectionHelper = e3Var.f12349a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != u0Var) {
                u0Var.post(new ei.y4(this, i1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void w(CharSequence charSequence) {
        e3 e3Var = this.f12608a.h;
        if (e3Var != null && charSequence != null && charSequence.length() > 0) {
            e3Var.f12349a.u4(charSequence.toString());
        }
    }

    @Override
    public final void f(int i10, int i11) {
    }
}
