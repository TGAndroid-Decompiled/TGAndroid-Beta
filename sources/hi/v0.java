package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.we;
import org.telegram.ui.BubbleActivity;
public final class v0 extends View {
    public final Paint f15538a;
    public final Path f15539b;
    public final RectF f15540c;
    public final w0 d;

    public v0(w0 w0Var, Context context) {
        super(context);
        this.d = w0Var;
        this.f15538a = new Paint(1);
        this.f15539b = new Path();
        this.f15540c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i7;
        boolean z10 = getContext() instanceof BubbleActivity;
        p0 p0Var = this.d.h;
        float f10 = p0Var.F;
        if (!z10) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        return ((getHeight() - f11) - p0Var.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i7;
        int currentWidth;
        int currentHeight;
        float T1;
        float T12;
        boolean z10;
        we weVar;
        float f10;
        float f11;
        tg.s1 s1Var;
        float f12;
        float f13;
        w0 w0Var = this.d;
        p0 p0Var = w0Var.h;
        int[] iArr = w0Var.f15642y;
        f6 f6Var = w0Var.f15632a;
        if (w0Var.f15633b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f15538a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (w0Var.f15639s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (w0Var.f15639s < 1.0f) {
            Path path = this.f15539b;
            path.rewind();
            RectF rectF = this.f15540c;
            rectF.set(0.0f, 0.0f, f6Var.getWidth(), f6Var.getHeight());
            int[] iArr2 = w0Var.f15641x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, w0Var.f15639s, rectF);
            float W1 = org.telegram.messenger.g0.W1(w0Var.f15639s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = w0Var.f15639s;
        float f15 = 1.0f - f14;
        int[] iArr3 = w0Var.f15640w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (w0Var.F) {
                w0Var.f15633b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            we weVar2 = w0Var.f15633b.I0;
            if (weVar2 != null) {
                f13 = weVar2.f27771e;
                f12 = weVar2.f27772f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (w0Var.f15633b.getScaleX() * (s1Var.getWidth() / f13)) / f6Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(w0Var.f15633b.getRotation() * f15);
            canvas.translate(((w0Var.f15633b.getContentWidth() * f13) / 2.0f) * f15, ((w0Var.f15633b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = p0Var.F;
        if (!z11) {
            i7 = org.telegram.messenger.g0.f24220m;
        } else {
            i7 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i7) * f14);
        if (i10 > 0) {
            float contentWidth = w0Var.f15633b.getContentWidth();
            float contentHeight = w0Var.f15633b.getContentHeight();
            we weVar3 = w0Var.f15633b.I0;
            if (weVar3 != null) {
                f10 = weVar3.f27771e;
            } else {
                f10 = 1.0f;
            }
            if (weVar3 != null) {
                f11 = weVar3.f27772f;
            } else {
                f11 = 1.0f;
            }
            float T14 = (org.telegram.messenger.g0.T1(1.0f, f10, f15) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.g0.T1(1.0f, f11, f15) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f14);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = w0Var.getCurrentWidth();
        og.g gVar = w0Var.E;
        currentHeight = w0Var.getCurrentHeight();
        int i11 = gVar.f21950i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f21953l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f21947e * 1.0f);
        float f19 = (gVar.f21948f / z12) * containerWidth;
        tg.s1 s1Var2 = w0Var.f15633b;
        if (s1Var2 != null && (weVar = s1Var2.I0) != null) {
            T1 = org.telegram.messenger.g0.T1(weVar.f27770c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f21945b * f17 * 1.0f, gVar.f21946c * f18 * 1.0f);
        float e10 = w0Var.d.e(false, i11) + w0Var.f15633b.getOrientation() + gVar.f21949g;
        we weVar4 = w0Var.f15633b.I0;
        if (weVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, w0Var.f15639s);
        } else {
            T12 = org.telegram.messenger.g0.T1(weVar4.d + weVar4.f27775k, e10, w0Var.f15639s);
        }
        canvas.rotate(T12);
        canvas.rotate(w0Var.f15633b.getOrientation());
        org.telegram.ui.Components.c6 c6Var = w0Var.f15634c;
        if (w0Var.F) {
            we weVar5 = w0Var.f15633b.I0;
            if (weVar5 != null && weVar5.f27776l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = p0Var.M;
            if (mVar != null) {
                z10 = mVar.f21984j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, c6Var.d(z10)), 1.0f);
        canvas.translate((-w0Var.f15633b.getContentWidth()) / 2.0f, (-w0Var.f15633b.getContentHeight()) / 2.0f);
        tg.s1 s1Var3 = w0Var.f15633b;
        Paint paint2 = s1Var3.H0;
        Bitmap bitmap = s1Var3.C0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
