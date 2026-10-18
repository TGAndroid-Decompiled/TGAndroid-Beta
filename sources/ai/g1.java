package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class g1 implements TextWatcher {
    public final h1 f1330a;

    public g1(h1 h1Var) {
        this.f1330a = h1Var;
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
        h1 h1Var = this.f1330a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), h1Var.H.f631a);
        } else {
            i10 = ag.a.i(0L, h1Var.H.f631a);
        }
        h1Var.r(i10, false, false, true);
        h1Var.f1396f.c(h1Var.h.isFocused(), true ^ TextUtils.isEmpty(h1Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
