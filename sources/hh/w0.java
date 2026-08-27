package hh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

public final class w0 implements TextWatcher {

    public final x0 f10261a;

    public w0(x0 x0Var) {
        this.f10261a = x0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string;
        int iIndexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
            editable.delete(iIndexOf + 3, string.length());
        }
        x0 x0Var = this.f10261a;
        x0Var.n(!z10 ? hf.a.h(editable.toString(), x0Var.A.f8919a) : hf.a.i(0L, x0Var.A.f8919a), false, false, true);
        x0Var.f10315b.c(x0Var.f10316c.isFocused(), true ^ TextUtils.isEmpty(x0Var.f10316c.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
