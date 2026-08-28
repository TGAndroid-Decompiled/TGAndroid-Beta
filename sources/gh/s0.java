package gh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class s0 implements TextWatcher {
    public final t0 f8855a;

    public s0(t0 t0Var) {
        this.f8855a = t0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        gf.a i9;
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
        t0 t0Var = this.f8855a;
        if (!z10) {
            i9 = gf.a.h(editable.toString(), t0Var.D.f7747a);
        } else {
            i9 = gf.a.i(0L, t0Var.D.f7747a);
        }
        t0Var.q(i9, false, false, true);
        t0Var.f8898f.c(t0Var.h.isFocused(), true ^ TextUtils.isEmpty(t0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
