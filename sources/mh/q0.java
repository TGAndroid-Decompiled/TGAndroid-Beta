package mh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class q0 implements TextWatcher {
    public final r0 f14616a;

    public q0(r0 r0Var) {
        this.f14616a = r0Var;
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
        r0 r0Var = this.f14616a;
        if (!z4) {
            i10 = mf.a.h(editable.toString(), r0Var.E.f13649a);
        } else {
            i10 = mf.a.i(0L, r0Var.E.f13649a);
        }
        r0Var.q(i10, false, false, true);
        r0Var.f14656f.c(r0Var.h.isFocused(), true ^ TextUtils.isEmpty(r0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
