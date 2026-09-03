package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class m0 implements TextWatcher {
    public final n0 f12770a;

    public m0(n0 n0Var) {
        this.f12770a = n0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        lf.a i10;
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
        n0 n0Var = this.f12770a;
        if (!z4) {
            i10 = lf.a.h(editable.toString(), n0Var.f12804j0.f12054a);
        } else {
            i10 = lf.a.i(0L, n0Var.f12804j0.f12054a);
        }
        n0Var.U(i10, false, false, true);
        n0Var.Z.c(n0Var.f12795a0.isFocused(), true ^ TextUtils.isEmpty(n0Var.f12795a0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
