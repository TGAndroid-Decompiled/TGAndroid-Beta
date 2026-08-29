package jh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class r0 implements TextWatcher {
    public final s0 f12687a;

    public r0(s0 s0Var) {
        this.f12687a = s0Var;
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
        s0 s0Var = this.f12687a;
        if (!z10) {
            i10 = kf.a.h(editable.toString(), s0Var.D.f13633a);
        } else {
            i10 = kf.a.i(0L, s0Var.D.f13633a);
        }
        s0Var.q(i10, false, false, true);
        s0Var.f12745f.c(s0Var.h.isFocused(), true ^ TextUtils.isEmpty(s0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
