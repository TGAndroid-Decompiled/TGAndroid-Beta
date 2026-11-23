package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b51;
public final class u implements TextWatcher {
    public final v f22519a;

    public u(v vVar) {
        this.f22519a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f22519a;
        TL_iv.RichMessage richMessage = vVar.f22541e2;
        if (richMessage != null && richMessage != null) {
            vVar.f22541e2 = null;
            vVar.f22539b2.i(gd.N0(2131754056, null), true, true);
            b51 b51Var = vVar.V1;
            if (b51Var != null) {
                b51Var.O(true);
            }
        }
        vVar.e1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
