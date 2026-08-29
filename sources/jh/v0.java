package jh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class v0 implements TextWatcher {
    public final w0 f12940a;

    public v0(w0 w0Var) {
        this.f12940a = w0Var;
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
        w0 w0Var = this.f12940a;
        if (!z10) {
            i10 = kf.a.h(editable.toString(), w0Var.A.f13633a);
        } else {
            i10 = kf.a.i(0L, w0Var.A.f13633a);
        }
        w0Var.n(i10, false, false, true);
        w0Var.f13002b.c(w0Var.f13003c.isFocused(), true ^ TextUtils.isEmpty(w0Var.f13003c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
