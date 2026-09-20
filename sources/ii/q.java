package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f11565a;
    public final k f11566b;

    public q(String[] strArr, k kVar) {
        this.f11565a = strArr;
        this.f11566b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f11565a[0] = editable.toString();
        this.f11566b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
