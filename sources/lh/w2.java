package lh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements TextWatcher {
    public boolean f13060a;
    public final u2 f13061b;

    public w2(u2 u2Var) {
        this.f13061b = u2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f13060a && editable.length() > 12) {
            this.f13060a = true;
            editable.delete(12, editable.length());
            u2 u2Var = this.f13061b;
            AndroidUtilities.shakeView(u2Var);
            try {
                u2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f13060a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
