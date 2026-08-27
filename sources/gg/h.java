package gg;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;

public final class h implements TextWatcher {

    public final l f7093a;

    public h(l lVar) {
        this.f7093a = lVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        l lVar = this.f7093a;
        if (lVar.h || (callback = lVar.f7111n) == null || editable == null) {
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
