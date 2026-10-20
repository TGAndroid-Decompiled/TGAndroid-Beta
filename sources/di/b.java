package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.w81;
public final class b extends w81 {
    public final Context f8030a;
    public final js0 f8031b;

    public b(js0 js0Var, Context context) {
        this.f8031b = js0Var;
        this.f8030a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t6 t6Var;
        r rVar = (r) view;
        js0 js0Var = this.f8031b;
        if (i10 == 0) {
            t6Var = js0Var.e;
        } else {
            t6Var = (t6) js0Var.f8071f.get(i10 - 1);
        }
        t6Var.H(null);
        rVar.setList(t6Var);
        rVar.setVisibleHeight(js0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f8031b, this.f8030a);
    }

    @Override
    public final int e() {
        return this.f8031b.f8071f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t6) this.f8031b.f8071f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = t41.E(((t6) this.f8031b.f8071f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
