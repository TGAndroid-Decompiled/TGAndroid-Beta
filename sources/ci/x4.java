package ci;

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
public final class x4 extends Drawable {
    public final Paint f6336a;
    public final LinearGradient[] f6337b;
    public final Matrix f6338c;
    public final org.telegram.ui.Components.u5 d;
    public final Path f6339e;
    public final lc f6340f;
    public int f6341g;
    public int h;

    public x4() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f6336a = new Paint(1);
        this.f6337b = new LinearGradient[2];
        this.f6338c = new Matrix();
        this.d = new org.telegram.ui.Components.u5(1.0f, new d1(this, 4), 0L, 420L, xq.h);
        this.f6339e = new Path();
        this.f6340f = new lc(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.6666667f));
    }

    public final void a(int i3, int i10) {
        if (this.f6341g == i3 && this.h == i10) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f6337b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f6341g = i3;
        this.h = i10;
        linearGradientArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        org.telegram.messenger.g0.P.set(getBounds());
        float L = org.telegram.messenger.g0.L(24.0f);
        int i3 = 0;
        float e10 = this.d.e(false, 1.0f);
        while (true) {
            LinearGradient[] linearGradientArr = this.f6337b;
            if (i3 < linearGradientArr.length) {
                if (linearGradientArr[i3] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i3 - e10), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f6338c;
                        matrix.reset();
                        RectF rectF = org.telegram.messenger.g0.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i3].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i3];
                        Paint paint = this.f6336a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i3++;
            } else {
                Path path = this.f6339e;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                lc lcVar = this.f6340f;
                lcVar.g(rectF2);
                lcVar.h = 30.0f;
                lcVar.d();
                lcVar.a(canvas, org.telegram.ui.ActionBar.k6.r1(0.6f, -1));
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
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
