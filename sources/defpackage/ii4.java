package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
public final class ii4 extends View {
    public final byte a;
    public final mi4 b;

    public ii4(mi4 mi4Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = mi4Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.a;
        mi4 mi4Var = this.b;
        switch (b) {
            case 0:
                mi4Var.q.reset();
                mi4Var.b(canvas, true);
                return;
            default:
                Matrix matrix = mi4Var.q;
                matrix.reset();
                matrix.postTranslate(-getX(), (-getY()) + gl.m);
                matrix.postScale(1.0f / getScaleX(), 1.0f / getScaleY(), getPivotX(), getPivotY());
                mi4Var.b(canvas, false);
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
