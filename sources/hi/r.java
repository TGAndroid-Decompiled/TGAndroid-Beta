package hi;

import android.text.Editable;
import android.text.TextWatcher;
public final class r implements TextWatcher {
    public final String[] f9805a;
    public final l f9806b;

    public r(String[] strArr, l lVar) {
        this.f9805a = strArr;
        this.f9806b = lVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f9805a[0] = editable.toString();
        this.f9806b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
