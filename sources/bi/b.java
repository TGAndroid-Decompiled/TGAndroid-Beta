package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.yr0;
public final class b extends o81 {
    public final Context f3553a;
    public final yr0 f3554b;

    public b(yr0 yr0Var, Context context) {
        this.f3554b = yr0Var;
        this.f3553a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        yr0 yr0Var = this.f3554b;
        if (i10 == 0) {
            u8Var = yr0Var.e;
        } else {
            u8Var = (u8) yr0Var.f3602f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(yr0Var.v);
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
        String E = j41.E(((u8) this.f3554b.f3602f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
