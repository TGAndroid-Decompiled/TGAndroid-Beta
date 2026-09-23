package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.z71;
public final class b extends z71 {
    public final Context f3553a;
    public final mr0 f3554b;

    public b(mr0 mr0Var, Context context) {
        this.f3554b = mr0Var;
        this.f3553a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        mr0 mr0Var = this.f3554b;
        if (i10 == 0) {
            u8Var = mr0Var.e;
        } else {
            u8Var = (u8) mr0Var.f3602f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(mr0Var.v);
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
        String E = u31.E(((u8) this.f3554b.f3602f.get(i10 - 1)).E, null, null);
        if (E == null) {
            return null;
        }
        return E.substring(0, 1).toUpperCase() + E.substring(1);
    }
}
