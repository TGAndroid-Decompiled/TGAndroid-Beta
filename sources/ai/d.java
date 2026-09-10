package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.vr0;
import zh.s4;
public final class d extends n81 {
    public final Context f428a;
    public final vr0 f429b;

    public d(vr0 vr0Var, Context context) {
        this.f429b = vr0Var;
        this.f428a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        s4 s4Var;
        a0 a0Var = (a0) view;
        vr0 vr0Var = this.f429b;
        if (i10 == 0) {
            s4Var = vr0Var.e;
        } else {
            s4Var = (s4) vr0Var.f445f.get(i10 - 1);
        }
        s4Var.H(null);
        a0Var.setList(s4Var);
        a0Var.setVisibleHeight(vr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new a0(this.f429b, this.f428a);
    }

    @Override
    public final int e() {
        return this.f429b.f445f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((s4) this.f429b.f445f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = i41.D(((s4) this.f429b.f445f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
