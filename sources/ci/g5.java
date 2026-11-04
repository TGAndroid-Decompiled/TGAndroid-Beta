package ci;

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
import org.telegram.ui.Components.xq;
public final class g5 extends Drawable {
    public Drawable f5172g;
    public int h;
    public int f5173i;
    public final Paint f5168b = new Paint(1);
    public final Shader[] f5169c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.u5 f5170e = new org.telegram.ui.Components.u5(1.0f, new d1(this, 7), 0, 420, xq.h);
    public final RectF f5171f = new RectF();
    public final int f5167a = 1;

    public final void a(int i3, int i10) {
        if (this.h == i3 && this.f5173i == i10) {
            return;
        }
        Shader[] shaderArr = this.f5169c;
        shaderArr[0] = shaderArr[1];
        if (this.f5167a == 0) {
            this.h = i3;
            this.f5173i = i10;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i3;
            this.f5173i = i10;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(340.0f), new int[]{i3, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f5170e.e(true, 0.0f);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f5171f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i3 = 0;
        float e10 = this.f5170e.e(false, 1.0f);
        while (true) {
            Shader[] shaderArr = this.f5169c;
            if (i3 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i3] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i3 - e10), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f5167a == 1) {
                        matrix.postTranslate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i3].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i3];
                    Paint paint = this.f5168b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i3++;
        }
        if (this.f5172g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), org.telegram.messenger.g0.L(145.0f));
            b1.a(canvas, 0, this.f5172g, rectF.width(), org.telegram.messenger.g0.L(290.0f), 2.0f, 1.0f);
            canvas.restore();
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
