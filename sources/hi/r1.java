package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c71;
public final class r1 extends c71 {
    public final boolean f15273a;
    public final Context f15274b;
    public final r2 f15275c;

    public r1(r2 r2Var, boolean z10, Context context) {
        this.f15275c = r2Var;
        this.f15273a = z10;
        this.f15274b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        c2 c2Var = (c2) view;
        if (this.f15273a) {
            i7 = 1;
        }
        c2Var.a(i7);
    }

    @Override
    public final View d(int i7) {
        Context context = this.f15274b;
        r2 r2Var = this.f15275c;
        if (i7 == 1) {
            return new b2(r2Var, context);
        }
        return new g2(r2Var, context);
    }

    @Override
    public final int e() {
        if (this.f15273a) {
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
