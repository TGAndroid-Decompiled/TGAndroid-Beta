package bi;

import ai.v8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.qs0;
public final class b extends f91 {
    public final Context f3891a;
    public final qs0 f3892b;

    public b(qs0 qs0Var, Context context) {
        this.f3892b = qs0Var;
        this.f3891a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v8 v8Var;
        u uVar = (u) view;
        qs0 qs0Var = this.f3892b;
        if (i10 == 0) {
            v8Var = qs0Var.f3943e;
        } else {
            v8Var = (v8) qs0Var.f3944f.get(i10 - 1);
        }
        v8Var.H(null);
        uVar.setList(v8Var);
        uVar.setVisibleHeight(qs0Var.v);
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
        String F = b51.F(((v8) this.f3892b.f3944f.get(i10 - 1)).E, null, null);
        if (F == null) {
            return null;
        }
        return F.substring(0, 1).toUpperCase() + F.substring(1);
    }
}
