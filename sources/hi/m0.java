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
public final class m0 extends View {
    public final Paint f14650a;
    public final Path f14651b;
    public final RectF f14652c;
    public final n0 d;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.d = n0Var;
        this.f14650a = new Paint(1);
        this.f14651b = new Path();
        this.f14652c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i7;
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        float f10 = g0Var.F;
        if (!z10) {
            i7 = org.telegram.messenger.g0.f23605m;
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        return ((getHeight() - f11) - g0Var.E) - org.telegram.messenger.g0.L(32.0f);
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
        tg.n1 n1Var;
        float f12;
        float f13;
        n0 n0Var = this.d;
        g0 g0Var = n0Var.h;
        int[] iArr = n0Var.f14729y;
        x5 x5Var = n0Var.f14719a;
        if (n0Var.f14720b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f14650a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.f14726s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.f14726s < 1.0f) {
            Path path = this.f14651b;
            path.rewind();
            RectF rectF = this.f14652c;
            rectF.set(0.0f, 0.0f, x5Var.getWidth(), x5Var.getHeight());
            int[] iArr2 = n0Var.f14728x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, n0Var.f14726s, rectF);
            float W1 = org.telegram.messenger.g0.W1(n0Var.f14726s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = n0Var.f14726s;
        float f15 = 1.0f - f14;
        int[] iArr3 = n0Var.f14727w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (n0Var.F) {
                n0Var.f14720b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            xe xeVar2 = n0Var.f14720b.H0;
            if (xeVar2 != null) {
                f13 = xeVar2.f27492e;
                f12 = xeVar2.f27493f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (n0Var.f14720b.getScaleX() * (n1Var.getWidth() / f13)) / x5Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(n0Var.f14720b.getRotation() * f15);
            canvas.translate(((n0Var.f14720b.getContentWidth() * f13) / 2.0f) * f15, ((n0Var.f14720b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = g0Var.F;
        if (!z11) {
            i7 = org.telegram.messenger.g0.f23605m;
        } else {
            i7 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i7) * f14);
        if (i10 > 0) {
            float contentWidth = n0Var.f14720b.getContentWidth();
            float contentHeight = n0Var.f14720b.getContentHeight();
            xe xeVar3 = n0Var.f14720b.H0;
            if (xeVar3 != null) {
                f10 = xeVar3.f27492e;
            } else {
                f10 = 1.0f;
            }
            if (xeVar3 != null) {
                f11 = xeVar3.f27493f;
            } else {
                f11 = 1.0f;
            }
            float T14 = (org.telegram.messenger.g0.T1(1.0f, f10, f15) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.g0.T1(1.0f, f11, f15) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f14);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = n0Var.getCurrentWidth();
        og.g gVar = n0Var.E;
        currentHeight = n0Var.getCurrentHeight();
        int i11 = gVar.f21493i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f21496l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f21490e * 1.0f);
        float f19 = (gVar.f21491f / z12) * containerWidth;
        tg.n1 n1Var2 = n0Var.f14720b;
        if (n1Var2 != null && (xeVar = n1Var2.H0) != null) {
            T1 = org.telegram.messenger.g0.T1(xeVar.f27491c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f21488b * f17 * 1.0f, gVar.f21489c * f18 * 1.0f);
        float e10 = n0Var.d.e(false, i11) + n0Var.f14720b.getOrientation() + gVar.f21492g;
        xe xeVar4 = n0Var.f14720b.H0;
        if (xeVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, n0Var.f14726s);
        } else {
            T12 = org.telegram.messenger.g0.T1(xeVar4.d + xeVar4.f27496k, e10, n0Var.f14726s);
        }
        canvas.rotate(T12);
        canvas.rotate(n0Var.f14720b.getOrientation());
        org.telegram.ui.Components.u5 u5Var = n0Var.f14721c;
        if (n0Var.F) {
            xe xeVar5 = n0Var.f14720b.H0;
            if (xeVar5 != null && xeVar5.f27497l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = g0Var.M;
            if (mVar != null) {
                z10 = mVar.f21527j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, u5Var.d(z10)), 1.0f);
        canvas.translate((-n0Var.f14720b.getContentWidth()) / 2.0f, (-n0Var.f14720b.getContentHeight()) / 2.0f);
        tg.n1 n1Var3 = n0Var.f14720b;
        Paint paint2 = n1Var3.G0;
        Bitmap bitmap = n1Var3.B0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
