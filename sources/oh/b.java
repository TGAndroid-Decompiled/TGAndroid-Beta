package oh;

import android.content.Context;
import android.view.View;
import nh.d6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.v31;
public final class b extends c81 {
    public final Context f16579a;
    public final nr0 f16580b;

    public b(nr0 nr0Var, Context context) {
        this.f16580b = nr0Var;
        this.f16579a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        d6 d6Var;
        r rVar = (r) view;
        nr0 nr0Var = this.f16580b;
        if (i10 == 0) {
            d6Var = nr0Var.e;
        } else {
            d6Var = (d6) nr0Var.f16618f.get(i10 - 1);
        }
        d6Var.H(null);
        rVar.setList(d6Var);
        rVar.setVisibleHeight(nr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f16580b, this.f16579a);
    }

    @Override
    public final int e() {
        return this.f16580b.f16618f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((d6) this.f16580b.f16618f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = v31.D(((d6) this.f16580b.f16618f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
