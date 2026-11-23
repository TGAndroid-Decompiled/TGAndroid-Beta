package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.xe;
import org.telegram.ui.BubbleActivity;
public final class n0 extends View {
    public final Paint f15061a;
    public final Path f15062b;
    public final RectF f15063c;
    public final o0 d;

    public n0(o0 o0Var, Context context) {
        super(context);
        this.d = o0Var;
        this.f15061a = new Paint(1);
        this.f15062b = new Path();
        this.f15063c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i7;
        boolean z10 = getContext() instanceof BubbleActivity;
        i0 i0Var = this.d.h;
        float f10 = i0Var.F;
        if (!z10) {
            i7 = org.telegram.messenger.g0.f24040m;
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        return ((getHeight() - f11) - i0Var.E) - org.telegram.messenger.g0.L(32.0f);
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
        xe xeVar;
        float f10;
        float f11;
        tg.p1 p1Var;
        float f12;
        float f13;
        o0 o0Var = this.d;
        i0 i0Var = o0Var.h;
        int[] iArr = o0Var.f15188y;
        v5 v5Var = o0Var.f15178a;
        if (o0Var.f15179b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f15061a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (o0Var.f15185s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (o0Var.f15185s < 1.0f) {
            Path path = this.f15062b;
            path.rewind();
            RectF rectF = this.f15063c;
            rectF.set(0.0f, 0.0f, v5Var.getWidth(), v5Var.getHeight());
            int[] iArr2 = o0Var.f15187x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, o0Var.f15185s, rectF);
            float W1 = org.telegram.messenger.g0.W1(o0Var.f15185s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = o0Var.f15185s;
        float f15 = 1.0f - f14;
        int[] iArr3 = o0Var.f15186w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (o0Var.F) {
                o0Var.f15179b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            xe xeVar2 = o0Var.f15179b.H0;
            if (xeVar2 != null) {
                f13 = xeVar2.f27877e;
                f12 = xeVar2.f27878f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (o0Var.f15179b.getScaleX() * (p1Var.getWidth() / f13)) / v5Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(o0Var.f15179b.getRotation() * f15);
            canvas.translate(((o0Var.f15179b.getContentWidth() * f13) / 2.0f) * f15, ((o0Var.f15179b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = i0Var.F;
        if (!z11) {
            i7 = org.telegram.messenger.g0.f24040m;
        } else {
            i7 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i7) * f14);
        if (i10 > 0) {
            float contentWidth = o0Var.f15179b.getContentWidth();
            float contentHeight = o0Var.f15179b.getContentHeight();
            xe xeVar3 = o0Var.f15179b.H0;
            if (xeVar3 != null) {
                f10 = xeVar3.f27877e;
            } else {
                f10 = 1.0f;
            }
            if (xeVar3 != null) {
                f11 = xeVar3.f27878f;
            } else {
                f11 = 1.0f;
            }
            float T14 = (org.telegram.messenger.g0.T1(1.0f, f10, f15) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.g0.T1(1.0f, f11, f15) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f14);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = o0Var.getCurrentWidth();
        og.g gVar = o0Var.E;
        currentHeight = o0Var.getCurrentHeight();
        int i11 = gVar.f21884i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f21887l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f21881e * 1.0f);
        float f19 = (gVar.f21882f / z12) * containerWidth;
        tg.p1 p1Var2 = o0Var.f15179b;
        if (p1Var2 != null && (xeVar = p1Var2.H0) != null) {
            T1 = org.telegram.messenger.g0.T1(xeVar.f27876c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f21879b * f17 * 1.0f, gVar.f21880c * f18 * 1.0f);
        float e10 = o0Var.d.e(false, i11) + o0Var.f15179b.getOrientation() + gVar.f21883g;
        xe xeVar4 = o0Var.f15179b.H0;
        if (xeVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, o0Var.f15185s);
        } else {
            T12 = org.telegram.messenger.g0.T1(xeVar4.d + xeVar4.f27881k, e10, o0Var.f15185s);
        }
        canvas.rotate(T12);
        canvas.rotate(o0Var.f15179b.getOrientation());
        org.telegram.ui.Components.d6 d6Var = o0Var.f15180c;
        if (o0Var.F) {
            xe xeVar5 = o0Var.f15179b.H0;
            if (xeVar5 != null && xeVar5.f27882l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = i0Var.M;
            if (mVar != null) {
                z10 = mVar.f21918j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, d6Var.d(z10)), 1.0f);
        canvas.translate((-o0Var.f15179b.getContentWidth()) / 2.0f, (-o0Var.f15179b.getContentHeight()) / 2.0f);
        tg.p1 p1Var3 = o0Var.f15179b;
        Paint paint2 = p1Var3.G0;
        Bitmap bitmap = p1Var3.B0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
