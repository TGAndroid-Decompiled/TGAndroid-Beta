package kh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class o9 implements TextWatcher {
    public final q9 f15803a;

    public o9(q9 q9Var) {
        this.f15803a = q9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        q9 q9Var = this.f15803a;
        if (!q9Var.h && (callback = q9Var.f15894n) != null && editable != null) {
            callback.run(editable.toString());
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
