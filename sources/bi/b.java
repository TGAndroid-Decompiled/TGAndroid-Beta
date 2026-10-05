package bi;

import ai.u8;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.y81;
public final class b extends y81 {
    public final Context f3842a;
    public final es0 f3843b;

    public b(es0 es0Var, Context context) {
        this.f3843b = es0Var;
        this.f3842a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u8 u8Var;
        u uVar = (u) view;
        es0 es0Var = this.f3843b;
        if (i10 == 0) {
            u8Var = es0Var.f3894e;
        } else {
            u8Var = (u8) es0Var.f3895f.get(i10 - 1);
        }
        u8Var.H(null);
        uVar.setList(u8Var);
        uVar.setVisibleHeight(es0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new u(this.f3843b, this.f3842a);
    }

    @Override
    public final int e() {
        return this.f3843b.f3895f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((u8) this.f3843b.f3895f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String C = u41.C(((u8) this.f3843b.f3895f.get(i10 - 1)).E, null, null);
        if (C == null) {
            return null;
        }
        return C.substring(0, 1).toUpperCase() + C.substring(1);
    }
}
