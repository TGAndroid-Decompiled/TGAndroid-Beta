package ci;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.z71;
public final class j1 extends z71 {
    public final boolean f4812a;
    public final Context f4813b;
    public final s2 f4814c;

    public j1(s2 s2Var, boolean z10, Context context) {
        this.f4814c = s2Var;
        this.f4812a = z10;
        this.f4813b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        a2 a2Var = (a2) view;
        if (this.f4812a) {
            i10 = 1;
        }
        a2Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f4813b;
        s2 s2Var = this.f4814c;
        if (i10 == 1) {
            return new z1(s2Var, context);
        }
        return new e2(s2Var, context);
    }

    @Override
    public final int e() {
        if (this.f4812a) {
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
