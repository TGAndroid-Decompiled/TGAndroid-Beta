package ci;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
public final class y9 implements TextWatcher {
    public final ba f5892a;

    public y9(ba baVar) {
        this.f5892a = baVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        Utilities.Callback callback;
        ba baVar = this.f5892a;
        if (!baVar.h && (callback = baVar.f4424n) != null && editable != null) {
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
