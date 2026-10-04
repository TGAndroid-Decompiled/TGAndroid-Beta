package ii;

import android.text.Editable;
import android.text.TextWatcher;
public final class q implements TextWatcher {
    public final String[] f12580a;
    public final k f12581b;

    public q(String[] strArr, k kVar) {
        this.f12580a = strArr;
        this.f12581b = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f12580a[0] = editable.toString();
        this.f12581b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
