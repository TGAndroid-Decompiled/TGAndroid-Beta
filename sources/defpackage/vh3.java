package defpackage;

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;
public final class vh3 implements wc5, u69 {
    public final uj3 a;

    public vh3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override
    public final void a(xc5 xc5Var, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(if7.a(-j, 0L));
        uj3 uj3Var = this.a;
        oj3 oj3Var = uj3Var.E2;
        if (uj3Var.D2) {
            uj3Var.removeSelfFromStack();
        }
        oj3Var.q(uj3Var, arrayList, null, true, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
    }

    @Override
    public final boolean mo8d(float f, float f2, int i, View view) {
        boolean z = view instanceof bv8;
        uj3 uj3Var = this.a;
        if (z) {
            bv8 bv8Var = (bv8) view;
            if (bv8Var.p0) {
                uj3Var.i5(bv8Var.getDialogId(), view);
                return true;
            }
        }
        bj3 bj3Var = uj3Var.D0;
        gw9 gw9Var = bj3Var.b0;
        return uj3Var.D4(view, i, f, bj3Var.e0);
    }

    @Override
    public final void f() {
        Point point = hl.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override
    public final void h(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f);
        }
    }
}
