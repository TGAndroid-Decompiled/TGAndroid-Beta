package gh;

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
import org.telegram.ui.Components.gr;
public final class h4 extends Drawable {
    public Drawable f8208g;
    public int h;
    public int f8209i;
    public final Paint f8204b = new Paint(1);
    public final Shader[] f8205c = new Shader[2];
    public final Matrix d = new Matrix();
    public final org.telegram.ui.Components.y5 f8206e = new org.telegram.ui.Components.y5(1.0f, new fh.o1(this, 14), 0, 420, gr.h);
    public final RectF f8207f = new RectF();
    public final int f8203a = 1;

    public final void a(int i9, int i10) {
        if (this.h == i9 && this.f8209i == i10) {
            return;
        }
        Shader[] shaderArr = this.f8205c;
        shaderArr[0] = shaderArr[1];
        if (this.f8203a == 0) {
            this.h = i9;
            this.f8209i = i10;
            shaderArr[1] = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        } else {
            this.h = i9;
            this.f8209i = i10;
            shaderArr[1] = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(340.0f), new int[]{i9, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        this.f8206e.d(0.0f, true);
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f8207f;
        rectF.set(bounds);
        rectF.right = rectF.width() + rectF.left;
        int i9 = 0;
        float d = this.f8206e.d(1.0f, false);
        while (true) {
            Shader[] shaderArr = this.f8205c;
            if (i9 >= shaderArr.length) {
                break;
            }
            if (shaderArr[i9] != null) {
                float pow = (float) Math.pow(1.0f - Math.abs(i9 - d), 0.25d);
                if (pow > 0.0f) {
                    Matrix matrix = this.d;
                    matrix.reset();
                    if (this.f8203a == 1) {
                        matrix.postTranslate(rectF.centerX(), AndroidUtilities.dp(145.0f));
                    } else {
                        matrix.postScale(getBounds().width() / 100.0f, 1.0f);
                    }
                    shaderArr[i9].setLocalMatrix(matrix);
                    Shader shader = shaderArr[i9];
                    Paint paint = this.f8204b;
                    paint.setShader(shader);
                    paint.setAlpha((int) (pow * 255.0f));
                    canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
                }
            }
            i9++;
        }
        if (this.f8208g != null) {
            canvas.save();
            canvas.translate(rectF.centerX(), AndroidUtilities.dp(145.0f));
            y0.a(canvas, 0, this.f8208g, rectF.width(), AndroidUtilities.dp(290.0f), 2.0f, 1.0f);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
