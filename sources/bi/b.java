package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.p81;
public final class b extends p81 {
    public final Context f3560a;
    public final as0 f3561b;

    public b(as0 as0Var, Context context) {
        this.f3561b = as0Var;
        this.f3560a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        as0 as0Var = this.f3561b;
        if (i10 == 0) {
            u8Var = as0Var.e;
        } else {
            u8Var = (u8) as0Var.f3609f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(as0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3561b, this.f3560a);
    }

    @Override
    public final int e() {
        return this.f3561b.f3609f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.f3561b.f3609f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = l41.E(((u8) this.f3561b.f3609f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
