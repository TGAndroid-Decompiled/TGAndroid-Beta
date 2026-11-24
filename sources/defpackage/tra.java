package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
public final class tra extends Drawable {
    public Drawable g;
    public int h;
    public int i;
    public final Paint b = new Paint(1);
    public final Shader[] c = new Shader[2];
    public final Matrix d = new Matrix();
    public final ln e = new ln(1.0f, new c0a(this, (byte) 29), 0, 420, d53.h);
    public final RectF f = new RectF();
    public final boolean a = true;

    public final void a(int i, int i2) {
        if (this.h == i && this.i == i2) {
            return;
        }
        Shader[] shaderArr = this.c;
        shaderArr[0] = shaderArr[1];
        if (!this.a) {
            this.h = i;
            this.i = i2;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i;
            this.i = i2;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, gm.L(340.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.e.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i = 0;
        float e = this.e.e(false, 1.0f);
        while (true) {
            Shader[] shaderArr = this.c;
            if (i >= shaderArr.length) {
                break;
            }
            if (shaderArr[i] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i - e), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.a) {
                        matrix.postTranslate(rectF.centerX(), gm.L(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i];
                    Paint paint = this.b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i++;
        }
        if (this.g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), gm.L(145.0f));
            bpa.a(canvas, 0, this.g, rectF.width(), gm.L(290.0f), 2.0f, 1.0f);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
