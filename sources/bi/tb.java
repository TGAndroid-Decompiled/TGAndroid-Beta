package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class tb extends LinearLayout {
    public final Path f5480a;
    public final Matrix f5481b;
    public final RadialGradient f5482c;
    public final Paint d;
    public final org.telegram.ui.Components.r5 e;

    public tb(Context context, Matrix matrix, RadialGradient radialGradient, Paint paint, org.telegram.ui.Components.r5 r5Var) {
        super(context);
        this.f5481b = matrix;
        this.f5482c = radialGradient;
        this.d = paint;
        this.e = r5Var;
        this.f5480a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp = AndroidUtilities.dp(10.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, AndroidUtilities.dp(2.0f) + 1, getWidth(), getHeight() + dp);
        Path path = this.f5480a;
        path.rewind();
        path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Matrix matrix = this.f5481b;
        matrix.reset();
        matrix.postTranslate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        this.f5482c.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        canvas.save();
        canvas.translate(getWidth() / 2.0f, AndroidUtilities.dp(100.0f));
        l1.a(canvas, 0, this.e, getWidth(), AndroidUtilities.dp(180.0f), 1.0f, 1.0f);
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
