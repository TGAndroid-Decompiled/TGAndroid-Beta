package me.vkryl.android.animator;

import android.view.View;
import android.view.animation.Interpolator;
import me.vkryl.android.animator.FactorAnimator;

public class BoolAnimator implements FactorAnimator.Target {
    private FactorAnimator animator;
    private long duration;
    private float floatValue;
    private final int id;
    private Interpolator interpolator;
    private long startDelay;
    private final FactorAnimator.Target target;
    private boolean value;

    public BoolAnimator(final View view, Interpolator interpolator, long j) {
        this(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                view.invalidate();
            }
        }, interpolator, j, false);
    }

    public BoolAnimator(final View view, Interpolator interpolator, long j, boolean z) {
        this(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
                view.invalidate();
            }
        }, interpolator, j, z);
    }

    public BoolAnimator(int i, FactorAnimator.Target target, Interpolator interpolator, long j) {
        this(i, target, interpolator, j, false);
    }

    public BoolAnimator(int i, FactorAnimator.Target target, Interpolator interpolator, long j, boolean z) {
        this.id = i;
        this.target = target;
        this.interpolator = interpolator;
        this.duration = j;
        this.value = z;
        this.floatValue = z ? 1.0f : 0.0f;
    }

    public boolean isAnimating() {
        FactorAnimator factorAnimator = this.animator;
        return factorAnimator != null && factorAnimator.isAnimating();
    }

    public void setValue(boolean z, boolean z2) {
        setValue(z, z2, null);
    }

    public void setValue(boolean z, boolean z2, View view) {
        if (this.value == z && z2) {
            return;
        }
        this.value = z;
        float f = z ? 1.0f : 0.0f;
        if (z2) {
            if (this.animator == null) {
                FactorAnimator factorAnimator = new FactorAnimator(0, this, this.interpolator, this.duration, this.floatValue);
                this.animator = factorAnimator;
                long j = this.startDelay;
                if (j != 0) {
                    factorAnimator.setStartDelay(j);
                }
            }
            this.animator.animateTo(f, view);
            return;
        }
        FactorAnimator factorAnimator2 = this.animator;
        if (factorAnimator2 != null) {
            factorAnimator2.forceFactor(f);
        }
        if (this.floatValue != f) {
            setFloatValue(f);
            this.target.onFactorChangeFinished(this.id, f, null);
        }
    }

    public boolean getValue() {
        return this.value;
    }

    public float getFloatValue() {
        return this.floatValue;
    }

    private void setFloatValue(float f) {
        if (this.floatValue != f) {
            this.floatValue = f;
            this.target.onFactorChanged(this.id, f, -1.0f, null);
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        setFloatValue(f);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        this.target.onFactorChangeFinished(this.id, f, null);
    }
}
