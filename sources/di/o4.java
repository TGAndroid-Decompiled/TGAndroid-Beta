package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.er;
public final class o4 extends Drawable {
    public final Paint f9140a;
    public final LinearGradient[] f9141b;
    public final Matrix f9142c;
    public final org.telegram.ui.Components.u5 d;
    public final Path f9143e;
    public final ac f9144f;
    public int f9145g;
    public int h;

    public o4() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f9140a = new Paint(1);
        this.f9141b = new LinearGradient[2];
        this.f9142c = new Matrix();
        this.d = new org.telegram.ui.Components.u5(1.0f, new ch.w(this, 15), 0L, 420L, er.h);
        this.f9143e = new Path();
        this.f9144f = new ac(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.6666667f));
    }

    public final void a(int i7, int i10) {
        if (this.f9145g == i7 && this.h == i10) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f9141b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f9145g = i7;
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
            LinearGradient[] linearGradientArr = this.f9141b;
            if (i7 < linearGradientArr.length) {
                if (linearGradientArr[i7] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i7 - e10), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f9142c;
                        matrix.reset();
                        RectF rectF = org.telegram.messenger.g0.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i7].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i7];
                        Paint paint = this.f9140a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i7++;
            } else {
                Path path = this.f9143e;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                ac acVar = this.f9144f;
                acVar.g(rectF2);
                acVar.h = 30.0f;
                acVar.d();
                acVar.a(canvas, org.telegram.ui.ActionBar.j6.r1(0.6f, -1));
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
