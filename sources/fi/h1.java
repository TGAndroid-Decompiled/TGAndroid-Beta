package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m61;
public final class h1 extends m61 {
    public final boolean f12127a;
    public final Context f12128b;
    public final k2 f12129c;

    public h1(k2 k2Var, boolean z9, Context context) {
        this.f12129c = k2Var;
        this.f12127a = z9;
        this.f12128b = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        u1 u1Var = (u1) view;
        if (this.f12127a) {
            i7 = 1;
        }
        u1Var.a(i7);
    }

    @Override
    public final View d(int i7) {
        Context context = this.f12128b;
        k2 k2Var = this.f12129c;
        if (i7 == 1) {
            return new t1(k2Var, context);
        }
        return new z1(k2Var, context);
    }

    @Override
    public final int e() {
        if (this.f12127a) {
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
