package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public final class e4 extends Drawable {
    public Drawable f12329g;
    public int h;
    public int f12330i;
    public final Paint f12326b = new Paint(1);
    public final Shader[] f12327c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.z5 e = new org.telegram.ui.Components.z5(1.0f, new b(this, 10), 0, 420, mr.h);
    public final RectF f12328f = new RectF();
    public final int f12325a = 1;

    public final void a(int i10, int i11) {
        if (this.h == i10 && this.f12330i == i11) {
            return;
        }
        Shader[] shaderArr = this.f12327c;
        shaderArr[0] = shaderArr[1];
        if (this.f12325a == 0) {
            this.h = i10;
            this.f12330i = i11;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i10;
            this.f12330i = i11;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(340.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.e.d(0.0f, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f12328f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i10 = 0;
        float d = this.e.d(1.0f, false);
        while (true) {
            Shader[] shaderArr = this.f12327c;
            if (i10 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i10] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i10 - d), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f12325a == 1) {
                        matrix.postTranslate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i10].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i10];
                    Paint paint = this.f12326b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i10++;
        }
        if (this.f12329g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), AndroidUtilities.dp(145.0f));
            x0.a(canvas, 0, this.f12329g, rectF.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
            canvas.restore();
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
