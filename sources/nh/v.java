package nh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final j0 f18728a;

    public v(j0 j0Var) {
        this.f18728a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        j0 j0Var = this.f18728a;
        boolean isEmpty = TextUtils.isEmpty(j0Var.N);
        j0Var.N = obj;
        j0Var.B.h(0L, j0Var.f18651e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
