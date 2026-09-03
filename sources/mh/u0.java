package mh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class u0 implements TextWatcher {
    public final v0 f14862a;

    public u0(v0 v0Var) {
        this.f14862a = v0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        mf.a i10;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z4 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        v0 v0Var = this.f14862a;
        if (!z4) {
            i10 = mf.a.h(editable.toString(), v0Var.B.f13651a);
        } else {
            i10 = mf.a.i(0L, v0Var.B.f13651a);
        }
        v0Var.n(i10, false, false, true);
        v0Var.f14915b.c(v0Var.f14916c.isFocused(), true ^ TextUtils.isEmpty(v0Var.f14916c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
