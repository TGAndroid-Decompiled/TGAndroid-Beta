package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.v81;
public final class b extends v81 {
    public final Context f8032a;
    public final is0 f8033b;

    public b(is0 is0Var, Context context) {
        this.f8033b = is0Var;
        this.f8032a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t6 t6Var;
        r rVar = (r) view;
        is0 is0Var = this.f8033b;
        if (i10 == 0) {
            t6Var = is0Var.e;
        } else {
            t6Var = (t6) is0Var.f8073f.get(i10 - 1);
        }
        t6Var.H(null);
        rVar.setList(t6Var);
        rVar.setVisibleHeight(is0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f8033b, this.f8032a);
    }

    @Override
    public final int e() {
        return this.f8033b.f8073f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t6) this.f8033b.f8073f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = s41.E(((t6) this.f8033b.f8073f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
