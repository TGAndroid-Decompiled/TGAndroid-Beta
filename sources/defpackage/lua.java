package defpackage;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
public final class lua extends View {
    public float E;
    public float F;
    public final Camera G;
    public final pm3 H;
    public final RectF I;
    public gua a;
    public gua b;
    public gua c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public fua s;
    public fua w;
    public fua x;
    public float y;

    public lua(Context context) {
        super(context);
        this.G = new Camera();
        this.H = new pm3((byte) 7);
        this.I = new RectF();
    }

    public final void a(Canvas canvas, fua fuaVar, float f, float f2, float f3, int[] iArr, int[] iArr2, int[] iArr3) {
        float f4;
        float f5;
        float f6;
        if (fuaVar != null) {
            Matrix matrix = fuaVar.d;
            Paint paint = fuaVar.c;
            float f7 = (f - 0.5f) / 1.5f;
            float l = Utilities.l(1.0f - Math.abs(f7));
            float max = Math.max(0.8f * f2, hl.L(180.0f));
            float v = bp1.v(f7, max, 1.8f, f2 / 2.0f);
            float min = Math.min(hl.L(176.0f), f3) / 2.0f;
            float f8 = v - max;
            float f9 = v + max;
            canvas.saveLayerAlpha(f8, 0.0f, f9, f3, 255, 31);
            matrix.reset();
            matrix.postTranslate(v, min);
            fuaVar.e.setLocalMatrix(matrix);
            paint.setAlpha((int) (l * 255.0f));
            canvas.drawRect(f8, 0.0f, f9, f3, paint);
            canvas.save();
            float L = hl.L(90.0f);
            RectF rectF = this.I;
            rectF.set(f8, 0.0f, f8 + L, f3);
            pm3 pm3Var = this.H;
            pm3Var.r(canvas, rectF, 0, 1.0f);
            rectF.set(f9 - L, 0.0f, f9, f3);
            pm3Var.r(canvas, rectF, 2, 1.0f);
            canvas.restore();
            canvas.restore();
            for (int i = 0; i < iArr.length; i++) {
                float width = (getWidth() / (iArr.length - 1)) * i;
                if (width >= f8 && width <= f9) {
                    f6 = Math.min(Utilities.l((width - f8) / max), Utilities.l(1.0f - ((width - (f9 - max)) / max)));
                } else {
                    f6 = 0.0f;
                }
                iArr[i] = aob.v(iArr[i], aob.p1(l * f6, fuaVar.g));
            }
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                float width2 = (getWidth() / (iArr2.length - 1)) * i2;
                if (width2 >= f8 && width2 <= f9) {
                    f5 = Math.min(Utilities.l((width2 - f8) / max), Utilities.l(1.0f - ((width2 - (f9 - max)) / max)));
                } else {
                    f5 = 0.0f;
                }
                iArr2[i2] = aob.v(iArr2[i2], aob.p1(l * f5, fuaVar.f));
            }
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                float width3 = (getWidth() / (iArr2.length - 1)) * i3;
                if (width3 >= f8 && width3 <= f9) {
                    f4 = Math.min(Utilities.l((width3 - f8) / max), Utilities.l(1.0f - ((width3 - (f9 - max)) / max)));
                } else {
                    f4 = 0.0f;
                }
                iArr3[i3] = aob.v(iArr3[i3], aob.p1(l * f4, fuaVar.h));
            }
        }
    }

    public final void b(Canvas canvas, gua guaVar, float f, boolean z) {
        if (guaVar == null) {
            return;
        }
        ImageReceiver imageReceiver = guaVar.d;
        float f2 = f;
        if (z) {
            f2 = Math.max(0.5f, f2);
        }
        float f3 = imageReceiver.L0;
        float f4 = imageReceiver.M0;
        float f5 = imageReceiver.N0;
        float f6 = imageReceiver.O0;
        float alpha = imageReceiver.getAlpha();
        float f7 = (f2 - 0.5f) / 1.5f;
        float l = Utilities.l(1.0f - Math.abs(f7));
        float width = (getWidth() / 2.0f) - (hl.L(220.0f) * f7);
        float L = hl.L(80.0f);
        float R1 = hl.R1(0.85f, 1.0f, l);
        float L2 = hl.L(160.0f);
        canvas.save();
        float f8 = ((L2 / 2.0f) * f7) + width;
        canvas.translate(f8, L);
        Camera camera = this.G;
        camera.save();
        camera.rotateY(f7 * (-30.0f));
        camera.applyToCanvas(canvas);
        camera.restore();
        canvas.translate(-f8, -L);
        float f9 = L2 * R1;
        float f10 = f9 / 2.0f;
        imageReceiver.i0(width - f10, L - f10, f9, f9);
        imageReceiver.setAlpha(l);
        imageReceiver.h(canvas, null);
        imageReceiver.i0(f3, f4, f5, f6);
        imageReceiver.setAlpha(alpha);
        canvas.restore();
    }

    public final void c() {
        boolean z;
        if (this.a == null && this.b == null && this.c == null && this.s == null && this.w == null && this.x == null) {
            z = false;
        } else {
            z = true;
        }
        this.c = null;
        this.b = null;
        this.a = null;
        this.f = 0.0f;
        this.e = 0.0f;
        this.d = 0.0f;
        this.r = false;
        this.n = false;
        this.h = false;
        this.x = null;
        this.w = null;
        this.s = null;
        this.F = 0.0f;
        this.E = 0.0f;
        this.y = 0.0f;
        if (z) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        b(canvas, this.a, this.d, this.h);
        b(canvas, this.b, this.e, this.n);
        b(canvas, this.c, this.f, this.r);
    }
}
