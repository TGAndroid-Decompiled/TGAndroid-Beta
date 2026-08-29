package nh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class z8 implements TextWatcher {
    public final b9 f18968a;

    public z8(b9 b9Var) {
        this.f18968a = b9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        b9 b9Var = this.f18968a;
        if (!b9Var.h && (callback = b9Var.f17435n) != null && editable != null) {
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
