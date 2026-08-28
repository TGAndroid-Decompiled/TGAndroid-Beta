package gh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class w0 implements TextWatcher {
    public final x0 f9082a;

    public w0(x0 x0Var) {
        this.f9082a = x0Var;
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
        x0 x0Var = this.f9082a;
        if (!z10) {
            i9 = gf.a.h(editable.toString(), x0Var.A.f7747a);
        } else {
            i9 = gf.a.i(0L, x0Var.A.f7747a);
        }
        x0Var.n(i9, false, false, true);
        x0Var.f9128b.c(x0Var.f9129c.isFocused(), true ^ TextUtils.isEmpty(x0Var.f9129c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
