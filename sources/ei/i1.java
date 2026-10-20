package ei;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w81;
public final class i1 extends w81 {
    public final boolean f9182a;
    public final Context f9183b;
    public final n2 f9184c;

    public i1(n2 n2Var, boolean z10, Context context) {
        this.f9184c = n2Var;
        this.f9182a = z10;
        this.f9183b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        w1 w1Var = (w1) view;
        if (this.f9182a) {
            i10 = 1;
        }
        w1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f9183b;
        n2 n2Var = this.f9184c;
        if (i10 == 1) {
            return new v1(n2Var, context);
        }
        return new b2(n2Var, context);
    }

    @Override
    public final int e() {
        if (this.f9182a) {
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
