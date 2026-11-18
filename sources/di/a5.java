package di;

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
import org.telegram.ui.Components.lr;
public final class a5 extends Drawable {
    public Drawable f8479g;
    public int h;
    public int f8480i;
    public final Paint f8475b = new Paint(1);
    public final Shader[] f8476c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.c6 f8477e = new org.telegram.ui.Components.c6(1.0f, new ca.r(this, 22), 0, 420, lr.h);
    public final RectF f8478f = new RectF();
    public final int f8474a = 1;

    public final void a(int i7, int i10) {
        if (this.h == i7 && this.f8480i == i10) {
            return;
        }
        Shader[] shaderArr = this.f8476c;
        shaderArr[0] = shaderArr[1];
        if (this.f8474a == 0) {
            this.h = i7;
            this.f8480i = i10;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i7;
            this.f8480i = i10;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(340.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f8477e.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f8478f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i7 = 0;
        float e10 = this.f8477e.e(false, 1.0f);
        while (true) {
            Shader[] shaderArr = this.f8476c;
            if (i7 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i7] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i7 - e10), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f8474a == 1) {
                        matrix.postTranslate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i7].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i7];
                    Paint paint = this.f8475b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i7++;
        }
        if (this.f8479g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
            v0.a(canvas, 0, this.f8479g, rectF.width(), org.telegram.messenger.g0.L(290.0f), 2.0f, 1.0f);
            canvas.restore();
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
