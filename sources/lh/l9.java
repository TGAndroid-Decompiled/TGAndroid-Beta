package lh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

public final class l9 implements TextWatcher {

    public final n9 f16324a;

    public l9(n9 n9Var) {
        this.f16324a = n9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        n9 n9Var = this.f16324a;
        if (n9Var.h || (callback = n9Var.f16445n) == null || editable == null) {
            return;
        }
        callback.run(editable.toString());
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
