package bi;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class v6 extends View {
    public float D;
    public float E;
    public final Camera F;
    public final h6.m G;
    public final RectF H;
    public q6 f4881a;
    public q6 f4882b;
    public q6 f4883c;
    public float d;
    public float f4884e;
    public float f4885f;
    public boolean h;
    public boolean f4886n;
    public boolean f4887r;
    public p6 f4888s;
    public p6 f4889w;
    public p6 f4890x;
    public float f4891y;

    public v6(Context context) {
        super(context);
        this.F = new Camera();
        this.G = new h6.m(28);
        this.H = new RectF();
    }

    public final void a(Canvas canvas, p6 p6Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        float f13;
        float f14;
        float f15;
        if (p6Var != null) {
            Matrix matrix = p6Var.d;
            Paint paint = p6Var.f4514c;
            if (paint != null) {
                float f16 = (f10 - 0.5f) / 1.5f;
                float l10 = Utilities.l(1.0f - Math.abs(f16));
                float max = Math.max(0.8f * f11, org.telegram.messenger.g0.L(180.0f));
                float x10 = org.telegram.ui.Cells.f1.x(f16, max, 1.8f, f11 / 2.0f);
                float min = Math.min(org.telegram.messenger.g0.L(176.0f), f12) / 2.0f;
                float f17 = x10 - max;
                float f18 = x10 + max;
                canvas.saveLayerAlpha(f17, 0.0f, f18, f12, 255, 31);
                matrix.reset();
                matrix.postTranslate(x10, min);
                p6Var.f4515e.setLocalMatrix(matrix);
                paint.setAlpha((int) (l10 * 255.0f));
                canvas.drawRect(f17, 0.0f, f18, f12, paint);
                canvas.save();
                float L = org.telegram.messenger.g0.L(90.0f);
                RectF rectF = this.H;
                rectF.set(f17, 0.0f, f17 + L, f12);
                h6.m mVar = this.G;
                mVar.m(canvas, rectF, 0, 1.0f);
                rectF.set(f18 - L, 0.0f, f18, f12);
                mVar.m(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    float width = (getWidth() / (iArr.length - 1)) * i7;
                    if (width >= f17 && width <= f18) {
                        f15 = Math.min(Utilities.l((width - f17) / max), Utilities.l(1.0f - ((width - (f18 - max)) / max)));
                    } else {
                        f15 = 0.0f;
                    }
                    iArr[i7] = org.telegram.ui.ActionBar.l6.w(iArr[i7], org.telegram.ui.ActionBar.l6.r1(l10 * f15, p6Var.f4517g));
                }
                for (int i10 = 0; i10 < iArr2.length; i10++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i10;
                    if (width2 >= f17 && width2 <= f18) {
                        f14 = Math.min(Utilities.l((width2 - f17) / max), Utilities.l(1.0f - ((width2 - (f18 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr2[i10] = org.telegram.ui.ActionBar.l6.w(iArr2[i10], org.telegram.ui.ActionBar.l6.r1(l10 * f14, p6Var.f4516f));
                }
                for (int i11 = 0; i11 < iArr3.length; i11++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width3 >= f17 && width3 <= f18) {
                        f13 = Math.min(Utilities.l((width3 - f17) / max), Utilities.l(1.0f - ((width3 - (f18 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr3[i11] = org.telegram.ui.ActionBar.l6.w(iArr3[i11], org.telegram.ui.ActionBar.l6.r1(l10 * f13, p6Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, q6 q6Var, float f10, boolean z9) {
        if (q6Var == null) {
            return;
        }
        ImageReceiver imageReceiver = q6Var.d;
        float f11 = f10;
        if (z9) {
            f11 = Math.max(0.5f, f11);
        }
        float f12 = imageReceiver.K0;
        float f13 = imageReceiver.L0;
        float f14 = imageReceiver.M0;
        float f15 = imageReceiver.N0;
        float alpha = imageReceiver.getAlpha();
        float f16 = (f11 - 0.5f) / 1.5f;
        float l10 = Utilities.l(1.0f - Math.abs(f16));
        float width = (getWidth() / 2.0f) - (org.telegram.messenger.g0.L(220.0f) * f16);
        float L = org.telegram.messenger.g0.L(80.0f);
        float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, l10);
        float L2 = org.telegram.messenger.g0.L(160.0f);
        canvas.save();
        float f17 = ((L2 / 2.0f) * f16) + width;
        canvas.translate(f17, L);
        Camera camera = this.F;
        camera.save();
        camera.rotateY(f16 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f17, -L);
        float f18 = L2 * T1;
        float f19 = f18 / 2.0f;
        imageReceiver.y0(width - f19, L - f19, f18, f18);
        imageReceiver.setAlpha(l10);
        imageReceiver.h(canvas, null);
        imageReceiver.y0(f12, f13, f14, f15);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z9;
        if (this.f4881a == null && this.f4882b == null && this.f4883c == null && this.f4888s == null && this.f4889w == null && this.f4890x == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f4883c = null;
        this.f4882b = null;
        this.f4881a = null;
        this.f4885f = 0.0f;
        this.f4884e = 0.0f;
        this.d = 0.0f;
        this.f4887r = false;
        this.f4886n = false;
        this.h = false;
        this.f4890x = null;
        this.f4889w = null;
        this.f4888s = null;
        this.E = 0.0f;
        this.D = 0.0f;
        this.f4891y = 0.0f;
        if (z9) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f4881a, this.d, this.h);
        b(canvas, this.f4882b, this.f4884e, this.f4886n);
        b(canvas, this.f4883c, this.f4885f, this.f4887r);
    }
}
