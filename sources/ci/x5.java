package ci;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class x5 extends View {
    public float E;
    public float F;
    public final Camera G;
    public final k4.j H;
    public final RectF I;
    public s5 f6342a;
    public s5 f6343b;
    public s5 f6344c;
    public float d;
    public float f6345e;
    public float f6346f;
    public boolean h;
    public boolean f6347n;
    public boolean f6348r;
    public r5 f6349s;
    public r5 f6350w;
    public r5 f6351x;
    public float f6352y;

    public x5(Context context) {
        super(context);
        this.G = new Camera();
        this.H = new k4.j(24);
        this.I = new RectF();
    }

    public final void a(Canvas canvas, r5 r5Var, float f10, float f11, float f12, int[] iArr, int[] iArr2, int[] iArr3) {
        float f13;
        float f14;
        float f15;
        if (r5Var != null) {
            Matrix matrix = r5Var.d;
            Paint paint = r5Var.f5892c;
            if (paint != null) {
                float f16 = (f10 - 0.5f) / 1.5f;
                float l10 = Utilities.l(1.0f - Math.abs(f16));
                float max = Math.max(0.8f * f11, org.telegram.messenger.g0.L(180.0f));
                float A = org.telegram.ui.Cells.f1.A(f16, max, 1.8f, f11 / 2.0f);
                float min = Math.min(org.telegram.messenger.g0.L(176.0f), f12) / 2.0f;
                float f17 = A - max;
                float f18 = A + max;
                canvas.saveLayerAlpha(f17, 0.0f, f18, f12, 255, 31);
                matrix.reset();
                matrix.postTranslate(A, min);
                r5Var.f5893e.setLocalMatrix(matrix);
                paint.setAlpha((int) (l10 * 255.0f));
                canvas.drawRect(f17, 0.0f, f18, f12, paint);
                canvas.save();
                float L = org.telegram.messenger.g0.L(90.0f);
                RectF rectF = this.I;
                rectF.set(f17, 0.0f, f17 + L, f12);
                k4.j jVar = this.H;
                jVar.w(canvas, rectF, 0, 1.0f);
                rectF.set(f18 - L, 0.0f, f18, f12);
                jVar.w(canvas, rectF, 2, 1.0f);
                canvas.restore();
                canvas.restore();
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    float width = (getWidth() / (iArr.length - 1)) * i3;
                    if (width >= f17 && width <= f18) {
                        f15 = Math.min(Utilities.l((width - f17) / max), Utilities.l(1.0f - ((width - (f18 - max)) / max)));
                    } else {
                        f15 = 0.0f;
                    }
                    iArr[i3] = org.telegram.ui.ActionBar.k6.w(iArr[i3], org.telegram.ui.ActionBar.k6.r1(l10 * f15, r5Var.f5895g));
                }
                for (int i10 = 0; i10 < iArr2.length; i10++) {
                    float width2 = (getWidth() / (iArr2.length - 1)) * i10;
                    if (width2 >= f17 && width2 <= f18) {
                        f14 = Math.min(Utilities.l((width2 - f17) / max), Utilities.l(1.0f - ((width2 - (f18 - max)) / max)));
                    } else {
                        f14 = 0.0f;
                    }
                    iArr2[i10] = org.telegram.ui.ActionBar.k6.w(iArr2[i10], org.telegram.ui.ActionBar.k6.r1(l10 * f14, r5Var.f5894f));
                }
                for (int i11 = 0; i11 < iArr3.length; i11++) {
                    float width3 = (getWidth() / (iArr2.length - 1)) * i11;
                    if (width3 >= f17 && width3 <= f18) {
                        f13 = Math.min(Utilities.l((width3 - f17) / max), Utilities.l(1.0f - ((width3 - (f18 - max)) / max)));
                    } else {
                        f13 = 0.0f;
                    }
                    iArr3[i11] = org.telegram.ui.ActionBar.k6.w(iArr3[i11], org.telegram.ui.ActionBar.k6.r1(l10 * f13, r5Var.h));
                }
            }
        }
    }

    public final void b(Canvas canvas, s5 s5Var, float f10, boolean z10) {
        if (s5Var == null) {
            return;
        }
        ImageReceiver imageReceiver = s5Var.d;
        float f11 = f10;
        if (z10) {
            f11 = Math.max(0.5f, f11);
        }
        float f12 = imageReceiver.L0;
        float f13 = imageReceiver.M0;
        float f14 = imageReceiver.N0;
        float f15 = imageReceiver.O0;
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
        Camera camera = this.G;
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
        boolean z10;
        if (this.f6342a == null && this.f6343b == null && this.f6344c == null && this.f6349s == null && this.f6350w == null && this.f6351x == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f6344c = null;
        this.f6343b = null;
        this.f6342a = null;
        this.f6346f = 0.0f;
        this.f6345e = 0.0f;
        this.d = 0.0f;
        this.f6348r = false;
        this.f6347n = false;
        this.h = false;
        this.f6351x = null;
        this.f6350w = null;
        this.f6349s = null;
        this.F = 0.0f;
        this.E = 0.0f;
        this.f6352y = 0.0f;
        if (z10) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.f6342a, this.d, this.h);
        b(canvas, this.f6343b, this.f6345e, this.f6347n);
        b(canvas, this.f6344c, this.f6346f, this.f6348r);
    }
}
