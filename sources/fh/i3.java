package fh;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class i3 implements TextWatcher {
    public boolean f6517a;
    public final g3 f6518b;

    public i3(g3 g3Var) {
        this.f6518b = g3Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f6517a && editable.length() > 12) {
            this.f6517a = true;
            editable.delete(12, editable.length());
            g3 g3Var = this.f6518b;
            AndroidUtilities.shakeView(g3Var);
            try {
                g3Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f6517a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
