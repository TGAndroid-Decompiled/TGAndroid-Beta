package kh;

import android.content.Context;
import android.view.View;
import jh.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.vq0;

public final class b extends g71 {

    public final Context f15190a;

    public final vq0 f15191b;

    public b(vq0 vq0Var, Context context) {
        this.f15191b = vq0Var;
        this.f15190a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        r rVar = (r) view;
        vq0 vq0Var = this.f15191b;
        b6 b6Var = i10 == 0 ? vq0Var.f15232e : (b6) vq0Var.f15233f.get(i10 - 1);
        b6Var.H(null);
        rVar.setList(b6Var);
        rVar.setVisibleHeight(vq0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f15191b, this.f15190a);
    }

    @Override
    public final int e() {
        return this.f15191b.f15233f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((b6) this.f15191b.f15233f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String strE = b31.E(((b6) this.f15191b.f15233f.get(i10 - 1)).E, null, null);
        if (strE == null) {
            return null;
        }
        return strE.substring(0, 1).toUpperCase() + strE.substring(1);
    }
}
