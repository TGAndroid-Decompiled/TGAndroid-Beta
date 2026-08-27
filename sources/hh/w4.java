package hh;

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
import org.telegram.ui.v10;

public final class w4 extends View {
    public float A;
    public final Camera B;
    public final v10 C;
    public final RectF D;

    public r4 f10274a;

    public r4 f10275b;

    public r4 f10276c;
    public float d;

    public float f10277e;

    public float f10278f;
    public boolean h;

    public boolean f10279n;

    public boolean f10280r;

    public q4 f10281s;
    public q4 v;

    public q4 f10282w;

    public float f10283x;

    public float f10284y;

    public w4(Context context) {
        super(context);
        this.B = new Camera();
        this.C = new v10();
        this.D = new RectF();
    }

    public final void a(Canvas canvas, q4 q4Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        if (q4Var != null) {
            Matrix matrix = q4Var.d;
            Paint paint = q4Var.f9902c;
            if (paint == null) {
                return;
            }
            float f13 = (f10 - 0.5f) / 1.5f;
            float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f13));
            float fMax = Math.max(0.8f * f11, AndroidUtilities.dp(180.0f));
            float f14 = (f11 / 2.0f) - ((f13 * fMax) * 1.8f);
            float fMin = Math.min(AndroidUtilities.dp(176.0f), f12) / 2.0f;
            float f15 = f14 - fMax;
            float f16 = f14 + fMax;
            canvas.saveLayerAlpha(f15, 0.0f, f16, f12, 255, 31);
            matrix.reset();
            matrix.postTranslate(f14, fMin);
            q4Var.f9903e.setLocalMatrix(matrix);
            paint.setAlpha((int) (fClamp01 * 255.0f));
            canvas.drawRect(f15, 0.0f, f16, f12, paint);
            canvas.save();
            float fDp = AndroidUtilities.dp(90.0f);
            RectF rectF = this.D;
            rectF.set(f15, 0.0f, f15 + fDp, f12);
            v10 v10Var = this.C;
            v10Var.b(canvas, rectF, 0, 1.0f);
            rectF.set(f16 - fDp, 0.0f, f16, f12);
            v10Var.b(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                float width = (getWidth() / (iArr.length - 1)) * i10;
                iArr[i10] = org.telegram.ui.ActionBar.g6.v(iArr[i10], org.telegram.ui.ActionBar.g6.l1(fClamp01 * ((width < f15 || width > f16) ? 0.0f : Math.min(Utilities.clamp01((width - f15) / fMax), Utilities.clamp01(1.0f - ((width - (f16 - fMax)) / fMax)))), q4Var.f9905g));
            }
            for (int i11 = 0; i11 < iArr2.length; i11++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                iArr2[i11] = org.telegram.ui.ActionBar.g6.v(iArr2[i11], org.telegram.ui.ActionBar.g6.l1(fClamp01 * ((width2 < f15 || width2 > f16) ? 0.0f : Math.min(Utilities.clamp01((width2 - f15) / fMax), Utilities.clamp01(1.0f - ((width2 - (f16 - fMax)) / fMax)))), q4Var.f9904f));
            }
            for (int i12 = 0; i12 < iArr3.length; i12++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                iArr3[i12] = org.telegram.ui.ActionBar.g6.v(iArr3[i12], org.telegram.ui.ActionBar.g6.l1(fClamp01 * ((width3 < f15 || width3 > f16) ? 0.0f : Math.min(Utilities.clamp01((width3 - f15) / fMax), Utilities.clamp01(1.0f - ((width3 - (f16 - fMax)) / fMax)))), q4Var.h));
            }
        }
    }

    public final void b(Canvas canvas, r4 r4Var, float f10, boolean z10) {
        if (r4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = r4Var.d;
        float fMax = f10;
        if (z10) {
            fMax = Math.max(0.5f, fMax);
        }
        float imageX = imageReceiver.getImageX();
        float imageY = imageReceiver.getImageY();
        float imageWidth = imageReceiver.getImageWidth();
        float imageHeight = imageReceiver.getImageHeight();
        float alpha = imageReceiver.getAlpha();
        float f11 = (fMax - 0.5f) / 1.5f;
        float fClamp01 = Utilities.clamp01(1.0f - Math.abs(f11));
        float width = (getWidth() / 2.0f) - (AndroidUtilities.dp(220.0f) * f11);
        float fDp = AndroidUtilities.dp(80.0f);
        float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, fClamp01);
        float fDp2 = AndroidUtilities.dp(160.0f);
        canvas.save();
        float f12 = ((fDp2 / 2.0f) * f11) + width;
        canvas.translate(f12, fDp);
        Camera camera = this.B;
        camera.save();
        camera.rotateY(f11 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f12, -fDp);
        float f13 = fDp2 * fLerp;
        float f14 = f13 / 2.0f;
        imageReceiver.setImageCoords(width - f14, fDp - f14, f13, f13);
        imageReceiver.setAlpha(fClamp01);
        imageReceiver.draw(canvas);
        imageReceiver.setImageCoords(imageX, imageY, imageWidth, imageHeight);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z10 = (this.f10274a == null && this.f10275b == null && this.f10276c == null && this.f10281s == null && this.v == null && this.f10282w == null) ? false : true;
        this.f10276c = null;
        this.f10275b = null;
        this.f10274a = null;
        this.f10278f = 0.0f;
        this.f10277e = 0.0f;
        this.d = 0.0f;
        this.f10280r = false;
        this.f10279n = false;
        this.h = false;
        this.f10282w = null;
        this.v = null;
        this.f10281s = null;
        this.A = 0.0f;
        this.f10284y = 0.0f;
        this.f10283x = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f10274a, this.d, this.h);
        b(canvas, this.f10275b, this.f10277e, this.f10279n);
        b(canvas, this.f10276c, this.f10278f, this.f10280r);
    }
}
