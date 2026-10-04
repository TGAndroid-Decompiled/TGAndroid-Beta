package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.x81;
public final class j1 extends x81 {
    public final boolean f5200a;
    public final Context f5201b;
    public final s2 f5202c;

    public j1(s2 s2Var, boolean z10, Context context) {
        this.f5202c = s2Var;
        this.f5200a = z10;
        this.f5201b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.f5200a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f5201b;
        s2 s2Var = this.f5202c;
        if (i10 == 1) {
            return new z1(s2Var, context);
        }
        return new e2(s2Var, context);
    }

    @Override
    public final int e() {
        if (this.f5200a) {
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
