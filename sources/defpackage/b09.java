package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
public final class b09 {
    public final vu3 a;
    public final int b;
    public final int c;
    public final int d;
    public final f09 e;
    public final TextPaint f;
    public RectF g;

    public b09(vu3 vu3Var, Layout layout, Spanned spanned, f09 f09Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.a = vu3Var;
        this.e = f09Var;
        this.f = layout.getPaint();
        f09Var.c = spanned.getSpanStart(f09Var);
        boolean z4 = f09Var.a;
        int spanEnd = spanned.getSpanEnd(f09Var);
        f09Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(f09Var.d) != '\n' && spanned.charAt(f09Var.d - 1) == '\n') {
            f09Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(f09Var.c);
        int lineForOffset2 = layout.getLineForOffset(f09Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z = true;
        } else {
            z = false;
        }
        f09Var.f = z;
        if (lineForOffset <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        f09Var.h = z2;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z3 = true;
        } else {
            z3 = false;
        }
        f09Var.n = z3;
        if (z4) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (f09Var.f) {
                i4 = 0;
            } else {
                if (f09Var.h) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                i4 = i3 + 3;
            }
            this.b = gm.L(3 - i4) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (f09Var.f) {
                i6 = 0;
            } else {
                if (f09Var.n) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = i5 + 3;
            }
            this.c = lineBottom - gm.L(2 - i6);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (f09Var.f) {
                i = 1;
            } else {
                i = 2;
            }
            this.b = gm.L(3 - i) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (f09Var.f) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.c = lineBottom2 - gm.L(2 - i2);
        }
        f09Var.r = false;
        float f = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f = Math.max(f, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                f09Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f);
        if (z4 && vu3Var != null && f09Var.K == null) {
            f09Var.K = new u30(vu3Var);
        }
    }

    public final void a(Canvas canvas, int i, int i2) {
        int L;
        int i3;
        float f;
        int i4;
        Path.Direction direction;
        f09 f09Var = this.e;
        int i5 = f09Var.J;
        float[] fArr = f09Var.E;
        boolean z = f09Var.a;
        Paint paint = f09Var.y;
        Paint paint2 = f09Var.G;
        Path path = f09Var.I;
        float[] fArr2 = f09Var.H;
        Path path2 = f09Var.F;
        Drawable drawable = f09Var.x;
        if (i5 != i2) {
            f09Var.J = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i2);
            paint.setColor(on2.p(i2, 30));
        }
        if (z) {
            L = i;
        } else {
            L = gm.L(32.0f) + this.d;
        }
        int i6 = i;
        if (L < i6 * 0.95d) {
            i6 = L;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF = gm.P;
        int i7 = this.b;
        float f2 = i7;
        float f3 = i6;
        int i8 = i6;
        int i9 = this.c;
        float f4 = i9;
        rectF.set(0.0f, f2, f3, f4);
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float L2 = gm.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (z && this.a != null && f09Var.K != null) {
            if (this.g == null) {
                this.g = new RectF();
            }
            int L3 = gm.L(3.333f);
            f = f2;
            i3 = i7;
            i4 = i9;
            direction = direction2;
            f09Var.K.d(canvas, this.g, i8 - L3, i9 - L3, i2, f09Var.e, b());
        } else {
            i3 = i7;
            f = f2;
            i4 = i9;
            direction = direction2;
        }
        rectF.set(-gm.L(3.0f), f, 0.0f, f4);
        float L4 = gm.L(4.0f);
        fArr2[7] = L4;
        fArr2[6] = L4;
        fArr2[1] = L4;
        fArr2[0] = L4;
        fArr2[5] = 0.0f;
        fArr2[4] = 0.0f;
        fArr2[3] = 0.0f;
        fArr2[2] = 0.0f;
        path.rewind();
        path.addRoundRect(rectF, fArr2, direction);
        canvas.drawPath(path, paint2);
        if (!f09Var.r) {
            int intrinsicHeight = (int) (((i3 + i4) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > gm.L(8.0f) + i3) {
                intrinsicHeight = gm.L(4.0f) + i3;
            }
            drawable.setBounds((i8 - drawable.getIntrinsicWidth()) - gm.L(4.0f), intrinsicHeight, i8 - gm.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
            drawable.setAlpha(255);
            drawable.draw(canvas);
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.e.a && this.c - this.b > this.f.getTextSize() * 1.3f * 3.0f) {
            return true;
        }
        return false;
    }
}
