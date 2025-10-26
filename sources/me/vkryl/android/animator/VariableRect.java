package me.vkryl.android.animator;

import android.graphics.RectF;
import me.vkryl.android.animator.Animatable;

public class VariableRect implements Animatable {
    private final VariableFloat bottom;
    private final VariableFloat left;
    private final RectF rectF;
    private final VariableFloat right;
    private final VariableFloat top;

    @Override
    public void applyChanges() {
        Animatable.CC.$default$applyChanges(this);
    }

    @Override
    public boolean hasChanges() {
        return Animatable.CC.$default$hasChanges(this);
    }

    @Override
    public void prepareChanges() {
        Animatable.CC.$default$prepareChanges(this);
    }

    public VariableRect() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public VariableRect(float f, float f2, float f3, float f4) {
        this.rectF = new RectF();
        this.left = new VariableFloat(f);
        this.top = new VariableFloat(f2);
        this.right = new VariableFloat(f3);
        this.bottom = new VariableFloat(f4);
    }

    public float getBottom() {
        return this.bottom.get();
    }

    public void set(float f, float f2, float f3, float f4) {
        this.left.set(f);
        this.top.set(f2);
        this.right.set(f3);
        this.bottom.set(f4);
    }

    public boolean differs(float f, float f2, float f3, float f4) {
        return this.left.differs(f) || this.top.differs(f2) || this.right.differs(f3) || this.bottom.differs(f4);
    }

    public void setTo(float f, float f2, float f3, float f4) {
        this.left.setTo(f);
        this.top.setTo(f2);
        this.right.setTo(f3);
        this.bottom.setTo(f4);
    }

    @Override
    public void finishAnimation(boolean z) {
        this.left.finishAnimation(z);
        this.top.finishAnimation(z);
        this.right.finishAnimation(z);
        this.bottom.finishAnimation(z);
    }

    @Override
    public boolean applyAnimation(float f) {
        return this.bottom.applyAnimation(f) || (this.right.applyAnimation(f) || (this.top.applyAnimation(f) || this.left.applyAnimation(f)));
    }
}
