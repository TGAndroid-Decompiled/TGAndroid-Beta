package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
public final class ra extends LinearLayout {
    public final Path f5909a;
    public final Matrix f5910b;
    public final RadialGradient f5911c;
    public final Paint d;
    public final org.telegram.ui.Components.e5 f5912e;

    public ra(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.e5 e5Var) {
        super(context);
        this.f5910b = matrix;
        this.f5911c = radialGradient;
        this.d = paint;
        this.f5912e = e5Var;
        this.f5909a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L = org.telegram.messenger.g0.L(10.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, org.telegram.messenger.g0.L(2.0f) + 1, getWidth(), getHeight() + L);
        Path path = this.f5909a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f5910b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        this.f5911c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, org.telegram.messenger.g0.L(100.0f));
        b1.a(canvas, 0, this.f5912e, getWidth(), org.telegram.messenger.g0.L(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5912e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5912e.b();
    }
}
