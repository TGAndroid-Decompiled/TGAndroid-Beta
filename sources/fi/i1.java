package fi;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.m91;
public final class i1 extends m91 {
    public final boolean f10982a;
    public final Context f10983b;
    public final l2 f10984c;

    public i1(l2 l2Var, boolean z10, Context context) {
        this.f10984c = l2Var;
        this.f10982a = z10;
        this.f10983b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v1 v1Var = (v1) view;
        if (this.f10982a) {
            i10 = 1;
        }
        v1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f10983b;
        l2 l2Var = this.f10984c;
        if (i10 == 1) {
            return new u1(l2Var, context);
        }
        return new z1(l2Var, context);
    }

    @Override
    public final int e() {
        if (this.f10982a) {
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
