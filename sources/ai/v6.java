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
import org.telegram.ui.u10;
public final class v6 extends View {
    public float E;
    public final Camera F;
    public final u10 G;
    public final RectF H;
    public q6 f2304a;
    public q6 f2305b;
    public q6 f2306c;
    public float d;
    public float e;
    public float f2307f;
    public boolean h;
    public boolean f2308n;
    public boolean f2309r;
    public p6 f2310s;
    public p6 v;
    public p6 f2311w;
    public float f2312x;
    public float f2313y;

    public v6(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new u10();
        this.H = new RectF();
    }

    public final void a(Canvas canvas, p6 p6Var, float f7, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        float f12;
        float f13;
        float f14;
        if (p6Var != null) {
            Matrix matrix = p6Var.d;
            Paint paint = p6Var.f2012c;
            if (paint != null) {
                float f15 = (f7 - 0.5f) / 1.5f;
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(f15));
                float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
                float z10 = org.telegram.ui.Cells.t0.z(f15, max, 1.8f, f10 / 2.0f);
                float min = Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f;
                float f16 = z10 - max;
                float f17 = z10 + max;
                canvas.saveLayerAlpha(f16, 0.0f, f17, f11, 255, 31);
                matrix.reset();
                matrix.postTranslate(z10, min);
                p6Var.e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f16, 0.0f, f17, f11, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.H;
                rectF.set(f16, 0.0f, f16 + dp, f11);
                u10 u10Var = this.G;
                u10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f17 - dp, 0.0f, f17, f11);
                u10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f16 && width <= f17) {
                        f14 = Math.min(Utilities.clamp01((width - f16) / max), Utilities.clamp01(1.0f - ((width - (f17 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.h6.v(iArr[i10], org.telegram.ui.ActionBar.h6.m1(clamp01 * f14, p6Var.f2014g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f16 && width2 <= f17) {
                        f13 = Math.min(Utilities.clamp01((width2 - f16) / max), Utilities.clamp01(1.0f - ((width2 - (f17 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.h6.v(iArr2[i11], org.telegram.ui.ActionBar.h6.m1(clamp01 * f13, p6Var.f2013f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f16 && width3 <= f17) {
                        f12 = Math.min(Utilities.clamp01((width3 - f16) / max), Utilities.clamp01(1.0f - ((width3 - (f17 - max)) / max)));
                    } else {
                        f12 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.h6.v(iArr3[i12], org.telegram.ui.ActionBar.h6.m1(clamp01 * f12, p6Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, q6 q6Var, float f7, boolean z10) {
        if (q6Var == null) {
            return;
        }
        ImageReceiver imageReceiver = q6Var.d;
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
        if (this.f2304a == null && this.f2305b == null && this.f2306c == null && this.f2310s == null && this.v == null && this.f2311w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f2306c = null;
        this.f2305b = null;
        this.f2304a = null;
        this.f2307f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.f2309r = false;
        this.f2308n = false;
        this.h = false;
        this.f2311w = null;
        this.v = null;
        this.f2310s = null;
        this.E = 0.0f;
        this.f2313y = 0.0f;
        this.f2312x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f2304a, this.d, this.h);
        b(canvas, this.f2305b, this.e, this.f2308n);
        b(canvas, this.f2306c, this.f2307f, this.f2309r);
    }
}
