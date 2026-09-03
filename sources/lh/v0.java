package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class v0 implements TextWatcher {
    public final w0 f13218a;

    public v0(w0 w0Var) {
        this.f13218a = w0Var;
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
        w0 w0Var = this.f13218a;
        if (!z4) {
            i10 = lf.a.h(editable.toString(), w0Var.B.f12054a);
        } else {
            i10 = lf.a.i(0L, w0Var.B.f12054a);
        }
        w0Var.n(i10, false, false, true);
        w0Var.f13253b.c(w0Var.f13254c.isFocused(), true ^ TextUtils.isEmpty(w0Var.f13254c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
