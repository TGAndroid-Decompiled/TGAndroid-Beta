package ki;

import ai.l8;
import android.text.Editable;
import android.text.TextWatcher;
public final class p implements TextWatcher {
    public final String[] f15435a;
    public final l8 f15436b;

    public p(String[] strArr, l8 l8Var) {
        this.f15435a = strArr;
        this.f15436b = l8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f15435a[0] = editable.toString();
        this.f15436b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
