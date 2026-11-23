package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.b71;
public final class i1 extends b71 {
    public final boolean f14701a;
    public final Context f14702b;
    public final i2 f14703c;

    public i1(i2 i2Var, boolean z10, Context context) {
        this.f14703c = i2Var;
        this.f14701a = z10;
        this.f14702b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.f14701a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override
    public final View d(int i7) {
        Context context = this.f14702b;
        i2 i2Var = this.f14703c;
        if (i7 == 1) {
            return new t1(i2Var, context);
        }
        return new y1(i2Var, context);
    }

    @Override
    public final int e() {
        if (this.f14701a) {
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
