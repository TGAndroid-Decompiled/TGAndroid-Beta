package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final j0 f14435a;

    public w(j0 j0Var) {
        this.f14435a = j0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        j0 j0Var = this.f14435a;
        j0Var.S = obj;
        j0Var.G.f32152g3.O(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
