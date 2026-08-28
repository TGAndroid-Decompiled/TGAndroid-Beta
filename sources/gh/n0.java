package gh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class n0 implements TextWatcher {
    public final o0 f8591a;

    public n0(o0 o0Var) {
        this.f8591a = o0Var;
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
        o0 o0Var = this.f8591a;
        if (!z10) {
            i9 = gf.a.h(editable.toString(), o0Var.f8649i0.f7747a);
        } else {
            i9 = gf.a.i(0L, o0Var.f8649i0.f7747a);
        }
        o0Var.T(i9, false, false, true);
        o0Var.Y.c(o0Var.Z.isFocused(), true ^ TextUtils.isEmpty(o0Var.Z.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
