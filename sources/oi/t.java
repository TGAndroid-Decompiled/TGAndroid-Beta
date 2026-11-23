package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.c51;
public final class t implements TextWatcher {
    public final u f22389a;

    public t(u uVar) {
        this.f22389a = uVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        u uVar = this.f22389a;
        TL_iv.RichMessage richMessage = uVar.f22411e2;
        if (richMessage != null && richMessage != null) {
            uVar.f22411e2 = null;
            uVar.f22409b2.i(hd.N0(2131754056, null), true, true);
            c51 c51Var = uVar.V1;
            if (c51Var != null) {
                c51Var.O(true);
            }
        }
        uVar.e1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
