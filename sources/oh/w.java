package oh;

import android.text.Editable;
import android.text.TextWatcher;

public final class w implements TextWatcher {

    public final j0 f19578a;

    public w(j0 j0Var) {
        this.f19578a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String string = editable.toString();
        j0 j0Var = this.f19578a;
        j0Var.O = string;
        j0Var.C.U2.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
