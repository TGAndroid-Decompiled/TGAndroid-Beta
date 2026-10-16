package ji;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f13471a;
    public final k f13472b;

    public q(String[] strArr, k kVar) {
        this.f13471a = strArr;
        this.f13472b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f13471a[0] = editable.toString();
        this.f13472b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
