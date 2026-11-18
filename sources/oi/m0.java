package oi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
public final class m0 implements d1 {
    public final p0 f22170a;

    public m0(p0 p0Var) {
        this.f22170a = p0Var;
    }

    @Override
    public final void E0() {
        a aVar;
        p0 p0Var = this.f22170a;
        b3 b3Var = p0Var.h;
        if (b3Var != null && (aVar = p0Var.f22233f) != null) {
            b3Var.a(aVar);
        }
    }

    @Override
    public final boolean E1(boolean z10) {
        return false;
    }

    @Override
    public final boolean J(e1 e1Var) {
        p0 p0Var = this.f22170a;
        if (p0Var.h != null && p0Var.f22233f != null && e1Var.length() == 0) {
            p0Var.h.a(p0Var.f22233f);
            return true;
        }
        return false;
    }

    @Override
    public final void b1(CharSequence charSequence) {
        b3 b3Var = this.f22170a.h;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f21949a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean d2(e1 e1Var) {
        return false;
    }

    @Override
    public final void e(e1 e1Var) {
        b3 b3Var = this.f22170a.h;
        if (b3Var != null) {
            s3 s3Var = b3Var.f21949a;
            s3.Q1(s3Var, e1Var);
            s3Var.f22334p3.k(e1Var, true);
        }
    }

    @Override
    public final boolean o() {
        p0 p0Var = this.f22170a;
        b3 b3Var = p0Var.h;
        if (b3Var != null && p0Var.f22233f != null) {
            return b3Var.f21949a.V4();
        }
        return false;
    }

    @Override
    public final void r1(e1 e1Var, int i7, int i10) {
        b3 b3Var;
        j9 textSelectionHelper;
        p0 p0Var = this.f22170a;
        if (!p0Var.f22234n && i7 != i10 && (b3Var = p0Var.h) != null && (textSelectionHelper = b3Var.f21949a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != p0Var) {
                p0Var.post(new jg.o1(this, e1Var, i10, textSelectionHelper, i7, 2));
            }
        }
    }

    @Override
    public final void s1(Editable editable) {
        p0 p0Var = this.f22170a;
        a aVar = p0Var.f22233f;
        if (aVar != null) {
            aVar.f21922s = true;
            aVar.f21921r = p0Var.d.f22019q2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f21907b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = b6.f(editable);
            }
        }
        b3 b3Var = p0Var.h;
        if (b3Var != null && p0Var.f22233f != null) {
            s3 s3Var = b3Var.f21949a;
            e2 e2Var = s3Var.R3;
            if (e2Var != null) {
                e2Var.g();
            }
            s3Var.f22334p3.onContentChanged();
        }
    }

    @Override
    public final void x0(e1 e1Var) {
        a aVar;
        s3 s3Var;
        ArrayList arrayList;
        int indexOf;
        p0 p0Var = this.f22170a;
        b3 b3Var = p0Var.h;
        if (b3Var != null && (aVar = p0Var.f22233f) != null && (indexOf = (arrayList = (s3Var = b3Var.f21949a).f22342t3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f21907b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                s3Var.f34607g3.O(true);
            }
            int i7 = indexOf + 1;
            if (i7 < arrayList.size() && !((a) arrayList.get(i7)).f21912i && !s3.A3((a) arrayList.get(i7))) {
                s3Var.post(new l2(s3Var, (a) arrayList.get(i7), 24));
            }
        }
    }

    @Override
    public final void A(int i7, int i10) {
    }
}
