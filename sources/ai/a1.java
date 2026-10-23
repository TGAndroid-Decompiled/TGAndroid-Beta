package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class a1 implements TextWatcher {
    public final b1 f925a;

    public a1(b1 b1Var) {
        this.f925a = b1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        ag.a i10;
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
        b1 b1Var = this.f925a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), b1Var.f1010n0.f631a);
        } else {
            i10 = ag.a.i(0L, b1Var.f1010n0.f631a);
        }
        b1Var.U(i10, false, false, true);
        b1Var.f1001d0.c(b1Var.f1002e0.isFocused(), true ^ TextUtils.isEmpty(b1Var.f1002e0.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
