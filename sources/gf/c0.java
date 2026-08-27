package gf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.g6;

public final class c0 extends Drawable {

    public static final PathInterpolator f6953i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);

    public final Interpolator f6954a;

    public final GradientDrawable f6955b;

    public final int f6957e;

    public final int[] f6958f;

    public int f6959g;

    public final Paint f6956c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public c0(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f6955b = gradientDrawable;
        this.f6954a = f6953i;
        this.f6958f = new int[8];
        this.f6957e = i10;
        if (i10 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i10 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i10 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i10 == 8) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        b(0);
    }

    public static void a(Interpolator interpolator, int i10, int[] iArr) {
        int length = iArr.length - 1;
        int iAlpha = Color.alpha(i10);
        for (int i11 = length; i11 >= 0; i11--) {
            iArr[i11] = i0.b.k(i10, (int) (interpolator.getInterpolation((length - i11) / length) * iAlpha));
        }
    }

    public final void b(int i10) {
        if (this.f6959g == i10) {
            return;
        }
        this.f6959g = i10;
        Interpolator interpolator = this.f6954a;
        int[] iArr = this.f6958f;
        a(interpolator, i10, iArr);
        this.f6955b.setColors(iArr);
        this.f6956c.setColor(g6.l1(this.h / 255.0f, this.f6959g));
    }

    public final void c(int i10, int i11) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i10 && rect.right == 0 && rect.bottom == i11) {
            return;
        }
        rect.set(0, i10, 0, i11);
        onBoundsChange(getBounds());
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        int i13;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            canvas2 = canvas;
        } else {
            Paint paint = this.f6956c;
            Rect rect = this.d;
            int i14 = this.f6957e;
            if (i14 == 1 && (i13 = rect.left) > 0) {
                int i15 = bounds.left;
                canvas2 = canvas;
                canvas2.drawRect(i15, bounds.top, Math.min(bounds.right, i15 + i13), bounds.bottom, paint);
            } else if (i14 == 2 && (i12 = rect.top) > 0) {
                float f10 = bounds.left;
                int i16 = bounds.top;
                float f11 = i16;
                float f12 = bounds.right;
                float fMin = Math.min(bounds.bottom, i16 + i12);
                canvas2 = canvas;
                canvas2.drawRect(f10, f11, f12, fMin, paint);
            } else if (i14 == 4 && (i11 = rect.right) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(Math.max(bounds.left, bounds.right - i11), bounds.top, bounds.right, bounds.bottom, paint);
            } else if (i14 != 8 || (i10 = rect.bottom) <= 0) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i10), bounds.right, bounds.bottom, paint);
            }
        }
        GradientDrawable gradientDrawable = this.f6955b;
        if (gradientDrawable.getBounds().isEmpty()) {
            return;
        }
        gradientDrawable.draw(canvas2);
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
        int i10 = rect.left;
        Rect rect2 = this.d;
        this.f6955b.setBounds(i10 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10;
        this.f6955b.setAlpha(i10);
        this.f6956c.setColor(g6.l1(this.h / 255.0f, this.f6959g));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f6955b.setColorFilter(colorFilter);
        this.f6956c.setColorFilter(colorFilter);
    }
}
