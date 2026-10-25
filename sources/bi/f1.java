package bi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class f1 implements TextWatcher {
    public final g1 f4593a;

    public f1(g1 g1Var) {
        this.f4593a = g1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        bg.a i10;
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
        g1 g1Var = this.f4593a;
        if (!z10) {
            i10 = bg.a.h(editable.toString(), g1Var.H.f3978a);
        } else {
            i10 = bg.a.i(0L, g1Var.H.f3978a);
        }
        g1Var.q(i10, false, false, true);
        g1Var.f4635f.c(g1Var.h.isFocused(), true ^ TextUtils.isEmpty(g1Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
