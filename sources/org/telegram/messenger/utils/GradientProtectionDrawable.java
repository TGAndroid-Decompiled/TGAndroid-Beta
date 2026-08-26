package org.telegram.messenger.utils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.Theme;

public final class GradientProtectionDrawable extends Drawable {
    public static final PathInterpolator DEFAULT_INTERPOLATOR = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public int mAlpha;
    public int mColor;
    public final int[] mColors;
    public final GradientDrawable mDrawable;
    public final Rect mInsets;
    public final PathInterpolator mInterpolator;
    public final Paint mPaint;
    public final int mSide;

    public GradientProtectionDrawable(int i) {
        PathInterpolator pathInterpolator = DEFAULT_INTERPOLATOR;
        this.mPaint = new Paint(1);
        this.mInsets = new Rect();
        this.mAlpha = 255;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.mDrawable = gradientDrawable;
        this.mInterpolator = pathInterpolator;
        this.mColors = new int[8];
        this.mSide = i;
        if (i == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i == 8) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        setColor(0);
    }

    public static void fillColors(PathInterpolator pathInterpolator, int i, int[] iArr) {
        int length = iArr.length - 1;
        int iAlpha = Color.alpha(i);
        for (int i2 = length; i2 >= 0; i2--) {
            iArr[i2] = ColorUtils.setAlphaComponent(i, (int) (pathInterpolator.getInterpolation((length - i2) / length) * iAlpha));
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            canvas2 = canvas;
        } else {
            Paint paint = this.mPaint;
            Rect rect = this.mInsets;
            int i5 = this.mSide;
            if (i5 == 1 && (i4 = rect.left) > 0) {
                int i6 = bounds.left;
                canvas2 = canvas;
                canvas2.drawRect(i6, bounds.top, Math.min(bounds.right, i6 + i4), bounds.bottom, paint);
            } else if (i5 == 2 && (i3 = rect.top) > 0) {
                float f = bounds.left;
                int i7 = bounds.top;
                float f2 = i7;
                float f3 = bounds.right;
                float fMin = Math.min(bounds.bottom, i7 + i3);
                canvas2 = canvas;
                canvas2.drawRect(f, f2, f3, fMin, paint);
            } else if (i5 == 4 && (i2 = rect.right) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(Math.max(bounds.left, bounds.right - i2), bounds.top, bounds.right, bounds.bottom, paint);
            } else if (i5 != 8 || (i = rect.bottom) <= 0) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i), bounds.right, bounds.bottom, paint);
            }
        }
        GradientDrawable gradientDrawable = this.mDrawable;
        if (gradientDrawable.getBounds().isEmpty()) {
            return;
        }
        gradientDrawable.draw(canvas2);
    }

    @Override
    public final int getAlpha() {
        return this.mAlpha;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        GradientDrawable gradientDrawable = this.mDrawable;
        int i = rect.left;
        Rect rect2 = this.mInsets;
        gradientDrawable.setBounds(i + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override
    public final void setAlpha(int i) {
        this.mAlpha = i;
        this.mDrawable.setAlpha(i);
        this.mPaint.setColor(Theme.multAlpha(this.mAlpha / 255.0f, this.mColor));
    }

    public final void setColor(int i) {
        if (this.mColor == i) {
            return;
        }
        this.mColor = i;
        PathInterpolator pathInterpolator = this.mInterpolator;
        int[] iArr = this.mColors;
        fillColors(pathInterpolator, i, iArr);
        this.mDrawable.setColors(iArr);
        this.mPaint.setColor(Theme.multAlpha(this.mAlpha / 255.0f, this.mColor));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
        this.mPaint.setColorFilter(colorFilter);
    }

    public final void setInsets(int i, int i2) {
        Rect rect = this.mInsets;
        if (rect.left == 0 && rect.top == i && rect.right == 0 && rect.bottom == i2) {
            return;
        }
        rect.set(0, i, 0, i2);
        onBoundsChange(getBounds());
    }
}
