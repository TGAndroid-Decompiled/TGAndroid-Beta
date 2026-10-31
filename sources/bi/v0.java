package bi;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.k9;
public final class v0 implements m1 {
    public final y0 f3396a;

    public v0(y0 y0Var) {
        this.f3396a = y0Var;
    }

    @Override
    public final void B(Editable editable) {
        y0 y0Var = this.f3396a;
        a aVar = y0Var.f3457f;
        if (aVar != null) {
            aVar.f2832s = true;
            aVar.f2831r = y0Var.d.f3226k2;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f2818b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = s6.f(editable);
            }
        }
        l3 l3Var = y0Var.h;
        if (l3Var != null && y0Var.f3457f != null) {
            d4 d4Var = l3Var.f3182a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.f2938o3.onContentChanged();
        }
    }

    @Override
    public final boolean H(boolean z10) {
        return false;
    }

    @Override
    public final boolean I(n1 n1Var) {
        return false;
    }

    @Override
    public final void b(n1 n1Var) {
        l3 l3Var = this.f3396a.h;
        if (l3Var != null) {
            d4 d4Var = l3Var.f3182a;
            d4.P1(d4Var, n1Var);
            d4Var.f2938o3.h(n1Var, true);
        }
    }

    @Override
    public final void e(n1 n1Var) {
        a aVar;
        d4 d4Var;
        ArrayList arrayList;
        int indexOf;
        y0 y0Var = this.f3396a;
        l3 l3Var = y0Var.h;
        if (l3Var != null && (aVar = y0Var.f3457f) != null && (indexOf = (arrayList = (d4Var = l3Var.f3182a).f2946s3).indexOf(aVar)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f2818b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                d4Var.f30819f3.O(true);
            }
            int i10 = indexOf + 1;
            if (i10 < arrayList.size() && !((a) arrayList.get(i10)).f2822i && !d4.A3((a) arrayList.get(i10))) {
                d4Var.post(new v2(d4Var, (a) arrayList.get(i10), 24));
            }
        }
    }

    @Override
    public final boolean f() {
        y0 y0Var = this.f3396a;
        l3 l3Var = y0Var.h;
        if (l3Var != null && y0Var.f3457f != null) {
            return l3Var.f3182a.V4();
        }
        return false;
    }

    @Override
    public final void i(n1 n1Var, int i10, int i11) {
        l3 l3Var;
        k9 textSelectionHelper;
        y0 y0Var = this.f3396a;
        if (!y0Var.f3458n && i10 != i11 && (l3Var = y0Var.h) != null && (textSelectionHelper = l3Var.f3182a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.x() || textSelectionHelper.W != y0Var) {
                y0Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 0));
            }
        }
    }

    @Override
    public final void r() {
        a aVar;
        y0 y0Var = this.f3396a;
        l3 l3Var = y0Var.h;
        if (l3Var != null && (aVar = y0Var.f3457f) != null) {
            l3Var.a(aVar);
        }
    }

    @Override
    public final void w(CharSequence charSequence) {
        l3 l3Var = this.f3396a.h;
        if (l3Var != null && charSequence != null && charSequence.length() > 0) {
            l3Var.f3182a.w4(charSequence.toString());
        }
    }

    @Override
    public final boolean x(n1 n1Var) {
        y0 y0Var = this.f3396a;
        if (y0Var.h != null && y0Var.f3457f != null && n1Var.length() == 0) {
            y0Var.h.a(y0Var.f3457f);
            return true;
        }
        return false;
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
