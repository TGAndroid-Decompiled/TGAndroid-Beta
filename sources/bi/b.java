package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.yr0;
public final class b extends o81 {
    public final Context f3561a;
    public final yr0 f3562b;

    public b(yr0 yr0Var, Context context) {
        this.f3562b = yr0Var;
        this.f3561a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t8 t8Var;
        u uVar = (u) view;
        yr0 yr0Var = this.f3562b;
        if (i10 == 0) {
            t8Var = yr0Var.e;
        } else {
            t8Var = (t8) yr0Var.f3610f.get(i10 - 1);
        }
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(yr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3562b, this.f3561a);
    }

    @Override
    public final int e() {
        return this.f3562b.f3610f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.f3562b.f3610f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = k41.E(((t8) this.f3562b.f3610f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
