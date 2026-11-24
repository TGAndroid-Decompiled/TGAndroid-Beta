package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class xb9 implements lc9 {
    public final ac9 a;

    public xb9(ac9 ac9Var) {
        this.a = ac9Var;
    }

    @Override
    public final boolean A(mc9 mc9Var) {
        return false;
    }

    @Override
    public final boolean H(mc9 mc9Var) {
        ac9 ac9Var = this.a;
        if (ac9Var.h != null && ac9Var.f != null && mc9Var.length() == 0) {
            ac9Var.h.a(ac9Var.f);
            return true;
        }
        return false;
    }

    @Override
    public final void I() {
        lk0 lk0Var;
        ac9 ac9Var = this.a;
        he9 he9Var = ac9Var.h;
        if (he9Var != null && (lk0Var = ac9Var.f) != null) {
            he9Var.a(lk0Var);
        }
    }

    @Override
    public final void O(CharSequence charSequence) {
        he9 he9Var = this.a.h;
        if (he9Var != null && charSequence != null && charSequence.length() > 0) {
            he9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final void U(Editable editable) {
        ac9 ac9Var = this.a;
        lk0 lk0Var = ac9Var.f;
        if (lk0Var != null) {
            lk0Var.s = true;
            lk0Var.r = ac9Var.d.q2;
        }
        if (lk0Var != null) {
            TL_iv.PageBlock pageBlock = lk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = yi9.f(editable);
            }
        }
        he9 he9Var = ac9Var.h;
        if (he9Var != null && ac9Var.f != null) {
            ye9 ye9Var = he9Var.a;
            ld9 ld9Var = ye9Var.R3;
            if (ld9Var != null) {
                ld9Var.g();
            }
            ye9Var.p3.onContentChanged();
        }
    }

    @Override
    public final void Y(mc9 mc9Var) {
        lk0 lk0Var;
        ye9 ye9Var;
        ArrayList arrayList;
        int indexOf;
        ac9 ac9Var = this.a;
        he9 he9Var = ac9Var.h;
        if (he9Var != null && (lk0Var = ac9Var.f) != null && (indexOf = (arrayList = (ye9Var = he9Var.a).t3).indexOf(lk0Var)) >= 0) {
            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lk0Var.b;
            if (!pageblockdetails.open) {
                pageblockdetails.open = true;
                ye9Var.g3.O(true);
            }
            int i = indexOf + 1;
            if (i < arrayList.size() && !((lk0) arrayList.get(i)).i && !ye9.t3((lk0) arrayList.get(i))) {
                ye9Var.post(new sd9(ye9Var, (lk0) arrayList.get(i), (byte) 24));
            }
        }
    }

    @Override
    public final boolean c0(boolean z) {
        return false;
    }

    @Override
    public final void d(mc9 mc9Var) {
        he9 he9Var = this.a.h;
        if (he9Var != null) {
            ye9 ye9Var = he9Var.a;
            ye9Var.i4(mc9Var);
            ye9Var.p3.g(mc9Var, true);
        }
    }

    @Override
    public final boolean i() {
        ac9 ac9Var = this.a;
        he9 he9Var = ac9Var.h;
        if (he9Var != null && ac9Var.f != null) {
            return he9Var.a.V4();
        }
        return false;
    }

    @Override
    public final void t(mc9 mc9Var, int i, int i2) {
        he9 he9Var;
        fib textSelectionHelper;
        ac9 ac9Var = this.a;
        if (!ac9Var.n && i != i2 && (he9Var = ac9Var.h) != null && (textSelectionHelper = he9Var.a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.w() || textSelectionHelper.W != ac9Var) {
                ac9Var.post(new zy0(this, mc9Var, i2, textSelectionHelper, i, (byte) 3));
            }
        }
    }

    @Override
    public final void l(int i, int i2) {
    }
}
