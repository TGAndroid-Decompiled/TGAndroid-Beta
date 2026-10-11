package bi;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ss0;
public final class b extends h91 {
    public final Context f3891a;
    public final ss0 f3892b;

    public b(ss0 ss0Var, Context context) {
        this.f3892b = ss0Var;
        this.f3891a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v8 v8Var;
        u uVar = (u) view;
        ss0 ss0Var = this.f3892b;
        if (i10 == 0) {
            v8Var = ss0Var.f3943e;
        } else {
            v8Var = (v8) ss0Var.f3944f.get(i10 - 1);
        }
        v8Var.H(null);
        uVar.setList(v8Var);
        uVar.setVisibleHeight(ss0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3892b, this.f3891a);
    }

    @Override
    public final int e() {
        return this.f3892b.f3944f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((v8) this.f3892b.f3944f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String F = d51.F(((v8) this.f3892b.f3944f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
