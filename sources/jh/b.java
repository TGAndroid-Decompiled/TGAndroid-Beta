package jh;

import android.content.Context;
import android.view.View;
import ih.f6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.z21;
public final class b extends e71 {
    public final Context f14341a;
    public final uq0 f14342b;

    public b(uq0 uq0Var, Context context) {
        this.f14342b = uq0Var;
        this.f14341a = context;
    }

    @Override
    public final void b(View view, int i9, int i10) {
        f6 f6Var;
        q qVar = (q) view;
        uq0 uq0Var = this.f14342b;
        if (i9 == 0) {
            f6Var = uq0Var.f14381e;
        } else {
            f6Var = (f6) uq0Var.f14382f.get(i9 - 1);
        }
        f6Var.H(null);
        qVar.setList(f6Var);
        qVar.setVisibleHeight(uq0Var.v);
    }

    @Override
    public final View d(int i9) {
        return new q(this.f14342b, this.f14341a);
    }

    @Override
    public final int e() {
        return this.f14342b.f14382f.size() + 1;
    }

    @Override
    public final int f(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return ((f6) this.f14342b.f14382f.get(i9 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i9) {
        if (i9 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = z21.D(((f6) this.f14342b.f14382f.get(i9 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
