package bi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.n81;
public final class q1 extends n81 {
    public final boolean f3439a;
    public final Context f3440b;
    public final f3 f3441c;

    public q1(f3 f3Var, boolean z10, Context context) {
        this.f3441c = f3Var;
        this.f3439a = z10;
        this.f3440b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        l2 l2Var = (l2) view;
        if (this.f3439a) {
            i10 = 1;
        }
        l2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f3440b;
        f3 f3Var = this.f3441c;
        if (i10 == 1) {
            return new k2(f3Var, context);
        }
        return new q2(f3Var, context);
    }

    @Override
    public final int e() {
        if (this.f3439a) {
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
