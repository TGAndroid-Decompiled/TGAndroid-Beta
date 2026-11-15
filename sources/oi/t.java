package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.p41;
public final class t implements TextWatcher {
    public final u f21999a;

    public t(u uVar) {
        this.f21999a = uVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        u uVar = this.f21999a;
        TL_iv.RichMessage richMessage = uVar.f22023e2;
        if (richMessage != null && richMessage != null) {
            uVar.f22023e2 = null;
            uVar.f22021b2.i(hd.M0(2131754059, null), true, true);
            p41 p41Var = uVar.V1;
            if (p41Var != null) {
                p41Var.O(true);
            }
        }
        uVar.d1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
