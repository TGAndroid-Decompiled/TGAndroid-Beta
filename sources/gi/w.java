package gi;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final k0 f10789a;

    public w(k0 k0Var) {
        this.f10789a = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        k0 k0Var = this.f10789a;
        boolean isEmpty = TextUtils.isEmpty(k0Var.R);
        k0Var.R = obj;
        k0Var.F.h(0L, k0Var.f10711e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
