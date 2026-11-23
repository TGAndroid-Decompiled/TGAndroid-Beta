package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
public final class ka extends LinearLayout {
    public final Path f9230a;
    public final Matrix f9231b;
    public final RadialGradient f9232c;
    public final Paint d;
    public final org.telegram.ui.Components.n5 f9233e;

    public ka(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.n5 n5Var) {
        super(context);
        this.f9231b = matrix;
        this.f9232c = radialGradient;
        this.d = paint;
        this.f9233e = n5Var;
        this.f9230a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(10.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.f9230a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f9231b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        this.f9232c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        v0.a(canvas, 0, this.f9233e, getWidth(), org.telegram.messenger.g0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9233e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9233e.b();
    }
}
