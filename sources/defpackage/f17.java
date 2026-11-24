package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class f17 extends Drawable {
    public Paint a;
    public Paint b;
    public long c;
    public float d;
    public boolean e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public long l;
    public gb2 m;

    public final void a() {
        int i;
        int i2;
        Rect bounds = getBounds();
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float f = bounds.left - centerX;
        float f2 = bounds.top - centerY;
        this.g = (float) Math.ceil(Math.sqrt(tb4.A(i2, centerY, f2, f * (i - centerX))));
    }

    @Override
    public final void draw(android.graphics.Canvas r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f17.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        a();
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    @Override
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        a();
    }
}
