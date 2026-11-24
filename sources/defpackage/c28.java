package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class c28 implements s09 {
    public final y28 a;

    public c28(y28 y28Var) {
        this.a = y28Var;
    }

    @Override
    public final boolean C() {
        return false;
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        pc7 pc7Var = new pc7(this, h19Var, view, (byte) 16);
        if (!z) {
            this.a.d0(pc7Var);
        } else {
            pc7Var.run();
        }
    }

    @Override
    public final boolean r() {
        return true;
    }

    @Override
    public final boolean u() {
        ((d8b) this.a.G1).b(false);
        return false;
    }

    @Override
    public final void z() {
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
