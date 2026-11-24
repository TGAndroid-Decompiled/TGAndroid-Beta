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
public final class ay8 {
    public final lt3 a;
    public final int b;
    public final int c;
    public final int d;
    public final ey8 e;
    public final TextPaint f;
    public RectF g;

    public ay8(lt3 lt3Var, Layout layout, Spanned spanned, ey8 ey8Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.a = lt3Var;
        this.e = ey8Var;
        this.f = layout.getPaint();
        ey8Var.c = spanned.getSpanStart(ey8Var);
        boolean z4 = ey8Var.a;
        int spanEnd = spanned.getSpanEnd(ey8Var);
        ey8Var.d = spanEnd;
        if (spanEnd - 1 >= 0 && spanEnd < spanned.length() && spanned.charAt(ey8Var.d) != '\n' && spanned.charAt(ey8Var.d - 1) == '\n') {
            ey8Var.d--;
        }
        int lineForOffset = layout.getLineForOffset(ey8Var.c);
        int lineForOffset2 = layout.getLineForOffset(ey8Var.d);
        if (lineForOffset2 - lineForOffset < 1) {
            z = true;
        } else {
            z = false;
        }
        ey8Var.f = z;
        if (lineForOffset <= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ey8Var.h = z2;
        if (lineForOffset2 + 1 >= layout.getLineCount()) {
            z3 = true;
        } else {
            z3 = false;
        }
        ey8Var.n = z3;
        if (z4) {
            int lineTop = layout.getLineTop(lineForOffset);
            if (ey8Var.f) {
                i4 = 0;
            } else {
                if (ey8Var.h) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                i4 = i3 + 3;
            }
            this.b = gl.L(3 - i4) + lineTop;
            int lineBottom = layout.getLineBottom(lineForOffset2);
            if (ey8Var.f) {
                i6 = 0;
            } else {
                if (ey8Var.n) {
                    i5 = 2;
                } else {
                    i5 = 0;
                }
                i6 = i5 + 3;
            }
            this.c = lineBottom - gl.L(2 - i6);
        } else {
            int lineTop2 = layout.getLineTop(lineForOffset);
            if (ey8Var.f) {
                i = 1;
            } else {
                i = 2;
            }
            this.b = gl.L(3 - i) + lineTop2;
            int lineBottom2 = layout.getLineBottom(lineForOffset2);
            if (ey8Var.f) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.c = lineBottom2 - gl.L(2 - i2);
        }
        ey8Var.r = false;
        float f = 0.0f;
        while (lineForOffset <= lineForOffset2) {
            f = Math.max(f, layout.getLineRight(lineForOffset));
            if (layout.getLineLeft(lineForOffset) > 0.0f) {
                ey8Var.r = true;
            }
            lineForOffset++;
        }
        this.d = (int) Math.ceil(f);
        if (z4 && lt3Var != null && ey8Var.K == null) {
            ey8Var.K = new u20(lt3Var);
        }
    }

    public final void a(Canvas canvas, int i, int i2) {
        int L;
        int i3;
        float f;
        int i4;
        Path.Direction direction;
        ey8 ey8Var = this.e;
        int i5 = ey8Var.J;
        float[] fArr = ey8Var.E;
        boolean z = ey8Var.a;
        Paint paint = ey8Var.y;
        Paint paint2 = ey8Var.G;
        Path path = ey8Var.I;
        float[] fArr2 = ey8Var.H;
        Path path2 = ey8Var.F;
        Drawable drawable = ey8Var.x;
        if (i5 != i2) {
            ey8Var.J = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            paint2.setColor(i2);
            paint.setColor(bm2.o(i2, 30));
        }
        if (z) {
            L = i;
        } else {
            L = gl.L(32.0f) + this.d;
        }
        int i6 = i;
        if (L < i6 * 0.95d) {
            i6 = L;
        }
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        RectF rectF = gl.P;
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
        float L2 = gl.L(4.0f);
        fArr[5] = L2;
        fArr[4] = L2;
        fArr[3] = L2;
        fArr[2] = L2;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addRoundRect(rectF, fArr, direction2);
        canvas.drawPath(path2, paint);
        if (z && this.a != null && ey8Var.K != null) {
            if (this.g == null) {
                this.g = new RectF();
            }
            int L3 = gl.L(3.333f);
            f = f2;
            i3 = i7;
            i4 = i9;
            direction = direction2;
            ey8Var.K.d(canvas, this.g, i8 - L3, i9 - L3, i2, ey8Var.e, b());
        } else {
            i3 = i7;
            f = f2;
            i4 = i9;
            direction = direction2;
        }
        rectF.set(-gl.L(3.0f), f, 0.0f, f4);
        float L4 = gl.L(4.0f);
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
        if (!ey8Var.r) {
            int intrinsicHeight = (int) (((i3 + i4) - drawable.getIntrinsicHeight()) / 2.0f);
            if (intrinsicHeight > gl.L(8.0f) + i3) {
                intrinsicHeight = gl.L(4.0f) + i3;
            }
            drawable.setBounds((i8 - drawable.getIntrinsicWidth()) - gl.L(4.0f), intrinsicHeight, i8 - gl.L(4.0f), drawable.getIntrinsicHeight() + intrinsicHeight);
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
