package ei;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class l9 implements TextWatcher {
    public final o9 f9387a;

    public l9(o9 o9Var) {
        this.f9387a = o9Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        o9 o9Var = this.f9387a;
        if (!o9Var.h && (callback = o9Var.f9564n) != null && editable != null) {
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
