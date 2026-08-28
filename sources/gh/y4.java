package gh;

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
import org.telegram.ui.s10;
public final class y4 extends View {
    public float A;
    public final Camera B;
    public final s10 C;
    public final RectF D;
    public t4 f9211a;
    public t4 f9212b;
    public t4 f9213c;
    public float d;
    public float f9214e;
    public float f9215f;
    public boolean h;
    public boolean f9216n;
    public boolean f9217r;
    public s4 f9218s;
    public s4 v;
    public s4 f9219w;
    public float f9220x;
    public float f9221y;

    public y4(Context context) {
        super(context);
        this.B = new Camera();
        this.C = new s10();
        this.D = new RectF();
    }

    public final void a(Canvas canvas, s4 s4Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        float f13;
        float f14;
        float f15;
        if (s4Var != null) {
            Matrix matrix = s4Var.d;
            Paint paint = s4Var.f8869c;
            if (paint != null) {
                float f16 = (f10 - 0.5f) / 1.5f;
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(f16));
                float max = Math.max(0.8f * f11, AndroidUtilities.dp(180.0f));
                float f17 = (f11 / 2.0f) - ((f16 * max) * 1.8f);
                float f18 = f17 - max;
                float f19 = f17 + max;
                canvas.saveLayerAlpha(f18, 0.0f, f19, f12, 255, 31);
                matrix.reset();
                matrix.postTranslate(f17, Math.min(AndroidUtilities.dp(176.0f), f12) / 2.0f);
                s4Var.f8870e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f18, 0.0f, f19, f12, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.D;
                rectF.set(f18, 0.0f, f18 + dp, f12);
                s10 s10Var = this.C;
                s10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f19 - dp, 0.0f, f19, f12);
                s10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i9 = 0; i9 < iArr.length; i9++) {
                    float width = (getWidth() / (iArr.length - 1)) * i9;
                    if (width >= f18 && width <= f19) {
                        f15 = Math.min(Utilities.clamp01((width - f18) / max), Utilities.clamp01(1.0f - ((width - (f19 - max)) / max)));
                    } else {
                        f15 = 0.0f;
                    }
                    iArr[i9] = org.telegram.ui.ActionBar.f6.v(iArr[i9], org.telegram.ui.ActionBar.f6.l1(clamp01 * f15, s4Var.f8872g));
                }
                for (int i10 = 0; i10 < iArr2.length; i10++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i10;
                    if (width2 >= f18 && width2 <= f19) {
                        f14 = Math.min(Utilities.clamp01((width2 - f18) / max), Utilities.clamp01(1.0f - ((width2 - (f19 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr2[i10] = org.telegram.ui.ActionBar.f6.v(iArr2[i10], org.telegram.ui.ActionBar.f6.l1(clamp01 * f14, s4Var.f8871f));
                }
                for (int i11 = 0; i11 < iArr3.length; i11++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width3 >= f18 && width3 <= f19) {
                        f13 = Math.min(Utilities.clamp01((width3 - f18) / max), Utilities.clamp01(1.0f - ((width3 - (f19 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr3[i11] = org.telegram.ui.ActionBar.f6.v(iArr3[i11], org.telegram.ui.ActionBar.f6.l1(clamp01 * f13, s4Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, t4 t4Var, float f10, boolean z10) {
        if (t4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = t4Var.d;
        float f11 = f10;
        if (z10) {
            f11 = Math.max(0.5f, f11);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f12 = (f11 - 0.5f) / 1.5f;
        float clamp01 = Utilities.clamp01(1.0f - Math.abs(f12));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f12);
        float dp = AndroidUtilities.dp(80.0f);
        float lerp = AndroidUtilities.lerp(0.85f, 1.0f, clamp01);
        float dp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f13 = ((dp2 / 2.0f) * f12) + width;
        canvas.translate(f13, dp);
        Camera camera = this.B;
        camera.save();
        camera.rotateY(f12 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f13, -dp);
        float f14 = dp2 * lerp;
        float f15 = f14 / 2.0f;
        imageReceiver.setImageCoords(width - f15, dp - f15, f14, f14);
        imageReceiver.setAlpha(clamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10;
        if (this.f9211a == null && this.f9212b == null && this.f9213c == null && this.f9218s == null && this.v == null && this.f9219w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f9213c = null;
        this.f9212b = null;
        this.f9211a = null;
        this.f9215f = 0.0f;
        this.f9214e = 0.0f;
        this.d = 0.0f;
        this.f9217r = false;
        this.f9216n = false;
        this.h = false;
        this.f9219w = null;
        this.v = null;
        this.f9218s = null;
        this.A = 0.0f;
        this.f9221y = 0.0f;
        this.f9220x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f9211a, this.d, this.h);
        b(canvas, this.f9212b, this.f9214e, this.f9216n);
        b(canvas, this.f9213c, this.f9215f, this.f9217r);
    }
}
