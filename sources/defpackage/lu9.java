package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
public final class lu9 extends Drawable {
    public int a = 255;
    public final f66 b;
    public final int[] c;
    public final wb2 d;
    public final int[] e;
    public final Bitmap f;
    public final RectF g;
    public final Paint h;
    public final Paint i;
    public final StaticLayout j;

    public lu9(f66 f66Var, int[] iArr, wb2 wb2Var, int[] iArr2, Bitmap bitmap, RectF rectF, Paint paint, Paint paint2, StaticLayout staticLayout) {
        this.b = f66Var;
        this.c = iArr;
        this.d = wb2Var;
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
        RectF rectF = hl.P;
        rectF.set(getBounds());
        float f = rectF.left;
        CornerPathEffect cornerPathEffect = f66.w;
        rectF.left = f - (hl.L(5.0f) / 2.0f);
        canvas.save();
        canvas.saveLayerAlpha(rectF, this.a, 31);
        int[] iArr = this.c;
        canvas.translate(iArr[0], iArr[1]);
        f66 f66Var = this.b;
        wb2 wb2Var = this.d;
        if (wb2Var != null && wb2Var.L0()) {
            t37 t37Var = wb2Var.L6;
            if (t37Var != null && t37Var.c != null) {
                canvas.save();
                wb2Var.setBackgroundTopY(true);
                canvas.translate(0.0f, -wb2Var.L6.r);
                canvas.drawPaint(wb2Var.L6.c);
                canvas.restore();
            } else {
                canvas.translate(-iArr[0], -iArr[1]);
                int[] iArr2 = this.e;
                canvas.translate(iArr2[0], wb2Var.getPaddingTop() + iArr2[1]);
                wb2Var.M0(canvas, true, false);
                canvas.translate(-iArr2[0], (-iArr2[1]) - wb2Var.getPaddingTop());
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
            canvas.drawPath(f66Var, this.i);
        }
        canvas.clipPath(f66Var);
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
