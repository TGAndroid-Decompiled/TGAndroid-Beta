package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
public final class nk4 extends View {
    public final byte a;
    public final rk4 b;

    public nk4(rk4 rk4Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = rk4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        rk4 rk4Var = this.b;
        switch (b) {
            case 0:
                rk4Var.q.reset();
                rk4Var.b(canvas, true);
                return;
            default:
                Matrix matrix = rk4Var.q;
                matrix.reset();
                matrix.postTranslate(-getX(), (-getY()) + gm.m);
                matrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                rk4Var.b(canvas, false);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, i2);
                this.b.g();
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
