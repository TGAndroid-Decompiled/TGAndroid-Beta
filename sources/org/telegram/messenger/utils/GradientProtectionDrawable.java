package org.telegram.messenger.utils;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.ColorUtils;

public class GradientProtectionDrawable extends GradientDrawable {
    public static final Interpolator DEFAULT_INTERPOLATOR = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    private int mColor;
    private final int[] mColors;
    private final Interpolator mInterpolator;

    public GradientProtectionDrawable(int i, int i2) {
        this(i, i2, DEFAULT_INTERPOLATOR, 8);
    }

    public GradientProtectionDrawable(int i, int i2, Interpolator interpolator, int i3) {
        this.mInterpolator = interpolator;
        this.mColors = new int[i3];
        setSide(i);
        setColor(i2);
    }

    public void setSide(int i) {
        if (i == 1) {
            setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            return;
        }
        if (i == 2) {
            setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i == 4) {
            setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else {
            if (i != 8) {
                return;
            }
            setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
    }

    @Override
    public void setColor(int i) {
        if (this.mColor == i) {
            return;
        }
        this.mColor = i;
        fillColors(this.mInterpolator, i, this.mColors);
        setColors(this.mColors);
    }

    public static void fillColors(Interpolator interpolator, int i, int[] iArr) {
        int length = iArr.length - 1;
        int iAlpha = Color.alpha(i);
        for (int i2 = length; i2 >= 0; i2--) {
            iArr[i2] = ColorUtils.setAlphaComponent(i, (int) (interpolator.getInterpolation((length - i2) / length) * iAlpha));
        }
    }
}
