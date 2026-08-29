package jh;

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
public final class v4 extends View {
    public float A;
    public final Camera B;
    public final u10 C;
    public final RectF D;
    public q4 f12952a;
    public q4 f12953b;
    public q4 f12954c;
    public float d;
    public float f12955e;
    public float f12956f;
    public boolean h;
    public boolean f12957n;
    public boolean f12958r;
    public p4 f12959s;
    public p4 v;
    public p4 f12960w;
    public float f12961x;
    public float f12962y;

    public v4(Context context) {
        super(context);
        this.B = new Camera();
        this.C = new u10();
        this.D = new RectF();
    }

    public final void a(Canvas canvas, p4 p4Var, float f9, float f10, float f11, int[] iArr, int[] iArr2, int[] iArr3) {
        float f12;
        float f13;
        float f14;
        if (p4Var != null) {
            Matrix matrix = p4Var.d;
            Paint paint = p4Var.f12609c;
            if (paint != null) {
                float f15 = (f9 - 0.5f) / 1.5f;
                float clamp01 = Utilities.clamp01(1.0f - Math.abs(f15));
                float max = Math.max(0.8f * f10, AndroidUtilities.dp(180.0f));
                float f16 = (f10 / 2.0f) - ((f15 * max) * 1.8f);
                float f17 = f16 - max;
                float f18 = f16 + max;
                canvas.saveLayerAlpha(f17, 0.0f, f18, f11, 255, 31);
                matrix.reset();
                matrix.postTranslate(f16, Math.min(AndroidUtilities.dp(176.0f), f11) / 2.0f);
                p4Var.f12610e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f17, 0.0f, f18, f11, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.D;
                rectF.set(f17, 0.0f, f17 + dp, f11);
                u10 u10Var = this.C;
                u10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f18 - dp, 0.0f, f18, f11);
                u10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f17 && width <= f18) {
                        f14 = Math.min(Utilities.clamp01((width - f17) / max), Utilities.clamp01(1.0f - ((width - (f18 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.g6.v(iArr[i10], org.telegram.ui.ActionBar.g6.l1(clamp01 * f14, p4Var.f12612g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f17 && width2 <= f18) {
                        f13 = Math.min(Utilities.clamp01((width2 - f17) / max), Utilities.clamp01(1.0f - ((width2 - (f18 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.g6.v(iArr2[i11], org.telegram.ui.ActionBar.g6.l1(clamp01 * f13, p4Var.f12611f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f17 && width3 <= f18) {
                        f12 = Math.min(Utilities.clamp01((width3 - f17) / max), Utilities.clamp01(1.0f - ((width3 - (f18 - max)) / max)));
                    } else {
                        f12 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.g6.v(iArr3[i12], org.telegram.ui.ActionBar.g6.l1(clamp01 * f12, p4Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, q4 q4Var, float f9, boolean z10) {
        if (q4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = q4Var.d;
        float f10 = f9;
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
        Camera camera = this.B;
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
        if (this.f12952a == null && this.f12953b == null && this.f12954c == null && this.f12959s == null && this.v == null && this.f12960w == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12954c = null;
        this.f12953b = null;
        this.f12952a = null;
        this.f12956f = 0.0f;
        this.f12955e = 0.0f;
        this.d = 0.0f;
        this.f12958r = false;
        this.f12957n = false;
        this.h = false;
        this.f12960w = null;
        this.v = null;
        this.f12959s = null;
        this.A = 0.0f;
        this.f12962y = 0.0f;
        this.f12961x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f12952a, this.d, this.h);
        b(canvas, this.f12953b, this.f12955e, this.f12957n);
        b(canvas, this.f12954c, this.f12956f, this.f12958r);
    }
}
