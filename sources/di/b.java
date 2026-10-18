package di;

import android.content.Context;
import android.view.View;
import ci.s6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u81;
public final class b extends u81 {
    public final Context f8031a;
    public final hs0 f8032b;

    public b(hs0 hs0Var, Context context) {
        this.f8032b = hs0Var;
        this.f8031a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        s6 s6Var;
        r rVar = (r) view;
        hs0 hs0Var = this.f8032b;
        if (i10 == 0) {
            s6Var = hs0Var.e;
        } else {
            s6Var = (s6) hs0Var.f8072f.get(i10 - 1);
        }
        s6Var.H(null);
        rVar.setList(s6Var);
        rVar.setVisibleHeight(hs0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f8032b, this.f8031a);
    }

    @Override
    public final int e() {
        return this.f8032b.f8072f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s6) this.f8032b.f8072f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = r41.F(((s6) this.f8032b.f8072f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
