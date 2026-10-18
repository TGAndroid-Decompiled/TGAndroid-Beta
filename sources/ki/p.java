package ki;

import ai.l8;
import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f15437a;
    public final l8 f15438b;

    public p(String[] strArr, l8 l8Var) {
        this.f15437a = strArr;
        this.f15438b = l8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f15437a[0] = editable.toString();
        this.f15438b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
