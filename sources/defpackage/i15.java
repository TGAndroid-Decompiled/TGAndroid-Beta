package defpackage;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
public final class i15 extends Drawable {
    public static final PathInterpolator i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final PathInterpolator a;
    public final GradientDrawable b;
    public final byte e;
    public final int[] f;
    public int g;
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public i15(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        this.a = i;
        this.f = new int[8];
        this.e = i2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 == 8) {
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

    public static void a(PathInterpolator pathInterpolator, int i2, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i2);
        for (int i3 = length; i3 >= 0; i3--) {
            iArr[i3] = on2.p(i2, (int) (pathInterpolator.getInterpolation((length - i3) / length) * alpha));
        }
    }

    public final void b(int i2) {
        if (this.g == i2) {
            return;
        }
        this.g = i2;
        PathInterpolator pathInterpolator = this.a;
        int[] iArr = this.f;
        a(pathInterpolator, i2, iArr);
        this.b.setColors(iArr);
        this.c.setColor(cmb.p1(this.h / 255.0f, this.g));
    }

    public final void c(int i2, int i3) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i2 && rect.right == 0 && rect.bottom == i3) {
            return;
        }
        rect.set(0, i2, 0, i3);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(android.graphics.Canvas r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i15.draw(android.graphics.Canvas):void");
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
        int i2 = rect.left;
        Rect rect2 = this.d;
        this.b.setBounds(i2 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override
    public final void setAlpha(int i2) {
        this.h = i2;
        this.b.setAlpha(i2);
        this.c.setColor(cmb.p1(this.h / 255.0f, this.g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
