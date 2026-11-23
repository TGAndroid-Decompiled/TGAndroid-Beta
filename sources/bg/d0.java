package bg;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.n6;
public final class d0 extends Drawable {
    public static final PathInterpolator f3185i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator f3186a;
    public final GradientDrawable f3187b;
    public final int f3189e;
    public final int[] f3190f;
    public int f3191g;
    public final Paint f3188c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public d0(int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f3187b = gradientDrawable;
        this.f3186a = f3185i;
        this.f3190f = new int[8];
        this.f3189e = i7;
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
        if (this.f3191g == i7) {
            return;
        }
        this.f3191g = i7;
        Interpolator interpolator = this.f3186a;
        int[] iArr = this.f3190f;
        a(interpolator, i7, iArr);
        this.f3187b.setColors(iArr);
        this.f3188c.setColor(n6.r1(this.h / 255.0f, this.f3191g));
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
        this.f3187b.setBounds(i7 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, i10);
    }

    @Override
    public final void setAlpha(int i7) {
        this.h = i7;
        this.f3187b.setAlpha(i7);
        this.f3188c.setColor(n6.r1(this.h / 255.0f, this.f3191g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3187b.setColorFilter(colorFilter);
        this.f3188c.setColorFilter(colorFilter);
    }
}
