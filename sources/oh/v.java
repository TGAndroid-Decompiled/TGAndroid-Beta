package oh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

public final class v implements TextWatcher {

    public final j0 f19577a;

    public v(j0 j0Var) {
        this.f19577a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        j0 j0Var = this.f19577a;
        boolean zIsEmpty = TextUtils.isEmpty(j0Var.N);
        j0Var.N = string;
        j0Var.B.h(0L, j0Var.f19500e, 0L, 0L, null, false, string, zIsEmpty);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
