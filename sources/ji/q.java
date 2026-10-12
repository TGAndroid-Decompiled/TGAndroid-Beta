package ji;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f13468a;
    public final k f13469b;

    public q(String[] strArr, k kVar) {
        this.f13468a = strArr;
        this.f13469b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f13468a[0] = editable.toString();
        this.f13469b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
