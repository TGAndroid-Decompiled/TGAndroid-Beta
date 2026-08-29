package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class m9 extends LinearLayout {
    public final Path f12473a;
    public final Matrix f12474b;
    public final RadialGradient f12475c;
    public final Paint d;
    public final org.telegram.ui.Components.n5 f12476e;

    public m9(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.n5 n5Var) {
        super(context);
        this.f12474b = matrix;
        this.f12475c = radialGradient;
        this.d = paint;
        this.f12476e = n5Var;
        this.f12473a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
        Path path = this.f12473a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f12474b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.f12475c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        x0.a(canvas, 0, this.f12476e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
        canvas.restore();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12476e.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12476e.b();
    }
}
