package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p81;
public final class j1 extends p81 {
    public final boolean f4814a;
    public final Context f4815b;
    public final s2 f4816c;

    public j1(s2 s2Var, boolean z10, Context context) {
        this.f4816c = s2Var;
        this.f4814a = z10;
        this.f4815b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.f4814a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f4815b;
        s2 s2Var = this.f4816c;
        if (i10 == 1) {
            return new z1(s2Var, context);
        }
        return new e2(s2Var, context);
    }

    @Override
    public final int e() {
        if (this.f4814a) {
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
