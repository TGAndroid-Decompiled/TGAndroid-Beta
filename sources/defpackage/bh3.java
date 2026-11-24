package defpackage;

import android.graphics.Point;
import android.view.View;
import java.util.ArrayList;
public final class bh3 implements va5, f39 {
    public final cj3 a;

    public bh3(cj3 cj3Var) {
        this.a = cj3Var;
    }

    @Override
    public final void a(wa5 wa5Var, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(zc7.a(-j, 0L));
        cj3 cj3Var = this.a;
        wi3 wi3Var = cj3Var.E2;
        if (cj3Var.D2) {
            cj3Var.removeSelfFromStack();
        }
        wi3Var.r(cj3Var, arrayList, null, true, cj3Var.L2, cj3Var.M2, cj3Var.N2, null);
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        boolean z = view instanceof rr8;
        cj3 cj3Var = this.a;
        if (z) {
            rr8 rr8Var = (rr8) view;
            if (rr8Var.o0) {
                cj3Var.e5(rr8Var.getDialogId(), view);
                return true;
            }
        }
        hi3 hi3Var = cj3Var.D0;
        ns9 ns9Var = hi3Var.b0;
        return cj3Var.z4(view, i, f, hi3Var.e0);
    }

    @Override
    public final void f() {
        Point point = gl.q;
        if (point.x > point.y) {
            this.a.finishPreviewFragment();
        }
    }

    @Override
    public final void g(float f) {
        Point point = gl.q;
        if (point.x > point.y) {
            this.a.movePreviewFragment(f);
        }
    }
}
