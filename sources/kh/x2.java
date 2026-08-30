package kh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x2 implements TextWatcher {
    public boolean f10937a;
    public final v2 f10938b;

    public x2(v2 v2Var) {
        this.f10938b = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f10937a && editable.length() > 12) {
            this.f10937a = true;
            editable.delete(12, editable.length());
            v2 v2Var = this.f10938b;
            AndroidUtilities.shakeView(v2Var);
            try {
                v2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f10937a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
