package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.l41;
public final class u implements TextWatcher {
    public final v f18911a;

    public u(v vVar) {
        this.f18911a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f18911a;
        TL_iv.RichMessage richMessage = vVar.f18923a2;
        if (richMessage != null && richMessage != null) {
            vVar.f18923a2 = null;
            vVar.X1.i(hd.M0(2131754059, null), true, true);
            l41 l41Var = vVar.R1;
            if (l41Var != null) {
                l41Var.O(true);
            }
        }
        vVar.d1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
