package ci;

import android.content.Context;
import android.view.View;
import bi.b8;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.u31;
public final class b extends a81 {
    public final Context f4802a;
    public final lr0 f4803b;

    public b(lr0 lr0Var, Context context) {
        this.f4803b = lr0Var;
        this.f4802a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        b8 b8Var;
        t tVar = (t) view;
        lr0 lr0Var = this.f4803b;
        if (i10 == 0) {
            b8Var = lr0Var.f4851e;
        } else {
            b8Var = (b8) lr0Var.f4852f.get(i10 - 1);
        }
        b8Var.H(null);
        tVar.setList(b8Var);
        tVar.setVisibleHeight(lr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new t(this.f4803b, this.f4802a);
    }

    @Override
    public final int e() {
        return this.f4803b.f4852f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((b8) this.f4803b.f4852f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = u31.D(((b8) this.f4803b.f4852f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
