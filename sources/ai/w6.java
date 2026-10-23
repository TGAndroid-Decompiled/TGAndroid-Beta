package ai;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.w10;
public final class w6 extends View {
    public float E;
    public final Camera F;
    public final w10 G;
    public final RectF H;
    public r6 f2363a;
    public r6 f2364b;
    public r6 f2365c;
    public float d;
    public float e;
    public float f2366f;
    public boolean h;
    public boolean f2367n;
    public boolean f2368r;
    public q6 f2369s;
    public q6 v;
    public q6 f2370w;
    public float f2371x;
    public float f2372y;

    public w6(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new w10();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, q6 q6Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        float f12;
        float f13;
        float f14;
        if (q6Var != null) {
            Matrix matrix = q6Var.d;
            Paint paint = q6Var.f2061c;
            if (paint != null) {
                float f15 = (f7 - 0.5f) / 1.5f;
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(f15));
                float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
                float x10 = org.telegram.ui.Cells.b1.x(f15, max, 1.8f, f10 / 2.0f);
                float min = Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f;
                float f16 = x10 - max;
                float f17 = x10 + max;
                canvas.saveLayerAlpha(f16, 0.0f, f17, f11, 255, 31);
                matrix.reset();
                matrix.postTranslate(x10, min);
                q6Var.e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f16, 0.0f, f17, f11, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.H;
                rectF.set(f16, 0.0f, f16 + dp, f11);
                w10 w10Var = this.G;
                w10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f17 - dp, 0.0f, f17, f11);
                w10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f16 && width <= f17) {
                        f14 = Math.min(Utilities.clamp01((width - f16) / max), Utilities.clamp01(1.0f - ((width - (f17 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.k6.v(iArr[i10], org.telegram.ui.ActionBar.k6.o1(clamp01 * f14, q6Var.f2063g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f16 && width2 <= f17) {
                        f13 = Math.min(Utilities.clamp01((width2 - f16) / max), Utilities.clamp01(1.0f - ((width2 - (f17 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.k6.v(iArr2[i11], org.telegram.ui.ActionBar.k6.o1(clamp01 * f13, q6Var.f2062f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f16 && width3 <= f17) {
                        f12 = Math.min(Utilities.clamp01((width3 - f16) / max), Utilities.clamp01(1.0f - ((width3 - (f17 - max)) / max)));
                    } else {
                        f12 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.k6.v(iArr3[i12], org.telegram.ui.ActionBar.k6.o1(clamp01 * f12, q6Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, r6 r6Var, float f7, boolean z10) {
        if (r6Var == null) {
            return;
        }
        ImageReceiver imageReceiver = r6Var.d;
        float f10 = f7;
        if (z10) {
            f10 = Math.max(0.5f, f10);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f11 = (f10 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f11));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f11);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f12 = ((dp2 / 2.0f) * f11) + width;
        canvas.translate(f12, dp);
        Camera camera = this.F;
        camera.save();
        camera.rotateY(f11 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f12, -dp);
        float f13 = dp2 * lerp;
        float f14 = f13 / 2.0f;
        imageReceiver.setImageCoords(width - f14, dp - f14, f13, f13);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10;
        if (this.f2363a == null && this.f2364b == null && this.f2365c == null && this.f2369s == null && this.v == null && this.f2370w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f2365c = null;
        this.f2364b = null;
        this.f2363a = null;
        this.f2366f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.f2368r = false;
        this.f2367n = false;
        this.h = false;
        this.f2370w = null;
        this.v = null;
        this.f2369s = null;
        this.E = 0.0f;
        this.f2372y = 0.0f;
        this.f2371x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f2363a, this.d, this.h);
        b(canvas, this.f2364b, this.e, this.f2367n);
        b(canvas, this.f2365c, this.f2366f, this.f2368r);
    }
}
