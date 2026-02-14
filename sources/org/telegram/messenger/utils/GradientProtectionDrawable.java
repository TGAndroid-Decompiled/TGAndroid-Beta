package org.telegram.messenger.utils;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.ActionBar.Theme;

public class GradientProtectionDrawable extends Drawable {
    public static final Interpolator DEFAULT_INTERPOLATOR = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    private int mAlpha;
    private int mColor;
    private final int[] mColors;
    private final GradientDrawable mDrawable;
    private final Rect mInsets;
    private final Interpolator mInterpolator;
    private final Paint mPaint;
    private int mSide;

    @Override
    public int getOpacity() {
        return -3;
    }

    public GradientProtectionDrawable(int i) {
        this(i, 0, DEFAULT_INTERPOLATOR, 8);
    }

    public GradientProtectionDrawable(int i, int i2, Interpolator interpolator, int i3) {
        this.mPaint = new Paint(1);
        this.mInsets = new Rect();
        this.mAlpha = 255;
        this.mDrawable = new GradientDrawable();
        this.mInterpolator = interpolator;
        this.mColors = new int[i3];
        setSide(i);
        setColor(i2);
    }

    public void setSide(int i) {
        this.mSide = i;
        if (i == 1) {
            this.mDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            return;
        }
        if (i == 2) {
            this.mDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i == 4) {
            this.mDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else {
            if (i != 8) {
                return;
            }
            this.mDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    public void setColor(int i) {
        if (this.mColor == i) {
            return;
        }
        this.mColor = i;
        fillColors(this.mInterpolator, i, this.mColors);
        this.mDrawable.setColors(this.mColors);
        this.mPaint.setColor(Theme.multAlpha(this.mColor, this.mAlpha / 255.0f));
    }

    @Override
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        GradientDrawable gradientDrawable = this.mDrawable;
        int i = rect.left;
        Rect rect2 = this.mInsets;
        gradientDrawable.setBounds(i + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    public void setInsets(int i, int i2, int i3, int i4) {
        Rect rect = this.mInsets;
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return;
        }
        rect.set(i, i2, i3, i4);
        onBoundsChange(getBounds());
    }

    @Override
    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            int i5 = this.mSide;
            if (i5 == 1 && (i4 = this.mInsets.left) > 0) {
                canvas.drawRect(bounds.left, bounds.top, Math.min(bounds.right, r1 + i4), bounds.bottom, this.mPaint);
            } else if (i5 == 2 && (i3 = this.mInsets.top) > 0) {
                canvas.drawRect(bounds.left, bounds.top, bounds.right, Math.min(bounds.bottom, r1 + i3), this.mPaint);
            } else if (i5 == 4 && (i2 = this.mInsets.right) > 0) {
                canvas.drawRect(Math.max(bounds.left, bounds.right - i2), bounds.top, bounds.right, bounds.bottom, this.mPaint);
            } else if (i5 == 8 && (i = this.mInsets.bottom) > 0) {
                canvas.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i), bounds.right, bounds.bottom, this.mPaint);
            }
        }
        if (this.mDrawable.getBounds().isEmpty()) {
            return;
        }
        this.mDrawable.draw(canvas);
    }

    @Override
    public void setAlpha(int i) {
        this.mAlpha = i;
        this.mDrawable.setAlpha(i);
        this.mPaint.setColor(Theme.multAlpha(this.mColor, this.mAlpha / 255.0f));
    }

    @Override
    public int getAlpha() {
        return this.mAlpha;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.mDrawable.setColorFilter(colorFilter);
        this.mPaint.setColorFilter(colorFilter);
    }

    public static void fillColors(Interpolator interpolator, int i, int[] iArr) {
        int length = iArr.length - 1;
        int iAlpha = Color.alpha(i);
        for (int i2 = length; i2 >= 0; i2--) {
            iArr[i2] = ColorUtils.setAlphaComponent(i, (int) (interpolator.getInterpolation((length - i2) / length) * iAlpha));
        }
    }
}
