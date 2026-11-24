package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public abstract class kk2 extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public kk2(float f) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new RectF();
        this.g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(gm.L(f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f = gm.L(8.0f);
    }

    public int a() {
        return cmb.w0(null, cmb.eg, false);
    }

    @Override
    public final void draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk2.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public kk2() {
        this(2.0f);
    }
}
