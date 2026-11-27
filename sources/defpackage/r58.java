package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
public final class r58 implements h49 {
    public final o68 a;

    public r58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        o68 o68Var = this.a;
        if (!z) {
            o68Var.d0(new lb7(this, view, w49Var, z, z2));
        } else {
            jj.X(o68Var.m2, o68Var.l1, 1, new wv1(this, z, w49Var, view));
        }
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.a.G0();
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        o68 o68Var = this.a;
        Paint paint = o68Var.X1;
        fp fpVar = o68Var.z1;
        float f4 = -f2;
        float f5 = -f3;
        fpVar.i(f4, f5, o68Var.getMeasuredWidth() + f4, o68Var.getMeasuredHeight() + f5);
        if (f > 0.0f) {
            canvas.drawRoundRect(rectF, f, f, (Paint) fpVar.a);
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) fpVar.a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void n() {
        ((ccb) this.a.A1).b(false);
    }

    @Override
    public final boolean p() {
        return false;
    }
}
