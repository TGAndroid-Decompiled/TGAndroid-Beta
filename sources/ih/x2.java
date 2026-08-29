package ih;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
public final class x2 implements TextWatcher {
    public boolean f9499a;
    public final v2 f9500b;

    public x2(v2 v2Var) {
        this.f9500b = v2Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        if (!this.f9499a && editable.length() > 12) {
            this.f9499a = true;
            editable.delete(12, editable.length());
            v2 v2Var = this.f9500b;
            AndroidUtilities.shakeView(v2Var);
            try {
                v2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            this.f9499a = false;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
