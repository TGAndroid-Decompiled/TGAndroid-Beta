package lh;

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
import org.telegram.ui.i20;
public final class u4 extends View {
    public float B;
    public final Camera C;
    public final i20 D;
    public final RectF E;
    public p4 f13183a;
    public p4 f13184b;
    public p4 f13185c;
    public float d;
    public float e;
    public float f13186f;
    public boolean h;
    public boolean f13187n;
    public boolean f13188r;
    public o4 f13189s;
    public o4 v;
    public o4 f13190w;
    public float f13191x;
    public float f13192y;

    public u4(Context context) {
        super(context);
        this.C = new Camera();
        this.D = new i20();
        this.E = new RectF();
    }

    public final void a(Canvas canvas, o4 o4Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        float f13;
        float f14;
        float f15;
        if (o4Var != null) {
            Matrix matrix = o4Var.d;
            Paint paint = o4Var.f12857c;
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
                o4Var.e.setLocalMatrix(matrix);
                paint.setAlpha((int) (clamp01 * 255.0f));
                canvas.drawRect(f18, 0.0f, f19, f12, paint);
                canvas.save();
                float dp = AndroidUtilities.dp(90.0f);
                RectF rectF = this.E;
                rectF.set(f18, 0.0f, f18 + dp, f12);
                i20 i20Var = this.D;
                i20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set(f19 - dp, 0.0f, f19, f12);
                i20Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    float width = (getWidth() / (iArr.length - 1)) * i10;
                    if (width >= f18 && width <= f19) {
                        f15 = Math.min(Utilities.clamp01((width - f18) / max), Utilities.clamp01(1.0f - ((width - (f19 - max)) / max)));
                    } else {
                        f15 = 0.0f;
                    }
                    iArr[i10] = org.telegram.ui.ActionBar.j6.v(iArr[i10], org.telegram.ui.ActionBar.j6.l1(clamp01 * f15, o4Var.f12859g));
                }
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width2 >= f18 && width2 <= f19) {
                        f14 = Math.min(Utilities.clamp01((width2 - f18) / max), Utilities.clamp01(1.0f - ((width2 - (f19 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr2[i11] = org.telegram.ui.ActionBar.j6.v(iArr2[i11], org.telegram.ui.ActionBar.j6.l1(clamp01 * f14, o4Var.f12858f));
                }
                for (int i12 = 0; i12 < iArr3.length; i12++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i12;
                    if (width3 >= f18 && width3 <= f19) {
                        f13 = Math.min(Utilities.clamp01((width3 - f18) / max), Utilities.clamp01(1.0f - ((width3 - (f19 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr3[i12] = org.telegram.ui.ActionBar.j6.v(iArr3[i12], org.telegram.ui.ActionBar.j6.l1(clamp01 * f13, o4Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, p4 p4Var, float f10, boolean z4) {
        if (p4Var == null) {
            return;
        }
        ImageReceiver imageReceiver = p4Var.d;
        float f11 = f10;
        if (z4) {
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
        Camera camera = this.C;
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
        boolean z4;
        if (this.f13183a == null && this.f13184b == null && this.f13185c == null && this.f13189s == null && this.v == null && this.f13190w == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f13185c = null;
        this.f13184b = null;
        this.f13183a = null;
        this.f13186f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.f13188r = false;
        this.f13187n = false;
        this.h = false;
        this.f13190w = null;
        this.v = null;
        this.f13189s = null;
        this.B = 0.0f;
        this.f13192y = 0.0f;
        this.f13191x = 0.0f;
        if (z4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f13183a, this.d, this.h);
        b(canvas, this.f13184b, this.e, this.f13187n);
        b(canvas, this.f13185c, this.f13186f, this.f13188r);
    }
}
