package gi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.f61;
public final class h1 extends f61 {
    public final boolean f12857a;
    public final Context f12858b;
    public final i2 f12859c;

    public h1(i2 i2Var, boolean z10, Context context) {
        this.f12859c = i2Var;
        this.f12857a = z10;
        this.f12858b = context;
    }

    @Override
    public final void b(View view, int i3, int i10) {
        u1 u1Var = (u1) view;
        if (this.f12857a) {
            i3 = 1;
        }
        u1Var.a(i3);
    }

    @Override
    public final View d(int i3) {
        Context context = this.f12858b;
        i2 i2Var = this.f12859c;
        if (i3 == 1) {
            return new t1(i2Var, context);
        }
        return new y1(i2Var, context);
    }

    @Override
    public final int e() {
        if (this.f12857a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i3) {
        if (i3 != 0 && i3 != 1) {
            return 1;
        }
        return 0;
    }
}
