package cg;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.k6;
public final class b0 extends Drawable {
    public static final PathInterpolator f4619i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator f4620a;
    public final GradientDrawable f4621b;
    public final int f4623e;
    public final int[] f4624f;
    public int f4625g;
    public final Paint f4622c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public b0(int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f4621b = gradientDrawable;
        this.f4620a = f4619i;
        this.f4624f = new int[8];
        this.f4623e = i3;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 == 8) {
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

    public static void a(Interpolator interpolator, int i3, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i3);
        for (int i10 = length; i10 >= 0; i10--) {
            iArr[i10] = i0.a.o(i3, (int) (interpolator.getInterpolation((length - i10) / length) * alpha));
        }
    }

    public final void b(int i3) {
        if (this.f4625g == i3) {
            return;
        }
        this.f4625g = i3;
        Interpolator interpolator = this.f4620a;
        int[] iArr = this.f4624f;
        a(interpolator, i3, iArr);
        this.f4621b.setColors(iArr);
        this.f4622c.setColor(k6.r1(this.h / 255.0f, this.f4625g));
    }

    public final void c(int i3, int i10) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i3 && rect.right == 0 && rect.bottom == i10) {
            return;
        }
        rect.set(0, i3, 0, i10);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(android.graphics.Canvas r9) {
        throw new UnsupportedOperationException("Method not decompiled: cg.b0.draw(android.graphics.Canvas):void");
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
        int i3 = rect.left;
        Rect rect2 = this.d;
        int i10 = rect.bottom - rect2.bottom;
        this.f4621b.setBounds(i3 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, i10);
    }

    @Override
    public final void setAlpha(int i3) {
        this.h = i3;
        this.f4621b.setAlpha(i3);
        this.f4622c.setColor(k6.r1(this.h / 255.0f, this.f4625g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4621b.setColorFilter(colorFilter);
        this.f4622c.setColorFilter(colorFilter);
    }
}
