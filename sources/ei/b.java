package ei;

import android.content.Context;
import android.view.View;
import di.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.us0;
public final class b extends m91 {
    public final Context f9977a;
    public final us0 f9978b;

    public b(us0 us0Var, Context context) {
        this.f9978b = us0Var;
        this.f9977a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        s6 s6Var;
        r rVar = (r) view;
        us0 us0Var = this.f9978b;
        if (i10 == 0) {
            s6Var = us0Var.e;
        } else {
            s6Var = (s6) us0Var.f10018f.get(i10 - 1);
        }
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(us0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f9978b, this.f9977a);
    }

    @Override
    public final int e() {
        return this.f9978b.f10018f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.f9978b.f10018f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String N = f51.N(((s6) this.f9978b.f10018f.get(i10 - 1)).E, null, null);
        if (N == null) {
            return null;
        }
        return N.substring(0, 1).toUpperCase() + N.substring(1);
    }
}
