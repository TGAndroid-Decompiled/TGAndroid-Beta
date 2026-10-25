package li;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;
public final class p0 implements f1 {
    public final s0 f17402a;

    public p0(s0 s0Var) {
        this.f17402a = s0Var;
    }

    @Override
    public final void E(g1 g1Var, int i10, int i11) {
        c3 c3Var;
        s9 textSelectionHelper;
        s0 s0Var = this.f17402a;
        if (!s0Var.f17464n && i10 != i11 && (c3Var = s0Var.h) != null && (textSelectionHelper = c3Var.f17172a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != s0Var) {
                s0Var.post(new hi.v4(this, g1Var, i11, textSelectionHelper, i10, 2));
            }
        }
    }

    @Override
    public final void R() {
        a aVar;
        s0 s0Var = this.f17402a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && (aVar = s0Var.f17463f) != null) {
            c3Var.a(aVar);
        }
    }

    @Override
    public final void T(CharSequence charSequence) {
        c3 c3Var = this.f17402a.h;
        if (c3Var != null && charSequence != null && charSequence.length() > 0) {
            c3Var.f17172a.z4(charSequence.toString());
        }
    }

    @Override
    public final void Y(Editable editable) {
        s0 s0Var = this.f17402a;
        a aVar = s0Var.f17463f;
        if (aVar != null) {
            aVar.f17068s = true;
            aVar.f17067r = s0Var.d.E;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17054b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = f6.f(editable);
            }
        }
        c3 c3Var = s0Var.h;
        if (c3Var != null && s0Var.f17463f != null) {
            v3 v3Var = c3Var.f17172a;
            f2 f2Var = v3Var.R3;
            if (f2Var != null) {
                f2Var.g();
            }
            v3Var.f17557p3.onContentChanged();
        }
    }

    @Override
    public final void b(g1 g1Var) {
        c3 c3Var = this.f17402a.h;
        if (c3Var != null) {
            v3 v3Var = c3Var.f17172a;
            v3.S1(v3Var, g1Var);
            v3Var.f17557p3.s(g1Var, true);
        }
    }

    @Override
    public final boolean e() {
        s0 s0Var = this.f17402a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && s0Var.f17463f != null) {
            return c3Var.f17172a.Y4();
        }
        return false;
    }

    @Override
    public final boolean f0(boolean z10) {
        return false;
    }

    @Override
    public final boolean g(g1 g1Var) {
        return false;
    }

    @Override
    public final boolean o(g1 g1Var) {
        s0 s0Var = this.f17402a;
        if (s0Var.h != null && s0Var.f17463f != null && g1Var.length() == 0) {
            s0Var.h.a(s0Var.f17463f);
            return true;
        }
        return false;
    }

    @Override
    public final void t(g1 g1Var) {
        a aVar;
        v3 v3Var;
        ArrayList arrayList;
        int indexOf;
        s0 s0Var = this.f17402a;
        c3 c3Var = s0Var.h;
        if (c3Var != null && (aVar = s0Var.f17463f) != null && (indexOf = (arrayList = (v3Var = c3Var.f17172a).f17565t3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f17054b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                v3Var.f32150g3.O(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f17058i && !v3.D3((a) arrayList.get(i10))) {
                v3Var.post(new m2(v3Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final void k(int i10, int i11) {
    }
}
