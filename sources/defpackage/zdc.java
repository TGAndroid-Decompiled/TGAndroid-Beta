package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
public final class zdc extends jy {
    public final Path h;
    public final bec n;

    public zdc(bec becVar, Context context) {
        super(context);
        this.n = becVar;
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
        bec becVar = this.n;
        if (becVar.d) {
            rectF = gm.P;
            rectF.set(0.0f, -becVar.N, getMeasuredWidth(), getMeasuredHeight());
        } else {
            rectF = gm.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), (int) (getMeasuredHeight() + becVar.N));
        }
        float L = becVar.N - gm.L(3.0f);
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
    }
}
