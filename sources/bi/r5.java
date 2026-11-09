package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xq;
public final class r5 extends Drawable {
    public final Paint f4616a;
    public final LinearGradient[] f4617b;
    public final Matrix f4618c;
    public final org.telegram.ui.Components.w5 d;
    public final Path f4619e;
    public final ud f4620f;
    public int f4621g;
    public int h;

    public r5() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f4616a = new Paint(1);
        this.f4617b = new LinearGradient[2];
        this.f4618c = new Matrix();
        this.d = new org.telegram.ui.Components.w5(1.0f, new a3.f(this, 24), 0L, 420L, xq.h);
        this.f4619e = new Path();
        this.f4620f = new ud(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.6666667f));
    }

    public final void a(int i7, int i10) {
        if (this.f4621g == i7 && this.h == i10) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f4617b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f4621g = i7;
        this.h = i10;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.messenger.g0.P.set(getBounds());
        float L = org.telegram.messenger.g0.L(24.0f);
        int i7 = 0;
        float e10 = this.d.e(false, 1.0f);
        while (true) {
            LinearGradient[] linearGradientArr = this.f4617b;
            if (i7 < linearGradientArr.length) {
                if (linearGradientArr[i7] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i7 - e10), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f4618c;
                        matrix.reset();
                        RectF rectF = org.telegram.messenger.g0.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i7].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i7];
                        Paint paint = this.f4616a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i7++;
            } else {
                Path path = this.f4619e;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                ud udVar = this.f4620f;
                udVar.g(rectF2);
                udVar.h = 30.0f;
                udVar.d();
                udVar.a(canvas, org.telegram.ui.ActionBar.l6.r1(0.6f, -1));
                invalidateSelf();
                canvas.restore();
                org.telegram.messenger.g0.P(canvas, rectF2, L);
                return;
            }
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
