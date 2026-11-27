package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class qo4 extends Drawable {
    public Drawable a;
    public float b;
    public int c;

    public final void a(int i) {
        if (this.c != i) {
            this.c = i;
            setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = this.b;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        Drawable drawable = this.a;
        if (i == 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) uh9.x(bounds.width(), 2.0f, f, bounds.centerX()), (int) uh9.x(bounds.height(), 2.0f, f, bounds.centerY()), (int) c00.B(bounds.width(), 2.0f, f, bounds.centerX()), (int) c00.B(bounds.height(), 2.0f, f, bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return null;
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
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
