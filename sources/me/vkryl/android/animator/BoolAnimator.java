package me.vkryl.android.animator;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class BoolAnimator implements FactorAnimator.Target {
    public FactorAnimator animator;
    public final long duration;
    public float floatValue;
    public final int id;
    public final Interpolator interpolator;
    public final FactorAnimator.Target target;
    public boolean value;

    public BoolAnimator(View view, Interpolator interpolator, long j) {
        this(0, new BoolAnimator$$ExternalSyntheticLambda1(view), interpolator, j, false);
    }

    public final float getFloatValue() {
        return this.floatValue;
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        this.target.onFactorChangeFinished(this.id, f, null);
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (this.floatValue != f) {
            this.floatValue = f;
            this.target.onFactorChanged(this.id, f, -1.0f, null);
        }
    }

    public final void setValue(boolean z, boolean z2) {
        BoolAnimator boolAnimator;
        if (this.value == z && z2) {
            return;
        }
        this.value = z;
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            if (this.animator == null) {
                boolAnimator = this;
                boolAnimator.animator = new FactorAnimator(0, boolAnimator, this.interpolator, this.duration, this.floatValue);
            } else {
                boolAnimator = this;
            }
            boolAnimator.animator.animateTo(f);
            return;
        }
        FactorAnimator factorAnimator = this.animator;
        if (factorAnimator != null) {
            factorAnimator.forceFactor(f);
        }
        float f2 = this.floatValue;
        if (f2 != f) {
            int i = this.id;
            FactorAnimator.Target target = this.target;
            if (f2 != f) {
                this.floatValue = f;
                target.onFactorChanged(i, f, -1.0f, null);
            }
            target.onFactorChangeFinished(i, f, null);
        }
    }

    public BoolAnimator(int i, FactorAnimator.Target target, CubicBezierInterpolator cubicBezierInterpolator, long j) {
        this(i, target, cubicBezierInterpolator, j, false);
    }

    public BoolAnimator(int i, FactorAnimator.Target target, Interpolator interpolator, long j, boolean z) {
        this.id = i;
        this.target = target;
        this.interpolator = interpolator;
        this.duration = j;
        this.value = z;
        this.floatValue = z ? 1.0f : 0.0f;
    }
}
