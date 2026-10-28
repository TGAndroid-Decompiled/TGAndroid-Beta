package ei;

import android.content.Context;
import android.view.View;
import di.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.vs0;
public final class b extends n91 {
    public final Context f9976a;
    public final vs0 f9977b;

    public b(vs0 vs0Var, Context context) {
        this.f9977b = vs0Var;
        this.f9976a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        s6 s6Var;
        r rVar = (r) view;
        vs0 vs0Var = this.f9977b;
        if (i10 == 0) {
            s6Var = vs0Var.e;
        } else {
            s6Var = (s6) vs0Var.f10017f.get(i10 - 1);
        }
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(vs0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f9977b, this.f9976a);
    }

    @Override
    public final int e() {
        return this.f9977b.f10017f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.f9977b.f10017f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = g51.N(((s6) this.f9977b.f10017f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
