package bg;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.m6;
public final class d0 extends Drawable {
    public static final PathInterpolator f3227i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator f3228a;
    public final GradientDrawable f3229b;
    public final int f3231e;
    public final int[] f3232f;
    public int f3233g;
    public final Paint f3230c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public d0(int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f3229b = gradientDrawable;
        this.f3228a = f3227i;
        this.f3232f = new int[8];
        this.f3231e = i7;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 == 8) {
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

    public static void a(Interpolator interpolator, int i7, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i7);
        for (int i10 = length; i10 >= 0; i10--) {
            iArr[i10] = i0.a.o(i7, (int) (interpolator.getInterpolation((length - i10) / length) * alpha));
        }
    }

    public final void b(int i7) {
        if (this.f3233g == i7) {
            return;
        }
        this.f3233g = i7;
        Interpolator interpolator = this.f3228a;
        int[] iArr = this.f3232f;
        a(interpolator, i7, iArr);
        this.f3229b.setColors(iArr);
        this.f3230c.setColor(m6.r1(this.h / 255.0f, this.f3233g));
    }

    public final void c(int i7, int i10) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i7 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, i7, 0, i10);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(android.graphics.Canvas r9) {
        throw new UnsupportedOperationException("Method not decompiled: bg.d0.draw(android.graphics.Canvas):void");
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
        int i7 = rect.left;
        Rect rect2 = this.d;
        int i10 = rect.bottom - rect2.bottom;
        this.f3229b.setBounds(i7 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, i10);
    }

    @Override
    public final void setAlpha(int i7) {
        this.h = i7;
        this.f3229b.setAlpha(i7);
        this.f3230c.setColor(m6.r1(this.h / 255.0f, this.f3233g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3229b.setColorFilter(colorFilter);
        this.f3230c.setColorFilter(colorFilter);
    }
}
