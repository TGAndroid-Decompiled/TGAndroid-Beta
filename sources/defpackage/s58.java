package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class s58 implements h49 {
    public final o68 a;

    public s58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        fd7 fd7Var = new fd7(this, w49Var, view, (byte) 24);
        if (!z) {
            this.a.d0(fd7Var);
        } else {
            fd7Var.run();
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        ((ccb) this.a.A1).b(false);
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
