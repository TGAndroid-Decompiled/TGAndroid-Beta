package li;

import android.text.Editable;
import android.text.TextWatcher;
import bi.i8;
public final class p implements TextWatcher {
    public final String[] f17400a;
    public final i8 f17401b;

    public p(String[] strArr, i8 i8Var) {
        this.f17400a = strArr;
        this.f17401b = i8Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f17400a[0] = editable.toString();
        this.f17401b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
