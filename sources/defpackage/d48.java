package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class d48 implements u29 {
    public final a58 a;

    public d48(a58 a58Var) {
        this.a = a58Var;
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        a58 a58Var = this.a;
        if (!z) {
            a58Var.d0(new eb7(this, view, k39Var, z, z2));
        } else {
            ik.X(a58Var.s2, a58Var.r1, 1, new sw1(this, z, k39Var, view));
        }
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean l() {
        return this.a.G0();
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        a58 a58Var = this.a;
        Paint paint = a58Var.d2;
        eq eqVar = a58Var.F1;
        float f4 = -f2;
        float f5 = -f3;
        eqVar.i(f4, f5, a58Var.getMeasuredWidth() + f4, a58Var.getMeasuredHeight() + f5);
        if (f > 0.0f) {
            canvas.drawRoundRect(rectF, f, f, (Paint) eqVar.a);
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) eqVar.a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void o() {
        ((fab) this.a.G1).b(false);
    }

    @Override
    public final boolean s() {
        return false;
    }
}
