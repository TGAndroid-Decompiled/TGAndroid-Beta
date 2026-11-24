package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class ku4 implements TextWatcher {
    public final lu4 a;

    public ku4(lu4 lu4Var) {
        this.a = lu4Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        nj j;
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
        lu4 lu4Var = this.a;
        if (!z) {
            j = nj.i(editable.toString(), lu4Var.A1.a);
        } else {
            j = nj.j(0L, lu4Var.A1.a);
        }
        lu4Var.E0(j, false, false, true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
