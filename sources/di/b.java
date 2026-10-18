package di;

import android.content.Context;
import android.view.View;
import ci.t6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u81;
public final class b extends u81 {
    public final Context f8033a;
    public final hs0 f8034b;

    public b(hs0 hs0Var, Context context) {
        this.f8034b = hs0Var;
        this.f8033a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t6 t6Var;
        r rVar = (r) view;
        hs0 hs0Var = this.f8034b;
        if (i10 == 0) {
            t6Var = hs0Var.e;
        } else {
            t6Var = (t6) hs0Var.f8074f.get(i10 - 1);
        }
        t6Var.H(null);
        rVar.setList(t6Var);
        rVar.setVisibleHeight(hs0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f8034b, this.f8033a);
    }

    @Override
    public final int e() {
        return this.f8034b.f8074f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t6) this.f8034b.f8074f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = r41.F(((t6) this.f8034b.f8074f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
