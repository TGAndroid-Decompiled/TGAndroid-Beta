package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.v31;
public final class b extends a81 {
    public final Context f3556a;
    public final mr0 f3557b;

    public b(mr0 mr0Var, Context context) {
        this.f3557b = mr0Var;
        this.f3556a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t8 t8Var;
        u uVar = (u) view;
        mr0 mr0Var = this.f3557b;
        if (i10 == 0) {
            t8Var = mr0Var.e;
        } else {
            t8Var = (t8) mr0Var.f3605f.get(i10 - 1);
        }
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(mr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3557b, this.f3556a);
    }

    @Override
    public final int e() {
        return this.f3557b.f3605f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.f3557b.f3605f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = v31.E(((t8) this.f3557b.f3605f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
