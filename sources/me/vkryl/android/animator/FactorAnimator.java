package me.vkryl.android.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import me.vkryl.android.AnimatorUtils;
import org.telegram.ui.Components.voip.VoIPFloatingLayout;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda79;

public final class FactorAnimator {
    public ValueAnimator animator;
    public final long duration;
    public float factor;
    public final int id;
    public final Interpolator interpolator;
    public boolean isAnimating;
    public final Target target;
    public float toFactor;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final Object this$0;
        public final float val$factorDiff;
        public final float val$fromFactor;

        public AnonymousClass1(Object obj, float f, float f2, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$fromFactor = f;
            this.val$factorDiff = f2;
        }

        public void finishAnimation() {
            FactorAnimator factorAnimator = (FactorAnimator) this.this$0;
            if (factorAnimator.isAnimating) {
                float f = this.val$fromFactor + this.val$factorDiff;
                float f2 = factorAnimator.factor;
                int i = factorAnimator.id;
                Target target = factorAnimator.target;
                if (f2 != f) {
                    factorAnimator.factor = f;
                    target.onFactorChanged(i, f, 1.0f, factorAnimator);
                }
                if (factorAnimator.isAnimating) {
                    factorAnimator.isAnimating = false;
                }
                target.onFactorChangeFinished(factorAnimator.factor, i);
            }
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    finishAnimation();
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    finishAnimation();
                    break;
                default:
                    VoIPFloatingLayout voIPFloatingLayout = (VoIPFloatingLayout) this.this$0;
                    voIPFloatingLayout.switchingToFloatingMode = false;
                    voIPFloatingLayout.floatingMode = true;
                    voIPFloatingLayout.updatePositionFromX = this.val$fromFactor;
                    voIPFloatingLayout.updatePositionFromY = this.val$factorDiff;
                    voIPFloatingLayout.requestLayout();
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((FactorAnimator) this.this$0).getClass();
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public interface Target {
        void onFactorChangeFinished(float f, int i);

        void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator);
    }

    public FactorAnimator(int i, Target target, Interpolator interpolator, long j) {
        this.id = i;
        this.target = target;
        this.interpolator = interpolator;
        this.duration = j;
    }

    public final void animateTo(float f) {
        int i = 0;
        int i2 = 1;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.isAnimating) {
            cancel();
        }
        float f2 = this.factor;
        Target target = this.target;
        int i3 = this.id;
        if (f2 == f) {
            target.onFactorChangeFinished(f2, i3);
            return;
        }
        if (!this.isAnimating) {
            this.isAnimating = true;
        }
        float f3 = f - f2;
        long j = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.duration : 0L;
        if (j <= 0) {
            if (this.factor != f) {
                this.factor = f;
                target.onFactorChanged(i3, f, 1.0f, this);
            }
            if (this.isAnimating) {
                this.isAnimating = false;
            }
            target.onFactorChangeFinished(f, i3);
            return;
        }
        this.toFactor = f;
        DecelerateInterpolator decelerateInterpolator = AnimatorUtils.DECELERATE_INTERPOLATOR;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.animator.setInterpolator(this.interpolator);
        this.animator.addUpdateListener(new PhotoViewer$$ExternalSyntheticLambda79(this, f2, f3, i2));
        this.animator.addListener(new AnonymousClass1(this, f2, f3, i));
        try {
            this.animator.start();
        } catch (Throwable th) {
            Log.e("tgx", "Cannot start animation", th);
            forceFactor(f);
        }
    }

    public final boolean cancel() {
        if (!this.isAnimating) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.isAnimating) {
            this.isAnimating = false;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null) {
            return true;
        }
        valueAnimator.cancel();
        this.animator = null;
        return true;
    }

    public final void forceFactor(float f) {
        boolean zCancel = cancel();
        float f2 = this.factor;
        Target target = this.target;
        int i = this.id;
        if (f2 != f) {
            this.factor = f;
            target.onFactorChanged(i, f, 1.0f, this);
        } else if (!zCancel) {
            return;
        }
        target.onFactorChangeFinished(f, i);
    }

    public FactorAnimator(int i, Target target, Interpolator interpolator, long j, float f) {
        this.id = i;
        this.target = target;
        this.interpolator = interpolator;
        this.duration = j;
        this.factor = f;
    }
}
