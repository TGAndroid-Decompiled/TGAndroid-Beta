package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class lw4 implements TextWatcher {
    public final mw4 a;

    public lw4(mw4 mw4Var) {
        this.a = mw4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        nk j;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        mw4 mw4Var = this.a;
        if (!z) {
            j = nk.i(editable.toString(), mw4Var.A1.a);
        } else {
            j = nk.j(0L, mw4Var.A1.a);
        }
        mw4Var.E0(j, false, false, true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
