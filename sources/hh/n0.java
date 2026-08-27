package hh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

public final class n0 implements TextWatcher {

    public final o0 f9770a;

    public n0(o0 o0Var) {
        this.f9770a = o0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string;
        int iIndexOf;
        boolean z10 = editable == null || editable.toString().isEmpty() || ".".equals(editable.toString());
        if (!z10 && (iIndexOf = (string = editable.toString()).indexOf(46)) >= 0 && (string.length() - iIndexOf) - 1 > 2) {
            editable.delete(iIndexOf + 3, string.length());
        }
        o0 o0Var = this.f9770a;
        o0Var.U(!z10 ? hf.a.h(editable.toString(), o0Var.f9805i0.f8919a) : hf.a.i(0L, o0Var.f9805i0.f8919a), false, false, true);
        o0Var.Y.c(o0Var.Z.isFocused(), true ^ TextUtils.isEmpty(o0Var.Z.getText()));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
