package mh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class l0 implements TextWatcher {
    public final m0 f14372a;

    public l0(m0 m0Var) {
        this.f14372a = m0Var;
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
        m0 m0Var = this.f14372a;
        if (!z4) {
            i10 = mf.a.h(editable.toString(), m0Var.f14433j0.f13651a);
        } else {
            i10 = mf.a.i(0L, m0Var.f14433j0.f13651a);
        }
        m0Var.U(i10, false, false, true);
        m0Var.Z.c(m0Var.f14424a0.isFocused(), true ^ TextUtils.isEmpty(m0Var.f14424a0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
