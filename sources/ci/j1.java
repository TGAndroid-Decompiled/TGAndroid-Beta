package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.o81;
public final class j1 extends o81 {
    public final boolean f4836a;
    public final Context f4837b;
    public final t2 f4838c;

    public j1(t2 t2Var, boolean z10, Context context) {
        this.f4838c = t2Var;
        this.f4836a = z10;
        this.f4837b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.f4836a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f4837b;
        t2 t2Var = this.f4838c;
        if (i10 == 1) {
            return new z1(t2Var, context);
        }
        return new e2(t2Var, context);
    }

    @Override
    public final int e() {
        if (this.f4836a) {
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
