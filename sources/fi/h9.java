package fi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class h9 implements TextWatcher {
    public final k9 f10967a;

    public h9(k9 k9Var) {
        this.f10967a = k9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        k9 k9Var = this.f10967a;
        if (!k9Var.f11127n && (callback = k9Var.f11128r) != null && editable != null) {
            callback.run(editable.toString());
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
