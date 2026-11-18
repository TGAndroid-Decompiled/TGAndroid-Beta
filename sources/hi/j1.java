package hi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.y61;
public final class j1 extends y61 {
    public final boolean f14793a;
    public final Context f14794b;
    public final j2 f14795c;

    public j1(j2 j2Var, boolean z10, Context context) {
        this.f14795c = j2Var;
        this.f14793a = z10;
        this.f14794b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        v1 v1Var = (v1) view;
        if (this.f14793a) {
            i7 = 1;
        }
        v1Var.a(i7);
    }

    @Override
    public final View d(int i7) {
        Context context = this.f14794b;
        j2 j2Var = this.f14795c;
        if (i7 == 1) {
            return new u1(j2Var, context);
        }
        return new z1(j2Var, context);
    }

    @Override
    public final int e() {
        if (this.f14793a) {
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
