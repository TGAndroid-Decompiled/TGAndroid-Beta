package li;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.m41;
public final class u implements TextWatcher {
    public final v f18914a;

    public u(v vVar) {
        this.f18914a = vVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        v vVar = this.f18914a;
        TL_iv.RichMessage richMessage = vVar.f18926a2;
        if (richMessage != null && richMessage != null) {
            vVar.f18926a2 = null;
            vVar.X1.i(id.M0(2131754059, null), true, true);
            m41 m41Var = vVar.R1;
            if (m41Var != null) {
                m41Var.O(true);
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
