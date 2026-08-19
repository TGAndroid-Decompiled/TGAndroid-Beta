package me.vkryl.android;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

public abstract class AnimatorUtils {
    public static final AnticipateOvershootInterpolator ANTICIPATE_OVERSHOOT_INTERPOLATOR = new AnticipateOvershootInterpolator();
    public static final DecelerateInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    public static final AccelerateInterpolator ACCELERATE_INTERPOLATOR = new AccelerateInterpolator();
    public static final DecelerateInterpolator NAVIGATION_INTERPOLATOR = new DecelerateInterpolator(1.78f);
    public static final LinearInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final OvershootInterpolator OVERSHOOT_INTERPOLATOR = new OvershootInterpolator(3.2f);
    public static final AccelerateDecelerateInterpolator ACCELERATE_DECELERATE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    public static final Interpolator QUADRATIC_EASE_IN_OUT_INTERPOLATOR = new Interpolator() {
        @Override
        public final float getInterpolation(float f) {
            return AnimatorUtils.$r8$lambda$U8unIFNBgpUICoxvqzSjoUxGuKM(f);
        }
    };
    public static final Interpolator QUADRATIC_OUT_INTERPOLATOR = new Interpolator() {
        @Override
        public final float getInterpolation(float f) {
            return AnimatorUtils.$r8$lambda$JI7rc6j6ef3U4gcSi5NiklRZPkY(f);
        }
    };

    public static float $r8$lambda$JI7rc6j6ef3U4gcSi5NiklRZPkY(float f) {
        float f2 = 1.0f - f;
        return 1.0f - (f2 * f2);
    }

    public static float $r8$lambda$U8unIFNBgpUICoxvqzSjoUxGuKM(float f) {
        float f2 = 2.0f * f;
        return f < 0.5f ? f2 * f : ((4.0f - f2) * f) - 1.0f;
    }

    public static ValueAnimator simpleValueAnimator() {
        return ValueAnimator.ofFloat(0.0f, 1.0f);
    }

    public static float getFraction(ValueAnimator valueAnimator) {
        return valueAnimator.getAnimatedFraction();
    }

    public static void startAnimator(View view, Animator animator) {
        startAnimator(view, animator, false);
    }

    public static void startAnimator(final View view, final Animator animator, boolean z) {
        if (view == null) {
            throw new IllegalArgumentException("view must be not null");
        }
        if (animator == null) {
            throw new IllegalArgumentException("animator must be not null");
        }
        if (view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0 && !z) {
            animator.start();
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    animator.start();
                }
            });
        }
    }
}
