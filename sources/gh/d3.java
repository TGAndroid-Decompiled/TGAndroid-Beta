package gh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;

public final class d3 implements TextWatcher {

    public boolean f7195a;

    public final b3 f7196b;

    public d3(b3 b3Var) {
        this.f7196b = b3Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f7195a && editable.length() > 12) {
            this.f7195a = true;
            editable.delete(12, editable.length());
            b3 b3Var = this.f7196b;
            AndroidUtilities.shakeView(b3Var);
            try {
                b3Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f7195a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
