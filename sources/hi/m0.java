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
public final class m0 extends View {
    public final Paint f14988a;
    public final Path f14989b;
    public final RectF f14990c;
    public final n0 d;

    public m0(n0 n0Var, Context context) {
        super(context);
        this.d = n0Var;
        this.f14988a = new Paint(1);
        this.f14989b = new Path();
        this.f14990c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i7;
        boolean z10 = getContext() instanceof BubbleActivity;
        h0 h0Var = this.d.h;
        float f10 = h0Var.F;
        if (!z10) {
            i7 = org.telegram.messenger.g0.f24115m;
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        return ((getHeight() - f11) - h0Var.E) - org.telegram.messenger.g0.L(32.0f);
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
        tg.n1 n1Var;
        float f12;
        float f13;
        n0 n0Var = this.d;
        h0 h0Var = n0Var.h;
        int[] iArr = n0Var.f15088y;
        w5 w5Var = n0Var.f15078a;
        if (n0Var.f15079b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f14988a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (n0Var.f15085s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (n0Var.f15085s < 1.0f) {
            Path path = this.f14989b;
            path.rewind();
            RectF rectF = this.f14990c;
            rectF.set(0.0f, 0.0f, w5Var.getWidth(), w5Var.getHeight());
            int[] iArr2 = n0Var.f15087x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, n0Var.f15085s, rectF);
            float W1 = org.telegram.messenger.g0.W1(n0Var.f15085s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = n0Var.f15085s;
        float f15 = 1.0f - f14;
        int[] iArr3 = n0Var.f15086w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (n0Var.F) {
                n0Var.f15079b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            we weVar2 = n0Var.f15079b.H0;
            if (weVar2 != null) {
                f13 = weVar2.f27679e;
                f12 = weVar2.f27680f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (n0Var.f15079b.getScaleX() * (n1Var.getWidth() / f13)) / w5Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(n0Var.f15079b.getRotation() * f15);
            canvas.translate(((n0Var.f15079b.getContentWidth() * f13) / 2.0f) * f15, ((n0Var.f15079b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = h0Var.F;
        if (!z11) {
            i7 = org.telegram.messenger.g0.f24115m;
        } else {
            i7 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i7) * f14);
        if (i10 > 0) {
            float contentWidth = n0Var.f15079b.getContentWidth();
            float contentHeight = n0Var.f15079b.getContentHeight();
            we weVar3 = n0Var.f15079b.H0;
            if (weVar3 != null) {
                f10 = weVar3.f27679e;
            } else {
                f10 = 1.0f;
            }
            if (weVar3 != null) {
                f11 = weVar3.f27680f;
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
        int i11 = gVar.f21859i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z12 = com.google.android.gms.internal.vision.e2.z(gVar.f21862l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f21856e * 1.0f);
        float f19 = (gVar.f21857f / z12) * containerWidth;
        tg.n1 n1Var2 = n0Var.f15079b;
        if (n1Var2 != null && (weVar = n1Var2.H0) != null) {
            T1 = org.telegram.messenger.g0.T1(weVar.f27678c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f21854b * f17 * 1.0f, gVar.f21855c * f18 * 1.0f);
        float e10 = n0Var.d.e(false, i11) + n0Var.f15079b.getOrientation() + gVar.f21858g;
        we weVar4 = n0Var.f15079b.H0;
        if (weVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, n0Var.f15085s);
        } else {
            T12 = org.telegram.messenger.g0.T1(weVar4.d + weVar4.f27683k, e10, n0Var.f15085s);
        }
        canvas.rotate(T12);
        canvas.rotate(n0Var.f15079b.getOrientation());
        org.telegram.ui.Components.c6 c6Var = n0Var.f15080c;
        if (n0Var.F) {
            we weVar5 = n0Var.f15079b.H0;
            if (weVar5 != null && weVar5.f27684l) {
                z10 = true;
            }
            z10 = false;
        } else {
            og.m mVar = h0Var.M;
            if (mVar != null) {
                z10 = mVar.f21893j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, c6Var.d(z10)), 1.0f);
        canvas.translate((-n0Var.f15079b.getContentWidth()) / 2.0f, (-n0Var.f15079b.getContentHeight()) / 2.0f);
        tg.n1 n1Var3 = n0Var.f15079b;
        Paint paint2 = n1Var3.G0;
        Bitmap bitmap = n1Var3.B0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
