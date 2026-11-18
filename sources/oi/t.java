package oi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.z41;
public final class t implements TextWatcher {
    public final u f22361a;

    public t(u uVar) {
        this.f22361a = uVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        u uVar = this.f22361a;
        TL_iv.RichMessage richMessage = uVar.f22385e2;
        if (richMessage != null && richMessage != null) {
            uVar.f22385e2 = null;
            uVar.f22383b2.i(gd.M0(2131754057, null), true, true);
            z41 z41Var = uVar.V1;
            if (z41Var != null) {
                z41Var.O(true);
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
