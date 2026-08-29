package jh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final n0 f12442a;

    public m0(n0 n0Var) {
        this.f12442a = n0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        kf.a i10;
        String obj;
        int indexOf;
        if (editable != null && !editable.toString().isEmpty() && !".".equals(editable.toString())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (indexOf = (obj = editable.toString()).indexOf(46)) >= 0 && (obj.length() - indexOf) - 1 > 2) {
            editable.delete(indexOf + 3, obj.length());
        }
        n0 n0Var = this.f12442a;
        if (!z10) {
            i10 = kf.a.h(editable.toString(), n0Var.f12490i0.f13633a);
        } else {
            i10 = kf.a.i(0L, n0Var.f12490i0.f13633a);
        }
        n0Var.U(i10, false, false, true);
        n0Var.Y.c(n0Var.Z.isFocused(), true ^ TextUtils.isEmpty(n0Var.Z.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
