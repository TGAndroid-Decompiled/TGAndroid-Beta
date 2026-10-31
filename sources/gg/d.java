package gg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class d extends Drawable {
    public Drawable f7504a;
    public float f7505b;
    public int f7506c;

    public final void a(int i10) {
        if (this.f7506c != i10) {
            this.f7506c = i10;
            setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7504a;
        Rect bounds = getBounds();
        float f7 = this.f7505b;
        if (f7 == 1.0f) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds((int) (bounds.centerX() - ((bounds.width() / 2.0f) * f7)), (int) (bounds.centerY() - ((bounds.height() / 2.0f) * f7)), (int) (((bounds.width() / 2.0f) * f7) + bounds.centerX()), (int) (((bounds.height() / 2.0f) * f7) + bounds.centerY()));
        }
        drawable.draw(canvas);
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7504a;
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
    public final void setAlpha(int i10) {
        this.f7504a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7504a.setColorFilter(colorFilter);
    }
}
