package me.vkryl.android.animator;

import android.view.View;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RadialProgress2$$ExternalSyntheticLambda0;
import org.telegram.ui.GroupCallActivity;

public final class BoolAnimator implements FactorAnimator.Target {
    public FactorAnimator animator;
    public final long duration;
    public float floatValue;
    public final int id;
    public final Interpolator interpolator;
    public final FactorAnimator.Target target;
    public boolean value;

    public BoolAnimator(long j, View view, Interpolator interpolator) {
        this(0, new RadialProgress2$$ExternalSyntheticLambda0(view), interpolator, j, false);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
        this.target.onFactorChangeFinished(f, this.id);
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
            target.onFactorChangeFinished(f, i);
        }
    }

    public BoolAnimator(int i, GroupCallActivity groupCallActivity, CubicBezierInterpolator cubicBezierInterpolator) {
        this(i, groupCallActivity, cubicBezierInterpolator, 350L, false);
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
