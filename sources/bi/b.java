package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.x81;
public final class b extends x81 {
    public final Context f3841a;
    public final ds0 f3842b;

    public b(ds0 ds0Var, Context context) {
        this.f3842b = ds0Var;
        this.f3841a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        ds0 ds0Var = this.f3842b;
        if (i10 == 0) {
            u8Var = ds0Var.f3893e;
        } else {
            u8Var = (u8) ds0Var.f3894f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(ds0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3842b, this.f3841a);
    }

    @Override
    public final int e() {
        return this.f3842b.f3894f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.f3842b.f3894f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String C = t41.C(((u8) this.f3842b.f3894f.get(i10 - 1)).E, null, null);
        if (C == null) {
            return null;
        }
        return C.substring(0, 1).toUpperCase() + C.substring(1);
    }
}
