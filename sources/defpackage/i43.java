package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class i43 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final j43 d;

    public i43(j43 j43Var, Context context) {
        super(context);
        this.d = j43Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        int i;
        boolean z = getContext() instanceof BubbleActivity;
        b43 b43Var = this.d.h;
        float f = b43Var.F;
        if (!z) {
            i = gm.m;
        } else {
            i = 0;
        }
        float f2 = f + i;
        return ((getHeight() - f2) - b43Var.E) - gm.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gm.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int currentWidth;
        int currentHeight;
        float R1;
        float R12;
        boolean z;
        ao6 ao6Var;
        float f;
        float f2;
        g88 g88Var;
        float f3;
        float f4;
        j43 j43Var = this.d;
        b43 b43Var = j43Var.h;
        int[] iArr = j43Var.y;
        k9b k9bVar = j43Var.a;
        if (j43Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (j43Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (j43Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, k9bVar.getWidth(), k9bVar.getHeight());
            int[] iArr2 = j43Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gm.X1(rectF, rectF2, j43Var.s, rectF);
            float U1 = gm.U1(j43Var.s, gm.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = j43Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = j43Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        int i2 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            if (j43Var.F) {
                j43Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            ao6 ao6Var2 = j43Var.b.I0;
            if (ao6Var2 != null) {
                f4 = ao6Var2.e;
                f3 = ao6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R13 = gm.R1(1.0f, (j43Var.b.getScaleX() * (g88Var.getWidth() / f4)) / k9bVar.getWidth(), f6);
            canvas.scale(R13, R13);
            canvas.rotate(j43Var.b.getRotation() * f6);
            canvas.translate(((j43Var.b.getContentWidth() * f4) / 2.0f) * f6, ((j43Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        boolean z2 = getContext() instanceof BubbleActivity;
        float f7 = b43Var.F;
        if (!z2) {
            i = gm.m;
        } else {
            i = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + gm.L(16.0f)) * f5, (((getContainerHeight() + gm.L(32.0f)) / 2.0f) + f7 + i) * f5);
        if (i2 > 0) {
            float contentWidth = j43Var.b.getContentWidth();
            float contentHeight = j43Var.b.getContentHeight();
            ao6 ao6Var3 = j43Var.b.I0;
            if (ao6Var3 != null) {
                f2 = ao6Var3.e;
                f = ao6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R14 = (gm.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R15 = (gm.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R16 = gm.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R14) * R16, (-R15) * R16, R14 * R16, R15 * R16);
        }
        currentWidth = j43Var.getCurrentWidth();
        n43 n43Var = j43Var.E;
        currentHeight = j43Var.getCurrentHeight();
        int i3 = n43Var.i;
        if (i3 == 90 || i3 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = td4.A(n43Var.l, 1.0f, f6, 1.0f);
        float f8 = currentWidth;
        float containerWidth = getContainerWidth() / f8;
        float f9 = currentHeight;
        if (containerWidth * f9 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f9;
        }
        canvas.translate(n43Var.d * 1.0f, n43Var.e * 1.0f);
        float f10 = (n43Var.f / A) * containerWidth;
        g88 g88Var2 = j43Var.b;
        if (g88Var2 != null && (ao6Var = g88Var2.I0) != null) {
            R1 = gm.R1(ao6Var.c, f10, f5);
        } else {
            R1 = gm.R1(1.0f, f10, f5);
        }
        canvas.scale(R1, R1);
        canvas.translate(n43Var.b * f8 * 1.0f, n43Var.c * f9 * 1.0f);
        float e = j43Var.d.e(false, i3) + j43Var.b.getOrientation() + n43Var.g;
        ao6 ao6Var4 = j43Var.b.I0;
        if (ao6Var4 == null) {
            R12 = gm.R1(0.0f, e, j43Var.s);
        } else {
            R12 = gm.R1(ao6Var4.d + ao6Var4.k, e, j43Var.s);
        }
        canvas.rotate(R12);
        canvas.rotate(j43Var.b.getOrientation());
        ln lnVar = j43Var.c;
        if (j43Var.F) {
            ao6 ao6Var5 = j43Var.b.I0;
            if (ao6Var5 != null && ao6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            s43 s43Var = b43Var.M;
            if (s43Var != null) {
                z = s43Var.j;
            }
            z = false;
        }
        canvas.scale(gm.R1(1.0f, -1.0f, lnVar.d(z)), 1.0f);
        canvas.translate((-j43Var.b.getContentWidth()) / 2.0f, (-j43Var.b.getContentHeight()) / 2.0f);
        g88 g88Var3 = j43Var.b;
        Paint paint2 = g88Var3.H0;
        Bitmap bitmap = g88Var3.C0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
