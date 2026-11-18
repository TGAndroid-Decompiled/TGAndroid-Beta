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
    public final Path f9196a;
    public final Matrix f9197b;
    public final RadialGradient f9198c;
    public final Paint d;
    public final org.telegram.ui.Components.m5 f9199e;

    public ka(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.m5 m5Var) {
        super(context);
        this.f9197b = matrix;
        this.f9198c = radialGradient;
        this.d = paint;
        this.f9199e = m5Var;
        this.f9196a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(10.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.f9196a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f9197b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        this.f9198c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        v0.a(canvas, 0, this.f9199e, getWidth(), org.telegram.messenger.g0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9199e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9199e.b();
    }
}
