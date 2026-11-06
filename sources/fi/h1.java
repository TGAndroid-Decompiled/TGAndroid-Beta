package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
public final class h1 extends l61 {
    public final boolean f12123a;
    public final Context f12124b;
    public final k2 f12125c;

    public h1(k2 k2Var, boolean z9, Context context) {
        this.f12125c = k2Var;
        this.f12123a = z9;
        this.f12124b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.f12123a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override
    public final View d(int i7) {
        Context context = this.f12124b;
        k2 k2Var = this.f12125c;
        if (i7 == 1) {
            return new t1(k2Var, context);
        }
        return new z1(k2Var, context);
    }

    @Override
    public final int e() {
        if (this.f12123a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i7) {
        if (i7 != 0 && i7 != 1) {
            return 1;
        }
        return 0;
    }
}
