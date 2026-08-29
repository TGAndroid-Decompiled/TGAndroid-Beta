package ig;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class g implements TextWatcher {
    public final k f8980a;

    public g(k kVar) {
        this.f8980a = kVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        k kVar = this.f8980a;
        if (!kVar.h && (callback = kVar.f8998n) != null && editable != null) {
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
