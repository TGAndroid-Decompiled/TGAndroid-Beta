package ei;

import android.text.Editable;
import android.text.TextWatcher;
public final class x implements TextWatcher {
    public final k0 f7643a;

    public x(k0 k0Var) {
        this.f7643a = k0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        k0 k0Var = this.f7643a;
        k0Var.S = obj;
        k0Var.G.Y2.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
