package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.ye;
import org.telegram.ui.BubbleActivity;
public final class l0 extends View {
    public final Paint f12300a;
    public final Path f12301b;
    public final RectF f12302c;
    public final m0 d;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.f12300a = new Paint(1);
        this.f12301b = new Path();
        this.f12302c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i7;
        boolean z9 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        float f10 = g0Var.E;
        if (!z9) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        float f11 = f10 + i7;
        return ((getHeight() - f11) - g0Var.D) - org.telegram.messenger.g0.L(32.0f);
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
        boolean z9;
        ye yeVar;
        float f10;
        float f11;
        tg.n1 n1Var;
        float f12;
        float f13;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.f12403y;
        y5 y5Var = m0Var.f12393a;
        if (m0Var.f12394b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f12300a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.f12400s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.f12400s < 1.0f) {
            Path path = this.f12301b;
            path.rewind();
            RectF rectF = this.f12302c;
            rectF.set(0.0f, 0.0f, y5Var.getWidth(), y5Var.getHeight());
            int[] iArr2 = m0Var.f12402x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, m0Var.f12400s, rectF);
            float W1 = org.telegram.messenger.g0.W1(m0Var.f12400s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = m0Var.f12400s;
        float f15 = 1.0f - f14;
        int[] iArr3 = m0Var.f12401w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (m0Var.E) {
                m0Var.f12394b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            ye yeVar2 = m0Var.f12394b.G0;
            if (yeVar2 != null) {
                f13 = yeVar2.f26638e;
                f12 = yeVar2.f26639f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (m0Var.f12394b.getScaleX() * (n1Var.getWidth() / f13)) / y5Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(m0Var.f12394b.getRotation() * f15);
            canvas.translate(((m0Var.f12394b.getContentWidth() * f13) / 2.0f) * f15, ((m0Var.f12394b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z10 = getContext() instanceof BubbleActivity;
        float f16 = g0Var.E;
        if (!z10) {
            i7 = org.telegram.messenger.g0.f22557m;
        } else {
            i7 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i7) * f14);
        if (i10 > 0) {
            float contentWidth = m0Var.f12394b.getContentWidth();
            float contentHeight = m0Var.f12394b.getContentHeight();
            ye yeVar3 = m0Var.f12394b.G0;
            if (yeVar3 != null) {
                f10 = yeVar3.f26638e;
            } else {
                f10 = 1.0f;
            }
            if (yeVar3 != null) {
                f11 = yeVar3.f26639f;
            } else {
                f11 = 1.0f;
            }
            float T14 = (org.telegram.messenger.g0.T1(1.0f, f10, f15) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.g0.T1(1.0f, f11, f15) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f14);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = m0Var.getCurrentWidth();
        og.g gVar = m0Var.D;
        currentHeight = m0Var.getCurrentHeight();
        int i11 = gVar.f20970i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float z11 = com.google.android.recaptcha.internal.a.z(gVar.f20973l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(gVar.d * 1.0f, gVar.f20967e * 1.0f);
        float f19 = (gVar.f20968f / z11) * containerWidth;
        tg.n1 n1Var2 = m0Var.f12394b;
        if (n1Var2 != null && (yeVar = n1Var2.G0) != null) {
            T1 = org.telegram.messenger.g0.T1(yeVar.f26637c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(gVar.f20965b * f17 * 1.0f, gVar.f20966c * f18 * 1.0f);
        float e10 = m0Var.d.e(false, i11) + m0Var.f12394b.getOrientation() + gVar.f20969g;
        ye yeVar4 = m0Var.f12394b.G0;
        if (yeVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, m0Var.f12400s);
        } else {
            T12 = org.telegram.messenger.g0.T1(yeVar4.d + yeVar4.f26642k, e10, m0Var.f12400s);
        }
        canvas.rotate(T12);
        canvas.rotate(m0Var.f12394b.getOrientation());
        org.telegram.ui.Components.w5 w5Var = m0Var.f12395c;
        if (m0Var.E) {
            ye yeVar5 = m0Var.f12394b.G0;
            if (yeVar5 != null && yeVar5.f26643l) {
                z9 = true;
            }
            z9 = false;
        } else {
            og.m mVar = g0Var.L;
            if (mVar != null) {
                z9 = mVar.f21004j;
            }
            z9 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, w5Var.d(z9)), 1.0f);
        canvas.translate((-m0Var.f12394b.getContentWidth()) / 2.0f, (-m0Var.f12394b.getContentHeight()) / 2.0f);
        tg.n1 n1Var3 = m0Var.f12394b;
        Paint paint2 = n1Var3.F0;
        Bitmap bitmap = n1Var3.A0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
