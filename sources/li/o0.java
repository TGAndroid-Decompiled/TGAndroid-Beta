package li;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.i9;
public final class o0 implements f1 {
    public final r0 f18734a;

    public o0(r0 r0Var) {
        this.f18734a = r0Var;
    }

    @Override
    public final boolean E(g1 g1Var) {
        r0 r0Var = this.f18734a;
        if (r0Var.h != null && r0Var.f18806f != null && g1Var.length() == 0) {
            r0Var.h.a(r0Var.f18806f);
            return true;
        }
        return false;
    }

    @Override
    public final void F(g1 g1Var) {
        a aVar;
        t3 t3Var;
        ArrayList arrayList;
        int indexOf;
        r0 r0Var = this.f18734a;
        b3 b3Var = r0Var.h;
        if (b3Var != null && (aVar = r0Var.f18806f) != null && (indexOf = (arrayList = (t3Var = b3Var.f18477a).f18897s3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f18392b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                t3Var.f37556f3.O(true);
            }
            int i7 = indexOf + 1;
            if (i7 < arrayList.size() && !((a) arrayList.get(i7)).f18397i && !t3.A3((a) arrayList.get(i7))) {
                t3Var.post(new m2(t3Var, (a) arrayList.get(i7), 24));
            }
        }
    }

    @Override
    public final void T0(CharSequence charSequence) {
        b3 b3Var = this.f18734a.h;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f18477a.w4(charSequence.toString());
        }
    }

    @Override
    public final void b(g1 g1Var) {
        b3 b3Var = this.f18734a.h;
        if (b3Var != null) {
            t3 t3Var = b3Var.f18477a;
            t3.Q1(t3Var, g1Var);
            t3Var.f18890o3.r(g1Var, true);
        }
    }

    @Override
    public final void f1(Editable editable) {
        r0 r0Var = this.f18734a;
        a aVar = r0Var.f18806f;
        if (aVar != null) {
            aVar.f18407s = true;
            aVar.f18406r = r0Var.d.f18593k2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f18392b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = c6.f(editable);
            }
        }
        b3 b3Var = r0Var.h;
        if (b3Var != null && r0Var.f18806f != null) {
            t3 t3Var = b3Var.f18477a;
            f2 f2Var = t3Var.Q3;
            if (f2Var != null) {
                f2Var.g();
            }
            t3Var.f18890o3.onContentChanged();
        }
    }

    @Override
    public final void l0(g1 g1Var, int i7, int i10) {
        b3 b3Var;
        i9 textSelectionHelper;
        r0 r0Var = this.f18734a;
        if (!r0Var.f18807n && i7 != i10 && (b3Var = r0Var.h) != null && (textSelectionHelper = b3Var.f18477a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != r0Var) {
                r0Var.post(new hi.j4(this, g1Var, i10, textSelectionHelper, i7, 2));
            }
        }
    }

    @Override
    public final boolean l1(boolean z9) {
        return false;
    }

    @Override
    public final boolean m() {
        r0 r0Var = this.f18734a;
        b3 b3Var = r0Var.h;
        if (b3Var != null && r0Var.f18806f != null) {
            return b3Var.f18477a.V4();
        }
        return false;
    }

    @Override
    public final void r0() {
        a aVar;
        r0 r0Var = this.f18734a;
        b3 b3Var = r0Var.h;
        if (b3Var != null && (aVar = r0Var.f18806f) != null) {
            b3Var.a(aVar);
        }
    }

    @Override
    public final boolean s(g1 g1Var) {
        return false;
    }

    @Override
    public final void w(int i7, int i10) {
    }
}
