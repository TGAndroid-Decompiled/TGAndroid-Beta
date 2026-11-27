package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class p33 extends View {
    public final Paint a;
    public final Path b;
    public final RectF c;
    public final q33 d;

    public p33(q33 q33Var, Context context) {
        super(context);
        this.d = q33Var;
        this.a = new Paint(1);
        this.b = new Path();
        this.c = new RectF();
    }

    private float getContainerHeight() {
        int i;
        boolean z = getContext() instanceof BubbleActivity;
        i33 i33Var = this.d.h;
        float f = i33Var.F;
        if (!z) {
            i = hl.m;
        } else {
            i = 0;
        }
        float f2 = f + i;
        return ((getHeight() - f2) - i33Var.E) - hl.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - hl.L(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int currentWidth;
        int currentHeight;
        float R1;
        float R12;
        boolean z;
        fo6 fo6Var;
        float f;
        float f2;
        v98 v98Var;
        float f3;
        float f4;
        q33 q33Var = this.d;
        i33 i33Var = q33Var.h;
        int[] iArr = q33Var.y;
        gbb gbbVar = q33Var.a;
        if (q33Var.b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (q33Var.s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (q33Var.s < 1.0f) {
            Path path = this.b;
            path.rewind();
            RectF rectF = this.c;
            rectF.set(0.0f, 0.0f, gbbVar.getWidth(), gbbVar.getHeight());
            int[] iArr2 = q33Var.x;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            hl.X1(rectF, rectF2, q33Var.s, rectF);
            float U1 = hl.U1(q33Var.s, hl.L(12.0f), 0);
            path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f5 = q33Var.s;
        float f6 = 1.0f - f5;
        int[] iArr3 = q33Var.w;
        canvas.translate((-iArr3[0]) * f6, (-iArr3[1]) * f6);
        int i2 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            if (q33Var.F) {
                q33Var.b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f6, iArr[1] * f6);
            fo6 fo6Var2 = q33Var.b.I0;
            if (fo6Var2 != null) {
                f4 = fo6Var2.e;
                f3 = fo6Var2.f;
            } else {
                f3 = 1.0f;
                f4 = 1.0f;
            }
            float R13 = hl.R1(1.0f, (q33Var.b.getScaleX() * (v98Var.getWidth() / f4)) / gbbVar.getWidth(), f6);
            canvas.scale(R13, R13);
            canvas.rotate(q33Var.b.getRotation() * f6);
            canvas.translate(((q33Var.b.getContentWidth() * f4) / 2.0f) * f6, ((q33Var.b.getContentHeight() * f3) / 2.0f) * f6);
        }
        boolean z2 = getContext() instanceof BubbleActivity;
        float f7 = i33Var.F;
        if (!z2) {
            i = hl.m;
        } else {
            i = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + hl.L(16.0f)) * f5, (((getContainerHeight() + hl.L(32.0f)) / 2.0f) + f7 + i) * f5);
        if (i2 > 0) {
            float contentWidth = q33Var.b.getContentWidth();
            float contentHeight = q33Var.b.getContentHeight();
            fo6 fo6Var3 = q33Var.b.I0;
            if (fo6Var3 != null) {
                f2 = fo6Var3.e;
                f = fo6Var3.f;
            } else {
                f = 1.0f;
                f2 = 1.0f;
            }
            float R14 = (hl.R1(1.0f, f2, f6) * contentWidth) / 2.0f;
            float R15 = (hl.R1(1.0f, f, f6) * contentHeight) / 2.0f;
            float R16 = hl.R1(1.0f, 4.0f, f5);
            canvas.clipRect((-R14) * R16, (-R15) * R16, R14 * R16, R15 * R16);
        }
        currentWidth = q33Var.getCurrentWidth();
        u33 u33Var = q33Var.E;
        currentHeight = q33Var.getCurrentHeight();
        int i3 = u33Var.i;
        if (i3 == 90 || i3 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float A = qd4.A(u33Var.l, 1.0f, f6, 1.0f);
        float f8 = currentWidth;
        float containerWidth = getContainerWidth() / f8;
        float f9 = currentHeight;
        if (containerWidth * f9 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f9;
        }
        canvas.translate(u33Var.d * 1.0f, u33Var.e * 1.0f);
        float f10 = (u33Var.f / A) * containerWidth;
        v98 v98Var2 = q33Var.b;
        if (v98Var2 != null && (fo6Var = v98Var2.I0) != null) {
            R1 = hl.R1(fo6Var.c, f10, f5);
        } else {
            R1 = hl.R1(1.0f, f10, f5);
        }
        canvas.scale(R1, R1);
        canvas.translate(u33Var.b * f8 * 1.0f, u33Var.c * f9 * 1.0f);
        float e = q33Var.d.e(false, i3) + q33Var.b.getOrientation() + u33Var.g;
        fo6 fo6Var4 = q33Var.b.I0;
        if (fo6Var4 == null) {
            R12 = hl.R1(0.0f, e, q33Var.s);
        } else {
            R12 = hl.R1(fo6Var4.d + fo6Var4.k, e, q33Var.s);
        }
        canvas.rotate(R12);
        canvas.rotate(q33Var.b.getOrientation());
        mm mmVar = q33Var.c;
        if (q33Var.F) {
            fo6 fo6Var5 = q33Var.b.I0;
            if (fo6Var5 != null && fo6Var5.l) {
                z = true;
            }
            z = false;
        } else {
            z33 z33Var = i33Var.M;
            if (z33Var != null) {
                z = z33Var.j;
            }
            z = false;
        }
        canvas.scale(hl.R1(1.0f, -1.0f, mmVar.d(z)), 1.0f);
        canvas.translate((-q33Var.b.getContentWidth()) / 2.0f, (-q33Var.b.getContentHeight()) / 2.0f);
        v98 v98Var3 = q33Var.b;
        Paint paint2 = v98Var3.H0;
        Bitmap bitmap = v98Var3.C0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
