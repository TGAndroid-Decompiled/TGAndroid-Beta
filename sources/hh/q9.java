package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public final class q9 extends LinearLayout {

    public final Path f9939a;

    public final Matrix f9940b;

    public final RadialGradient f9941c;
    public final Paint d;

    public final org.telegram.ui.Components.i5 f9942e;

    public q9(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.i5 i5Var) {
        super(context);
        this.f9940b = matrix;
        this.f9941c = radialGradient;
        this.d = paint;
        this.f9942e = i5Var;
        this.f9939a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + fDp);
        Path path = this.f9939a;
        path.rewind();
        path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f9940b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.f9941c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        y0.a(canvas, 0, this.f9942e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9942e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9942e.b();
    }
}
