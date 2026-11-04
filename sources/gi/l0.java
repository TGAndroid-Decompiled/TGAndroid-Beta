package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.re;
import org.telegram.ui.BubbleActivity;
public final class l0 extends View {
    public final Paint f13065a;
    public final Path f13066b;
    public final RectF f13067c;
    public final m0 d;

    public l0(m0 m0Var, Context context) {
        super(context);
        this.d = m0Var;
        this.f13065a = new Paint(1);
        this.f13066b = new Path();
        this.f13067c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i3;
        boolean z10 = getContext() instanceof BubbleActivity;
        g0 g0Var = this.d.h;
        float f10 = g0Var.F;
        if (!z10) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        float f11 = f10 + i3;
        return ((getHeight() - f11) - g0Var.E) - org.telegram.messenger.g0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.g0.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i3;
        int currentWidth;
        int currentHeight;
        float T1;
        float T12;
        boolean z10;
        re reVar;
        float f10;
        float f11;
        ug.n1 n1Var;
        float f12;
        float f13;
        m0 m0Var = this.d;
        g0 g0Var = m0Var.h;
        int[] iArr = m0Var.f13181y;
        y5 y5Var = m0Var.f13171a;
        if (m0Var.f13172b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f13065a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (m0Var.f13178s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (m0Var.f13178s < 1.0f) {
            Path path = this.f13066b;
            path.rewind();
            RectF rectF = this.f13067c;
            rectF.set(0.0f, 0.0f, y5Var.getWidth(), y5Var.getHeight());
            int[] iArr2 = m0Var.f13180x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            org.telegram.messenger.g0.Z1(rectF, rectF2, m0Var.f13178s, rectF);
            float W1 = org.telegram.messenger.g0.W1(m0Var.f13178s, org.telegram.messenger.g0.L(12.0f), 0);
            path.addRoundRect(rectF, W1, W1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = m0Var.f13178s;
        float f15 = 1.0f - f14;
        int[] iArr3 = m0Var.f13179w;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i10 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            if (m0Var.F) {
                m0Var.f13172b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            re reVar2 = m0Var.f13172b.H0;
            if (reVar2 != null) {
                f13 = reVar2.f25113e;
                f12 = reVar2.f25114f;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float T13 = org.telegram.messenger.g0.T1(1.0f, (m0Var.f13172b.getScaleX() * (n1Var.getWidth() / f13)) / y5Var.getWidth(), f15);
            canvas.scale(T13, T13);
            canvas.rotate(m0Var.f13172b.getRotation() * f15);
            canvas.translate(((m0Var.f13172b.getContentWidth() * f13) / 2.0f) * f15, ((m0Var.f13172b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z11 = getContext() instanceof BubbleActivity;
        float f16 = g0Var.F;
        if (!z11) {
            i3 = org.telegram.messenger.g0.f22602m;
        } else {
            i3 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + org.telegram.messenger.g0.L(16.0f)) * f14, (((getContainerHeight() + org.telegram.messenger.g0.L(32.0f)) / 2.0f) + f16 + i3) * f14);
        if (i10 > 0) {
            float contentWidth = m0Var.f13172b.getContentWidth();
            float contentHeight = m0Var.f13172b.getContentHeight();
            re reVar3 = m0Var.f13172b.H0;
            if (reVar3 != null) {
                f10 = reVar3.f25113e;
            } else {
                f10 = 1.0f;
            }
            if (reVar3 != null) {
                f11 = reVar3.f25114f;
            } else {
                f11 = 1.0f;
            }
            float T14 = (org.telegram.messenger.g0.T1(1.0f, f10, f15) * contentWidth) / 2.0f;
            float T15 = (org.telegram.messenger.g0.T1(1.0f, f11, f15) * contentHeight) / 2.0f;
            float T16 = org.telegram.messenger.g0.T1(1.0f, 4.0f, f14);
            canvas.clipRect((-T14) * T16, (-T15) * T16, T14 * T16, T15 * T16);
        }
        currentWidth = m0Var.getCurrentWidth();
        pg.f fVar = m0Var.E;
        currentHeight = m0Var.getCurrentHeight();
        int i11 = fVar.f53477i;
        if (i11 == 90 || i11 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float y9 = com.google.android.recaptcha.internal.a.y(fVar.f53480l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(fVar.d * 1.0f, fVar.f53474e * 1.0f);
        float f19 = (fVar.f53475f / y9) * containerWidth;
        ug.n1 n1Var2 = m0Var.f13172b;
        if (n1Var2 != null && (reVar = n1Var2.H0) != null) {
            T1 = org.telegram.messenger.g0.T1(reVar.f25112c, f19, f14);
        } else {
            T1 = org.telegram.messenger.g0.T1(1.0f, f19, f14);
        }
        canvas.scale(T1, T1);
        canvas.translate(fVar.f53472b * f17 * 1.0f, fVar.f53473c * f18 * 1.0f);
        float e10 = m0Var.d.e(false, i11) + m0Var.f13172b.getOrientation() + fVar.f53476g;
        re reVar4 = m0Var.f13172b.H0;
        if (reVar4 == null) {
            T12 = org.telegram.messenger.g0.T1(0.0f, e10, m0Var.f13178s);
        } else {
            T12 = org.telegram.messenger.g0.T1(reVar4.d + reVar4.f25117k, e10, m0Var.f13178s);
        }
        canvas.rotate(T12);
        canvas.rotate(m0Var.f13172b.getOrientation());
        org.telegram.ui.Components.u5 u5Var = m0Var.f13173c;
        if (m0Var.F) {
            re reVar5 = m0Var.f13172b.H0;
            if (reVar5 != null && reVar5.f25118l) {
                z10 = true;
            }
            z10 = false;
        } else {
            pg.k kVar = g0Var.M;
            if (kVar != null) {
                z10 = kVar.f53508j;
            }
            z10 = false;
        }
        canvas.scale(org.telegram.messenger.g0.T1(1.0f, -1.0f, u5Var.d(z10)), 1.0f);
        canvas.translate((-m0Var.f13172b.getContentWidth()) / 2.0f, (-m0Var.f13172b.getContentHeight()) / 2.0f);
        ug.n1 n1Var3 = m0Var.f13172b;
        Paint paint2 = n1Var3.G0;
        Bitmap bitmap = n1Var3.B0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
