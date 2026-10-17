package ai;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class k1 implements TextWatcher {
    public final l1 f1627a;

    public k1(l1 l1Var) {
        this.f1627a = l1Var;
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
        l1 l1Var = this.f1627a;
        if (!z10) {
            i10 = ag.a.h(editable.toString(), l1Var.E.f631a);
        } else {
            i10 = ag.a.i(0L, l1Var.E.f631a);
        }
        l1Var.o(i10, false, false, true);
        l1Var.f1749b.c(l1Var.f1750c.isFocused(), true ^ TextUtils.isEmpty(l1Var.f1750c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
