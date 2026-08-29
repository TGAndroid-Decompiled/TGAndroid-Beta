package nh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.q71;
public final class h1 extends q71 {
    public final boolean f17827a;
    public final Context f17828b;
    public final k2 f17829c;

    public h1(k2 k2Var, boolean z10, Context context) {
        this.f17829c = k2Var;
        this.f17827a = z10;
        this.f17828b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        u1 u1Var = (u1) view;
        if (this.f17827a) {
            i10 = 1;
        }
        u1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f17828b;
        k2 k2Var = this.f17829c;
        if (i10 == 1) {
            return new t1(k2Var, context);
        }
        return new y1(k2Var, context);
    }

    @Override
    public final int e() {
        if (this.f17827a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i10) {
        if (i10 != 0 && i10 != 1) {
            return 1;
        }
        return 0;
    }
}
