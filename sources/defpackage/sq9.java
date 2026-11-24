package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class sq9 extends Drawable {
    public int a = 255;
    public final b46 b;
    public final int[] c;
    public final gb2 d;
    public final int[] e;
    public final Bitmap f;
    public final RectF g;
    public final Paint h;
    public final Paint i;
    public final StaticLayout j;

    public sq9(b46 b46Var, int[] iArr, gb2 gb2Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.b = b46Var;
        this.c = iArr;
        this.d = gb2Var;
        this.e = iArr2;
        this.f = bitmap;
        this.g = rectF;
        this.h = paint;
        this.i = paint2;
        this.j = staticLayout;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.a <= 0) {
            return;
        }
        RectF rectF = gl.P;
        rectF.set(getBounds());
        float f = rectF.left;
        CornerPathEffect cornerPathEffect = b46.w;
        rectF.left = f - (gl.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.a, 31);
        int[] iArr = this.c;
        canvas.translate(iArr[0], iArr[1]);
        b46 b46Var = this.b;
        gb2 gb2Var = this.d;
        if (gb2Var != null && gb2Var.L0()) {
            m17 m17Var = gb2Var.L6;
            if (m17Var != null && m17Var.c != null) {
                canvas.save();
                gb2Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -gb2Var.L6.r);
                canvas.drawPaint(gb2Var.L6.c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], gb2Var.getPaddingTop() + iArr2[1]);
                gb2Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - gb2Var.getPaddingTop());
                canvas.translate(iArr[0], iArr[1]);
            }
            Bitmap bitmap = this.f;
            if (bitmap != null) {
                canvas.save();
                RectF rectF2 = this.g;
                canvas.drawBitmap(bitmap, rectF2.left, rectF2.top, this.h);
                canvas.restore();
            }
        } else {
            canvas.drawPath(b46Var, this.i);
        }
        canvas.clipPath(b46Var);
        this.j.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
