package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class nw4 implements TextWatcher {
    public final ow4 a;

    public nw4(ow4 ow4Var) {
        this.a = ow4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        oj j;
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
        ow4 ow4Var = this.a;
        if (!z) {
            j = oj.i(editable.toString(), ow4Var.A1.a);
        } else {
            j = oj.j(0L, ow4Var.A1.a);
        }
        ow4Var.F0(j, false, false, true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
