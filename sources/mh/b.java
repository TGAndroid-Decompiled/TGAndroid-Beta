package mh;

import android.content.Context;
import android.view.View;
import lh.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.q71;
public final class b extends q71 {
    public final Context f17017a;
    public final fr0 f17018b;

    public b(fr0 fr0Var, Context context) {
        this.f17018b = fr0Var;
        this.f17017a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        c6 c6Var;
        r rVar = (r) view;
        fr0 fr0Var = this.f17018b;
        if (i10 == 0) {
            c6Var = fr0Var.f17059e;
        } else {
            c6Var = (c6) fr0Var.f17060f.get(i10 - 1);
        }
        c6Var.H(null);
        rVar.setList(c6Var);
        rVar.setVisibleHeight(fr0Var.v);
    }

    @Override
    public final View d(int i10) {
        return new r(this.f17018b, this.f17017a);
    }

    @Override
    public final int e() {
        return this.f17018b.f17060f.size() + 1;
    }

    @Override
    public final int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((c6) this.f17018b.f17060f.get(i10 - 1)).E.hashCode();
    }

    @Override
    public final CharSequence g(int i10) {
        if (i10 == 0) {
            return LocaleController.getString(R.string.ProfileBotLanguageGeneral);
        }
        String D = k31.D(((c6) this.f17018b.f17060f.get(i10 - 1)).E, null, null);
        if (D == null) {
            return null;
        }
        return D.substring(0, 1).toUpperCase() + D.substring(1);
    }
}
