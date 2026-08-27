package lh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.g71;

public final class i1 extends g71 {

    public final boolean f16095a;

    public final Context f16096b;

    public final l2 f16097c;

    public i1(l2 l2Var, boolean z10, Context context) {
        this.f16097c = l2Var;
        this.f16095a = z10;
        this.f16096b = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        v1 v1Var = (v1) view;
        if (this.f16095a) {
            i10 = 1;
        }
        v1Var.a(i10);
    }

    @Override
    public final View d(int i10) {
        Context context = this.f16096b;
        l2 l2Var = this.f16097c;
        return i10 == 1 ? new u1(l2Var, context) : new z1(l2Var, context);
    }

    @Override
    public final int e() {
        return this.f16095a ? 1 : 3;
    }

    @Override
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
