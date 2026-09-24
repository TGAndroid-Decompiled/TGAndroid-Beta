package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.xr0;
public final class b extends n81 {
    public final Context f3553a;
    public final xr0 f3554b;

    public b(xr0 xr0Var, Context context) {
        this.f3554b = xr0Var;
        this.f3553a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        xr0 xr0Var = this.f3554b;
        if (i10 == 0) {
            u8Var = xr0Var.e;
        } else {
            u8Var = (u8) xr0Var.f3602f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(xr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3554b, this.f3553a);
    }

    @Override
    public final int e() {
        return this.f3554b.f3602f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.f3554b.f3602f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String E = i41.E(((u8) this.f3554b.f3602f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
