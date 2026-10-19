package ki;

import ai.m8;
import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f15436a;
    public final m8 f15437b;

    public p(String[] strArr, m8 m8Var) {
        this.f15436a = strArr;
        this.f15437b = m8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f15436a[0] = editable.toString();
        this.f15437b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
