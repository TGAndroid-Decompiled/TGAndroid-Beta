package ci;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class s0 implements TextWatcher {
    public final t0 f5944a;

    public s0(t0 t0Var) {
        this.f5944a = t0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        dg.a i3;
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
        t0 t0Var = this.f5944a;
        if (!z10) {
            i3 = dg.a.h(editable.toString(), t0Var.f6001g2.f8923a);
        } else {
            i3 = dg.a.i(0L, t0Var.f6001g2.f8923a);
        }
        t0Var.f1(i3, false, false, true);
        t0Var.W1.c(t0Var.X1.isFocused(), true ^ TextUtils.isEmpty(t0Var.X1.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
