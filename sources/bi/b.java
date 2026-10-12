package bi;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.ws0;
public final class b extends l91 {
    public final Context f3890a;
    public final ws0 f3891b;

    public b(ws0 ws0Var, Context context) {
        this.f3891b = ws0Var;
        this.f3890a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v8 v8Var;
        u uVar = (u) view;
        ws0 ws0Var = this.f3891b;
        if (i10 == 0) {
            v8Var = ws0Var.f3942e;
        } else {
            v8Var = (v8) ws0Var.f3943f.get(i10 - 1);
        }
        v8Var.H(null);
        uVar.setList(v8Var);
        uVar.setVisibleHeight(ws0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3891b, this.f3890a);
    }

    @Override
    public final int e() {
        return this.f3891b.f3943f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((v8) this.f3891b.f3943f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = g51.F(((v8) this.f3891b.f3943f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
