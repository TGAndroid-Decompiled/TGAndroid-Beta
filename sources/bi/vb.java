package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
public final class vb extends LinearLayout {
    public final Path f4922a;
    public final Matrix f4923b;
    public final RadialGradient f4924c;
    public final Paint d;
    public final org.telegram.ui.Components.f5 f4925e;

    public vb(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.f5 f5Var) {
        super(context);
        this.f4923b = matrix;
        this.f4924c = radialGradient;
        this.d = paint;
        this.f4925e = f5Var;
        this.f4922a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(10.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.f4922a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f4923b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        this.f4924c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        i1.a(canvas, 0, this.f4925e, getWidth(), org.telegram.messenger.g0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4925e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4925e.b();
    }
}
