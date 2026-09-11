package ji;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f14119a;
    public final k f14120b;

    public q(String[] strArr, k kVar) {
        this.f14119a = strArr;
        this.f14120b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f14119a[0] = editable.toString();
        this.f14120b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
