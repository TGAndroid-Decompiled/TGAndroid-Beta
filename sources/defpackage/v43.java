package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v43 extends Drawable {
    public final Drawable a;
    public final RectF b = new RectF();
    public final Paint c;
    public final Paint d;
    public int e;
    public final int f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;

    public v43(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.a = context.getDrawable(i);
        this.f = i2;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(gm.N(2.5f));
    }

    public final void a(boolean z, boolean z2) {
        if (this.h != z) {
            this.h = z;
            float f = 0.0f;
            if (!z2) {
                if (z) {
                    f = 1.0f;
                }
                this.g = f;
            } else {
                if (!z) {
                    f = 1.0f;
                }
                this.g = f;
            }
            invalidateSelf();
        }
    }

    @Override
    public final void draw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v43.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
