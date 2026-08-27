package hh;

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
import org.telegram.ui.Components.er;

public final class f4 extends Drawable {

    public Drawable f9255g;
    public int h;

    public int f9256i;

    public final Paint f9251b = new Paint(1);

    public final Shader[] f9252c = new Shader[2];
    public final Matrix d = new Matrix();

    public final org.telegram.ui.Components.y5 f9253e = new org.telegram.ui.Components.y5(1.0f, new f2.r(this, 25), 0, 420, er.h);

    public final RectF f9254f = new RectF();

    public final int f9250a = 1;

    public final void a(int i10, int i11) {
        if (this.h == i10 && this.f9256i == i11) {
            return;
        }
        Shader[] shaderArr = this.f9252c;
        shaderArr[0] = shaderArr[1];
        if (this.f9250a == 0) {
            this.h = i10;
            this.f9256i = i11;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            float fDp = AndroidUtilities.dp(340.0f);
            this.h = i10;
            this.f9256i = i11;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, fDp, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f9253e.d(0.0f, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f9254f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i10 = 0;
        float fD = this.f9253e.d(1.0f, false);
        while (true) {
            Shader[] shaderArr = this.f9252c;
            if (i10 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i10] != null) {
                float fPow = (float) Math.pow(1.0f - Math.abs(i10 - fD), 0.25d);
                if (fPow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f9250a == 1) {
                        matrix.postTranslate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i10].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i10];
                    Paint paint = this.f9251b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (fPow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i10++;
        }
        if (this.f9255g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), AndroidUtilities.dp(145.0f));
            y0.a(canvas, 0, this.f9255g, rectF.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
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
