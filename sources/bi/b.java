package bi;

import ai.t8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q81;
import org.telegram.ui.Components.zr0;
public final class b extends q81 {
    public final Context f3560a;
    public final zr0 f3561b;

    public b(zr0 zr0Var, Context context) {
        this.f3561b = zr0Var;
        this.f3560a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        t8 t8Var;
        u uVar = (u) view;
        zr0 zr0Var = this.f3561b;
        if (i10 == 0) {
            t8Var = zr0Var.e;
        } else {
            t8Var = (t8) zr0Var.f3609f.get(i10 - 1);
        }
        t8Var.H(null);
        uVar.setList(t8Var);
        uVar.setVisibleHeight(zr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3561b, this.f3560a);
    }

    @Override
    public final int e() {
        return this.f3561b.f3609f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((t8) this.f3561b.f3609f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = l41.D(((t8) this.f3561b.f3609f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
