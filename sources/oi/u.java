package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
public final class u implements TextWatcher {
    public final v f22452a;

    public u(v vVar) {
        this.f22452a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f22452a;
        TL_iv.RichMessage richMessage = vVar.f22474e2;
        if (richMessage != null && richMessage != null) {
            vVar.f22474e2 = null;
            vVar.f22472b2.i(hd.N0(2131754056, null), true, true);
            c51 c51Var = vVar.V1;
            if (c51Var != null) {
                c51Var.O(true);
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
