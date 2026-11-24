package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
public final class hq7 implements TextWatcher {
    public final iq7 a;

    public hq7(iq7 iq7Var) {
        this.a = iq7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj;
        boolean z;
        nj i;
        long j;
        if (editable == null) {
            obj = "";
        } else {
            obj = editable.toString();
        }
        int indexOf = obj.indexOf(46);
        if (indexOf >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
            return;
        }
        if (!obj.isEmpty() && !".".equals(obj)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = null;
        } else {
            i = nj.i(obj, oj.b);
        }
        if (!z && i == null) {
            editable.delete(obj.length() - 1, obj.length());
            return;
        }
        if (z) {
            j = 0;
        } else {
            j = i.b;
        }
        this.a.E0(j);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
