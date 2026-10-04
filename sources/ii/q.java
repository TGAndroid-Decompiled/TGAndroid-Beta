package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f12581a;
    public final k f12582b;

    public q(String[] strArr, k kVar) {
        this.f12581a = strArr;
        this.f12582b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f12581a[0] = editable.toString();
        this.f12582b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
