package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class x23 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final y23 d;

    public x23(y23 y23Var, Context context) {
        super(context);
        this.d = y23Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        int i;
        boolean z = getContext() instanceof BubbleActivity;
        q23 q23Var = this.d.h;
        float f = q23Var.F;
        if (!z) {
            i = gl.m;
        } else {
            i = 0;
        }
        float f2 = f + i;
        return ((getHeight() - f2) - q23Var.E) - gl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - gl.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int currentWidth;
        int currentHeight;
        float R1;
        float R12;
        boolean z;
        zl6 zl6Var;
        float f;
        float f2;
        e68 e68Var;
        float f3;
        float f4;
        y23 y23Var = this.d;
        q23 q23Var = y23Var.h;
        int[] iArr = y23Var.y;
        i7b i7bVar = y23Var.a;
        if (y23Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (y23Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (y23Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, i7bVar.getWidth(), i7bVar.getHeight());
            int[] iArr2 = y23Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = gl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            gl.X1(rectF, rectF2, y23Var.s, rectF);
            float U1 = gl.U1(y23Var.s, gl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = y23Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = y23Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        int i2 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            if (y23Var.F) {
                y23Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            zl6 zl6Var2 = y23Var.b.I0;
            if (zl6Var2 != null) {
                f4 = zl6Var2.e;
                f3 = zl6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R13 = gl.R1(1.0f, (y23Var.b.getScaleX() * (e68Var.getWidth() / f4)) / i7bVar.getWidth(), f6);
            canvas.scale(R13, R13);
            canvas.rotate(y23Var.b.getRotation() * f6);
            canvas.translate(((y23Var.b.getContentWidth() * f4) / 2.0f) * f6, ((y23Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        boolean z2 = getContext() instanceof BubbleActivity;
        float f7 = q23Var.F;
        if (!z2) {
            i = gl.m;
        } else {
            i = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + gl.L(16.0f)) * f5, (((getContainerHeight() + gl.L(32.0f)) / 2.0f) + f7 + i) * f5);
        if (i2 > 0) {
            float contentWidth = y23Var.b.getContentWidth();
            float contentHeight = y23Var.b.getContentHeight();
            zl6 zl6Var3 = y23Var.b.I0;
            if (zl6Var3 != null) {
                f2 = zl6Var3.e;
                f = zl6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R14 = (gl.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R15 = (gl.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R16 = gl.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R14) * R16, (-R15) * R16, R14 * R16, R15 * R16);
        }
        currentWidth = y23Var.getCurrentWidth();
        c33 c33Var = y23Var.E;
        currentHeight = y23Var.getCurrentHeight();
        int i3 = c33Var.i;
        if (i3 == 90 || i3 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = tb4.A(c33Var.l, 1.0f, f6, 1.0f);
        float f8 = currentWidth;
        float containerWidth = getContainerWidth() / f8;
        float f9 = currentHeight;
        if (containerWidth * f9 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f9;
        }
        canvas.translate(c33Var.d * 1.0f, c33Var.e * 1.0f);
        float f10 = (c33Var.f / A) * containerWidth;
        e68 e68Var2 = y23Var.b;
        if (e68Var2 != null && (zl6Var = e68Var2.I0) != null) {
            R1 = gl.R1(zl6Var.c, f10, f5);
        } else {
            R1 = gl.R1(1.0f, f10, f5);
        }
        canvas.scale(R1, R1);
        canvas.translate(c33Var.b * f8 * 1.0f, c33Var.c * f9 * 1.0f);
        float e = y23Var.d.e(false, i3) + y23Var.b.getOrientation() + c33Var.g;
        zl6 zl6Var4 = y23Var.b.I0;
        if (zl6Var4 == null) {
            R12 = gl.R1(0.0f, e, y23Var.s);
        } else {
            R12 = gl.R1(zl6Var4.d + zl6Var4.k, e, y23Var.s);
        }
        canvas.rotate(R12);
        canvas.rotate(y23Var.b.getOrientation());
        lm lmVar = y23Var.c;
        if (y23Var.F) {
            zl6 zl6Var5 = y23Var.b.I0;
            if (zl6Var5 != null && zl6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            h33 h33Var = q23Var.M;
            if (h33Var != null) {
                z = h33Var.j;
            }
            z = false;
        }
        canvas.scale(gl.R1(1.0f, -1.0f, lmVar.d(z)), 1.0f);
        canvas.translate((-y23Var.b.getContentWidth()) / 2.0f, (-y23Var.b.getContentHeight()) / 2.0f);
        e68 e68Var3 = y23Var.b;
        Paint paint2 = e68Var3.H0;
        Bitmap bitmap = e68Var3.C0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
