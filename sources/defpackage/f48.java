package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class f48 implements u29 {
    public final a58 a;

    public f48(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        ud7 ud7Var = new ud7(this, k39Var, view, (byte) 19);
        if (!z) {
            this.a.d0(ud7Var);
        } else {
            ud7Var.run();
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean l() {
        ((fab) this.a.G1).b(false);
        return false;
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
