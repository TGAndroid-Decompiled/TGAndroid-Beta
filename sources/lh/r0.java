package lh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class r0 implements TextWatcher {
    public final s0 f13000a;

    public r0(s0 s0Var) {
        this.f13000a = s0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z4;
        mf.a i10;
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
        s0 s0Var = this.f13000a;
        if (!z4) {
            i10 = mf.a.h(editable.toString(), s0Var.E.f13928a);
        } else {
            i10 = mf.a.i(0L, s0Var.E.f13928a);
        }
        s0Var.q(i10, false, false, true);
        s0Var.f13051f.c(s0Var.h.isFocused(), true ^ TextUtils.isEmpty(s0Var.h.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
