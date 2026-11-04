package mi;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.f41;
public final class u implements TextWatcher {
    public final v f19959a;

    public u(v vVar) {
        this.f19959a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f19959a;
        TL_iv.RichMessage richMessage = vVar.f19975b2;
        if (richMessage != null && richMessage != null) {
            vVar.f19975b2 = null;
            vVar.Y1.i(bd.M0(2131754059, null), true, true);
            f41 f41Var = vVar.S1;
            if (f41Var != null) {
                f41Var.O(true);
            }
        }
        vVar.d1();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
