package di;

import android.content.Context;
import android.view.View;
import ci.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;
import org.telegram.ui.Components.ls0;
import org.telegram.ui.Components.x41;
public final class b extends d91 {
    public final Context f8037a;
    public final ls0 f8038b;

    public b(ls0 ls0Var, Context context) {
        this.f8038b = ls0Var;
        this.f8037a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        s6 s6Var;
        r rVar = (r) view;
        ls0 ls0Var = this.f8038b;
        if (i10 == 0) {
            s6Var = ls0Var.e;
        } else {
            s6Var = (s6) ls0Var.f8078f.get(i10 - 1);
        }
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(ls0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f8038b, this.f8037a);
    }

    @Override
    public final int e() {
        return this.f8038b.f8078f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.f8038b.f8078f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = x41.N(((s6) this.f8038b.f8078f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
