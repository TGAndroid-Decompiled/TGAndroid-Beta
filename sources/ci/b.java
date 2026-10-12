package ci;

import android.content.Context;
import android.view.View;
import bi.f8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.x41;
public final class b extends c91 {
    public final Context f4753a;
    public final ms0 f4754b;

    public b(ms0 ms0Var, Context context) {
        this.f4754b = ms0Var;
        this.f4753a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        f8 f8Var;
        t tVar = (t) view;
        ms0 ms0Var = this.f4754b;
        if (i10 == 0) {
            f8Var = ms0Var.e;
        } else {
            f8Var = (f8) ms0Var.f4799f.get(i10 - 1);
        }
        f8Var.H(null);
        tVar.setList(f8Var);
        tVar.setVisibleHeight(ms0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new t(this.f4754b, this.f4753a);
    }

    @Override
    public final int e() {
        return this.f4754b.f4799f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((f8) this.f4754b.f4799f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = x41.F(((f8) this.f4754b.f4799f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
