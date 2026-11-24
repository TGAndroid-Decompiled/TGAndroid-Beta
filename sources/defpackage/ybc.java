package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class ybc extends ix {
    public final Path h;
    public final acc n;

    public ybc(acc accVar, Context context) {
        super(context);
        this.n = accVar;
        this.h = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.h);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        RectF rectF;
        super.onMeasure(i, i2);
        Path path = this.h;
        path.reset();
        acc accVar = this.n;
        if (accVar.d) {
            rectF = gl.P;
            rectF.set(0.0f, -accVar.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rectF = gl.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + accVar.N));
        }
        float L = accVar.N - gl.L(3.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
    }
}
