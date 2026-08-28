package ff;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.f6;
public final class c0 extends Drawable {
    public static final PathInterpolator f6153i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator f6154a;
    public final GradientDrawable f6155b;
    public final int f6157e;
    public final int[] f6158f;
    public int f6159g;
    public final Paint f6156c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public c0(int i9) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f6155b = gradientDrawable;
        this.f6154a = f6153i;
        this.f6158f = new int[8];
        this.f6157e = i9;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 == 8) {
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                    }
                } else {
                    gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                }
            } else {
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            }
        } else {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        }
        b(0);
    }

    public static void a(Interpolator interpolator, int i9, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i9);
        for (int i10 = length; i10 >= 0; i10--) {
            iArr[i10] = i0.a.k(i9, (int) (interpolator.getInterpolation((length - i10) / length) * alpha));
        }
    }

    public final void b(int i9) {
        if (this.f6159g == i9) {
            return;
        }
        this.f6159g = i9;
        Interpolator interpolator = this.f6154a;
        int[] iArr = this.f6158f;
        a(interpolator, i9, iArr);
        this.f6155b.setColors(iArr);
        this.f6156c.setColor(f6.l1(this.h / 255.0f, this.f6159g));
    }

    public final void c(int i9, int i10) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i9 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, i9, 0, i10);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(android.graphics.Canvas r9) {
        throw new UnsupportedOperationException("Method not decompiled: ff.c0.draw(android.graphics.Canvas):void");
    }

    @Override
    public final int getAlpha() {
        return this.h;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i9 = rect.left;
        Rect rect2 = this.d;
        int i10 = rect.bottom - rect2.bottom;
        this.f6155b.setBounds(i9 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, i10);
    }

    @Override
    public final void setAlpha(int i9) {
        this.h = i9;
        this.f6155b.setAlpha(i9);
        this.f6156c.setColor(f6.l1(this.h / 255.0f, this.f6159g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6155b.setColorFilter(colorFilter);
        this.f6156c.setColorFilter(colorFilter);
    }
}
