package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class us9 extends Drawable {
    public int a = 255;
    public final b66 b;
    public final int[] c;
    public final rc2 d;
    public final int[] e;
    public final Bitmap f;
    public final RectF g;
    public final Paint h;
    public final Paint i;
    public final StaticLayout j;

    public us9(b66 b66Var, int[] iArr, rc2 rc2Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.b = b66Var;
        this.c = iArr;
        this.d = rc2Var;
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
        RectF rectF = gm.P;
        rectF.set(getBounds());
        float f = rectF.left;
        CornerPathEffect cornerPathEffect = b66.w;
        rectF.left = f - (gm.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.a, 31);
        int[] iArr = this.c;
        canvas.translate(iArr[0], iArr[1]);
        b66 b66Var = this.b;
        rc2 rc2Var = this.d;
        if (rc2Var != null && rc2Var.L0()) {
            m37 m37Var = rc2Var.L6;
            if (m37Var != null && m37Var.c != null) {
                canvas.save();
                rc2Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -rc2Var.L6.r);
                canvas.drawPaint(rc2Var.L6.c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], rc2Var.getPaddingTop() + iArr2[1]);
                rc2Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - rc2Var.getPaddingTop());
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
            canvas.drawPath(b66Var, this.i);
        }
        canvas.clipPath(b66Var);
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
