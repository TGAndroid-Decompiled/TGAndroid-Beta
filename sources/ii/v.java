package ii;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final j0 f14433a;

    public v(j0 j0Var) {
        this.f14433a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        j0 j0Var = this.f14433a;
        boolean isEmpty = TextUtils.isEmpty(j0Var.R);
        j0Var.R = obj;
        j0Var.F.h(0L, j0Var.e, 0L, 0L, null, false, obj, isEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
