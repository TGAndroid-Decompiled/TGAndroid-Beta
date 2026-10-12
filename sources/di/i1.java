package di;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c91;
public final class i1 extends c91 {
    public final boolean f7029a;
    public final Context f7030b;
    public final r2 f7031c;

    public i1(r2 r2Var, boolean z10, Context context) {
        this.f7031c = r2Var;
        this.f7029a = z10;
        this.f7030b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        z1 z1Var = (z1) view;
        if (this.f7029a) {
            i10 = 1;
        }
        z1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f7030b;
        r2 r2Var = this.f7031c;
        if (i10 == 1) {
            return new y1(r2Var, context);
        }
        return new d2(r2Var, context);
    }

    @Override
    public final int e() {
        if (this.f7029a) {
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
