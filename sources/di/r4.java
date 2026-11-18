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
import org.telegram.ui.Components.lr;
public final class r4 extends Drawable {
    public final Paint f9634a;
    public final LinearGradient[] f9635b;
    public final Matrix f9636c;
    public final org.telegram.ui.Components.c6 d;
    public final Path f9637e;
    public final ec f9638f;
    public int f9639g;
    public int h;

    public r4() {
        Paint paint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f9634a = new Paint(1);
        this.f9635b = new LinearGradient[2];
        this.f9636c = new Matrix();
        this.d = new org.telegram.ui.Components.c6(1.0f, new ca.r(this, 19), 0L, 420L, lr.h);
        this.f9637e = new Path();
        this.f9638f = new ec(1, 45);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(117440511);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.0f));
        paint2.setStyle(style);
        paint2.setColor(301989887);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.6666667f));
    }

    public final void a(int i7, int i10) {
        if (this.f9639g == i7 && this.h == i10) {
            return;
        }
        LinearGradient[] linearGradientArr = this.f9635b;
        linearGradientArr[0] = linearGradientArr[1];
        this.f9639g = i7;
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
            LinearGradient[] linearGradientArr = this.f9635b;
            if (i7 < linearGradientArr.length) {
                if (linearGradientArr[i7] != null) {
                    float pow = (float) Math.pow(1.0f - Math.abs(i7 - e10), 0.5d);
                    if (pow > 0.0f) {
                        Matrix matrix = this.f9636c;
                        matrix.reset();
                        RectF rectF = org.telegram.messenger.g0.P;
                        matrix.postScale(rectF.width() / 100.0f, 1.0f);
                        linearGradientArr[i7].setLocalMatrix(matrix);
                        LinearGradient linearGradient = linearGradientArr[i7];
                        Paint paint = this.f9634a;
                        paint.setShader(linearGradient);
                        paint.setAlpha((int) (pow * 255.0f));
                        canvas.drawRoundRect(rectF, L, L, paint);
                    }
                }
                i7++;
            } else {
                Path path = this.f9637e;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                ec ecVar = this.f9638f;
                ecVar.g(rectF2);
                ecVar.h = 30.0f;
                ecVar.d();
                ecVar.a(canvas, org.telegram.ui.ActionBar.n6.r1(0.6f, -1));
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
