package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.a81;
public final class j1 extends a81 {
    public final boolean f7449a;
    public final Context f7450b;
    public final t2 f7451c;

    public j1(t2 t2Var, boolean z10, Context context) {
        this.f7451c = t2Var;
        this.f7449a = z10;
        this.f7450b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.f7449a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f7450b;
        t2 t2Var = this.f7451c;
        if (i10 == 1) {
            return new z1(t2Var, context);
        }
        return new e2(t2Var, context);
    }

    @Override
    public final int e() {
        if (this.f7449a) {
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
