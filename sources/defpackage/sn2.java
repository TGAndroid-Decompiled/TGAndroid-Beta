package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public class sn2 extends Drawable implements Drawable.Callback {
    public Drawable a;
    public final Drawable b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public int s;
    public int w;
    public boolean x;
    public float y;

    public sn2(Drawable drawable, Drawable drawable2, int i, int i2) {
        this.a = drawable;
        this.b = drawable2;
        this.c = i;
        this.d = i2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.y, 0.0f);
        if (this.r) {
            Rect bounds = getBounds();
            setBounds(bounds.centerX() - (getIntrinsicWidth() / 2), bounds.centerY() - (getIntrinsicHeight() / 2), (getIntrinsicWidth() / 2) + bounds.centerX(), (getIntrinsicHeight() / 2) + bounds.centerY());
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.a.draw(canvas);
        }
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            boolean z = this.x;
            int i = this.d;
            int i2 = this.c;
            if (z) {
                Rect bounds2 = getBounds();
                if (i2 != 0) {
                    drawable2.setBounds(bounds2.left + i2, bounds2.top + i, bounds2.right - i2, bounds2.bottom - i);
                } else {
                    drawable2.setBounds(bounds2);
                }
            } else if (this.e != 0) {
                int centerX = (getBounds().centerX() - (this.e / 2)) + i2 + this.s;
                int centerY = getBounds().centerY();
                int i3 = this.f;
                int i4 = (centerY - (i3 / 2)) + i + this.w;
                drawable2.setBounds(centerX, i4, this.e + centerX, i3 + i4);
            } else {
                int centerX2 = (getBounds().centerX() - (drawable2.getIntrinsicWidth() / 2)) + i2;
                int centerY2 = (getBounds().centerY() - (drawable2.getIntrinsicHeight() / 2)) + i;
                drawable2.setBounds(centerX2, centerY2, drawable2.getIntrinsicWidth() + centerX2, drawable2.getIntrinsicHeight() + centerY2);
            }
            drawable2.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        return this.b.getConstantState();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        return this.a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        return this.a.getIntrinsicWidth();
    }

    @Override
    public final int getMinimumHeight() {
        int i = this.n;
        if (i != 0) {
            return i;
        }
        return this.a.getMinimumHeight();
    }

    @Override
    public final int getMinimumWidth() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        return this.a.getMinimumWidth();
    }

    @Override
    public final int getOpacity() {
        return this.b.getOpacity();
    }

    @Override
    public final int[] getState() {
        return this.b.getState();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override
    public final boolean isStateful() {
        return this.b.isStateful();
    }

    @Override
    public final void jumpToCurrentState() {
        this.b.jumpToCurrentState();
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        return true;
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.a.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    @Override
    public final boolean setState(int[] iArr) {
        this.b.setState(iArr);
        return true;
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public sn2(Drawable drawable, Drawable drawable2) {
        this.a = drawable;
        this.b = drawable2;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
    }
}
