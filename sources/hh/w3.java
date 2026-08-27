package hh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class w3 extends Drawable {

    public final Paint f10268a;

    public final LinearGradient[] f10269b;

    public final Matrix f10270c;
    public final org.telegram.ui.Components.y5 d;

    public final Path f10271e;

    public final bb f10272f;

    public int f10273g;
    public int h;

    public w3() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f10268a = new Paint(1);
        this.f10269b = new LinearGradient[2];
        this.f10270c = new Matrix();
        this.d = new org.telegram.ui.Components.y5(1.0f, new f2.r(this, 22), 0L, 420L, er.h);
        this.f10271e = new Path();
        this.f10272f = new bb(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(0.6666667f));
    }

    public final void a(int i10, int i11) {
        if (this.f10273g == i10 && this.h == i11) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f10269b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f10273g = i10;
        this.h = i11;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.d(0.0f, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        AndroidUtilities.rectTmp.set(getBounds());
        float fDp = AndroidUtilities.dp(24.0f);
        int i10 = 0;
        float fD = this.d.d(1.0f, false);
        while (true) {
            LinearGradient[] linearGradientArr = this.f10269b;
            if (i10 >= linearGradientArr.length) {
                Path path = this.f10271e;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                path.addRoundRect(rectF, fDp, fDp, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                bb bbVar = this.f10272f;
                bbVar.g(rectF);
                bbVar.h = 30.0f;
                bbVar.d();
                bbVar.a(canvas, org.telegram.ui.ActionBar.g6.l1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                AndroidUtilities.drawStroke(canvas, rectF, fDp);
                return;
            }
            if (linearGradientArr[i10] != null) {
                float fPow = (float) Math.pow(1.0f - Math.abs(i10 - fD), 0.5d);
                if (fPow > 0.0f) {
                    Matrix matrix = this.f10270c;
                    matrix.reset();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    matrix.postScale(rectF2.width() / 100.0f, 1.0f);
                    linearGradientArr[i10].setLocalMatrix(matrix);
                    LinearGradient linearGradient = linearGradientArr[i10];
                    Paint paint = this.f10268a;
                    paint.setShader(linearGradient);
                    paint.setAlpha((int) (fPow * 255.0f));
                    canvas.drawRoundRect(rectF2, fDp, fDp, paint);
                }
            }
            i10++;
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
