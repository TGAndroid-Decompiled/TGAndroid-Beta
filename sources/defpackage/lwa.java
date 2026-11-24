package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
public final class lwa extends LinearLayout {
    public final Path a;
    public final Matrix b;
    public final RadialGradient c;
    public final Paint d;
    public final tm e;

    public lwa(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, tm tmVar) {
        super(context);
        this.b = matrix;
        this.c = radialGradient;
        this.d = paint;
        this.e = tmVar;
        this.a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = gm.L(10.0f);
        RectF rectF = gm.P;
        rectF.set(0.0f, gm.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, gm.L(100.0f));
        this.c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, gm.L(100.0f));
        bpa.a(canvas, 0, this.e, getWidth(), gm.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.b();
    }
}
